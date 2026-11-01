package b.a.q.k0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothHeadset;
import d0.z.d.o;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: BluetoothHeadsetPrivateApi.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DiscouragedPrivateApi"})
public final class d {
    public static final d c = null;
    public static final Lazy a = d0.g.lazy(a.j);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f263b = d0.g.lazy(b.j);

    /* JADX INFO: compiled from: BluetoothHeadsetPrivateApi.kt */
    public final class a extends o implements Function0<String> {
        public static final a j = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public String invoke() {
            try {
                Object obj = BluetoothHeadset.class.getField("ACTION_ACTIVE_DEVICE_CHANGED").get(null);
                if (!(obj instanceof String)) {
                    obj = null;
                }
                return (String) obj;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: BluetoothHeadsetPrivateApi.kt */
    public final class b extends o implements Function0<Method> {
        public static final b j = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Method invoke() {
            try {
                return BluetoothHeadset.class.getDeclaredMethod("getActiveDevice", new Class[0]);
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
