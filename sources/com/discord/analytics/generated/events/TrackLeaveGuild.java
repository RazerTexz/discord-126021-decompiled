package com.discord.analytics.generated.events;

import b.d.b.a.outline;
import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBase2;
import com.discord.api.science.AnalyticsSchema;
import d0.z.d.Intrinsics3;

/* JADX INFO: compiled from: TrackLeaveGuild.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackLeaveGuild implements AnalyticsSchema, TrackBase2 {
    private final Long guildId = null;
    private final CharSequence guildName = null;
    private TrackBase trackBase;
    private final transient String analyticsSchemaTypeName = "leave_guild";

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackLeaveGuild)) {
            return false;
        }
        TrackLeaveGuild trackLeaveGuild = (TrackLeaveGuild) other;
        return Intrinsics3.areEqual(this.guildId, trackLeaveGuild.guildId) && Intrinsics3.areEqual(this.guildName, trackLeaveGuild.guildName);
    }

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }

    public int hashCode() {
        Long l = this.guildId;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        CharSequence charSequence = this.guildName;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbU = outline.U("TrackLeaveGuild(guildId=");
        sbU.append(this.guildId);
        sbU.append(", guildName=");
        return outline.E(sbU, this.guildName, ")");
    }
}
