package com.discord.widgets.channels.list;

import android.view.View;

/* JADX INFO: compiled from: WidgetChannelsListAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetChannelsListAdapter$ItemGuildRoleSubscriptionsOverview$onConfigure$1 implements View.OnClickListener {
    public final /* synthetic */ WidgetChannelsListAdapter.ItemGuildRoleSubscriptionsOverview this$0;

    public WidgetChannelsListAdapter$ItemGuildRoleSubscriptionsOverview$onConfigure$1(WidgetChannelsListAdapter.ItemGuildRoleSubscriptionsOverview itemGuildRoleSubscriptionsOverview) {
        this.this$0 = itemGuildRoleSubscriptionsOverview;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WidgetChannelsListAdapter.ItemGuildRoleSubscriptionsOverview.access$getAdapter$p(this.this$0).getOnViewGuildRoleSubscriptions().invoke();
    }
}
