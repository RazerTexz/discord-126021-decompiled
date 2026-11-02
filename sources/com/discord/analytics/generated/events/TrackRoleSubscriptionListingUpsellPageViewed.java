package com.discord.analytics.generated.events;

import b.d.b.a.outline;
import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBase2;
import com.discord.analytics.generated.traits.TrackChannel;
import com.discord.analytics.generated.traits.TrackChannel2;
import com.discord.analytics.generated.traits.TrackGuild;
import com.discord.analytics.generated.traits.TrackGuild2;
import com.discord.api.science.AnalyticsSchema;
import d0.z.d.Intrinsics3;
import java.util.List;

/* JADX INFO: compiled from: TrackRoleSubscriptionListingUpsellPageViewed.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackRoleSubscriptionListingUpsellPageViewed implements AnalyticsSchema, TrackBase2, TrackGuild2, TrackChannel2 {
    private final Boolean isPremiumMember = null;
    private final Long roleSubscriptionGroupListingId = null;
    private final List<Long> roleSubscriptionListingIds = null;
    private TrackBase trackBase;
    private TrackChannel trackChannel;
    private TrackGuild trackGuild;
    private final transient String analyticsSchemaTypeName = "role_subscription_listing_upsell_page_viewed";

    @Override // com.discord.analytics.generated.traits.TrackGuild2
    public void c(TrackGuild trackGuild) {
        this.trackGuild = trackGuild;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackRoleSubscriptionListingUpsellPageViewed)) {
            return false;
        }
        TrackRoleSubscriptionListingUpsellPageViewed trackRoleSubscriptionListingUpsellPageViewed = (TrackRoleSubscriptionListingUpsellPageViewed) other;
        return Intrinsics3.areEqual(this.roleSubscriptionGroupListingId, trackRoleSubscriptionListingUpsellPageViewed.roleSubscriptionGroupListingId) && Intrinsics3.areEqual(this.roleSubscriptionListingIds, trackRoleSubscriptionListingUpsellPageViewed.roleSubscriptionListingIds) && Intrinsics3.areEqual(this.isPremiumMember, trackRoleSubscriptionListingUpsellPageViewed.isPremiumMember);
    }

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }

    @Override // com.discord.analytics.generated.traits.TrackGuild2
    /* JADX INFO: renamed from: a, reason: from getter */
    public TrackGuild getTrackGuild() {
        return this.trackGuild;
    }

    public int hashCode() {
        Long l = this.roleSubscriptionGroupListingId;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        List<Long> list = this.roleSubscriptionListingIds;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.isPremiumMember;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbU = outline.U("TrackRoleSubscriptionListingUpsellPageViewed(roleSubscriptionGroupListingId=");
        sbU.append(this.roleSubscriptionGroupListingId);
        sbU.append(", roleSubscriptionListingIds=");
        sbU.append(this.roleSubscriptionListingIds);
        sbU.append(", isPremiumMember=");
        return outline.D(sbU, this.isPremiumMember, ")");
    }
}
