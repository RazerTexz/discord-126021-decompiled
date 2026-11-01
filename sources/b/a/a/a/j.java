package b.a.a.a;

import com.discord.stores.StoreSubscriptions;
import d0.z.d.m;

/* JADX INFO: compiled from: GuildBoostUncancelViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j<T, R> implements j0.k.b<StoreSubscriptions.SubscriptionsState, k.b> {
    public static final j j = new j();

    @Override // j0.k.b
    public k.b call(StoreSubscriptions.SubscriptionsState subscriptionsState) {
        StoreSubscriptions.SubscriptionsState subscriptionsState2 = subscriptionsState;
        m.checkNotNullExpressionValue(subscriptionsState2, "it");
        return new k.b(subscriptionsState2);
    }
}
