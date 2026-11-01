package com.discord.utilities.voice;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.StringRes;
import b.a.d.m;
import b.a.k.b;
import b.d.b.a.a;
import com.discord.R;
import com.discord.rtcconnection.RtcConnection;
import com.discord.stores.StoreAudioManagerV2;
import com.discord.stores.StoreMediaSettings;
import com.discord.stores.StoreRtcConnection;
import com.discord.stores.StoreVoiceChannelSelected;
import com.discord.utilities.rx.ObservableExtensionsKt;
import d0.g;
import d0.z.d.o;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;

/* JADX INFO: compiled from: VoiceEngineServiceController.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VoiceEngineServiceController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final StoreAudioManagerV2 audioManagerStore;
    private final StoreMediaSettings mediaSettingsStore;
    private final Observable<NotificationData> notificationDataObservable;
    private VoiceEngineForegroundService.Connection serviceBinding;
    private final StoreVoiceChannelSelected voiceChannelSelectedStore;
    private static final Lazy INSTANCE$delegate = g.lazy(VoiceEngineServiceController$Companion$INSTANCE$2.INSTANCE);
    private static final NotificationData NOTIFICATION_DATA_DISCONNECTED = new NotificationData(new RtcConnection.State.d(false), "", false, false, false, false, -1, null, false, false);

    /* JADX INFO: renamed from: com.discord.utilities.voice.VoiceEngineServiceController$init$1, reason: invalid class name */
    /* JADX INFO: compiled from: VoiceEngineServiceController.kt */
    public final class AnonymousClass1 extends o implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoiceEngineServiceController.access$getVoiceChannelSelectedStore$p(VoiceEngineServiceController.this).clear();
        }
    }

    /* JADX INFO: renamed from: com.discord.utilities.voice.VoiceEngineServiceController$init$2, reason: invalid class name */
    /* JADX INFO: compiled from: VoiceEngineServiceController.kt */
    public final class AnonymousClass2 extends o implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoiceEngineServiceController.access$getMediaSettingsStore$p(VoiceEngineServiceController.this).toggleSelfDeafened();
        }
    }

    /* JADX INFO: renamed from: com.discord.utilities.voice.VoiceEngineServiceController$init$3, reason: invalid class name */
    /* JADX INFO: compiled from: VoiceEngineServiceController.kt */
    public final class AnonymousClass3 extends o implements Function0<Unit> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StoreMediaSettings.SelfMuteFailure selfMuteFailure = VoiceEngineServiceController.access$getMediaSettingsStore$p(VoiceEngineServiceController.this).toggleSelfMuted();
            if (selfMuteFailure == null || selfMuteFailure.ordinal() != 0) {
                return;
            }
            m.g(this.$context, R.string.vad_permission_small, 0, null, 12);
        }
    }

    /* JADX INFO: renamed from: com.discord.utilities.voice.VoiceEngineServiceController$init$4, reason: invalid class name */
    /* JADX INFO: compiled from: VoiceEngineServiceController.kt */
    public final class AnonymousClass4 extends o implements Function1<NotificationData, Unit> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NotificationData notificationData) {
            invoke2(notificationData);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NotificationData notificationData) {
            if (notificationData.getRtcConnectionState() instanceof RtcConnection.State.d) {
                DiscordOverlayService.INSTANCE.launchForClose(this.$context);
                VoiceEngineForegroundService.INSTANCE.stopForegroundAndUnbind(VoiceEngineServiceController.access$getServiceBinding$p(VoiceEngineServiceController.this));
                return;
            }
            Context context = this.$context;
            VoiceEngineForegroundService.INSTANCE.startForegroundAndBind(VoiceEngineServiceController.access$getServiceBinding$p(VoiceEngineServiceController.this), b.h(context, R.string.call_mobile_tap_to_return, new Object[]{b.h(context, notificationData.getStateString(), new Object[0], null, 4)}, null, 4), notificationData.getChannelName(), notificationData.isSelfMuted(), notificationData.isSelfDeafened(), notificationData.isSelfStreaming(), notificationData.getChannelId(), notificationData.getGuildId(), notificationData.getProximityLockEnabled(), notificationData.getCanSpeak());
            if (d0.z.d.m.areEqual(notificationData.getRtcConnectionState(), RtcConnection.State.f.a)) {
                DiscordOverlayService.INSTANCE.launchForVoice(this.$context);
            }
        }
    }

    /* JADX INFO: compiled from: VoiceEngineServiceController.kt */
    public final class Companion {
        private Companion() {
        }

        public final VoiceEngineServiceController getINSTANCE() {
            Lazy lazyAccess$getINSTANCE$cp = VoiceEngineServiceController.access$getINSTANCE$cp();
            Companion companion = VoiceEngineServiceController.INSTANCE;
            return (VoiceEngineServiceController) lazyAccess$getINSTANCE$cp.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: VoiceEngineServiceController.kt */
    public final /* data */ class NotificationData {
        private final boolean canSpeak;
        private final long channelId;
        private final String channelName;
        private final Long guildId;
        private final boolean isSelfDeafened;
        private final boolean isSelfMuted;
        private final boolean isSelfStreaming;
        private final boolean isVideo;
        private final boolean proximityLockEnabled;
        private final RtcConnection.State rtcConnectionState;

        @StringRes
        private final int stateString;

        public NotificationData(RtcConnection.State state, String str, boolean z2, boolean z3, boolean z4, boolean z5, long j, Long l, boolean z6, boolean z7) {
            int i;
            d0.z.d.m.checkNotNullParameter(state, "rtcConnectionState");
            d0.z.d.m.checkNotNullParameter(str, "channelName");
            this.rtcConnectionState = state;
            this.channelName = str;
            this.isSelfMuted = z2;
            this.isSelfDeafened = z3;
            this.isSelfStreaming = z4;
            this.isVideo = z5;
            this.channelId = j;
            this.guildId = l;
            this.proximityLockEnabled = z6;
            this.canSpeak = z7;
            if (state instanceof RtcConnection.State.d) {
                i = R.string.connection_status_disconnected;
            } else if (d0.z.d.m.areEqual(state, RtcConnection.State.b.a)) {
                i = R.string.connection_status_awaiting_endpoint;
            } else if (d0.z.d.m.areEqual(state, RtcConnection.State.a.a)) {
                i = R.string.connection_status_authenticating;
            } else if (d0.z.d.m.areEqual(state, RtcConnection.State.c.a)) {
                i = R.string.connection_status_connecting;
            } else if (d0.z.d.m.areEqual(state, RtcConnection.State.h.a)) {
                i = R.string.connection_status_rtc_disconnected;
            } else if (d0.z.d.m.areEqual(state, RtcConnection.State.g.a)) {
                i = R.string.connection_status_rtc_connecting;
            } else if (d0.z.d.m.areEqual(state, RtcConnection.State.f.a)) {
                i = z4 ? R.string.connection_status_stream_self_connected : z5 ? R.string.connection_status_video_connected : R.string.connection_status_voice_connected;
            } else {
                if (!d0.z.d.m.areEqual(state, RtcConnection.State.e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.connection_status_no_route;
            }
            this.stateString = i;
        }

        public static /* synthetic */ NotificationData copy$default(NotificationData notificationData, RtcConnection.State state, String str, boolean z2, boolean z3, boolean z4, boolean z5, long j, Long l, boolean z6, boolean z7, int i, Object obj) {
            return notificationData.copy((i & 1) != 0 ? notificationData.rtcConnectionState : state, (i & 2) != 0 ? notificationData.channelName : str, (i & 4) != 0 ? notificationData.isSelfMuted : z2, (i & 8) != 0 ? notificationData.isSelfDeafened : z3, (i & 16) != 0 ? notificationData.isSelfStreaming : z4, (i & 32) != 0 ? notificationData.isVideo : z5, (i & 64) != 0 ? notificationData.channelId : j, (i & 128) != 0 ? notificationData.guildId : l, (i & 256) != 0 ? notificationData.proximityLockEnabled : z6, (i & 512) != 0 ? notificationData.canSpeak : z7);
        }

        public final NotificationData copy(RtcConnection.State rtcConnectionState, String channelName, boolean isSelfMuted, boolean isSelfDeafened, boolean isSelfStreaming, boolean isVideo, long channelId, Long guildId, boolean proximityLockEnabled, boolean canSpeak) {
            d0.z.d.m.checkNotNullParameter(rtcConnectionState, "rtcConnectionState");
            d0.z.d.m.checkNotNullParameter(channelName, "channelName");
            return new NotificationData(rtcConnectionState, channelName, isSelfMuted, isSelfDeafened, isSelfStreaming, isVideo, channelId, guildId, proximityLockEnabled, canSpeak);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationData)) {
                return false;
            }
            NotificationData notificationData = (NotificationData) other;
            return d0.z.d.m.areEqual(this.rtcConnectionState, notificationData.rtcConnectionState) && d0.z.d.m.areEqual(this.channelName, notificationData.channelName) && this.isSelfMuted == notificationData.isSelfMuted && this.isSelfDeafened == notificationData.isSelfDeafened && this.isSelfStreaming == notificationData.isSelfStreaming && this.isVideo == notificationData.isVideo && this.channelId == notificationData.channelId && d0.z.d.m.areEqual(this.guildId, notificationData.guildId) && this.proximityLockEnabled == notificationData.proximityLockEnabled && this.canSpeak == notificationData.canSpeak;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final boolean getCanSpeak() {
            return this.canSpeak;
        }

        public final boolean getCanSpeak() {
            return this.canSpeak;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final long getChannelId() {
            return this.channelId;
        }

        public final long getChannelId() {
            return this.channelId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChannelName() {
            return this.channelName;
        }

        public final String getChannelName() {
            return this.channelName;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Long getGuildId() {
            return this.guildId;
        }

        public final Long getGuildId() {
            return this.guildId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsSelfDeafened() {
            return this.isSelfDeafened;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsSelfMuted() {
            return this.isSelfMuted;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsSelfStreaming() {
            return this.isSelfStreaming;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getProximityLockEnabled() {
            return this.proximityLockEnabled;
        }

        public final boolean getProximityLockEnabled() {
            return this.proximityLockEnabled;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RtcConnection.State getRtcConnectionState() {
            return this.rtcConnectionState;
        }

        public final RtcConnection.State getRtcConnectionState() {
            return this.rtcConnectionState;
        }

        public final int getStateString() {
            return this.stateString;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [int] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10, types: [int] */
        /* JADX WARN: Type inference failed for: r2v16, types: [int] */
        /* JADX WARN: Type inference failed for: r2v18, types: [int] */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v4, types: [int] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v8, types: [int] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public int hashCode() {
            RtcConnection.State state = this.rtcConnectionState;
            int iHashCode = (state != null ? state.hashCode() : 0) * 31;
            String str = this.channelName;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z2 = this.isSelfMuted;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i = (iHashCode2 + r2) * 31;
            boolean z3 = this.isSelfDeafened;
            ?? r3 = z3;
            if (z3) {
                r3 = 1;
            }
            int i2 = (i + r3) * 31;
            boolean z4 = this.isSelfStreaming;
            ?? r4 = z4;
            if (z4) {
                r4 = 1;
            }
            int i3 = (i2 + r4) * 31;
            boolean z5 = this.isVideo;
            ?? r5 = z5;
            if (z5) {
                r5 = 1;
            }
            int iA = (a0.a.a.b.a(this.channelId) + ((i3 + r5) * 31)) * 31;
            Long l = this.guildId;
            int iHashCode3 = (iA + (l != null ? l.hashCode() : 0)) * 31;
            boolean z6 = this.proximityLockEnabled;
            ?? r0 = z6;
            if (z6) {
                r0 = 1;
            }
            int i4 = (iHashCode3 + r0) * 31;
            boolean z7 = this.canSpeak;
            return i4 + (z7 ? 1 : z7);
        }

        public final boolean isSelfDeafened() {
            return this.isSelfDeafened;
        }

        public final boolean isSelfMuted() {
            return this.isSelfMuted;
        }

        public final boolean isSelfStreaming() {
            return this.isSelfStreaming;
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        public String toString() {
            StringBuilder sbU = a.U("NotificationData(rtcConnectionState=");
            sbU.append(this.rtcConnectionState);
            sbU.append(", channelName=");
            sbU.append(this.channelName);
            sbU.append(", isSelfMuted=");
            sbU.append(this.isSelfMuted);
            sbU.append(", isSelfDeafened=");
            sbU.append(this.isSelfDeafened);
            sbU.append(", isSelfStreaming=");
            sbU.append(this.isSelfStreaming);
            sbU.append(", isVideo=");
            sbU.append(this.isVideo);
            sbU.append(", channelId=");
            sbU.append(this.channelId);
            sbU.append(", guildId=");
            sbU.append(this.guildId);
            sbU.append(", proximityLockEnabled=");
            sbU.append(this.proximityLockEnabled);
            sbU.append(", canSpeak=");
            return a.O(sbU, this.canSpeak, ")");
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            StoreMediaSettings.SelfMuteFailure.values();
            int[] iArr = new int[1];
            $EnumSwitchMapping$0 = iArr;
            iArr[StoreMediaSettings.SelfMuteFailure.CANNOT_USE_VAD.ordinal()] = 1;
        }
    }

    public VoiceEngineServiceController(StoreAudioManagerV2 storeAudioManagerV2, StoreMediaSettings storeMediaSettings, StoreVoiceChannelSelected storeVoiceChannelSelected, StoreRtcConnection storeRtcConnection) {
        d0.z.d.m.checkNotNullParameter(storeAudioManagerV2, "audioManagerStore");
        d0.z.d.m.checkNotNullParameter(storeMediaSettings, "mediaSettingsStore");
        d0.z.d.m.checkNotNullParameter(storeVoiceChannelSelected, "voiceChannelSelectedStore");
        d0.z.d.m.checkNotNullParameter(storeRtcConnection, "rtcConnectionStore");
        this.audioManagerStore = storeAudioManagerV2;
        this.mediaSettingsStore = storeMediaSettings;
        this.voiceChannelSelectedStore = storeVoiceChannelSelected;
        Observable<R> observableY = storeRtcConnection.getConnectionState().Y(new VoiceEngineServiceController$notificationDataObservable$1(this));
        d0.z.d.m.checkNotNullExpressionValue(observableY, "rtcConnectionStore\n     …            }\n          }");
        this.notificationDataObservable = ObservableExtensionsKt.computationLatest(observableY).r();
    }

    public static final /* synthetic */ StoreAudioManagerV2 access$getAudioManagerStore$p(VoiceEngineServiceController voiceEngineServiceController) {
        return voiceEngineServiceController.audioManagerStore;
    }

    public static final /* synthetic */ Lazy access$getINSTANCE$cp() {
        return INSTANCE$delegate;
    }

    public static final /* synthetic */ StoreMediaSettings access$getMediaSettingsStore$p(VoiceEngineServiceController voiceEngineServiceController) {
        return voiceEngineServiceController.mediaSettingsStore;
    }

    public static final /* synthetic */ NotificationData access$getNOTIFICATION_DATA_DISCONNECTED$cp() {
        return NOTIFICATION_DATA_DISCONNECTED;
    }

    public static final /* synthetic */ VoiceEngineForegroundService.Connection access$getServiceBinding$p(VoiceEngineServiceController voiceEngineServiceController) {
        VoiceEngineForegroundService.Connection connection = voiceEngineServiceController.serviceBinding;
        if (connection == null) {
            d0.z.d.m.throwUninitializedPropertyAccessException("serviceBinding");
        }
        return connection;
    }

    public static final /* synthetic */ StoreVoiceChannelSelected access$getVoiceChannelSelectedStore$p(VoiceEngineServiceController voiceEngineServiceController) {
        return voiceEngineServiceController.voiceChannelSelectedStore;
    }

    public static final /* synthetic */ void access$setServiceBinding$p(VoiceEngineServiceController voiceEngineServiceController, VoiceEngineForegroundService.Connection connection) {
        voiceEngineServiceController.serviceBinding = connection;
    }

    public final void init(Context context) {
        d0.z.d.m.checkNotNullParameter(context, "context");
        VoiceEngineForegroundService.Companion companion = VoiceEngineForegroundService.INSTANCE;
        companion.setOnDisconnect(new AnonymousClass1());
        companion.setOnToggleSelfDeafen(new AnonymousClass2());
        companion.setOnToggleSelfMute(new AnonymousClass3(context));
        this.serviceBinding = new VoiceEngineForegroundService.Connection(context);
        Observable<NotificationData> observable = this.notificationDataObservable;
        d0.z.d.m.checkNotNullExpressionValue(observable, "notificationDataObservable");
        ObservableExtensionsKt.appSubscribe$default(observable, VoiceEngineServiceController.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass4(context), 62, (Object) null);
    }

    public final void startStream(Intent permissionIntent) {
        d0.z.d.m.checkNotNullParameter(permissionIntent, "permissionIntent");
        VoiceEngineForegroundService.Companion companion = VoiceEngineForegroundService.INSTANCE;
        VoiceEngineForegroundService.Connection connection = this.serviceBinding;
        if (connection == null) {
            d0.z.d.m.throwUninitializedPropertyAccessException("serviceBinding");
        }
        companion.startStream(connection, permissionIntent);
    }

    public final void stopStream() {
        VoiceEngineForegroundService.Companion companion = VoiceEngineForegroundService.INSTANCE;
        VoiceEngineForegroundService.Connection connection = this.serviceBinding;
        if (connection == null) {
            d0.z.d.m.throwUninitializedPropertyAccessException("serviceBinding");
        }
        companion.stopStream(connection);
    }
}
