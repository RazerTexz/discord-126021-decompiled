package com.discord.widgets.servers;

import android.view.View;

/* JADX INFO: compiled from: WidgetServerSettingsEmojis.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetServerSettingsEmojis$Adapter$EmojiHeaderViewHolder$onConfigure$1 implements View.OnClickListener {
    public final /* synthetic */ WidgetServerSettingsEmojis.Adapter.EmojiHeaderViewHolder this$0;

    public WidgetServerSettingsEmojis$Adapter$EmojiHeaderViewHolder$onConfigure$1(WidgetServerSettingsEmojis.Adapter.EmojiHeaderViewHolder emojiHeaderViewHolder) {
        this.this$0 = emojiHeaderViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WidgetServerSettingsEmojis.Adapter.EmojiHeaderViewHolder.access$getAdapter$p(this.this$0).getOnUploadEmoji().invoke();
    }
}
