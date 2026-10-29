package com.discord.analytics.generated.events;

import b.d.b.a.a;
import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBaseReceiver;
import com.discord.api.science.AnalyticsSchema;
import d0.z.d.m;

/* JADX INFO: compiled from: TrackInviteAppInvoked.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackInviteAppInvoked implements AnalyticsSchema, TrackBaseReceiver {
    private final CharSequence inviteCode = null;
    private TrackBase trackBase;
    private final transient String analyticsSchemaTypeName = "invite_app_invoked";

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof TrackInviteAppInvoked) && m.areEqual(this.inviteCode, ((TrackInviteAppInvoked) other).inviteCode);
        }
        return true;
    }

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }

    public int hashCode() {
        CharSequence charSequence = this.inviteCode;
        if (charSequence != null) {
            return charSequence.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.E(a.U("TrackInviteAppInvoked(inviteCode="), this.inviteCode, ")");
    }
}
