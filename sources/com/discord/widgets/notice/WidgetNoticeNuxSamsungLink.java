package com.discord.widgets.notice;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import b.d.b.a.a;
import com.discord.R;
import com.discord.app.AppDialog;
import com.discord.databinding.WidgetNoticeNuxSamsungLinkBinding;
import com.discord.models.domain.ModelAuditLogEntry;
import com.discord.models.domain.ModelOAuth2Token;
import com.discord.stores.StoreNotices;
import com.discord.stores.StoreStream;
import com.discord.stores.StoreUser;
import com.discord.utilities.intent.IntentUtils;
import com.discord.utilities.rest.RestAPI;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.time.Clock;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import d0.g0.t;
import d0.z.d.m;
import d0.z.d.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import rx.Observable;

/* JADX INFO: compiled from: WidgetNoticeNuxSamsungLink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetNoticeNuxSamsungLink extends AppDialog {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetNoticeNuxSamsungLink.class, "binding", "getBinding()Lcom/discord/databinding/WidgetNoticeNuxSamsungLinkBinding;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NOTICE_NAME = "NUX/SamsungLink";

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;

    /* JADX INFO: renamed from: com.discord.widgets.notice.WidgetNoticeNuxSamsungLink$onViewBound$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetNoticeNuxSamsungLink.kt */
    public final class AnonymousClass1 extends o implements Function1<List<? extends ModelOAuth2Token>, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ModelOAuth2Token> list) {
            invoke2((List<ModelOAuth2Token>) list);
            return Unit.a;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004e  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<ModelOAuth2Token> list) {
            boolean z2;
            m.checkNotNullExpressionValue(list, "authedApps");
            boolean z3 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    } else if (m.areEqual(String.valueOf(((ModelOAuth2Token) it.next()).getApplication().getId()), "591317049637339146")) {
                        if (Build.VERSION.SDK_INT >= 28 && t.equals(Build.MANUFACTURER, "samsung", true)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } while (!z2);
            } else {
                z3 = false;
                break;
            }
            if (z3) {
                WidgetNoticeNuxSamsungLink.this.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.notice.WidgetNoticeNuxSamsungLink$onViewBound$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetNoticeNuxSamsungLink.kt */
    public final class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WidgetNoticeNuxSamsungLink widgetNoticeNuxSamsungLink = WidgetNoticeNuxSamsungLink.this;
            Uri oauth2Authorize = IntentUtils.RouteBuilders.Uris.INSTANCE.getOauth2Authorize();
            m.checkNotNullParameter(oauth2Authorize, "oAuthUri");
            widgetNoticeNuxSamsungLink.startActivity(new Intent("android.intent.action.VIEW", oauth2Authorize.buildUpon().appendQueryParameter("client_id", "591317049637339146").appendQueryParameter("prompt", "consent").appendQueryParameter("response_type", ModelAuditLogEntry.CHANGE_KEY_CODE).appendQueryParameter("scope", "identify activities.read activities.write").build()));
            WidgetNoticeNuxSamsungLink.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.notice.WidgetNoticeNuxSamsungLink$onViewBound$3, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetNoticeNuxSamsungLink.kt */
    public final class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WidgetNoticeNuxSamsungLink.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WidgetNoticeNuxSamsungLink.kt */
    public final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ void access$internalEnqueue(Companion companion) {
            companion.internalEnqueue();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0032  */
        public final void enqueue(Context context, Clock clock) {
            boolean z2;
            m.checkNotNullParameter(context, "context");
            m.checkNotNullParameter(clock, "clock");
            if (Build.VERSION.SDK_INT >= 28 && t.equals(Build.MANUFACTURER, "samsung", true)) {
                m.checkNotNullParameter(context, "context");
                try {
                    try {
                        if (context.getPackageManager().getPackageInfo("com.samsung.android.game.gametools", 0) != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        if (context.getPackageManager().getPackageInfo("com.samsung.android.game.gamehome", 0) == null) {
                            z2 = false;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (z2) {
                    StoreStream.Companion companion = StoreStream.INSTANCE;
                    Observable observableJ = Observable.j(companion.getAuthentication().observeIsAuthed$app_productionGoogleRelease(), StoreUser.observeMe$default(companion.getUsers(), false, 1, null), WidgetNoticeNuxSamsungLink$Companion$enqueue$1.INSTANCE);
                    m.checkNotNullExpressionValue(observableJ, "Observable\n          .co…hed to meUser\n          }");
                    ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.computationLatest(ObservableExtensionsKt.takeSingleUntilTimeout$default(observableJ, 0L, false, 3, null)), WidgetNoticeNuxSamsungLink.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new WidgetNoticeNuxSamsungLink$Companion$enqueue$2(clock), 62, (Object) null);
                }
            }
        }

        private final void internalEnqueue() {
            StoreStream.INSTANCE.getNotices().requestToShow(new StoreNotices.Notice(WidgetNoticeNuxSamsungLink.NOTICE_NAME, null, 0L, 0, true, null, 0L, false, RecyclerView.FOREVER_NS, WidgetNoticeNuxSamsungLink$Companion$internalEnqueue$notice$1.INSTANCE, 230, null));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetNoticeNuxSamsungLink() {
        super(R.layout.widget_notice_nux_samsung_link);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetNoticeNuxSamsungLink$binding$2.INSTANCE, null, 2, null);
    }

    private final WidgetNoticeNuxSamsungLinkBinding getBinding() {
        return (WidgetNoticeNuxSamsungLinkBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    @Override // com.discord.app.AppDialog
    public void onViewBound(View view) {
        m.checkNotNullParameter(view, "view");
        super.onViewBound(view);
        StoreStream.INSTANCE.getNotices().markDialogSeen(NOTICE_NAME);
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui$default(ObservableExtensionsKt.takeSingleUntilTimeout$default(ObservableExtensionsKt.computationLatest(ObservableExtensionsKt.restSubscribeOn$default(RestAPI.INSTANCE.getApi().getOAuthTokens(), false, 1, null)), 0L, false, 1, null), this, null, 2, null), WidgetNoticeNuxSamsungLink.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(), 62, (Object) null);
        getBinding().c.setOnClickListener(new AnonymousClass2());
        getBinding().f2502b.setOnClickListener(new AnonymousClass3());
    }
}
