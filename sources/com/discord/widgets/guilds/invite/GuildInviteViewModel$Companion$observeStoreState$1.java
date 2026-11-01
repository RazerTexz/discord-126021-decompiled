package com.discord.widgets.guilds.invite;

import androidx.core.app.NotificationCompat;
import com.discord.stores.StoreInstantInvites;
import j0.k.b;

/* JADX INFO: compiled from: GuildInviteViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GuildInviteViewModel$Companion$observeStoreState$1<T, R> implements b<StoreInstantInvites.InviteState, GuildInviteViewModel.StoreState> {
    public static final GuildInviteViewModel$Companion$observeStoreState$1 INSTANCE = new GuildInviteViewModel$Companion$observeStoreState$1();

    @Override // j0.k.b
    public /* bridge */ /* synthetic */ GuildInviteViewModel.StoreState call(StoreInstantInvites.InviteState inviteState) {
        return call2(inviteState);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final GuildInviteViewModel.StoreState call2(StoreInstantInvites.InviteState inviteState) {
        if (inviteState instanceof StoreInstantInvites.InviteState.Loading) {
            return GuildInviteViewModel.StoreState.Loading.INSTANCE;
        }
        return inviteState instanceof StoreInstantInvites.InviteState.Resolved ? new GuildInviteViewModel.StoreState.Loaded(((StoreInstantInvites.InviteState.Resolved) inviteState).getInvite()) : GuildInviteViewModel.StoreState.Invalid.INSTANCE;
    }
}
