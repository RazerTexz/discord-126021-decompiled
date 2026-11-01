package com.discord.widgets.chat.overlay;

import androidx.core.app.NotificationCompat;
import com.discord.stores.StoreChannelsSelected;
import j0.k.b;
import j0.l.e.k;
import rx.Observable;

/* JADX INFO: compiled from: ChatTypingModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ChatTypingModel$Companion$get$1<T, R> implements b<StoreChannelsSelected.ResolvedSelectedChannel, Observable<? extends ChatTypingModel>> {
    public static final ChatTypingModel$Companion$get$1 INSTANCE = new ChatTypingModel$Companion$get$1();

    @Override // j0.k.b
    public /* bridge */ /* synthetic */ Observable<? extends ChatTypingModel> call(StoreChannelsSelected.ResolvedSelectedChannel resolvedSelectedChannel) {
        return call2(resolvedSelectedChannel);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final Observable<? extends ChatTypingModel> call2(StoreChannelsSelected.ResolvedSelectedChannel resolvedSelectedChannel) {
        if (resolvedSelectedChannel instanceof StoreChannelsSelected.ResolvedSelectedChannel.Channel) {
            return ChatTypingModel.Companion.access$getTypingObservableForChannel(ChatTypingModel.INSTANCE, ((StoreChannelsSelected.ResolvedSelectedChannel.Channel) resolvedSelectedChannel).getChannel());
        }
        return resolvedSelectedChannel instanceof StoreChannelsSelected.ResolvedSelectedChannel.ThreadDraft ? ChatTypingModel.Companion.access$getTypingObservableForDraft(ChatTypingModel.INSTANCE, ((StoreChannelsSelected.ResolvedSelectedChannel.ThreadDraft) resolvedSelectedChannel).getParentChannel()) : new k(ChatTypingModel.Hide.INSTANCE);
    }
}
