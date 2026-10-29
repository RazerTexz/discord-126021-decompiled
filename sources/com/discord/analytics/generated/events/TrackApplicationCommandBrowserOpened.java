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

/* JADX INFO: compiled from: TrackApplicationCommandBrowserOpened.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class TrackApplicationCommandBrowserOpened implements AnalyticsSchema, TrackBaseReceiver, TrackGuildReceiver, TrackChannelReceiver {
    private final Boolean previewEnabled = null;
    private TrackBase trackBase;
    private TrackChannel trackChannel;
    private TrackGuild trackGuild;
    private final transient String analyticsSchemaTypeName = "application_command_browser_opened";

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof TrackApplicationCommandBrowserOpened) && C12238m.areEqual(this.previewEnabled, ((TrackApplicationCommandBrowserOpened) other).previewEnabled);
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
        Boolean bool = this.previewEnabled;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    @Override // com.discord.analytics.generated.traits.TrackGuildReceiver
    /* JADX INFO: renamed from: c */
    public void mo7508c(TrackGuild trackGuild) {
        this.trackGuild = trackGuild;
    }

    public String toString() {
        return C1643a.m816D(C1643a.m833U("TrackApplicationCommandBrowserOpened(previewEnabled="), this.previewEnabled, ")");
    }
}
