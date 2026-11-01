package com.discord.api.guildscheduledevent;

import b.d.b.a.a;
import com.discord.models.domain.ModelAuditLogEntry;
import d0.z.d.m;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: GuildScheduledEventEntityMetadata.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* data */ class GuildScheduledEventEntityMetadata implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String location;

    /* JADX INFO: compiled from: GuildScheduledEventEntityMetadata.kt */
    public final class Companion {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                GuildScheduledEventEntityType.values();
                int[] iArr = new int[5];
                $EnumSwitchMapping$0 = iArr;
                iArr[GuildScheduledEventEntityType.EXTERNAL.ordinal()] = 1;
            }
        }

        public Companion() {
        }

        public final GuildScheduledEventEntityMetadata a(GuildScheduledEventEntityType entityType, String location) {
            m.checkNotNullParameter(entityType, "entityType");
            return entityType.ordinal() != 3 ? new GuildScheduledEventEntityMetadata(null, 1) : new GuildScheduledEventEntityMetadata(location);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public GuildScheduledEventEntityMetadata() {
        this.location = null;
    }

    public final boolean b() {
        return this.location == null;
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof GuildScheduledEventEntityMetadata) && m.areEqual(this.location, ((GuildScheduledEventEntityMetadata) other).location);
        }
        return true;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public int hashCode() {
        String str = this.location;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.J(a.U("GuildScheduledEventEntityMetadata(location="), this.location, ")");
    }

    public GuildScheduledEventEntityMetadata(String str) {
        this.location = str;
    }

    public GuildScheduledEventEntityMetadata(String str, int i) {
        int i2 = i & 1;
        this.location = null;
    }
}
