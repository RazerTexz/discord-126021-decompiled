package b.a.a.f.a;

import android.content.Context;
import b.a.d.d0;
import com.discord.rtcconnection.audio.DiscordAudioManager;
import com.discord.stores.StoreAudioManagerV2;
import com.discord.stores.StoreStream;
import com.discord.utilities.rx.ObservableExtensionsKt;
import d0.z.d.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;

/* JADX INFO: compiled from: AudioOutputSelectionDialogViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends d0<a> {
    public final StoreAudioManagerV2 j;

    /* JADX INFO: compiled from: AudioOutputSelectionDialogViewModel.kt */
    public abstract class a {

        /* JADX INFO: renamed from: b.a.a.f.a.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AudioOutputSelectionDialogViewModel.kt */
        public final class C0025a extends a {
            public final DiscordAudioManager.DeviceTypes a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f48b;
            public final String c;
            public final boolean d;
            public final boolean e;
            public final boolean f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0025a(DiscordAudioManager.DeviceTypes deviceTypes, boolean z2, String str, boolean z3, boolean z4, boolean z5) {
                super(null);
                m.checkNotNullParameter(deviceTypes, "selectedAudioOutput");
                this.a = deviceTypes;
                this.f48b = z2;
                this.c = str;
                this.d = z3;
                this.e = z4;
                this.f = z5;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0025a)) {
                    return false;
                }
                C0025a c0025a = (C0025a) obj;
                return m.areEqual(this.a, c0025a.a) && this.f48b == c0025a.f48b && m.areEqual(this.c, c0025a.c) && this.d == c0025a.d && this.e == c0025a.e && this.f == c0025a.f;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [int] */
            /* JADX WARN: Type inference failed for: r0v12, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4, types: [int] */
            /* JADX WARN: Type inference failed for: r0v8, types: [int] */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v3, types: [int] */
            /* JADX WARN: Type inference failed for: r1v5, types: [int] */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1, types: [int] */
            /* JADX WARN: Type inference failed for: r3v2 */
            public int hashCode() {
                DiscordAudioManager.DeviceTypes deviceTypes = this.a;
                int iHashCode = (deviceTypes != null ? deviceTypes.hashCode() : 0) * 31;
                boolean z2 = this.f48b;
                ?? r2 = z2;
                if (z2) {
                    r2 = 1;
                }
                int i = (iHashCode + r2) * 31;
                String str = this.c;
                int iHashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
                boolean z3 = this.d;
                ?? r1 = z3;
                if (z3) {
                    r1 = 1;
                }
                int i2 = (iHashCode2 + r1) * 31;
                boolean z4 = this.e;
                ?? r3 = z4;
                if (z4) {
                    r3 = 1;
                }
                int i3 = (i2 + r3) * 31;
                boolean z5 = this.f;
                return i3 + (z5 ? 1 : z5);
            }

            public String toString() {
                StringBuilder sbU = b.d.b.a.a.U("Loaded(selectedAudioOutput=");
                sbU.append(this.a);
                sbU.append(", showBluetoothItem=");
                sbU.append(this.f48b);
                sbU.append(", bluetoothDeviceName=");
                sbU.append(this.c);
                sbU.append(", showSpeakerItem=");
                sbU.append(this.d);
                sbU.append(", showWiredItem=");
                sbU.append(this.e);
                sbU.append(", showEarpieceItem=");
                return b.d.b.a.a.O(sbU, this.f, ")");
            }
        }

        /* JADX INFO: compiled from: AudioOutputSelectionDialogViewModel.kt */
        public final class b extends a {
            public static final b a = new b();

            public b() {
                super(null);
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public d() {
        this(null, null, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StoreAudioManagerV2 storeAudioManagerV2, Observable observable, int i) {
        super(a.b.a);
        StoreAudioManagerV2 audioManagerV2 = (i & 1) != 0 ? StoreStream.INSTANCE.getAudioManagerV2() : null;
        Observable<StoreAudioManagerV2.State> observableObserveAudioManagerState = (i & 2) != 0 ? audioManagerV2.observeAudioManagerState() : null;
        m.checkNotNullParameter(audioManagerV2, "storeAudioManager");
        m.checkNotNullParameter(observableObserveAudioManagerState, "storeStateObservable");
        this.j = audioManagerV2;
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui$default(ObservableExtensionsKt.computationLatest(observableObserveAudioManagerState), this, null, 2, null), d.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new c(this), 62, (Object) null);
    }
}
