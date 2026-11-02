package com.discord.widgets.guild_role_subscriptions;

import android.content.Context;
import b.a.d.AppViewModel;
import b.d.b.a.outline;
import com.discord.stores.StoreGuildRoleSubscriptions;
import com.discord.stores.StoreStream;
import com.discord.stores.updates.ObservationDeck;
import com.discord.stores.updates.ObservationDeck4;
import com.discord.utilities.rx.ObservableExtensionsKt;
import d0.z.d.Intrinsics3;
import d0.z.d.Lambda;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;

/* JADX INFO: compiled from: PriceTierPickerBottomSheetViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PriceTierPickerBottomSheetViewModel extends AppViewModel<ViewState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.discord.widgets.guild_role_subscriptions.PriceTierPickerBottomSheetViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: PriceTierPickerBottomSheetViewModel.kt */
    public final class AnonymousClass1 extends Lambda implements Function1<StoreState, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StoreState storeState) {
            invoke2(storeState);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreState storeState) {
            Intrinsics3.checkNotNullParameter(storeState, "storeState");
            PriceTierPickerBottomSheetViewModel.access$handleStoreState(PriceTierPickerBottomSheetViewModel.this, storeState);
        }
    }

    /* JADX INFO: compiled from: PriceTierPickerBottomSheetViewModel.kt */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Observable observeStoreState$default(Companion companion, ObservationDeck observationDeck, StoreGuildRoleSubscriptions storeGuildRoleSubscriptions, int i, Object obj) {
            if ((i & 1) != 0) {
                observationDeck = ObservationDeck4.get();
            }
            if ((i & 2) != 0) {
                storeGuildRoleSubscriptions = StoreStream.INSTANCE.getGuildRoleSubscriptions();
            }
            return companion.observeStoreState(observationDeck, storeGuildRoleSubscriptions);
        }

        private final Observable<StoreState> observeStoreState(ObservationDeck observationDeck, StoreGuildRoleSubscriptions storeGuildRoleSubscriptions) {
            return ObservationDeck.connectRx$default(observationDeck, new ObservationDeck.UpdateSource[]{storeGuildRoleSubscriptions}, false, null, null, new PriceTierPickerBottomSheetViewModel2(storeGuildRoleSubscriptions), 14, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: PriceTierPickerBottomSheetViewModel.kt */
    public final /* data */ class StoreState {
        private final StoreGuildRoleSubscriptions.PriceTierState priceTierState;

        public StoreState(StoreGuildRoleSubscriptions.PriceTierState priceTierState) {
            Intrinsics3.checkNotNullParameter(priceTierState, "priceTierState");
            this.priceTierState = priceTierState;
        }

        public static /* synthetic */ StoreState copy$default(StoreState storeState, StoreGuildRoleSubscriptions.PriceTierState priceTierState, int i, Object obj) {
            if ((i & 1) != 0) {
                priceTierState = storeState.priceTierState;
            }
            return storeState.copy(priceTierState);
        }

        public final StoreState copy(StoreGuildRoleSubscriptions.PriceTierState priceTierState) {
            Intrinsics3.checkNotNullParameter(priceTierState, "priceTierState");
            return new StoreState(priceTierState);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof StoreState) && Intrinsics3.areEqual(this.priceTierState, ((StoreState) other).priceTierState);
            }
            return true;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final StoreGuildRoleSubscriptions.PriceTierState getPriceTierState() {
            return this.priceTierState;
        }

        public final StoreGuildRoleSubscriptions.PriceTierState getPriceTierState() {
            return this.priceTierState;
        }

        public int hashCode() {
            StoreGuildRoleSubscriptions.PriceTierState priceTierState = this.priceTierState;
            if (priceTierState != null) {
                return priceTierState.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sbU = outline.U("StoreState(priceTierState=");
            sbU.append(this.priceTierState);
            sbU.append(")");
            return sbU.toString();
        }
    }

    /* JADX INFO: compiled from: PriceTierPickerBottomSheetViewModel.kt */
    public abstract class ViewState {

        /* JADX INFO: compiled from: PriceTierPickerBottomSheetViewModel.kt */
        public final class Failed extends ViewState {
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: PriceTierPickerBottomSheetViewModel.kt */
        public final /* data */ class Loaded extends ViewState {
            private final List<Integer> priceTiers;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Loaded(List<Integer> list) {
                super(null);
                Intrinsics3.checkNotNullParameter(list, "priceTiers");
                this.priceTiers = list;
            }

            public final List<Integer> component1() {
                return this.priceTiers;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = loaded.priceTiers;
                }
                return loaded.copy(list);
            }

            public final Loaded copy(List<Integer> priceTiers) {
                Intrinsics3.checkNotNullParameter(priceTiers, "priceTiers");
                return new Loaded(priceTiers);
            }

            public boolean equals(Object other) {
                if (this != other) {
                    return (other instanceof Loaded) && Intrinsics3.areEqual(this.priceTiers, ((Loaded) other).priceTiers);
                }
                return true;
            }

            public final List<Integer> getPriceTiers() {
                return this.priceTiers;
            }

            public int hashCode() {
                List<Integer> list = this.priceTiers;
                if (list != null) {
                    return list.hashCode();
                }
                return 0;
            }

            public String toString() {
                return outline.L(outline.U("Loaded(priceTiers="), this.priceTiers, ")");
            }
        }

        /* JADX INFO: compiled from: PriceTierPickerBottomSheetViewModel.kt */
        public final class Loading extends ViewState {
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private ViewState() {
        }

        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PriceTierPickerBottomSheetViewModel() {
        this(null, null, 3, null);
    }

    public /* synthetic */ PriceTierPickerBottomSheetViewModel(StoreGuildRoleSubscriptions storeGuildRoleSubscriptions, Observable observable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? StoreStream.INSTANCE.getGuildRoleSubscriptions() : storeGuildRoleSubscriptions, (i & 2) != 0 ? Companion.observeStoreState$default(INSTANCE, null, null, 3, null) : observable);
    }

    public static final /* synthetic */ void access$handleStoreState(PriceTierPickerBottomSheetViewModel priceTierPickerBottomSheetViewModel, StoreState storeState) {
        priceTierPickerBottomSheetViewModel.handleStoreState(storeState);
    }

    private final void handleStoreState(StoreState storeState) {
        StoreGuildRoleSubscriptions.PriceTierState priceTierState = storeState.getPriceTierState();
        if (priceTierState instanceof StoreGuildRoleSubscriptions.PriceTierState.Loading) {
            updateViewState(ViewState.Loading.INSTANCE);
        } else if (priceTierState instanceof StoreGuildRoleSubscriptions.PriceTierState.Failed) {
            updateViewState(ViewState.Failed.INSTANCE);
        } else if (priceTierState instanceof StoreGuildRoleSubscriptions.PriceTierState.Loaded) {
            updateViewState(new ViewState.Loaded(((StoreGuildRoleSubscriptions.PriceTierState.Loaded) storeState.getPriceTierState()).getPriceTiers()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceTierPickerBottomSheetViewModel(StoreGuildRoleSubscriptions storeGuildRoleSubscriptions, Observable<StoreState> observable) {
        super(null, 1, null);
        Intrinsics3.checkNotNullParameter(storeGuildRoleSubscriptions, "storeGuildRoleSubscriptions");
        Intrinsics3.checkNotNullParameter(observable, "storeObservable");
        storeGuildRoleSubscriptions.fetchPriceTiersIfNonExisting();
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui$default(ObservableExtensionsKt.computationLatest(observable), this, null, 2, null), PriceTierPickerBottomSheetViewModel.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(), 62, (Object) null);
    }
}
