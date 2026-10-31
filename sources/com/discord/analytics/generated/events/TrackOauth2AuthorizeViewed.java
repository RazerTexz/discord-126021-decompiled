package com.discord.analytics.generated.events;

import b.d.b.a.a;
import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBaseReceiver;
import com.discord.api.science.AnalyticsSchema;
import d0.z.d.m;

/* JADX INFO: compiled from: TrackOauth2AuthorizeViewed.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackOauth2AuthorizeViewed implements AnalyticsSchema, TrackBaseReceiver {
    private final Long applicationId = null;
    private TrackBase trackBase;
    private final transient String analyticsSchemaTypeName = "oauth2_authorize_viewed";

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof TrackOauth2AuthorizeViewed) && m.areEqual(this.applicationId, ((TrackOauth2AuthorizeViewed) other).applicationId);
        }
        return true;
    }

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }

    public int hashCode() {
        Long l = this.applicationId;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.G(a.U("TrackOauth2AuthorizeViewed(applicationId="), this.applicationId, ")");
    }
}
