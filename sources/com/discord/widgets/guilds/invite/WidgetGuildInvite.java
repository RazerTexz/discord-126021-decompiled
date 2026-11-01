package com.discord.widgets.guilds.invite;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import b.a.d.g0;
import b.a.d.i0;
import b.a.d.j;
import b.d.b.a.a;
import com.discord.R;
import com.discord.api.guildscheduledevent.GuildScheduledEvent;
import com.discord.app.AppActivity;
import com.discord.app.AppFragment;
import com.discord.databinding.WidgetGuildInvitePageBinding;
import com.discord.models.domain.ModelInvite;
import com.discord.stores.StoreGuilds;
import com.discord.stores.StoreInviteSettings;
import com.discord.stores.StoreStream;
import com.discord.stores.StoreUser;
import com.discord.utilities.analytics.AnalyticsTracker;
import com.discord.utilities.error.Error;
import com.discord.utilities.guildscheduledevent.GuildScheduledEventUtilitiesKt;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import com.discord.widgets.guildscheduledevent.GuildScheduledEventItemView;
import com.discord.widgets.guildscheduledevent.GuildScheduledEventModel;
import com.discord.widgets.guildscheduledevent.GuildScheduledEventModelKt;
import com.google.android.material.button.MaterialButton;
import d0.z.d.a0;
import d0.z.d.m;
import d0.z.d.o;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: WidgetGuildInvite.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetGuildInvite extends AppFragment {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetGuildInvite.class, "binding", "getBinding()Lcom/discord/databinding/WidgetGuildInvitePageBinding;", 0)};
    private static final String EXTRA_CODE = "EXTRA_CODE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;
    private final StoreInviteSettings.InviteCode inviteCode;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: com.discord.widgets.guilds.invite.WidgetGuildInvite$onViewBound$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetGuildInvite.kt */
    public final class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws Exception {
            AppActivity appActivity = WidgetGuildInvite.this.getAppActivity();
            if (appActivity != null) {
                appActivity.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.guilds.invite.WidgetGuildInvite$onViewBoundOrOnResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetGuildInvite.kt */
    public final class AnonymousClass1 extends o implements Function1<GuildInviteViewModel.ViewState, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GuildInviteViewModel.ViewState viewState) {
            invoke2(viewState);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GuildInviteViewModel.ViewState viewState) {
            m.checkNotNullParameter(viewState, "viewState");
            WidgetGuildInvite.this.configureUI(viewState);
        }
    }

    /* JADX INFO: compiled from: WidgetGuildInvite.kt */
    public final class Companion {
        private Companion() {
        }

        public final void launch(Context context, StoreInviteSettings.InviteCode inviteCode) {
            m.checkNotNullParameter(context, "context");
            m.checkNotNullParameter(inviteCode, "inviteCode");
            Intent intent = new Intent();
            intent.putExtra(WidgetGuildInvite.EXTRA_CODE, inviteCode);
            j.d(context, WidgetGuildInvite.class, intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetGuildInvite() {
        super(R.layout.widget_guild_invite_page);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetGuildInvite$binding$2.INSTANCE, null, 2, null);
        WidgetGuildInvite$viewModel$2 widgetGuildInvite$viewModel$2 = new WidgetGuildInvite$viewModel$2(this);
        g0 g0Var = new g0(this);
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, a0.getOrCreateKotlinClass(GuildInviteViewModel.class), new WidgetGuildInvite$appViewModels$$inlined$viewModels$1(g0Var), new i0(widgetGuildInvite$viewModel$2));
        this.inviteCode = (StoreInviteSettings.InviteCode) getMostRecentIntent().getParcelableExtra(EXTRA_CODE);
    }

    public static final /* synthetic */ void access$configureUIFailure(WidgetGuildInvite widgetGuildInvite, Error error) {
        widgetGuildInvite.configureUIFailure(error);
    }

    private final void configureLoadedUI(GuildInviteViewModel.ViewState.Loaded viewState) {
        boolean z2;
        GuildScheduledEventModel model;
        ModelInvite invite = viewState.getInvite();
        getBinding().d.configureUI(invite, new WidgetGuildInvite$configureLoadedUI$onAcceptClick$1(this, invite));
        GuildScheduledEventItemView guildScheduledEventItemView = getBinding().c;
        m.checkNotNullExpressionValue(guildScheduledEventItemView, "binding.guildInviteEventInfo");
        GuildScheduledEvent guildScheduledEvent = invite.getGuildScheduledEvent();
        if (guildScheduledEvent == null || (model = GuildScheduledEventModelKt.toModel(guildScheduledEvent)) == null) {
            z2 = false;
        } else {
            getBinding().c.configureAsPreview(model, invite.getChannel(), GuildScheduledEventUtilitiesKt.getCreatorUserGuildMember$default(model, (StoreGuilds) null, (StoreUser) null, 3, (Object) null));
            z2 = true;
        }
        guildScheduledEventItemView.setVisibility(z2 ? 0 : 8);
        MaterialButton materialButton = getBinding().f2416b;
        m.checkNotNullExpressionValue(materialButton, "binding.guildInviteCancel");
        materialButton.setVisibility(8);
    }

    public final void configureUI(GuildInviteViewModel.ViewState viewState) {
        m.checkNotNullParameter(viewState, "viewState");
        if (viewState instanceof GuildInviteViewModel.ViewState.Invalid) {
            configureUIFailure(null);
        } else if (viewState instanceof GuildInviteViewModel.ViewState.Loaded) {
            GuildInviteViewModel.ViewState.Loaded loaded = (GuildInviteViewModel.ViewState.Loaded) viewState;
            trackAndConsumeDynamicLinkCache(loaded.getInvite());
            configureLoadedUI(loaded);
        }
    }

    private final void configureUIFailure(Error e) {
        MaterialButton materialButton = getBinding().f2416b;
        m.checkNotNullExpressionValue(materialButton, "binding.guildInviteCancel");
        materialButton.setVisibility(0);
        getBinding().d.configureUIFailure(e);
        trackAndConsumeDynamicLinkCache(null);
    }

    private final WidgetGuildInvitePageBinding getBinding() {
        return (WidgetGuildInvitePageBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final GuildInviteViewModel getViewModel() {
        return (GuildInviteViewModel) this.viewModel.getValue();
    }

    @Override // com.discord.app.AppFragment
    public void onViewBound(View view) {
        m.checkNotNullParameter(view, "view");
        super.onViewBound(view);
        AppFragment.setActionBarDisplayHomeAsUpEnabled$default(this, false, 1, null);
        AnalyticsTracker analyticsTracker = AnalyticsTracker.INSTANCE;
        StoreInviteSettings.InviteCode inviteCode = this.inviteCode;
        analyticsTracker.impressionInviteAccept(inviteCode != null ? inviteCode.getInviteCode() : null);
        getBinding().f2416b.setOnClickListener(new AnonymousClass1());
    }

    @Override // com.discord.app.AppFragment
    public void onViewBoundOrOnResume() {
        super.onViewBoundOrOnResume();
        getViewModel().fetchInviteIfNotLoaded();
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.bindToComponentLifecycle$default(getViewModel().observeViewState(), this, null, 2, null), WidgetGuildInvite.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(), 62, (Object) null);
    }

    private final void trackAndConsumeDynamicLinkCache(ModelInvite invite) {
        String source;
        String inviteCode;
        String source2;
        StoreStream.INSTANCE.getInviteSettings().clearInviteCode();
        if (getViewModel().getInviteResolved()) {
            return;
        }
        getViewModel().setInviteResolved(true);
        String str = "";
        if (invite == null) {
            StoreInviteSettings.InviteCode inviteCode2 = this.inviteCode;
            String str2 = (inviteCode2 == null || (inviteCode = inviteCode2.getInviteCode()) == null) ? "" : inviteCode;
            StoreInviteSettings.InviteCode inviteCode3 = this.inviteCode;
            AnalyticsTracker.inviteResolveFailed$default(str2, (inviteCode3 == null || (source = inviteCode3.getSource()) == null) ? "" : source, null, null, 12, null);
            return;
        }
        AnalyticsTracker analyticsTracker = AnalyticsTracker.INSTANCE;
        StoreInviteSettings.InviteCode inviteCode4 = this.inviteCode;
        if (inviteCode4 != null && (source2 = inviteCode4.getSource()) != null) {
            str = source2;
        }
        analyticsTracker.inviteResolved(invite, str);
    }
}
