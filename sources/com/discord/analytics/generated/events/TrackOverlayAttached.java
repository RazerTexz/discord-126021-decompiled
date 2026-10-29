package com.discord.analytics.generated.events;

import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBaseReceiver;
import com.discord.api.science.AnalyticsSchema;
import p007b.p100d.p104b.p105a.C1643a;
import p507d0.p592z.p594d.C12238m;

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
        return C12238m.areEqual(this.attachStatus, trackOverlayAttached.attachStatus) && C12238m.areEqual(this.overlaySession, trackOverlayAttached.overlaySession);
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
        StringBuilder sbM833U = C1643a.m833U("TrackOverlayAttached(attachStatus=");
        sbM833U.append(this.attachStatus);
        sbM833U.append(", overlaySession=");
        return C1643a.m817E(sbM833U, this.overlaySession, ")");
    }
}
