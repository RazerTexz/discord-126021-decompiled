package com.discord.analytics.generated.events;

import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBaseReceiver;
import com.discord.analytics.generated.traits.TrackChannel;
import com.discord.analytics.generated.traits.TrackChannelReceiver;
import com.discord.analytics.generated.traits.TrackGuild;
import com.discord.analytics.generated.traits.TrackGuildReceiver;
import com.discord.api.science.AnalyticsSchema;
import p007b.p100d.p104b.p105a.C1643a;
import p507d0.p592z.p594d.C12238m;

/* JADX INFO: compiled from: TrackStickerSearchViewAll.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackStickerSearchViewAll implements AnalyticsSchema, TrackBaseReceiver, TrackGuildReceiver, TrackChannelReceiver {
    private final Long stickerId = null;
    private final Long stickerPackId = null;
    private TrackBase trackBase;
    private TrackChannel trackChannel;
    private TrackGuild trackGuild;
    private final transient String analyticsSchemaTypeName = "sticker_search_view_all";

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackStickerSearchViewAll)) {
            return false;
        }
        TrackStickerSearchViewAll trackStickerSearchViewAll = (TrackStickerSearchViewAll) other;
        return C12238m.areEqual(this.stickerId, trackStickerSearchViewAll.stickerId) && C12238m.areEqual(this.stickerPackId, trackStickerSearchViewAll.stickerPackId);
    }

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }

    @Override // com.discord.analytics.generated.traits.TrackGuildReceiver
    /* JADX INFO: renamed from: a, reason: from getter */
    public TrackGuild getTrackGuild() {
        return this.trackGuild;
    }

    public int hashCode() {
        Long l = this.stickerId;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.stickerPackId;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.discord.analytics.generated.traits.TrackGuildReceiver
    /* JADX INFO: renamed from: c */
    public void mo7508c(TrackGuild trackGuild) {
        this.trackGuild = trackGuild;
    }

    public String toString() {
        StringBuilder sbM833U = C1643a.m833U("TrackStickerSearchViewAll(stickerId=");
        sbM833U.append(this.stickerId);
        sbM833U.append(", stickerPackId=");
        return C1643a.m819G(sbM833U, this.stickerPackId, ")");
    }
}
