package com.discord.widgets.home;

import androidx.core.app.NotificationCompat;
import com.discord.api.channel.ChannelUtils;
import com.discord.panels.OverlappingPanelsLayout;
import com.discord.stores.StoreChannelsSelected;
import com.discord.stores.StoreGuildSelected;
import com.discord.stores.StoreStream;
import d0.z.d.Intrinsics3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;
import rx.functions.Func2;

/* JADX INFO: compiled from: LeftPanelManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LeftPanelManager {
    private final StoreChannelsSelected storeChannelsSelected;
    private final StoreGuildSelected storeGuildSelected;

    /* JADX INFO: renamed from: com.discord.widgets.home.LeftPanelManager$observeLockState$1, reason: invalid class name */
    /* JADX INFO: compiled from: LeftPanelManager.kt */
    public final class AnonymousClass1<T1, T2, R> implements Func2<StoreChannelsSelected.ResolvedSelectedChannel, Long, OverlappingPanelsLayout.LockState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // rx.functions.Func2
        public /* bridge */ /* synthetic */ OverlappingPanelsLayout.LockState call(StoreChannelsSelected.ResolvedSelectedChannel resolvedSelectedChannel, Long l) {
            return call2(resolvedSelectedChannel, l);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0028  */
        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final OverlappingPanelsLayout.LockState call2(StoreChannelsSelected.ResolvedSelectedChannel resolvedSelectedChannel, Long l) {
            long id2 = resolvedSelectedChannel.getId();
            boolean z2 = false;
            boolean z3 = (id2 == 0 || id2 == -1) ? false : true;
            boolean z4 = l == null || l.longValue() != 0;
            boolean z5 = !z3;
            if (resolvedSelectedChannel instanceof StoreChannelsSelected.ResolvedSelectedChannel.ThreadDraft) {
                z2 = true;
            } else if (resolvedSelectedChannel instanceof StoreChannelsSelected.ResolvedSelectedChannel.Channel) {
                StoreChannelsSelected.ResolvedSelectedChannel.Channel channel = (StoreChannelsSelected.ResolvedSelectedChannel.Channel) resolvedSelectedChannel;
                if (channel.getPeekParent() != null || ChannelUtils.J(channel.getChannel())) {
                    z2 = true;
                }
            }
            if (z4 && z2) {
                return OverlappingPanelsLayout.LockState.CLOSE;
            }
            return (z4 || !z5) ? OverlappingPanelsLayout.LockState.UNLOCKED : OverlappingPanelsLayout.LockState.OPEN;
        }
    }

    public LeftPanelManager() {
        this(null, null, 3, null);
    }

    public LeftPanelManager(StoreChannelsSelected storeChannelsSelected, StoreGuildSelected storeGuildSelected) {
        Intrinsics3.checkNotNullParameter(storeChannelsSelected, "storeChannelsSelected");
        Intrinsics3.checkNotNullParameter(storeGuildSelected, "storeGuildSelected");
        this.storeChannelsSelected = storeChannelsSelected;
        this.storeGuildSelected = storeGuildSelected;
    }

    public final Observable<OverlappingPanelsLayout.LockState> observeLockState() {
        Observable<OverlappingPanelsLayout.LockState> observableR = Observable.j(this.storeChannelsSelected.observeResolvedSelectedChannel(), this.storeGuildSelected.observeSelectedGuildId(), AnonymousClass1.INSTANCE).r();
        Intrinsics3.checkNotNullExpressionValue(observableR, "Observable.combineLatest… }.distinctUntilChanged()");
        return observableR;
    }

    public /* synthetic */ LeftPanelManager(StoreChannelsSelected storeChannelsSelected, StoreGuildSelected storeGuildSelected, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? StoreStream.INSTANCE.getChannelsSelected() : storeChannelsSelected, (i & 2) != 0 ? StoreStream.INSTANCE.getGuildSelected() : storeGuildSelected);
    }
}
