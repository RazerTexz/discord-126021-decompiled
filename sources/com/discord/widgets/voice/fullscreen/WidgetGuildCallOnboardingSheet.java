package com.discord.widgets.voice.fullscreen;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.preference.PreferenceManager;
import b.a.d.g0;
import b.a.d.i0;
import b.a.y.g;
import b.c.a.a0.d;
import b.d.b.a.a;
import com.discord.R;
import com.discord.app.AppBottomSheet;
import com.discord.app.AppTransitionActivity;
import com.discord.databinding.WidgetGuildCallOnboardingBinding;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import com.discord.utilities.voice.VoiceChannelJoinability;
import com.discord.views.JoinVoiceChannelButton;
import com.discord.widgets.chat.list.TextInVoiceFeatureFlag;
import com.discord.widgets.voice.sheet.WidgetVoiceBottomSheet;
import d0.z.d.a0;
import d0.z.d.m;
import d0.z.d.o;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: WidgetGuildCallOnboardingSheet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WidgetGuildCallOnboardingSheet extends AppBottomSheet {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetGuildCallOnboardingSheet.class, "binding", "getBinding()Lcom/discord/databinding/WidgetGuildCallOnboardingBinding;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: com.discord.widgets.voice.fullscreen.WidgetGuildCallOnboardingSheet$configureUI$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetGuildCallOnboardingSheet.kt */
    public final class AnonymousClass1 extends o implements Function0<Unit> {

        /* JADX INFO: renamed from: com.discord.widgets.voice.fullscreen.WidgetGuildCallOnboardingSheet$configureUI$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: WidgetGuildCallOnboardingSheet.kt */
        public final class C04851 extends o implements Function0<Unit> {
            public C04851() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Companion companion = WidgetGuildCallOnboardingSheet.INSTANCE;
                Context contextRequireContext = WidgetGuildCallOnboardingSheet.this.requireContext();
                m.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                companion.markSeenUserVoiceChannelOnboarding(contextRequireContext);
                WidgetGuildCallOnboardingSheet.access$getViewModel$p(WidgetGuildCallOnboardingSheet.this).onConnectPressed();
            }
        }

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            d.S1(WidgetGuildCallOnboardingSheet.this, null, new C04851(), 1, null);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.voice.fullscreen.WidgetGuildCallOnboardingSheet$onResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetGuildCallOnboardingSheet.kt */
    public final class AnonymousClass1 extends o implements Function1<WidgetGuildCallOnboardingSheetViewModel.ViewState, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WidgetGuildCallOnboardingSheetViewModel.ViewState viewState) {
            invoke2(viewState);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetGuildCallOnboardingSheetViewModel.ViewState viewState) {
            m.checkNotNullParameter(viewState, "viewState");
            WidgetGuildCallOnboardingSheet.access$configureUI(WidgetGuildCallOnboardingSheet.this, viewState);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.voice.fullscreen.WidgetGuildCallOnboardingSheet$onResume$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetGuildCallOnboardingSheet.kt */
    public final class AnonymousClass2 extends o implements Function1<WidgetGuildCallOnboardingSheetViewModel.Event, Unit> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WidgetGuildCallOnboardingSheetViewModel.Event event) {
            invoke2(event);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetGuildCallOnboardingSheetViewModel.Event event) {
            m.checkNotNullParameter(event, "event");
            WidgetGuildCallOnboardingSheet.access$handleEvent(WidgetGuildCallOnboardingSheet.this, event);
        }
    }

    /* JADX INFO: compiled from: WidgetGuildCallOnboardingSheet.kt */
    public final class Companion {
        private Companion() {
        }

        public final boolean hasUserSeenVoiceChannelOnboarding(Context context) {
            m.checkNotNullParameter(context, "context");
            return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("CACHE_KEY_VOICE_CHANNEL_ONBOARDED", false);
        }

        public final void markSeenUserVoiceChannelOnboarding(Context context) {
            m.checkNotNullParameter(context, "context");
            PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("CACHE_KEY_VOICE_CHANNEL_ONBOARDED", true).apply();
        }

        public final void show(FragmentManager fragmentManager, long channelId) {
            m.checkNotNullParameter(fragmentManager, "fragmentManager");
            WidgetGuildCallOnboardingSheet widgetGuildCallOnboardingSheet = new WidgetGuildCallOnboardingSheet();
            Bundle bundle = new Bundle();
            bundle.putLong("com.discord.intent.extra.EXTRA_CHANNEL_ID", channelId);
            widgetGuildCallOnboardingSheet.setArguments(bundle);
            widgetGuildCallOnboardingSheet.show(fragmentManager, WidgetGuildCallOnboardingSheet.class.getName());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetGuildCallOnboardingSheet() {
        super(false, 1, null);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetGuildCallOnboardingSheet$binding$2.INSTANCE, null, 2, null);
        WidgetGuildCallOnboardingSheet$viewModel$2 widgetGuildCallOnboardingSheet$viewModel$2 = new WidgetGuildCallOnboardingSheet$viewModel$2(this);
        g0 g0Var = new g0(this);
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, a0.getOrCreateKotlinClass(WidgetGuildCallOnboardingSheetViewModel.class), new WidgetGuildCallOnboardingSheet$appViewModels$$inlined$viewModels$1(g0Var), new i0(widgetGuildCallOnboardingSheet$viewModel$2));
    }

    public static final /* synthetic */ void access$configureUI(WidgetGuildCallOnboardingSheet widgetGuildCallOnboardingSheet, WidgetGuildCallOnboardingSheetViewModel.ViewState viewState) {
        widgetGuildCallOnboardingSheet.configureUI(viewState);
    }

    public static final /* synthetic */ Bundle access$getArgumentsOrDefault$p(WidgetGuildCallOnboardingSheet widgetGuildCallOnboardingSheet) {
        return widgetGuildCallOnboardingSheet.getArgumentsOrDefault();
    }

    public static final /* synthetic */ WidgetGuildCallOnboardingSheetViewModel access$getViewModel$p(WidgetGuildCallOnboardingSheet widgetGuildCallOnboardingSheet) {
        return widgetGuildCallOnboardingSheet.getViewModel();
    }

    public static final /* synthetic */ void access$handleEvent(WidgetGuildCallOnboardingSheet widgetGuildCallOnboardingSheet, WidgetGuildCallOnboardingSheetViewModel.Event event) {
        widgetGuildCallOnboardingSheet.handleEvent(event);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void configureUI(WidgetGuildCallOnboardingSheetViewModel.ViewState viewState) {
        if (viewState instanceof WidgetGuildCallOnboardingSheetViewModel.ViewState.Loaded) {
            JoinVoiceChannelButton joinVoiceChannelButton = getBinding().f2409b;
            VoiceChannelJoinability joinability = ((WidgetGuildCallOnboardingSheetViewModel.ViewState.Loaded) viewState).getJoinability();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            Objects.requireNonNull(joinVoiceChannelButton);
            m.checkNotNullParameter(joinability, "joinability");
            m.checkNotNullParameter(anonymousClass1, "joinVoiceClickListener");
            int iOrdinal = joinability.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    joinVoiceChannelButton.setText(R.string.channel_locked_short);
                    joinVoiceChannelButton.a(joinVoiceChannelButton, R.string.channel_locked);
                    return;
                } else if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        joinVoiceChannelButton.setText(R.string.unable_to_join_channel_full);
                        joinVoiceChannelButton.a(joinVoiceChannelButton, R.string.unable_to_join_channel_full);
                        return;
                    } else {
                        if (iOrdinal != 4) {
                            return;
                        }
                        joinVoiceChannelButton.setText(R.string.connect_to_voice);
                        joinVoiceChannelButton.a(joinVoiceChannelButton, R.string.guild_settings_public_welcome_invalid_channel);
                        return;
                    }
                }
            }
            joinVoiceChannelButton.setText(R.string.connect_to_voice);
            joinVoiceChannelButton.setOnClickListener(new g(anonymousClass1));
        }
    }

    private final WidgetGuildCallOnboardingBinding getBinding() {
        return (WidgetGuildCallOnboardingBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    @Override // com.discord.app.AppBottomSheet
    public int getContentViewResId() {
        return R.layout.widget_guild_call_onboarding;
    }

    private final WidgetGuildCallOnboardingSheetViewModel getViewModel() {
        return (WidgetGuildCallOnboardingSheetViewModel) this.viewModel.getValue();
    }

    private final void handleEvent(WidgetGuildCallOnboardingSheetViewModel.Event event) {
        if (m.areEqual(event, WidgetGuildCallOnboardingSheetViewModel.Event.ShowGuildVideoCapacityDialog.INSTANCE)) {
            b.a.a.m.Companion companion = b.a.a.m.INSTANCE;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            m.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
            companion.a(parentFragmentManager);
            dismiss();
            return;
        }
        if (event instanceof WidgetGuildCallOnboardingSheetViewModel.Event.LaunchGuildCallScreen) {
            WidgetGuildCallOnboardingSheetViewModel.Event.LaunchGuildCallScreen launchGuildCallScreen = (WidgetGuildCallOnboardingSheetViewModel.Event.LaunchGuildCallScreen) event;
            if (TextInVoiceFeatureFlag.INSTANCE.getINSTANCE().isEnabled(launchGuildCallScreen.getGuildId())) {
                WidgetCallPreviewFullscreen.Companion companion2 = WidgetCallPreviewFullscreen.INSTANCE;
                Context contextRequireContext = requireContext();
                m.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                companion2.launch(contextRequireContext, launchGuildCallScreen.getChannelId(), AppTransitionActivity.Transition.TYPE_SLIDE_VERTICAL_WITH_FADE);
            } else {
                WidgetVoiceBottomSheet.Companion companion3 = WidgetVoiceBottomSheet.INSTANCE;
                FragmentManager parentFragmentManager2 = getParentFragmentManager();
                m.checkNotNullExpressionValue(parentFragmentManager2, "parentFragmentManager");
                companion3.show(parentFragmentManager2, launchGuildCallScreen.getChannelId(), true, WidgetVoiceBottomSheet.FeatureContext.HOME);
            }
            dismiss();
        }
    }

    @Override // com.discord.app.AppBottomSheet, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.bindToComponentLifecycle$default(getViewModel().observeViewState(), this, null, 2, null), WidgetGuildCallOnboardingSheet.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(), 62, (Object) null);
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.bindToComponentLifecycle$default(getViewModel().observeEvents(), this, null, 2, null), WidgetGuildCallOnboardingSheet.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass2(), 62, (Object) null);
    }
}
