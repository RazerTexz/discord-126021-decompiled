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

/* JADX INFO: compiled from: TrackReactionLimitReached.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackReactionLimitReached implements AnalyticsSchema, TrackBaseReceiver, TrackChannelReceiver, TrackGuildReceiver {
    private final Long limit = null;
    private TrackBase trackBase;
    private TrackChannel trackChannel;
    private TrackGuild trackGuild;
    private final transient String analyticsSchemaTypeName = "reaction_limit_reached";

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof TrackReactionLimitReached) && C12238m.areEqual(this.limit, ((TrackReactionLimitReached) other).limit);
        }
        return true;
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
        Long l = this.limit;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    @Override // com.discord.analytics.generated.traits.TrackGuildReceiver
    /* JADX INFO: renamed from: c */
    public void mo7508c(TrackGuild trackGuild) {
        this.trackGuild = trackGuild;
    }

    public String toString() {
        return C1643a.m819G(C1643a.m833U("TrackReactionLimitReached(limit="), this.limit, ")");
    }
}
