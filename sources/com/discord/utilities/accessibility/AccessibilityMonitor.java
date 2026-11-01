package com.discord.utilities.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import androidx.core.app.NotificationCompat;
import d0.g;
import d0.z.d.m;
import j0.l.e.k;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;
import rx.subjects.SerializedSubject;

/* JADX INFO: compiled from: AccessibilityMonitor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityMonitor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AccessibilityManager accessibilityManager;
    private AccessibilityState accessibilityState;
    private final SerializedSubject<AccessibilityState, AccessibilityState> accessibilityStateSubject;
    private ContentResolver contentResolver;
    private static final Lazy INSTANCE$delegate = g.lazy(AccessibilityMonitor$Companion$INSTANCE$2.INSTANCE);
    private final ContentObserver animationScaleObserver = new AccessibilityMonitor$animationScaleObserver$1(this, new Handler(Looper.getMainLooper()));

    /* JADX INFO: renamed from: com.discord.utilities.accessibility.AccessibilityMonitor$handleInitialState$1, reason: invalid class name */
    /* JADX INFO: compiled from: AccessibilityMonitor.kt */
    public final class AnonymousClass1 implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: com.discord.utilities.accessibility.AccessibilityMonitor$handleInitialState$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: AccessibilityMonitor.kt */
        public final class C03261<T> implements Action1<Unit> {
            public final /* synthetic */ boolean $enabled;

            public C03261(boolean z2) {
                this.$enabled = z2;
            }

            @Override // rx.functions.Action1
            public /* bridge */ /* synthetic */ void call(Unit unit) {
                call2(unit);
            }

            /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
            public final void call2(Unit unit) {
                AccessibilityMonitor.access$handleScreenreaderEnabledUpdate(AccessibilityMonitor.this, this.$enabled);
            }
        }

        public AnonymousClass1() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z2) {
            new k(Unit.a).q(200L, TimeUnit.MILLISECONDS).V(new C03261(z2));
        }
    }

    /* JADX INFO: compiled from: AccessibilityMonitor.kt */
    public final class Companion {
        private Companion() {
        }

        public final AccessibilityMonitor getINSTANCE() {
            Lazy lazyAccess$getINSTANCE$cp = AccessibilityMonitor.access$getINSTANCE$cp();
            Companion companion = AccessibilityMonitor.INSTANCE;
            return (AccessibilityMonitor) lazyAccess$getINSTANCE$cp.getValue();
        }

        public final void initialize(Application application) {
            m.checkNotNullParameter(application, "application");
            getINSTANCE().bindContext(application);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AccessibilityMonitor() {
        AccessibilityState accessibilityState = new AccessibilityState(null, 1, null);
        this.accessibilityState = accessibilityState;
        this.accessibilityStateSubject = new SerializedSubject<>(BehaviorSubject.l0(accessibilityState));
    }

    public static final /* synthetic */ Lazy access$getINSTANCE$cp() {
        return INSTANCE$delegate;
    }

    public static final /* synthetic */ void access$handleReduceMotionUpdated(AccessibilityMonitor accessibilityMonitor) {
        accessibilityMonitor.handleReduceMotionUpdated();
    }

    public static final /* synthetic */ void access$handleScreenreaderEnabledUpdate(AccessibilityMonitor accessibilityMonitor, boolean z2) {
        accessibilityMonitor.handleScreenreaderEnabledUpdate(z2);
    }

    public final void bindContext(Context context) {
        m.checkNotNullParameter(context, "context");
        handleInitialState(context);
    }

    private final synchronized void handleInitialState(Context context) {
        Object systemService = context.getSystemService("accessibility");
        if (!(systemService instanceof AccessibilityManager)) {
            systemService = null;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager != null) {
            this.accessibilityManager = accessibilityManager;
            if (accessibilityManager == null) {
                m.throwUninitializedPropertyAccessException("accessibilityManager");
            }
            accessibilityManager.addAccessibilityStateChangeListener(new AnonymousClass1());
            AccessibilityManager accessibilityManager2 = this.accessibilityManager;
            if (accessibilityManager2 == null) {
                m.throwUninitializedPropertyAccessException("accessibilityManager");
            }
            handleScreenreaderEnabledUpdate(accessibilityManager2.isEnabled());
            ContentResolver contentResolver = context.getContentResolver();
            m.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
            this.contentResolver = contentResolver;
            Uri uriFor = Settings.Global.getUriFor("transition_animation_scale");
            ContentResolver contentResolver2 = this.contentResolver;
            if (contentResolver2 == null) {
                m.throwUninitializedPropertyAccessException("contentResolver");
            }
            contentResolver2.registerContentObserver(uriFor, false, this.animationScaleObserver);
            Resources resources = context.getResources();
            m.checkNotNullExpressionValue(resources, "context.resources");
            handleUIModeUpdate(resources.getConfiguration().uiMode);
        }
    }

    private final void handleReduceMotionUpdated() {
        EnumSet<AccessibilityFeatureFlags> enumSetCopyOf = EnumSet.copyOf((EnumSet) this.accessibilityState.getFeatures());
        ContentResolver contentResolver = this.contentResolver;
        if (contentResolver == null) {
            m.throwUninitializedPropertyAccessException("contentResolver");
        }
        String string = Settings.Global.getString(contentResolver, "transition_animation_scale");
        if (m.areEqual(string, "0.0") || m.areEqual(string, "0")) {
            enumSetCopyOf.add(AccessibilityFeatureFlags.REDUCED_MOTION);
        } else {
            enumSetCopyOf.remove(AccessibilityFeatureFlags.REDUCED_MOTION);
        }
        AccessibilityState accessibilityState = this.accessibilityState;
        m.checkNotNullExpressionValue(enumSetCopyOf, "features");
        updateAccessibilityState(accessibilityState.copy(enumSetCopyOf));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    private final void handleScreenreaderEnabledUpdate(boolean enabled) {
        EnumSet<AccessibilityFeatureFlags> enumSetCopyOf = EnumSet.copyOf((EnumSet) this.accessibilityState.getFeatures());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null) {
            m.throwUninitializedPropertyAccessException("accessibilityManager");
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabled) {
            m.checkNotNullExpressionValue(enabledAccessibilityServiceList, "services");
            if (!enabledAccessibilityServiceList.isEmpty()) {
                enumSetCopyOf.add(AccessibilityFeatureFlags.SCREENREADER);
            } else {
                enumSetCopyOf.remove(AccessibilityFeatureFlags.SCREENREADER);
            }
        } else {
            enumSetCopyOf.remove(AccessibilityFeatureFlags.SCREENREADER);
        }
        AccessibilityState accessibilityState = this.accessibilityState;
        m.checkNotNullExpressionValue(enumSetCopyOf, "features");
        updateAccessibilityState(accessibilityState.copy(enumSetCopyOf));
    }

    private final void handleUIModeUpdate(int uiMode) {
        EnumSet<AccessibilityFeatureFlags> enumSetCopyOf = EnumSet.copyOf((EnumSet) this.accessibilityState.getFeatures());
        int i = uiMode & 48;
        if (i == 16) {
            enumSetCopyOf.add(AccessibilityFeatureFlags.PREFERS_COLOR_SCHEME_LIGHT);
            enumSetCopyOf.remove(AccessibilityFeatureFlags.PREFERS_COLOR_SCHEME_DARK);
        } else if (i != 32) {
            enumSetCopyOf.remove(AccessibilityFeatureFlags.PREFERS_COLOR_SCHEME_LIGHT);
            enumSetCopyOf.remove(AccessibilityFeatureFlags.PREFERS_COLOR_SCHEME_DARK);
        } else {
            enumSetCopyOf.add(AccessibilityFeatureFlags.PREFERS_COLOR_SCHEME_DARK);
            enumSetCopyOf.remove(AccessibilityFeatureFlags.PREFERS_COLOR_SCHEME_LIGHT);
        }
        AccessibilityState accessibilityState = this.accessibilityState;
        m.checkNotNullExpressionValue(enumSetCopyOf, "features");
        updateAccessibilityState(accessibilityState.copy(enumSetCopyOf));
    }

    public final Observable<AccessibilityState> observeAccessibilityState() {
        Observable<AccessibilityState> observableR = this.accessibilityStateSubject.r();
        m.checkNotNullExpressionValue(observableR, "accessibilityStateSubject.distinctUntilChanged()");
        return observableR;
    }

    private final void updateAccessibilityState(AccessibilityState newState) {
        this.accessibilityState = newState;
        this.accessibilityStateSubject.k.onNext(newState);
    }
}
