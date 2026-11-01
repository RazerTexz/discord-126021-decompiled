package com.discord.widgets.channels;

import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WidgetGroupInviteFriendsAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetGroupInviteFriendsAdapter$WidgetGroupInviteFriendsListItem$onConfigure$1 implements View.OnClickListener {
    public final /* synthetic */ WidgetGroupInviteFriends.Model.FriendItem $data;
    public final /* synthetic */ WidgetGroupInviteFriendsAdapter.WidgetGroupInviteFriendsListItem this$0;

    public WidgetGroupInviteFriendsAdapter$WidgetGroupInviteFriendsListItem$onConfigure$1(WidgetGroupInviteFriendsAdapter.WidgetGroupInviteFriendsListItem widgetGroupInviteFriendsListItem, WidgetGroupInviteFriends.Model.FriendItem friendItem) {
        this.this$0 = widgetGroupInviteFriendsListItem;
        this.$data = friendItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function2 function2Access$getListener$p;
        if (this.$data.getUser() == null || (function2Access$getListener$p = WidgetGroupInviteFriendsAdapter.access$getListener$p(WidgetGroupInviteFriendsAdapter.WidgetGroupInviteFriendsListItem.access$getAdapter$p(this.this$0))) == null) {
            return;
        }
    }
}
