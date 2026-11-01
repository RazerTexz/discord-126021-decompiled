package com.discord.widgets.guildscheduledevent;

import android.view.View;

/* JADX INFO: compiled from: GuildScheduledEventListAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GuildScheduledEventListAdapter$EventViewHolder$onConfigure$4 implements View.OnClickListener {
    public final /* synthetic */ GuildScheduledEventListItem.Event $item;
    public final /* synthetic */ GuildScheduledEventListAdapter.EventViewHolder this$0;

    public GuildScheduledEventListAdapter$EventViewHolder$onConfigure$4(GuildScheduledEventListAdapter.EventViewHolder eventViewHolder, GuildScheduledEventListItem.Event event) {
        this.this$0 = eventViewHolder;
        this.$item = event;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GuildScheduledEventListAdapter.EventViewHolder.access$getAdapter$p(this.this$0).getOnShareClicked().invoke(this.$item);
    }
}
