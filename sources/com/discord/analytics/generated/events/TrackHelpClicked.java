package com.discord.analytics.generated.events;

import b.d.b.a.a;
import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBaseReceiver;
import com.discord.api.science.AnalyticsSchema;
import d0.z.d.m;

/* JADX INFO: compiled from: TrackHelpClicked.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackHelpClicked implements AnalyticsSchema, TrackBaseReceiver {
    private final Boolean highlighted = null;
    private TrackBase trackBase;
    private final transient String analyticsSchemaTypeName = "help_clicked";

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof TrackHelpClicked) && m.areEqual(this.highlighted, ((TrackHelpClicked) other).highlighted);
        }
        return true;
    }

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }

    public int hashCode() {
        Boolean bool = this.highlighted;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.D(a.U("TrackHelpClicked(highlighted="), this.highlighted, ")");
    }
}
