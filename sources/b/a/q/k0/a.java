package b.a.q.k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import androidx.annotation.MainThread;
import androidx.core.os.EnvironmentCompat;
import com.discord.models.domain.ModelAuditLogEntry;
import com.discord.rtcconnection.enums.AudioManagerBroadcastAction;
import com.discord.rtcconnection.enums.ScoAudioState;
import d0.z.d.m;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;
import org.webrtc.ThreadUtils;

/* JADX INFO: compiled from: AudioManagerBroadcastReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public static final C0040a a = new C0040a(null);
    public final h c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f261b;

    /* JADX INFO: renamed from: b.a.q.k0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioManagerBroadcastReceiver.kt */
    public final class C0040a {
        public C0040a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public a(Context context, h hVar) {
        m.checkNotNullParameter(context, "context");
        m.checkNotNullParameter(hVar, "listener");
        this.f261b = context;
        this.c = hVar;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(Context context, Intent intent) {
        b.a.q.l0.a c0041a;
        m.checkNotNullParameter(context, "context");
        ThreadUtils.checkIsOnMainThread();
        if (intent == null) {
            return;
        }
        Objects.requireNonNull(AudioManagerBroadcastAction.INSTANCE);
        m.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        AudioManagerBroadcastAction audioManagerBroadcastAction = null;
        if (action != null) {
            m.checkNotNullParameter(action, "action");
            AudioManagerBroadcastAction[] audioManagerBroadcastActionArrValues = AudioManagerBroadcastAction.values();
            for (int i = 0; i < 5; i++) {
                AudioManagerBroadcastAction audioManagerBroadcastAction2 = audioManagerBroadcastActionArrValues[i];
                if (m.areEqual(audioManagerBroadcastAction2.getAction(), action)) {
                    audioManagerBroadcastAction = audioManagerBroadcastAction2;
                    break;
                }
            }
        }
        if (audioManagerBroadcastAction == null) {
            StringBuilder sbU = b.d.b.a.a.U("unable to parse AudioManagerBroadcastAction for action: ");
            sbU.append(intent.getAction());
            b.c.a.a0.d.f1("AudioManagerBroadcastReceiver", sbU.toString());
            return;
        }
        b.c.a.a0.d.e1("AudioManagerBroadcastReceiver", "onReceive: action = " + audioManagerBroadcastAction);
        try {
            h hVar = this.c;
            int iOrdinal = audioManagerBroadcastAction.ordinal();
            if (iOrdinal == 0) {
                hVar.c(context);
                return;
            }
            if (iOrdinal == 1) {
                m.checkNotNullParameter(intent, "intent");
                if (!m.areEqual(intent.getAction(), "android.intent.action.HEADSET_PLUG")) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (intent.getIntExtra("state", 0) == 1) {
                    String stringExtra = intent.getStringExtra(ModelAuditLogEntry.CHANGE_KEY_NAME);
                    if (stringExtra == null) {
                        stringExtra = EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    m.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(\"name\") ?: \"unknown\"");
                    c0041a = new b.a.q.l0.a.C0041a(stringExtra, intent.getIntExtra("microphone", 0) == 1);
                } else {
                    c0041a = b.a.q.l0.a.b.a;
                }
                hVar.e(context, c0041a);
                return;
            }
            if (iOrdinal == 2) {
                hVar.b(context, ScoAudioState.INSTANCE.b(intent));
                return;
            }
            if (iOrdinal == 3) {
                m.checkNotNullParameter(context, "$this$isMicrophoneMute");
                m.checkNotNullParameter(context, "$this$getAudioManager");
                Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                hVar.a(context, ((AudioManager) systemService).isMicrophoneMute());
                return;
            }
            if (iOrdinal != 4) {
                return;
            }
            m.checkNotNullParameter(context, "$this$isSpeakerphoneOn");
            m.checkNotNullParameter(context, "$this$getAudioManager");
            Object systemService2 = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            Objects.requireNonNull(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
            hVar.d(context, ((AudioManager) systemService2).isSpeakerphoneOn());
        } catch (Throwable th) {
            b.c.a.a0.d.c1("AudioManagerBroadcastReceiver", "error handling " + audioManagerBroadcastAction, th);
        }
    }
}
