package b.a.q.m0.c;

import com.discord.rtcconnection.mediaengine.MediaEngineConnection;
import com.discord.utilities.logging.Logger;
import com.hammerandchisel.libdiscord.Discord;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: MediaEngineConnectionLegacy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Discord.ConnectToServerCallback {
    public final /* synthetic */ e a;

    /* JADX INFO: compiled from: MediaEngineConnectionLegacy.kt */
    public final class a extends d0.z.d.o implements Function0<Unit> {
        public final /* synthetic */ Discord.ConnectionInfo $connectionInfo;
        public final /* synthetic */ String $errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Discord.ConnectionInfo connectionInfo, String str) {
            super(0);
            this.$connectionInfo = connectionInfo;
            this.$errorMessage = str;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0087 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:14:0x0089  */
        /* JADX WARN: Code duplicated, block: B:15:0x0092  */
        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            e eVar = d.this.a;
            Discord.ConnectionInfo connectionInfo = this.$connectionInfo;
            String str = this.$errorMessage;
            Logger.i$default(eVar.l, "MediaEngineConnectionLegacy", b.d.b.a.a.w("handleConnection(). errorMessage: ", str), null, 4, null);
            if (connectionInfo != null) {
                if (str == null || str.length() == 0) {
                    String str2 = connectionInfo.localAddress;
                    d0.z.d.m.checkNotNullExpressionValue(str2, "connectionInfo.localAddress");
                    int i = connectionInfo.localPort;
                    String str3 = connectionInfo.protocol;
                    d0.z.d.m.checkNotNullExpressionValue(str3, "connectionInfo.protocol");
                    Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = str3.toUpperCase();
                    d0.z.d.m.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
                    MediaEngineConnection.TransportInfo transportInfo = new MediaEngineConnection.TransportInfo(str2, i, MediaEngineConnection.TransportInfo.Protocol.valueOf(upperCase));
                    MediaEngineConnection.ConnectionState connectionState = MediaEngineConnection.ConnectionState.CONNECTED;
                    eVar.f270b = connectionState;
                    eVar.y(new b.a.q.m0.c.a(eVar, connectionState));
                    b.a.q.m0.a aVar = new b.a.q.m0.a("opus", 1, MediaStreamTrack.AUDIO_TRACK_KIND, 120, null);
                    eVar.i.clear();
                    eVar.i.add(aVar);
                    eVar.i.addAll(eVar.o);
                    eVar.y(new defpackage.m(0, eVar, transportInfo));
                } else if (connectionInfo == null) {
                    eVar.y(new defpackage.m(1, eVar, str));
                } else {
                    eVar.y(new defpackage.m(2, eVar, str));
                }
            } else if (connectionInfo == null) {
                eVar.y(new defpackage.m(1, eVar, str));
            } else {
                eVar.y(new defpackage.m(2, eVar, str));
            }
            return Unit.a;
        }
    }

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // com.hammerandchisel.libdiscord.Discord.ConnectToServerCallback
    public final void onConnectToServer(Discord.ConnectionInfo connectionInfo, String str) {
        d0.z.d.m.checkNotNullParameter(connectionInfo, "connectionInfo");
        d0.z.d.m.checkNotNullParameter(str, "errorMessage");
        e.x(this.a, new a(connectionInfo, str));
    }
}
