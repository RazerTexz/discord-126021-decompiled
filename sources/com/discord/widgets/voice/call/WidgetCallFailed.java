package com.discord.widgets.voice.call;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b.a.d.m;
import b.a.k.b;
import b.d.b.a.a;
import com.discord.R;
import com.discord.app.AppDialog;
import com.discord.app.AppFragment;
import com.discord.databinding.ViewDialogConfirmationBinding;
import com.discord.models.user.User;
import com.discord.stores.StoreStream;
import com.discord.utilities.captcha.CaptchaErrorBody;
import com.discord.utilities.captcha.CaptchaHelper;
import com.discord.utilities.error.Error;
import com.discord.utilities.rest.RestAPI;
import com.discord.utilities.rest.RestAPIAbortMessages;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import com.discord.widgets.captcha.WidgetCaptchaBottomSheet;
import com.discord.widgets.captcha.WidgetCaptchaKt;
import com.google.android.material.button.MaterialButton;
import d0.z.d.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import rx.functions.Action1;

/* JADX INFO: compiled from: WidgetCallFailed.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WidgetCallFailed extends AppDialog {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetCallFailed.class, "binding", "getBinding()Lcom/discord/databinding/ViewDialogConfirmationBinding;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String INTENT_USER_ID = "INTENT_USER_ID";

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;

    /* JADX INFO: renamed from: com.discord.widgets.voice.call.WidgetCallFailed$onViewBound$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetCallFailed.kt */
    public final class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WidgetCallFailed.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.voice.call.WidgetCallFailed$onViewBoundOrOnResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetCallFailed.kt */
    public final class AnonymousClass1 extends o implements Function1<User, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            invoke2(user);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(User user) {
            WidgetCallFailed.access$configureUI(WidgetCallFailed.this, user);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.voice.call.WidgetCallFailed$sendFriendRequest$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetCallFailed.kt */
    public final class AnonymousClass1<T> implements Action1<Void> {
        public AnonymousClass1() {
        }

        @Override // rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Void r1) {
            call2(r1);
        }

        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final void call2(Void r4) {
            m.i(WidgetCallFailed.this, R.string.friend_request_sent, 0, 4);
            WidgetCallFailed.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.voice.call.WidgetCallFailed$sendFriendRequest$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetCallFailed.kt */
    public final class AnonymousClass2<T> implements Action1<Error> {
        public final /* synthetic */ long $userId;
        public final /* synthetic */ String $username;

        /* JADX INFO: renamed from: com.discord.widgets.voice.call.WidgetCallFailed$sendFriendRequest$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: WidgetCallFailed.kt */
        public final class AnonymousClass1 extends o implements Function0<Unit> {
            public final /* synthetic */ Error $error;

            /* JADX INFO: renamed from: com.discord.widgets.voice.call.WidgetCallFailed$sendFriendRequest$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: WidgetCallFailed.kt */
            public final class C04791 extends o implements Function2<AppFragment, CaptchaHelper.CaptchaPayload, Unit> {
                public C04791() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(AppFragment appFragment, CaptchaHelper.CaptchaPayload captchaPayload) {
                    invoke2(appFragment, captchaPayload);
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AppFragment appFragment, CaptchaHelper.CaptchaPayload captchaPayload) {
                    d0.z.d.m.checkNotNullParameter(appFragment, "<anonymous parameter 0>");
                    d0.z.d.m.checkNotNullParameter(captchaPayload, "captchaPayload");
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    WidgetCallFailed.access$sendFriendRequest(WidgetCallFailed.this, anonymousClass2.$userId, anonymousClass2.$username, captchaPayload);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Error error) {
                super(0);
                this.$error = error;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Error error = this.$error;
                d0.z.d.m.checkNotNullExpressionValue(error, "error");
                if (WidgetCaptchaKt.isCaptchaError(error)) {
                    WidgetCaptchaBottomSheet.Companion companion = WidgetCaptchaBottomSheet.INSTANCE;
                    C04791 c04791 = new C04791();
                    CaptchaErrorBody.Companion companion2 = CaptchaErrorBody.INSTANCE;
                    Error error2 = this.$error;
                    d0.z.d.m.checkNotNullExpressionValue(error2, "error");
                    WidgetCaptchaBottomSheet.Companion.enqueue$default(companion, "Add Friend Captcha", c04791, null, companion2.createFromError(error2), 4, null);
                    return;
                }
                RestAPIAbortMessages.ResponseResolver responseResolver = RestAPIAbortMessages.ResponseResolver.INSTANCE;
                Context context = WidgetCallFailed.this.getContext();
                Error error3 = this.$error;
                d0.z.d.m.checkNotNullExpressionValue(error3, "error");
                Error.Response response = error3.getResponse();
                d0.z.d.m.checkNotNullExpressionValue(response, "error.response");
                m.h(WidgetCallFailed.this.getContext(), responseResolver.getRelationshipResponse(context, response.getCode(), AnonymousClass2.this.$username), 0, null, 12);
            }
        }

        public AnonymousClass2(long j, String str) {
            this.$userId = j;
            this.$username = str;
        }

        @Override // rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Error error) {
            call2(error);
        }

        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final void call2(Error error) {
            RestAPIAbortMessages restAPIAbortMessages = RestAPIAbortMessages.INSTANCE;
            d0.z.d.m.checkNotNullExpressionValue(error, "error");
            RestAPIAbortMessages.handleAbortCodeOrDefault$default(restAPIAbortMessages, error, new AnonymousClass1(error), null, 4, null);
        }
    }

    /* JADX INFO: compiled from: WidgetCallFailed.kt */
    public final class Companion {
        private Companion() {
        }

        public final void show(FragmentManager fragmentManager, long userId) {
            d0.z.d.m.checkNotNullParameter(fragmentManager, "fragmentManager");
            WidgetCallFailed widgetCallFailed = new WidgetCallFailed();
            Bundle bundle = new Bundle();
            bundle.putLong(WidgetCallFailed.INTENT_USER_ID, userId);
            widgetCallFailed.setArguments(bundle);
            widgetCallFailed.show(fragmentManager, WidgetCallFailed.class.getSimpleName());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetCallFailed() {
        super(R.layout.view_dialog_confirmation);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetCallFailed$binding$2.INSTANCE, null, 2, null);
    }

    public static final /* synthetic */ void access$configureUI(WidgetCallFailed widgetCallFailed, User user) {
        widgetCallFailed.configureUI(user);
    }

    public static final /* synthetic */ void access$sendFriendRequest(WidgetCallFailed widgetCallFailed, long j, String str, CaptchaHelper.CaptchaPayload captchaPayload) {
        widgetCallFailed.sendFriendRequest(j, str, captchaPayload);
    }

    private final void configureUI(User user) {
        if (user == null) {
            dismiss();
            return;
        }
        TextView textView = getBinding().e;
        d0.z.d.m.checkNotNullExpressionValue(textView, "binding.viewDialogConfirmationText");
        b.n(textView, R.string.call_invite_not_friends, new Object[]{user.getUsername()}, null, 4);
        getBinding().c.setOnClickListener(new WidgetCallFailed$configureUI$$inlined$let$lambda$1(this, user));
    }

    private final ViewDialogConfirmationBinding getBinding() {
        return (ViewDialogConfirmationBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    @Override // com.discord.app.AppDialog
    public void onViewBound(View view) {
        d0.z.d.m.checkNotNullParameter(view, "view");
        super.onViewBound(view);
        TextView textView = getBinding().d;
        d0.z.d.m.checkNotNullExpressionValue(textView, "binding.viewDialogConfirmationHeader");
        textView.setText(getString(R.string.start_call));
        MaterialButton materialButton = getBinding().c;
        d0.z.d.m.checkNotNullExpressionValue(materialButton, "binding.viewDialogConfirmationConfirm");
        materialButton.setText(getString(R.string.add_friend_button));
        MaterialButton materialButton2 = getBinding().f2185b;
        d0.z.d.m.checkNotNullExpressionValue(materialButton2, "binding.viewDialogConfirmationCancel");
        materialButton2.setText(getString(R.string.okay));
        getBinding().f2185b.setOnClickListener(new AnonymousClass1());
    }

    @Override // com.discord.app.AppDialog
    public void onViewBoundOrOnResume() {
        super.onViewBoundOrOnResume();
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui$default(StoreStream.INSTANCE.getUsers().observeUser(getArgumentsOrDefault().getLong(INTENT_USER_ID)), this, null, 2, null), WidgetCallFailed.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(), 62, (Object) null);
    }

    public static /* synthetic */ void sendFriendRequest$default(WidgetCallFailed widgetCallFailed, long j, String str, CaptchaHelper.CaptchaPayload captchaPayload, int i, Object obj) {
        if ((i & 4) != 0) {
            captchaPayload = null;
        }
        widgetCallFailed.sendFriendRequest(j, str, captchaPayload);
    }

    private final void sendFriendRequest(long userId, String username, CaptchaHelper.CaptchaPayload captchaPayload) {
        ObservableExtensionsKt.ui$default(RestAPI.addRelationship$default(RestAPI.INSTANCE.getApi(), "Call", userId, null, null, captchaPayload, 8, null), this, null, 2, null).k(b.a.d.o.h(new AnonymousClass1(), getAppActivity(), new AnonymousClass2(userId, username)));
    }
}
