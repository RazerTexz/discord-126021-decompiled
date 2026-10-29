package com.discord.analytics.generated.events;

import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBaseReceiver;
import com.discord.api.science.AnalyticsSchema;

/* JADX INFO: compiled from: TrackMessageLengthLimitReached.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TrackMessageLengthLimitReached implements AnalyticsSchema, TrackBaseReceiver {
    private TrackBase trackBase;
    private final transient String analyticsSchemaTypeName = "message_length_limit_reached";

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }
}
