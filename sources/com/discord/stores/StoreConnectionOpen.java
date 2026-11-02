package com.discord.stores;

import com.discord.stores.updates.ObservationDeck;
import com.discord.stores.updates.ObservationDeck4;
import d0.z.d.Intrinsics3;
import d0.z.d.Lambda;
import d0.z.d.MutablePropertyReference1Impl;
import d0.z.d.Reflection2;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import rx.Observable;

/* JADX INFO: compiled from: StoreConnectionOpen.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StoreConnectionOpen extends StoreV2 {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection2.mutableProperty1(new MutablePropertyReference1Impl(StoreConnectionOpen.class, "isConnectionOpen", "isConnectionOpen()Z", 0))};

    /* JADX INFO: renamed from: isConnectionOpen$delegate, reason: from kotlin metadata */
    private final StoreV2.MarkChangedDelegate isConnectionOpen = new StoreV2.MarkChangedDelegate(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: com.discord.stores.StoreConnectionOpen$observeConnectionOpen$1, reason: invalid class name */
    /* JADX INFO: compiled from: StoreConnectionOpen.kt */
    public final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return StoreConnectionOpen.access$isConnectionOpen$p(StoreConnectionOpen.this);
        }
    }

    public static final /* synthetic */ boolean access$isConnectionOpen$p(StoreConnectionOpen storeConnectionOpen) {
        return storeConnectionOpen.isConnectionOpen();
    }

    public static final /* synthetic */ void access$setConnectionOpen$p(StoreConnectionOpen storeConnectionOpen, boolean z2) {
        storeConnectionOpen.setConnectionOpen(z2);
    }

    @Store3
    public final void handleConnected(boolean connected) {
        if (connected) {
            return;
        }
        setConnectionOpen(false);
    }

    @Store3
    public final void handleConnectionOpen() {
        setConnectionOpen(true);
    }

    private final boolean isConnectionOpen() {
        return ((Boolean) this.isConnectionOpen.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public static /* synthetic */ Observable observeConnectionOpen$default(StoreConnectionOpen storeConnectionOpen, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = true;
        }
        return storeConnectionOpen.observeConnectionOpen(z2);
    }

    public final Observable<Boolean> observeConnectionOpen(boolean delayForUI) {
        Observable<Boolean> observableConnectRx$default = ObservationDeck.connectRx$default(ObservationDeck4.get(), new ObservationDeck.UpdateSource[]{this}, false, null, null, new AnonymousClass1(), 14, null);
        if (delayForUI) {
            observableConnectRx$default = observableConnectRx$default.q(100L, TimeUnit.MILLISECONDS);
        }
        Intrinsics3.checkNotNullExpressionValue(observableConnectRx$default, "ObservationDeckProvider\n…            }\n          }");
        return observableConnectRx$default;
    }

    private final void setConnectionOpen(boolean z2) {
        this.isConnectionOpen.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z2));
    }
}
