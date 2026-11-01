package com.discord.widgets.stage.sheet;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import b.a.d.g0;
import b.a.d.i0;
import b.d.b.a.a;
import com.discord.R;
import com.discord.app.AppBottomSheet;
import com.discord.databinding.WidgetStageAudienceBlockedBottomSheetBinding;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.view.recycler.MaxHeightRecyclerView;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import com.discord.widgets.stage.StageChannelJoinHelper;
import d0.g;
import d0.z.d.a0;
import d0.z.d.k;
import d0.z.d.m;
import d0.z.d.o;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: WidgetStageAudienceBlockedBottomSheet.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetStageAudienceBlockedBottomSheet extends AppBottomSheet {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetStageAudienceBlockedBottomSheet.class, "binding", "getBinding()Lcom/discord/databinding/WidgetStageAudienceBlockedBottomSheetBinding;", 0)};
    private static final String EXTRA_LAUNCH_FULL_SCREEN = "LAUNCH_FULL_SCREEN";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private StageAudienceBlockedBottomSheetAdapter adapter;

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;

    /* JADX INFO: renamed from: channelId$delegate, reason: from kotlin metadata */
    private final Lazy channelId;

    /* JADX INFO: renamed from: launchStageFullScreen$delegate, reason: from kotlin metadata */
    private final Lazy launchStageFullScreen;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageAudienceBlockedBottomSheet$configureUI$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetStageAudienceBlockedBottomSheet.kt */
    public final class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ StageAudienceBlockedBottomSheetViewModel.ViewState $viewState;

        /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageAudienceBlockedBottomSheet$configureUI$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: WidgetStageAudienceBlockedBottomSheet.kt */
        public final class C04631 extends o implements Function0<Unit> {
            public C04631() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WidgetStageAudienceBlockedBottomSheet.this.dismiss();
            }
        }

        public AnonymousClass1(StageAudienceBlockedBottomSheetViewModel.ViewState viewState) {
            this.$viewState = viewState;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StageChannelJoinHelper stageChannelJoinHelper = StageChannelJoinHelper.INSTANCE;
            Context contextRequireContext = WidgetStageAudienceBlockedBottomSheet.this.requireContext();
            m.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            FragmentManager parentFragmentManager = WidgetStageAudienceBlockedBottomSheet.this.getParentFragmentManager();
            m.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
            StageChannelJoinHelper.connectToStage$default(stageChannelJoinHelper, contextRequireContext, parentFragmentManager, ((StageAudienceBlockedBottomSheetViewModel.ViewState.Loaded) this.$viewState).getChannel().getId(), true, WidgetStageAudienceBlockedBottomSheet.access$getLaunchStageFullScreen$p(WidgetStageAudienceBlockedBottomSheet.this), null, null, null, null, new C04631(), 480, null);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageAudienceBlockedBottomSheet$onResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetStageAudienceBlockedBottomSheet.kt */
    public final /* synthetic */ class AnonymousClass1 extends k implements Function1<StageAudienceBlockedBottomSheetViewModel.ViewState, Unit> {
        public AnonymousClass1(WidgetStageAudienceBlockedBottomSheet widgetStageAudienceBlockedBottomSheet) {
            super(1, widgetStageAudienceBlockedBottomSheet, WidgetStageAudienceBlockedBottomSheet.class, "configureUI", "configureUI(Lcom/discord/widgets/stage/sheet/StageAudienceBlockedBottomSheetViewModel$ViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StageAudienceBlockedBottomSheetViewModel.ViewState viewState) {
            invoke2(viewState);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StageAudienceBlockedBottomSheetViewModel.ViewState viewState) {
            m.checkNotNullParameter(viewState, "p1");
            WidgetStageAudienceBlockedBottomSheet.access$configureUI((WidgetStageAudienceBlockedBottomSheet) this.receiver, viewState);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageAudienceBlockedBottomSheet$configureUI$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetStageAudienceBlockedBottomSheet.kt */
    public final class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WidgetStageAudienceBlockedBottomSheet.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WidgetStageAudienceBlockedBottomSheet.kt */
    public final class Companion {
        private Companion() {
        }

        public final void show(FragmentManager fragmentManager, long channelId, boolean launchStageFullScreen) {
            m.checkNotNullParameter(fragmentManager, "fragmentManager");
            WidgetStageAudienceBlockedBottomSheet widgetStageAudienceBlockedBottomSheet = new WidgetStageAudienceBlockedBottomSheet();
            widgetStageAudienceBlockedBottomSheet.setArguments(BundleKt.bundleOf(d0.o.to("com.discord.intent.extra.EXTRA_CHANNEL_ID", Long.valueOf(channelId)), d0.o.to(WidgetStageAudienceBlockedBottomSheet.EXTRA_LAUNCH_FULL_SCREEN, Boolean.valueOf(launchStageFullScreen))));
            widgetStageAudienceBlockedBottomSheet.show(fragmentManager, WidgetStageAudienceBlockedBottomSheet.class.getSimpleName());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetStageAudienceBlockedBottomSheet() {
        super(false, 1, null);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetStageAudienceBlockedBottomSheet$binding$2.INSTANCE, null, 2, null);
        this.channelId = g.lazy(new WidgetStageAudienceBlockedBottomSheet$channelId$2(this));
        this.launchStageFullScreen = g.lazy(new WidgetStageAudienceBlockedBottomSheet$launchStageFullScreen$2(this));
        WidgetStageAudienceBlockedBottomSheet$viewModel$2 widgetStageAudienceBlockedBottomSheet$viewModel$2 = new WidgetStageAudienceBlockedBottomSheet$viewModel$2(this);
        g0 g0Var = new g0(this);
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, a0.getOrCreateKotlinClass(StageAudienceBlockedBottomSheetViewModel.class), new WidgetStageAudienceBlockedBottomSheet$appViewModels$$inlined$viewModels$1(g0Var), new i0(widgetStageAudienceBlockedBottomSheet$viewModel$2));
    }

    public static final /* synthetic */ void access$configureUI(WidgetStageAudienceBlockedBottomSheet widgetStageAudienceBlockedBottomSheet, StageAudienceBlockedBottomSheetViewModel.ViewState viewState) {
        widgetStageAudienceBlockedBottomSheet.configureUI(viewState);
    }

    public static final /* synthetic */ Bundle access$getArgumentsOrDefault$p(WidgetStageAudienceBlockedBottomSheet widgetStageAudienceBlockedBottomSheet) {
        return widgetStageAudienceBlockedBottomSheet.getArgumentsOrDefault();
    }

    public static final /* synthetic */ long access$getChannelId$p(WidgetStageAudienceBlockedBottomSheet widgetStageAudienceBlockedBottomSheet) {
        return widgetStageAudienceBlockedBottomSheet.getChannelId();
    }

    public static final /* synthetic */ boolean access$getLaunchStageFullScreen$p(WidgetStageAudienceBlockedBottomSheet widgetStageAudienceBlockedBottomSheet) {
        return widgetStageAudienceBlockedBottomSheet.getLaunchStageFullScreen();
    }

    private final void configureUI(StageAudienceBlockedBottomSheetViewModel.ViewState viewState) {
        if (viewState instanceof StageAudienceBlockedBottomSheetViewModel.ViewState.Invalid) {
            dismiss();
            return;
        }
        if (!(viewState instanceof StageAudienceBlockedBottomSheetViewModel.ViewState.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        getBinding().f2647b.setOnClickListener(new AnonymousClass1(viewState));
        getBinding().d.setOnClickListener(new AnonymousClass2());
        StageAudienceBlockedBottomSheetAdapter stageAudienceBlockedBottomSheetAdapter = this.adapter;
        if (stageAudienceBlockedBottomSheetAdapter == null) {
            m.throwUninitializedPropertyAccessException("adapter");
        }
        stageAudienceBlockedBottomSheetAdapter.setData(((StageAudienceBlockedBottomSheetViewModel.ViewState.Loaded) viewState).getListItems());
    }

    private final WidgetStageAudienceBlockedBottomSheetBinding getBinding() {
        return (WidgetStageAudienceBlockedBottomSheetBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final long getChannelId() {
        return ((Number) this.channelId.getValue()).longValue();
    }

    @Override // com.discord.app.AppBottomSheet
    public int getContentViewResId() {
        return R.layout.widget_stage_audience_blocked_bottom_sheet;
    }

    private final boolean getLaunchStageFullScreen() {
        return ((Boolean) this.launchStageFullScreen.getValue()).booleanValue();
    }

    private final StageAudienceBlockedBottomSheetViewModel getViewModel() {
        return (StageAudienceBlockedBottomSheetViewModel) this.viewModel.getValue();
    }

    @Override // com.discord.app.AppBottomSheet, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.bindToComponentLifecycle$default(getViewModel().observeViewState(), this, null, 2, null), WidgetStageAudienceBlockedBottomSheet.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(this), 62, (Object) null);
    }

    @Override // com.discord.app.AppBottomSheet, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        m.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WidgetStageAudienceBlockedBottomSheetBinding binding = getBinding();
        m.checkNotNullExpressionValue(binding, "binding");
        setPeekHeightBottomView(binding.a);
        MaxHeightRecyclerView maxHeightRecyclerView = getBinding().c;
        m.checkNotNullExpressionValue(maxHeightRecyclerView, "binding.blockedUsers");
        this.adapter = new StageAudienceBlockedBottomSheetAdapter(maxHeightRecyclerView);
    }
}
