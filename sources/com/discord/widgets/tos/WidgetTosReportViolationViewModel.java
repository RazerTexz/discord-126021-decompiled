package com.discord.widgets.tos;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.core.app.NotificationCompat;
import b.a.d.d0;
import b.d.b.a.a;
import com.discord.api.channel.Channel;
import com.discord.api.channel.ChannelUtils;
import com.discord.api.report.ReportReason;
import com.discord.models.domain.ModelAuditLogEntry;
import com.discord.models.user.User;
import com.discord.restapi.RestAPIInterface;
import com.discord.restapi.RestAPIParams;
import com.discord.stores.StoreStream;
import com.discord.stores.StoreUserProfile;
import com.discord.utilities.error.Error;
import com.discord.utilities.rest.RestAPI;
import com.discord.utilities.rx.ObservableExtensionsKt;
import d0.z.d.k;
import d0.z.d.m;
import d0.z.d.o;
import j0.k.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;

/* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WidgetTosReportViolationViewModel extends d0<ViewState> {
    private final long channelId;
    private final long messageId;
    private ReportReason reasonSelected;
    private StoreState storeState;

    /* JADX INFO: renamed from: com.discord.widgets.tos.WidgetTosReportViolationViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
    public final /* synthetic */ class AnonymousClass1 extends k implements Function1<StoreState, Unit> {
        public AnonymousClass1(WidgetTosReportViolationViewModel widgetTosReportViolationViewModel) {
            super(1, widgetTosReportViolationViewModel, WidgetTosReportViolationViewModel.class, "generateViewState", "generateViewState(Lcom/discord/widgets/tos/WidgetTosReportViolationViewModel$StoreState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StoreState storeState) {
            invoke2(storeState);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreState storeState) {
            m.checkNotNullParameter(storeState, "p1");
            WidgetTosReportViolationViewModel.access$generateViewState((WidgetTosReportViolationViewModel) this.receiver, storeState);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.tos.WidgetTosReportViolationViewModel$observeStoreState$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
    public final class AnonymousClass1<T, R> implements b<List<? extends ReportReason>, StoreState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // j0.k.b
        public /* bridge */ /* synthetic */ StoreState call(List<? extends ReportReason> list) {
            return call2((List<ReportReason>) list);
        }

        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final StoreState call2(List<ReportReason> list) {
            m.checkNotNullExpressionValue(list, "reportReasons");
            return new StoreState.ReportReasons(list);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.tos.WidgetTosReportViolationViewModel$sendReportAPICall$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
    public final class AnonymousClass1 extends o implements Function1<Error, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Error error) {
            invoke2(error);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Error error) {
            m.checkNotNullParameter(error, "it");
            WidgetTosReportViolationViewModel.access$updateViewState(WidgetTosReportViolationViewModel.this, ViewState.SubmissionError.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.tos.WidgetTosReportViolationViewModel$sendReportAPICall$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
    public final class AnonymousClass2 extends o implements Function1<Unit, Unit> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            m.checkNotNullParameter(unit, "it");
            WidgetTosReportViolationViewModel.access$updateViewState(WidgetTosReportViolationViewModel.this, ViewState.Submitted.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
    public abstract class StoreState {

        /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
        public final /* data */ class ReportReasons extends StoreState {
            private final List<ReportReason> reasons;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReportReasons(List<ReportReason> list) {
                super(null);
                m.checkNotNullParameter(list, "reasons");
                this.reasons = list;
            }

            public final List<ReportReason> component1() {
                return this.reasons;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReportReasons copy$default(ReportReasons reportReasons, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = reportReasons.reasons;
                }
                return reportReasons.copy(list);
            }

            public final ReportReasons copy(List<ReportReason> reasons) {
                m.checkNotNullParameter(reasons, "reasons");
                return new ReportReasons(reasons);
            }

            public boolean equals(Object other) {
                if (this != other) {
                    return (other instanceof ReportReasons) && m.areEqual(this.reasons, ((ReportReasons) other).reasons);
                }
                return true;
            }

            public final List<ReportReason> getReasons() {
                return this.reasons;
            }

            public int hashCode() {
                List<ReportReason> list = this.reasons;
                if (list != null) {
                    return list.hashCode();
                }
                return 0;
            }

            public String toString() {
                return a.L(a.U("ReportReasons(reasons="), this.reasons, ")");
            }
        }

        private StoreState() {
        }

        public /* synthetic */ StoreState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
    public abstract class ViewState {

        /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
        public final /* data */ class Loaded extends ViewState {
            private final List<ReportReason> reasons;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Loaded(List<ReportReason> list) {
                super(null);
                m.checkNotNullParameter(list, "reasons");
                this.reasons = list;
            }

            public final List<ReportReason> component1() {
                return this.reasons;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = loaded.reasons;
                }
                return loaded.copy(list);
            }

            public final Loaded copy(List<ReportReason> reasons) {
                m.checkNotNullParameter(reasons, "reasons");
                return new Loaded(reasons);
            }

            public boolean equals(Object other) {
                if (this != other) {
                    return (other instanceof Loaded) && m.areEqual(this.reasons, ((Loaded) other).reasons);
                }
                return true;
            }

            public final List<ReportReason> getReasons() {
                return this.reasons;
            }

            public int hashCode() {
                List<ReportReason> list = this.reasons;
                if (list != null) {
                    return list.hashCode();
                }
                return 0;
            }

            public String toString() {
                return a.L(a.U("Loaded(reasons="), this.reasons, ")");
            }
        }

        /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
        public final class Loading extends ViewState {
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
        public final class SubmissionError extends ViewState {
            public static final SubmissionError INSTANCE = new SubmissionError();

            private SubmissionError() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
        public final class Submitted extends ViewState {
            public static final Submitted INSTANCE = new Submitted();

            private Submitted() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WidgetTosReportViolationViewModel.kt */
        public final /* data */ class Submitting extends ViewState {
            private final int reason;

            public Submitting(int i) {
                super(null);
                this.reason = i;
            }

            public static /* synthetic */ Submitting copy$default(Submitting submitting, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = submitting.reason;
                }
                return submitting.copy(i);
            }

            public final Submitting copy(int reason) {
                return new Submitting(reason);
            }

            public boolean equals(Object other) {
                if (this != other) {
                    return (other instanceof Submitting) && this.reason == ((Submitting) other).reason;
                }
                return true;
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getReason() {
                return this.reason;
            }

            public final int getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason;
            }

            public String toString() {
                return a.B(a.U("Submitting(reason="), this.reason, ")");
            }
        }

        private ViewState() {
        }

        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetTosReportViolationViewModel(long j, long j2) {
        super(ViewState.Loading.INSTANCE);
        this.channelId = j;
        this.messageId = j2;
        Observable<StoreState> observableR = observeStoreState().r();
        m.checkNotNullExpressionValue(observableR, "observeStoreState()\n    …  .distinctUntilChanged()");
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui$default(ObservableExtensionsKt.computationLatest(observableR), this, null, 2, null), WidgetTosReportViolationViewModel.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(this), 62, (Object) null);
    }

    public static final /* synthetic */ void access$generateViewState(WidgetTosReportViolationViewModel widgetTosReportViolationViewModel, StoreState storeState) {
        widgetTosReportViolationViewModel.generateViewState(storeState);
    }

    public static final /* synthetic */ void access$updateViewState(WidgetTosReportViolationViewModel widgetTosReportViolationViewModel, ViewState viewState) {
        widgetTosReportViolationViewModel.updateViewState(viewState);
    }

    @MainThread
    private final void generateViewState(StoreState storeState) {
        this.storeState = storeState;
        if (storeState instanceof StoreState.ReportReasons) {
            updateViewState(new ViewState.Loaded(((StoreState.ReportReasons) storeState).getReasons()));
        }
    }

    public final ReportReason getReasonSelected() {
        return this.reasonSelected;
    }

    @MainThread
    public final void handleDismissError() {
        StoreState storeState = this.storeState;
        if (storeState == null) {
            m.throwUninitializedPropertyAccessException("storeState");
        }
        generateViewState(storeState);
    }

    private final Observable<StoreState> observeStoreState() {
        Observable<StoreState> observableG = ObservableExtensionsKt.restSubscribeOn$default(RestAPIInterface.DefaultImpls.report$default(RestAPI.INSTANCE.getApi(), Long.valueOf(this.channelId), null, Long.valueOf(this.messageId), null, 2, null), false, 1, null).G(AnonymousClass1.INSTANCE);
        m.checkNotNullExpressionValue(observableG, "RestAPI\n          .api\n …eportReasons)\n          }");
        return observableG;
    }

    @MainThread
    public final void sendReport() {
        ReportReason reportReason = this.reasonSelected;
        if (reportReason != null) {
            updateViewState(new ViewState.Submitting(reportReason.getReason()));
        }
    }

    @MainThread
    public final void sendReportAPICall(int reason, long channelId, long messageId) {
        StoreStream.Companion companion = StoreStream.INSTANCE;
        Channel channel = companion.getChannels().getChannel(channelId);
        if (channel != null && channel.getType() == 1) {
            User userA = ChannelUtils.a(channel);
            Long lValueOf = userA != null ? Long.valueOf(userA.getId()) : null;
            if (lValueOf != null) {
                StoreUserProfile.fetchProfile$default(companion.getUserProfile(), lValueOf.longValue(), null, false, new WidgetTosReportViolationViewModel$sendReportAPICall$onFetchSuccess$1(this, reason, channelId, messageId), 6, null);
            }
        }
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui(ObservableExtensionsKt.restSubscribeOn$default(RestAPI.INSTANCE.getApi().report(new RestAPIParams.Report(reason, Long.valueOf(channelId), Long.valueOf(messageId))), false, 1, null)), WidgetTosReportViolationViewModel.class, (Context) null, (Function1) null, new AnonymousClass1(), (Function0) null, (Function0) null, new AnonymousClass2(), 54, (Object) null);
    }

    public final void setReasonSelected(ReportReason reportReason) {
        this.reasonSelected = reportReason;
    }
}
