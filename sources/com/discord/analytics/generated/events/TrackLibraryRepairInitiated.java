package com.discord.analytics.generated.events;

import com.discord.analytics.generated.traits.TrackBase;
import com.discord.analytics.generated.traits.TrackBaseReceiver;
import com.discord.analytics.generated.traits.TrackStoreSkuMetadata;
import com.discord.analytics.generated.traits.TrackStoreSkuMetadataReceiver;
import com.discord.api.science.AnalyticsSchema;

/* JADX INFO: compiled from: TrackLibraryRepairInitiated.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TrackLibraryRepairInitiated implements AnalyticsSchema, TrackBaseReceiver, TrackStoreSkuMetadataReceiver {
    private TrackBase trackBase;
    private TrackStoreSkuMetadata trackStoreSkuMetadata;
    private final transient String analyticsSchemaTypeName = "library_repair_initiated";

    @Override // com.discord.api.science.AnalyticsSchema
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getAnalyticsSchemaTypeName() {
        return this.analyticsSchemaTypeName;
    }
}
