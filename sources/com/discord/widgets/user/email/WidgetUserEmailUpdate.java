package com.discord.widgets.user.email;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import b.a.d.j;
import b.d.b.a.a;
import com.discord.R;
import com.discord.api.user.User;
import com.discord.app.AppActivity;
import com.discord.app.AppFragment;
import com.discord.databinding.WidgetUserEmailUpdateBinding;
import com.discord.restapi.RestAPIParams;
import com.discord.utilities.rest.RestAPI;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.view.extensions.ViewExtensions;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import com.discord.widgets.user.account.WidgetUserAccountVerifyBase;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import d0.z.d.m;
import d0.z.d.o;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import rx.functions.Action1;

/* JADX INFO: compiled from: WidgetUserEmailUpdate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WidgetUserEmailUpdate extends WidgetUserAccountVerifyBase {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetUserEmailUpdate.class, "binding", "getBinding()Lcom/discord/databinding/WidgetUserEmailUpdateBinding;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;

    /* JADX INFO: renamed from: com.discord.widgets.user.email.WidgetUserEmailUpdate$onViewBound$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetUserEmailUpdate.kt */
    public final class AnonymousClass1 extends o implements Function1<Editable, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
            invoke2(editable);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Editable editable) {
            m.checkNotNullParameter(editable, "it");
            WidgetUserEmailUpdate.access$handleTextChanged(WidgetUserEmailUpdate.this);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.user.email.WidgetUserEmailUpdate$onViewBound$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetUserEmailUpdate.kt */
    public final class AnonymousClass2 extends o implements Function1<Editable, Unit> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
            invoke2(editable);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Editable editable) {
            m.checkNotNullParameter(editable, "it");
            WidgetUserEmailUpdate.access$handleTextChanged(WidgetUserEmailUpdate.this);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.user.email.WidgetUserEmailUpdate$onViewBound$3, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetUserEmailUpdate.kt */
    public final class AnonymousClass3 implements View.OnClickListener {

        /* JADX INFO: renamed from: com.discord.widgets.user.email.WidgetUserEmailUpdate$onViewBound$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: WidgetUserEmailUpdate.kt */
        public final class AnonymousClass1<T> implements Action1<User> {
            public AnonymousClass1() {
            }

            @Override // rx.functions.Action1
            public /* bridge */ /* synthetic */ void call(User user) {
                call2(user);
            }

            /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
            public final void call2(User user) {
                WidgetUserEmailUpdate.access$onEmailUpdated(WidgetUserEmailUpdate.this);
            }
        }

        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RestAPI api = RestAPI.INSTANCE.getApi();
            RestAPIParams.UserInfo.Companion companion = RestAPIParams.UserInfo.INSTANCE;
            TextInputLayout textInputLayout = WidgetUserEmailUpdate.access$getBinding$p(WidgetUserEmailUpdate.this).c;
            m.checkNotNullExpressionValue(textInputLayout, "binding.alertVerifyEmailChangeEmail");
            String textOrEmpty = ViewExtensions.getTextOrEmpty(textInputLayout);
            TextInputLayout textInputLayout2 = WidgetUserEmailUpdate.access$getBinding$p(WidgetUserEmailUpdate.this).d;
            m.checkNotNullExpressionValue(textInputLayout2, "binding.alertVerifyEmailChangePassword");
            ObservableExtensionsKt.ui$default(ObservableExtensionsKt.withDimmer$default(ObservableExtensionsKt.restSubscribeOn$default(api.patchUser(companion.createForEmail(textOrEmpty, ViewExtensions.getTextOrEmpty(textInputLayout2))), false, 1, null), WidgetUserEmailUpdate.access$getBinding$p(WidgetUserEmailUpdate.this).e, 0L, 2, null), WidgetUserEmailUpdate.this, null, 2, null).k(b.a.d.o.i(new AnonymousClass1(), WidgetUserEmailUpdate.this));
        }
    }

    /* JADX INFO: compiled from: WidgetUserEmailUpdate.kt */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void launch$default(Companion companion, Context context, WidgetUserAccountVerifyBase.Mode mode, ActivityResultLauncher activityResultLauncher, int i, Object obj) {
            if ((i & 4) != 0) {
                activityResultLauncher = null;
            }
            companion.launch(context, mode, activityResultLauncher);
        }

        public final void launch(Context context, WidgetUserAccountVerifyBase.Mode mode, ActivityResultLauncher<Intent> launcher) {
            m.checkNotNullParameter(context, "context");
            m.checkNotNullParameter(mode, "mode");
            Intent launchIntent = WidgetUserAccountVerifyBase.INSTANCE.getLaunchIntent(mode, false, true);
            if (launcher != null) {
                j.g.f(context, launcher, WidgetUserEmailUpdate.class, launchIntent);
            } else {
                j.d(context, WidgetUserEmailUpdate.class, launchIntent);
            }
        }

        public final ActivityResultLauncher<Intent> registerForResult(AppFragment fragment, Function0<Unit> callback) {
            m.checkNotNullParameter(fragment, "fragment");
            m.checkNotNullParameter(callback, "callback");
            ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new WidgetUserEmailUpdate$Companion$registerForResult$1(callback));
            m.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "fragment.registerForActi…k()\n          }\n        }");
            return activityResultLauncherRegisterForActivityResult;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetUserEmailUpdate() {
        super(R.layout.widget_user_email_update);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetUserEmailUpdate$binding$2.INSTANCE, null, 2, null);
    }

    public static final /* synthetic */ WidgetUserEmailUpdateBinding access$getBinding$p(WidgetUserEmailUpdate widgetUserEmailUpdate) {
        return widgetUserEmailUpdate.getBinding();
    }

    public static final /* synthetic */ void access$handleTextChanged(WidgetUserEmailUpdate widgetUserEmailUpdate) {
        widgetUserEmailUpdate.handleTextChanged();
    }

    public static final /* synthetic */ void access$onEmailUpdated(WidgetUserEmailUpdate widgetUserEmailUpdate) {
        widgetUserEmailUpdate.onEmailUpdated();
    }

    private final WidgetUserEmailUpdateBinding getBinding() {
        return (WidgetUserEmailUpdateBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    private final void handleTextChanged() {
        boolean z2;
        TextInputLayout textInputLayout = getBinding().d;
        m.checkNotNullExpressionValue(textInputLayout, "binding.alertVerifyEmailChangePassword");
        if (ViewExtensions.getTextOrEmpty(textInputLayout).length() >= 3) {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            TextInputLayout textInputLayout2 = getBinding().c;
            m.checkNotNullExpressionValue(textInputLayout2, "binding.alertVerifyEmailChangeEmail");
            if (pattern.matcher(ViewExtensions.getTextOrEmpty(textInputLayout2)).matches()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        MaterialButton materialButton = getBinding().f2680b;
        m.checkNotNullExpressionValue(materialButton, "binding.alertVerifyEmailChange");
        materialButton.setEnabled(z2);
    }

    private final void onEmailUpdated() {
        AppActivity appActivity = getAppActivity();
        if (appActivity != null) {
            appActivity.setResult(-1);
        }
        AppActivity appActivity2 = getAppActivity();
        if (appActivity2 != null) {
            appActivity2.finish();
        }
    }

    @Override // com.discord.widgets.user.account.WidgetUserAccountVerifyBase, com.discord.app.AppFragment
    public void onViewBound(View view) {
        m.checkNotNullParameter(view, "view");
        super.onViewBound(view);
        AppFragment.setActionBarDisplayHomeAsUpEnabled$default(this, false, 1, null);
        TextInputLayout textInputLayout = getBinding().c;
        m.checkNotNullExpressionValue(textInputLayout, "binding.alertVerifyEmailChangeEmail");
        ViewExtensions.addBindedTextWatcher(textInputLayout, this, new AnonymousClass1());
        TextInputLayout textInputLayout2 = getBinding().d;
        m.checkNotNullExpressionValue(textInputLayout2, "binding.alertVerifyEmailChangePassword");
        ViewExtensions.addBindedTextWatcher(textInputLayout2, this, new AnonymousClass2());
        getBinding().f2680b.setOnClickListener(new AnonymousClass3());
    }
}
