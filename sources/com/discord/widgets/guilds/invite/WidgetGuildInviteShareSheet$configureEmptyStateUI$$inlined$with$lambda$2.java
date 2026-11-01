package com.discord.widgets.guilds.invite;

import android.view.View;

/* JADX INFO: compiled from: WidgetGuildInviteShareSheet.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetGuildInviteShareSheet$configureEmptyStateUI$$inlined$with$lambda$2 implements View.OnClickListener {
    public final /* synthetic */ GuildInvite $invite;
    public final /* synthetic */ GuildInviteShareSheetViewModel.ViewState $viewState$inlined;
    public final /* synthetic */ WidgetGuildInviteShareSheet this$0;

    public WidgetGuildInviteShareSheet$configureEmptyStateUI$$inlined$with$lambda$2(GuildInvite guildInvite, WidgetGuildInviteShareSheet widgetGuildInviteShareSheet, GuildInviteShareSheetViewModel.ViewState viewState) {
        this.$invite = guildInvite;
        this.this$0 = widgetGuildInviteShareSheet;
        this.$viewState$inlined = viewState;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.$invite != null) {
            GuildInviteUiHelperKt.shareLinkClick(this.this$0.getContext(), this.$invite, this.$viewState$inlined.getChannel());
        }
    }
}
