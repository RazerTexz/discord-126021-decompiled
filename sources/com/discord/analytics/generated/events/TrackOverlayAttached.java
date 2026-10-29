package com.discord.analytics.generated.events;

import b.d.b.a.a;
import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBaseReceiver;
import com.discord.api.science.AnalyticsSchema;
import d0.z.d.m;

/* JADX INFO: compiled from: TrackOverlayAttached.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackOverlayAttached implements AnalyticsSchema, TrackBaseReceiver {
    private final Long attachStatus = null;
    private final CharSequence overlaySession = null;
    private TrackBase trackBase;
    private final transient String analyticsSchemaTypeName = "overlay_attached";

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackOverlayAttached)) {
            return false;
        }
        TrackOverlayAttached trackOverlayAttached = (TrackOverlayAttached) other;
        return m.areEqual(this.attachStatus, trackOverlayAttached.attachStatus) && m.areEqual(this.overlaySession, trackOverlayAttached.overlaySession);
    }

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }

    public int hashCode() {
        Long l = this.attachStatus;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        CharSequence charSequence = this.overlaySession;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbU = a.U("TrackOverlayAttached(attachStatus=");
        sbU.append(this.attachStatus);
        sbU.append(", overlaySession=");
        return a.E(sbU, this.overlaySession, ")");
    }
}
