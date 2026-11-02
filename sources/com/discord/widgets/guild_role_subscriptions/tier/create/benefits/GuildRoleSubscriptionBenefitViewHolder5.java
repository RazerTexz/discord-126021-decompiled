package com.discord.widgets.guild_role_subscriptions.tier.create.benefits;

import android.view.View;
import com.discord.views.CheckedSetting;
import d0.z.d.Intrinsics3;

/* JADX INFO: renamed from: com.discord.widgets.guild_role_subscriptions.tier.create.benefits.GuildRoleSubscriptionBenefitViewHolder$FreeTrialViewHolder$configure$1, reason: use source file name */
/* JADX INFO: compiled from: GuildRoleSubscriptionBenefitViewHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GuildRoleSubscriptionBenefitViewHolder5 implements View.OnClickListener {
    public final /* synthetic */ GuildRoleSubscriptionBenefitViewHolder.FreeTrialViewHolder this$0;

    public GuildRoleSubscriptionBenefitViewHolder5(GuildRoleSubscriptionBenefitViewHolder.FreeTrialViewHolder freeTrialViewHolder) {
        this.this$0 = freeTrialViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GuildRoleSubscriptionBenefitAdapter.Listener listenerAccess$getListener$p = GuildRoleSubscriptionBenefitViewHolder.FreeTrialViewHolder.access$getListener$p(this.this$0);
        CheckedSetting checkedSetting = GuildRoleSubscriptionBenefitViewHolder.FreeTrialViewHolder.access$getBinding$p(this.this$0).e;
        Intrinsics3.checkNotNullExpressionValue(checkedSetting, "binding.guildRoleSubscriptionFreeTrialEnableToggle");
        listenerAccess$getListener$p.onFreeTrialToggle(!checkedSetting.isChecked());
    }
}
