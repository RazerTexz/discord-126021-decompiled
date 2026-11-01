package com.discord.widgets.servers;

import a0.a.a.b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b.a.d.j;
import b.d.b.a.a;
import com.discord.R;
import com.discord.app.AppActivity;
import com.discord.app.AppDialog;
import com.discord.app.AppFragment;
import com.discord.app.LoggingConfig;
import com.discord.databinding.WidgetServerSettingsSecurityBinding;
import com.discord.databinding.WidgetServerSettingsSecurityDialogBinding;
import com.discord.stores.StoreStream;
import com.discord.stores.StoreUser;
import com.discord.utilities.color.ColorCompat;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import com.google.android.material.button.MaterialButton;
import d0.g;
import d0.z.d.k;
import d0.z.d.m;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import rx.Observable;

/* JADX INFO: compiled from: WidgetServerSettingsSecurity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetServerSettingsSecurity extends AppFragment {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetServerSettingsSecurity.class, "binding", "getBinding()Lcom/discord/databinding/WidgetServerSettingsSecurityBinding;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String INTENT_EXTRA_GUILD_ID = "INTENT_EXTRA_GUILD_ID";
    private static final String TAG_TOGGLE_MFA_DIALOG = "TAG_TOGGLE_MFA_DIALOG";

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;

    /* JADX INFO: renamed from: guildId$delegate, reason: from kotlin metadata */
    private final Lazy guildId;
    private final LoggingConfig loggingConfig;

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsSecurity$configureUI$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsSecurity.kt */
    public final class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ Model $model;

        public AnonymousClass1(Model model) {
            this.$model = model;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ToggleMfaDialog.Companion companion = ToggleMfaDialog.INSTANCE;
            FragmentManager parentFragmentManager = WidgetServerSettingsSecurity.this.getParentFragmentManager();
            m.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
            companion.show(parentFragmentManager, this.$model.getGuildId(), this.$model.isMfaEnabled());
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsSecurity$onViewBoundOrOnResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsSecurity.kt */
    public final /* synthetic */ class AnonymousClass1 extends k implements Function1<Model, Unit> {
        public AnonymousClass1(WidgetServerSettingsSecurity widgetServerSettingsSecurity) {
            super(1, widgetServerSettingsSecurity, WidgetServerSettingsSecurity.class, "configureUI", "configureUI(Lcom/discord/widgets/servers/WidgetServerSettingsSecurity$Model;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Model model) throws Exception {
            invoke2(model);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Model model) throws Exception {
            WidgetServerSettingsSecurity.access$configureUI((WidgetServerSettingsSecurity) this.receiver, model);
        }
    }

    /* JADX INFO: compiled from: WidgetServerSettingsSecurity.kt */
    public final class Companion {
        private Companion() {
        }

        public final void create(Context context, long guildId) {
            m.checkNotNullParameter(context, "context");
            StoreStream.INSTANCE.getAnalytics().onGuildSettingsPaneViewed("SECURITY", guildId);
            Intent intentPutExtra = new Intent().putExtra("INTENT_EXTRA_GUILD_ID", guildId);
            m.checkNotNullExpressionValue(intentPutExtra, "Intent().putExtra(INTENT_EXTRA_GUILD_ID, guildId)");
            j.d(context, WidgetServerSettingsSecurity.class, intentPutExtra);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WidgetServerSettingsSecurity.kt */
    public final /* data */ class Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long guildId;
        private final String guildName;
        private final boolean isMfaEnabled;

        /* JADX INFO: compiled from: WidgetServerSettingsSecurity.kt */
        public final class Companion {
            private Companion() {
            }

            public final Observable<Model> get(long guildId) {
                StoreStream.Companion companion = StoreStream.INSTANCE;
                Observable observableJ = Observable.j(StoreUser.observeMe$default(companion.getUsers(), false, 1, null), companion.getGuilds().observeGuild(guildId), WidgetServerSettingsSecurity$Model$Companion$get$1.INSTANCE);
                m.checkNotNullExpressionValue(observableJ, "Observable\n             …        )\n              }");
                Observable<Model> observableR = ObservableExtensionsKt.computationLatest(observableJ).r();
                m.checkNotNullExpressionValue(observableR, "Observable\n             …  .distinctUntilChanged()");
                return observableR;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Model(long j, String str, boolean z2) {
            this.guildId = j;
            this.guildName = str;
            this.isMfaEnabled = z2;
        }

        public static /* synthetic */ Model copy$default(Model model, long j, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = model.guildId;
            }
            if ((i & 2) != 0) {
                str = model.guildName;
            }
            if ((i & 4) != 0) {
                z2 = model.isMfaEnabled;
            }
            return model.copy(j, str, z2);
        }

        public final Model copy(long guildId, String guildName, boolean isMfaEnabled) {
            return new Model(guildId, guildName, isMfaEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return this.guildId == model.guildId && m.areEqual(this.guildName, model.guildName) && this.isMfaEnabled == model.isMfaEnabled;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getGuildId() {
            return this.guildId;
        }

        public final long getGuildId() {
            return this.guildId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGuildName() {
            return this.guildName;
        }

        public final String getGuildName() {
            return this.guildName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsMfaEnabled() {
            return this.isMfaEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iA = b.a(this.guildId) * 31;
            String str = this.guildName;
            int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
            boolean z2 = this.isMfaEnabled;
            ?? r1 = z2;
            if (z2) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        public final boolean isMfaEnabled() {
            return this.isMfaEnabled;
        }

        public String toString() {
            StringBuilder sbU = a.U("Model(guildId=");
            sbU.append(this.guildId);
            sbU.append(", guildName=");
            sbU.append(this.guildName);
            sbU.append(", isMfaEnabled=");
            return a.O(sbU, this.isMfaEnabled, ")");
        }
    }

    /* JADX INFO: compiled from: WidgetServerSettingsSecurity.kt */
    public final class ToggleMfaDialog extends AppDialog {
        public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(ToggleMfaDialog.class, "binding", "getBinding()Lcom/discord/databinding/WidgetServerSettingsSecurityDialogBinding;", 0)};
        private static final String ARG_GUILD_ID = "ARG_GUILD_ID";
        private static final String ARG_MFA_ENABLED = "ARG_MFA_ENABLED";

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
        private final FragmentViewBindingDelegate binding;

        /* JADX INFO: renamed from: guildId$delegate, reason: from kotlin metadata */
        private final Lazy guildId;

        /* JADX INFO: renamed from: mfaEnabled$delegate, reason: from kotlin metadata */
        private final Lazy mfaEnabled;

        /* JADX INFO: compiled from: WidgetServerSettingsSecurity.kt */
        public final class Companion {
            private Companion() {
            }

            public final void show(FragmentManager fragmentManager, long guildId, boolean mfaEnabled) {
                m.checkNotNullParameter(fragmentManager, "fragmentManager");
                ToggleMfaDialog toggleMfaDialog = new ToggleMfaDialog();
                Bundle bundle = new Bundle();
                bundle.putLong(ToggleMfaDialog.ARG_GUILD_ID, guildId);
                bundle.putBoolean(ToggleMfaDialog.ARG_MFA_ENABLED, mfaEnabled);
                toggleMfaDialog.setArguments(bundle);
                toggleMfaDialog.show(fragmentManager, WidgetServerSettingsSecurity.TAG_TOGGLE_MFA_DIALOG);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public ToggleMfaDialog() {
            super(R.layout.widget_server_settings_security_dialog);
            this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetServerSettingsSecurity$ToggleMfaDialog$binding$2.INSTANCE, null, 2, null);
            this.guildId = g.lazy(new WidgetServerSettingsSecurity$ToggleMfaDialog$guildId$2(this));
            this.mfaEnabled = g.lazy(new WidgetServerSettingsSecurity$ToggleMfaDialog$mfaEnabled$2(this));
        }

        public static final /* synthetic */ Bundle access$getArgumentsOrDefault$p(ToggleMfaDialog toggleMfaDialog) {
            return toggleMfaDialog.getArgumentsOrDefault();
        }

        public static final /* synthetic */ WidgetServerSettingsSecurityDialogBinding access$getBinding$p(ToggleMfaDialog toggleMfaDialog) {
            return toggleMfaDialog.getBinding();
        }

        public final void configure(long guildId, boolean mfaEnabled) {
            if (guildId <= 0) {
                dismiss();
            }
            getBinding().c.setText(mfaEnabled ? R.string.disable : R.string.enable);
            MaterialButton materialButton = getBinding().c;
            m.checkNotNullExpressionValue(materialButton, "binding.serverSettingsSecurityDialogConfirm");
            WidgetServerSettingsSecurityDialogBinding binding = getBinding();
            m.checkNotNullExpressionValue(binding, "binding");
            LinearLayout linearLayout = binding.a;
            m.checkNotNullExpressionValue(linearLayout, "binding.root");
            materialButton.setBackgroundTintList(ColorStateList.valueOf(ColorCompat.getColor(linearLayout.getContext(), mfaEnabled ? R.color.status_red_500 : R.color.status_green_600)));
            getBinding().c.setOnClickListener(new WidgetServerSettingsSecurity$ToggleMfaDialog$configure$1(this, mfaEnabled, guildId));
            getBinding().f2587b.setOnClickListener(new WidgetServerSettingsSecurity$ToggleMfaDialog$configure$2(this));
        }

        private final WidgetServerSettingsSecurityDialogBinding getBinding() {
            return (WidgetServerSettingsSecurityDialogBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
        }

        private final long getGuildId() {
            return ((Number) this.guildId.getValue()).longValue();
        }

        private final boolean getMfaEnabled() {
            return ((Boolean) this.mfaEnabled.getValue()).booleanValue();
        }

        @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            m.checkNotNullParameter(dialog, "dialog");
            super.onDismiss(dialog);
            AppDialog.hideKeyboard$default(this, null, 1, null);
        }

        @Override // com.discord.app.AppDialog
        public void onViewBoundOrOnResume() {
            super.onViewBoundOrOnResume();
            configure(getGuildId(), getMfaEnabled());
        }
    }

    public WidgetServerSettingsSecurity() {
        super(R.layout.widget_server_settings_security);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetServerSettingsSecurity$binding$2.INSTANCE, null, 2, null);
        this.guildId = g.lazy(new WidgetServerSettingsSecurity$guildId$2(this));
        this.loggingConfig = new LoggingConfig(false, null, WidgetServerSettingsSecurity$loggingConfig$1.INSTANCE, 3);
    }

    public static final /* synthetic */ void access$configureUI(WidgetServerSettingsSecurity widgetServerSettingsSecurity, Model model) throws Exception {
        widgetServerSettingsSecurity.configureUI(model);
    }

    private final void configureUI(Model model) throws Exception {
        if (model == null) {
            AppActivity appActivity = getAppActivity();
            if (appActivity != null) {
                appActivity.onBackPressed();
                return;
            }
            return;
        }
        setActionBarTitle(R.string.security);
        setActionBarSubtitle(model.getGuildName());
        if (model.isMfaEnabled()) {
            getBinding().c.setText(R.string.guild_security_req_mfa_turn_off);
            MaterialButton materialButton = getBinding().c;
            m.checkNotNullExpressionValue(materialButton, "binding.serverSettingsSecurityToggleMfaButton");
            materialButton.setBackgroundTintList(ColorStateList.valueOf(ColorCompat.getColor(requireContext(), R.color.status_red_500)));
        } else {
            getBinding().c.setText(R.string.guild_security_req_mfa_turn_on);
            MaterialButton materialButton2 = getBinding().c;
            m.checkNotNullExpressionValue(materialButton2, "binding.serverSettingsSecurityToggleMfaButton");
            materialButton2.setBackgroundTintList(ColorStateList.valueOf(ColorCompat.getColor(requireContext(), R.color.status_green_600)));
        }
        Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag(TAG_TOGGLE_MFA_DIALOG);
        if (fragmentFindFragmentByTag != null) {
            ((ToggleMfaDialog) fragmentFindFragmentByTag).configure(model.getGuildId(), model.isMfaEnabled());
        }
        getBinding().c.setOnClickListener(new AnonymousClass1(model));
    }

    private final WidgetServerSettingsSecurityBinding getBinding() {
        return (WidgetServerSettingsSecurityBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final long getGuildId() {
        return ((Number) this.guildId.getValue()).longValue();
    }

    @Override // com.discord.app.AppFragment, com.discord.app.AppLogger.a
    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    @Override // com.discord.app.AppFragment
    public void onViewBound(View view) {
        m.checkNotNullParameter(view, "view");
        super.onViewBound(view);
        AppFragment.setActionBarDisplayHomeAsUpEnabled$default(this, false, 1, null);
        Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag(TAG_TOGGLE_MFA_DIALOG);
        if (fragmentFindFragmentByTag != null) {
            getParentFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        TextView textView = getBinding().f2586b;
        m.checkNotNullExpressionValue(textView, "binding.mfaDescriptionText");
        b.a.k.b.n(textView, R.string.guild_security_req_mfa_body, new Object[0], null, 4);
    }

    @Override // com.discord.app.AppFragment
    public void onViewBoundOrOnResume() {
        super.onViewBoundOrOnResume();
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui$default(Model.INSTANCE.get(getGuildId()), this, null, 2, null), WidgetServerSettingsSecurity.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(this), 62, (Object) null);
    }
}
