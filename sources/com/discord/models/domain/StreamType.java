package com.discord.models.domain;

import androidx.core.app.NotificationCompat;
import b.d.b.a.a;
import d0.z.d.m;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ModelApplicationStream.kt */
/* JADX INFO: loaded from: classes.dex */
public enum StreamType {
    GUILD("guild"),
    CALL(NotificationCompat.CATEGORY_CALL);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String serializedRepresentation;
    private static final StreamType[] VALUES = values();

    /* JADX INFO: compiled from: ModelApplicationStream.kt */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        public final StreamType fromString(String string) {
            m.checkNotNullParameter(string, "string");
            for (StreamType streamType : StreamType.access$getVALUES$cp()) {
                if (m.areEqual(streamType.getSerializedRepresentation(), string)) {
                    if (streamType != null) {
                        return streamType;
                    }
                    throw new IllegalArgumentException(a.w("unable to parse stream type: ", string));
                }
            }
            streamType = null;
            if (streamType != null) {
                return streamType;
            }
            throw new IllegalArgumentException(a.w("unable to parse stream type: ", string));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    StreamType(String str) {
        this.serializedRepresentation = str;
    }

    public static final /* synthetic */ StreamType[] access$getVALUES$cp() {
        return VALUES;
    }

    public final String getSerializedRepresentation() {
        return this.serializedRepresentation;
    }
}
