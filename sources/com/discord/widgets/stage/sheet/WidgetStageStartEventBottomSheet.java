package com.discord.widgets.stage.sheet;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import b.a.d.g0;
import b.a.d.i0;
import b.d.b.a.a;
import com.discord.R;
import com.discord.app.AppBottomSheet;
import com.discord.databinding.WidgetStageStartEventBottomSheetBinding;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.view.extensions.ViewExtensions;
import com.discord.utilities.view.text.TextWatcherKt;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import d0.g;
import d0.z.d.a0;
import d0.z.d.m;
import d0.z.d.o;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: WidgetStageStartEventBottomSheet.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetStageStartEventBottomSheet extends AppBottomSheet {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetStageStartEventBottomSheet.class, "binding", "getBinding()Lcom/discord/databinding/WidgetStageStartEventBottomSheetBinding;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;

    /* JADX INFO: renamed from: channelId$delegate, reason: from kotlin metadata */
    private final Lazy channelId;
    private Function0<Unit> onDismiss;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageStartEventBottomSheet$onResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetStageStartEventBottomSheet.kt */
    public final class AnonymousClass1 extends o implements Function1<WidgetStageStartEventBottomSheetViewModel.Event, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WidgetStageStartEventBottomSheetViewModel.Event event) {
            invoke2(event);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetStageStartEventBottomSheetViewModel.Event event) {
            m.checkNotNullParameter(event, "event");
            WidgetStageStartEventBottomSheet.access$handleEvent(WidgetStageStartEventBottomSheet.this, event);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageStartEventBottomSheet$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetStageStartEventBottomSheet.kt */
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
            m.checkNotNullParameter(editable, "editable");
            TextInputLayout textInputLayout = WidgetStageStartEventBottomSheet.access$getBinding$p(WidgetStageStartEventBottomSheet.this).g;
            m.checkNotNullExpressionValue(textInputLayout, "binding.topicLayout");
            textInputLayout.setError(null);
            WidgetStageStartEventBottomSheet.access$getViewModel$p(WidgetStageStartEventBottomSheet.this).setTopic(editable.toString());
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageStartEventBottomSheet$onResume$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetStageStartEventBottomSheet.kt */
    public final class AnonymousClass2 extends o implements Function1<WidgetStageStartEventBottomSheetViewModel.ViewState, Unit> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WidgetStageStartEventBottomSheetViewModel.ViewState viewState) {
            invoke2(viewState);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetStageStartEventBottomSheetViewModel.ViewState viewState) {
            m.checkNotNullParameter(viewState, "viewState");
            WidgetStageStartEventBottomSheet.access$configureUI(WidgetStageStartEventBottomSheet.this, viewState);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageStartEventBottomSheet$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetStageStartEventBottomSheet.kt */
    public final class AnonymousClass2 implements View.OnClickListener {

        /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageStartEventBottomSheet$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: WidgetStageStartEventBottomSheet.kt */
        public final class AnonymousClass1 extends o implements Function0<Unit> {
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
                WidgetStageStartEventBottomSheet.access$getViewModel$p(WidgetStageStartEventBottomSheet.this).openStage(false);
                Function0<Unit> onDismiss = WidgetStageStartEventBottomSheet.this.getOnDismiss();
                if (onDismiss != null) {
                    onDismiss.invoke();
                }
            }
        }

        /* JADX INFO: renamed from: com.discord.widgets.stage.sheet.WidgetStageStartEventBottomSheet$onViewCreated$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: WidgetStageStartEventBottomSheet.kt */
        public final class C04672 extends o implements Function0<Unit> {
            public C04672() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WidgetStageStartEventBottomSheet.access$getViewModel$p(WidgetStageStartEventBottomSheet.this).openStage(true);
                Function0<Unit> onDismiss = WidgetStageStartEventBottomSheet.this.getOnDismiss();
                if (onDismiss != null) {
                    onDismiss.invoke();
                }
            }
        }

        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WidgetStageStartEventBottomSheet.this.requestMicrophone(new AnonymousClass1(), new C04672());
        }
    }

    /* JADX INFO: compiled from: WidgetStageStartEventBottomSheet.kt */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WidgetStageStartEventBottomSheet show$default(Companion companion, FragmentManager fragmentManager, long j, Function0 function0, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            return companion.show(fragmentManager, j, function0);
        }

        public final WidgetStageStartEventBottomSheet show(FragmentManager fragmentManager, long channelId, Function0<Unit> onDismiss) {
            m.checkNotNullParameter(fragmentManager, "fragmentManager");
            WidgetStageStartEventBottomSheet widgetStageStartEventBottomSheet = new WidgetStageStartEventBottomSheet();
            widgetStageStartEventBottomSheet.setOnDismiss(onDismiss);
            widgetStageStartEventBottomSheet.setArguments(BundleKt.bundleOf(d0.o.to("com.discord.intent.extra.EXTRA_CHANNEL_ID", Long.valueOf(channelId))));
            widgetStageStartEventBottomSheet.show(fragmentManager, WidgetStageStartEventBottomSheet.class.getSimpleName());
            return widgetStageStartEventBottomSheet;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetStageStartEventBottomSheet() {
        super(true);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetStageStartEventBottomSheet$binding$2.INSTANCE, null, 2, null);
        this.channelId = g.lazy(new WidgetStageStartEventBottomSheet$channelId$2(this));
        WidgetStageStartEventBottomSheet$viewModel$2 widgetStageStartEventBottomSheet$viewModel$2 = new WidgetStageStartEventBottomSheet$viewModel$2(this);
        g0 g0Var = new g0(this);
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, a0.getOrCreateKotlinClass(WidgetStageStartEventBottomSheetViewModel.class), new WidgetStageStartEventBottomSheet$appViewModels$$inlined$viewModels$1(g0Var), new i0(widgetStageStartEventBottomSheet$viewModel$2));
    }

    public static final /* synthetic */ void access$configureUI(WidgetStageStartEventBottomSheet widgetStageStartEventBottomSheet, WidgetStageStartEventBottomSheetViewModel.ViewState viewState) {
        widgetStageStartEventBottomSheet.configureUI(viewState);
    }

    public static final /* synthetic */ Bundle access$getArgumentsOrDefault$p(WidgetStageStartEventBottomSheet widgetStageStartEventBottomSheet) {
        return widgetStageStartEventBottomSheet.getArgumentsOrDefault();
    }

    public static final /* synthetic */ WidgetStageStartEventBottomSheetBinding access$getBinding$p(WidgetStageStartEventBottomSheet widgetStageStartEventBottomSheet) {
        return widgetStageStartEventBottomSheet.getBinding();
    }

    public static final /* synthetic */ long access$getChannelId$p(WidgetStageStartEventBottomSheet widgetStageStartEventBottomSheet) {
        return widgetStageStartEventBottomSheet.getChannelId();
    }

    public static final /* synthetic */ WidgetStageStartEventBottomSheetViewModel access$getViewModel$p(WidgetStageStartEventBottomSheet widgetStageStartEventBottomSheet) {
        return widgetStageStartEventBottomSheet.getViewModel();
    }

    public static final /* synthetic */ void access$handleEvent(WidgetStageStartEventBottomSheet widgetStageStartEventBottomSheet, WidgetStageStartEventBottomSheetViewModel.Event event) {
        widgetStageStartEventBottomSheet.handleEvent(event);
    }

    private final void configureUI(WidgetStageStartEventBottomSheetViewModel.ViewState viewState) {
        if (viewState instanceof WidgetStageStartEventBottomSheetViewModel.ViewState.Loaded) {
            MaterialButton materialButton = getBinding().c;
            m.checkNotNullExpressionValue(materialButton, "binding.startStageButton");
            WidgetStageStartEventBottomSheetViewModel.ViewState.Loaded loaded = (WidgetStageStartEventBottomSheetViewModel.ViewState.Loaded) viewState;
            ViewExtensions.setEnabledAndAlpha$default(materialButton, loaded.getTopic().length() > 0, 0.0f, 2, null);
            String topic = loaded.getTopic();
            TextInputLayout textInputLayout = getBinding().g;
            m.checkNotNullExpressionValue(textInputLayout, "binding.topicLayout");
            if (!m.areEqual(topic, ViewExtensions.getTextOrEmpty(textInputLayout))) {
                getBinding().f.setText(loaded.getTopic());
            }
            TextView textView = getBinding().e;
            m.checkNotNullExpressionValue(textView, "binding.title");
            textView.setText(getString(loaded.getStageInstance() == null ? R.string.start_stage_channel_event_modal_title : R.string.edit_stage_title));
            TextView textView2 = getBinding().d;
            m.checkNotNullExpressionValue(textView2, "binding.subtitle");
            textView2.setText(getString(loaded.getStageInstance() == null ? R.string.start_stage_channel_event_modal_subtitle : R.string.edit_stage_subtitle));
            MaterialButton materialButton2 = getBinding().c;
            m.checkNotNullExpressionValue(materialButton2, "binding.startStageButton");
            materialButton2.setText(getString(loaded.getStageInstance() == null ? R.string.start_stage_channel_event_modal_button : R.string.save_changes));
            TextView textView3 = getBinding().f2658b;
            m.checkNotNullExpressionValue(textView3, "binding.speakerHint");
            textView3.setVisibility(loaded.getStageInstance() == null ? 0 : 8);
        }
    }

    private final WidgetStageStartEventBottomSheetBinding getBinding() {
        return (WidgetStageStartEventBottomSheetBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final long getChannelId() {
        return ((Number) this.channelId.getValue()).longValue();
    }

    @Override // com.discord.app.AppBottomSheet
    public int getContentViewResId() {
        return R.layout.widget_stage_start_event_bottom_sheet;
    }

    public final Function0<Unit> getOnDismiss() {
        return this.onDismiss;
    }

    private final WidgetStageStartEventBottomSheetViewModel getViewModel() {
        return (WidgetStageStartEventBottomSheetViewModel) this.viewModel.getValue();
    }

    private final void handleEvent(WidgetStageStartEventBottomSheetViewModel.Event event) {
        if (event instanceof WidgetStageStartEventBottomSheetViewModel.Event.SetTopicSuccess) {
            AppBottomSheet.hideKeyboard$default(this, null, 1, null);
            dismiss();
        } else if (event instanceof WidgetStageStartEventBottomSheetViewModel.Event.SetTopicFailure) {
            b.a.d.m.i(this, ((WidgetStageStartEventBottomSheetViewModel.Event.SetTopicFailure) event).getFailureMessageStringRes(), 0, 4);
        } else if (event instanceof WidgetStageStartEventBottomSheetViewModel.Event.InvalidTopic) {
            TextInputLayout textInputLayout = getBinding().g;
            m.checkNotNullExpressionValue(textInputLayout, "binding.topicLayout");
            textInputLayout.setError(getString(((WidgetStageStartEventBottomSheetViewModel.Event.InvalidTopic) event).getFailureMessageStringRes()));
        }
    }

    @Override // com.discord.app.AppBottomSheet, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.bindToComponentLifecycle$default(getViewModel().observeEvents(), this, null, 2, null), WidgetStageStartEventBottomSheet.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(), 62, (Object) null);
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.bindToComponentLifecycle$default(getViewModel().observeViewState(), this, null, 2, null), WidgetStageStartEventBottomSheet.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass2(), 62, (Object) null);
    }

    @Override // com.discord.app.AppBottomSheet, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        m.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TextInputEditText textInputEditText = getBinding().f;
        m.checkNotNullExpressionValue(textInputEditText, "binding.topicInput");
        TextWatcherKt.addBindedTextWatcher(textInputEditText, this, new AnonymousClass1());
        getBinding().c.setOnClickListener(new AnonymousClass2());
    }

    public final void setOnDismiss(Function0<Unit> function0) {
        this.onDismiss = function0;
    }
}
