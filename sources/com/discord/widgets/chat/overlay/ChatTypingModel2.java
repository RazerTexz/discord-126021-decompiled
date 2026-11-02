package com.discord.widgets.chat.overlay;

import androidx.core.app.NotificationCompat;
import com.discord.stores.StoreChannelsSelected;
import j0.k.Func1;
import j0.l.e.ScalarSynchronousObservable;
import rx.Observable;

/* JADX INFO: renamed from: com.discord.widgets.chat.overlay.ChatTypingModel$Companion$get$1, reason: use source file name */
/* JADX INFO: compiled from: ChatTypingModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ChatTypingModel2<T, R> implements Func1<StoreChannelsSelected.ResolvedSelectedChannel, Observable<? extends ChatTypingModel>> {
    public static final ChatTypingModel2 INSTANCE = new ChatTypingModel2();

    @Override // j0.k.Func1
    public /* bridge */ /* synthetic */ Observable<? extends ChatTypingModel> call(StoreChannelsSelected.ResolvedSelectedChannel resolvedSelectedChannel) {
        return call2(resolvedSelectedChannel);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final Observable<? extends ChatTypingModel> call2(StoreChannelsSelected.ResolvedSelectedChannel resolvedSelectedChannel) {
        if (resolvedSelectedChannel instanceof StoreChannelsSelected.ResolvedSelectedChannel.Channel) {
            return ChatTypingModel.Companion.access$getTypingObservableForChannel(ChatTypingModel.INSTANCE, ((StoreChannelsSelected.ResolvedSelectedChannel.Channel) resolvedSelectedChannel).getChannel());
        }
        return resolvedSelectedChannel instanceof StoreChannelsSelected.ResolvedSelectedChannel.ThreadDraft ? ChatTypingModel.Companion.access$getTypingObservableForDraft(ChatTypingModel.INSTANCE, ((StoreChannelsSelected.ResolvedSelectedChannel.ThreadDraft) resolvedSelectedChannel).getParentChannel()) : new ScalarSynchronousObservable(ChatTypingModel.Hide.INSTANCE);
    }
}
