package b.o.a;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: CameraLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Set<InterfaceC0166b> f1910b;

    @VisibleForTesting
    public static InterfaceC0166b c;

    @NonNull
    public String d;

    /* JADX INFO: renamed from: b.o.a.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CameraLogger.java */
    public interface InterfaceC0166b {
        void a(int i, @NonNull String str, @NonNull String str2, @Nullable Throwable th);
    }

    /* JADX INFO: compiled from: CameraLogger.java */
    public class a implements InterfaceC0166b {
        @Override // b.o.a.b.InterfaceC0166b
        public void a(int i, @NonNull String str, @NonNull String str2, @Nullable Throwable th) {
            if (i == 0) {
                Log.v(str, str2, th);
                return;
            }
            if (i == 1) {
                Log.i(str, str2, th);
            } else if (i == 2) {
                Log.w(str, str2, th);
            } else {
                if (i != 3) {
                    return;
                }
                Log.e(str, str2, th);
            }
        }
    }

    static {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        f1910b = copyOnWriteArraySet;
        a aVar = new a();
        c = aVar;
        a = 3;
        copyOnWriteArraySet.add(aVar);
    }

    public b(@NonNull String str) {
        this.d = str;
    }

    @Nullable
    public final String a(int i, @NonNull Object... objArr) {
        Throwable th = null;
        if (!(a <= i && f1910b.size() > 0)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
            sb.append(String.valueOf(obj));
            sb.append(" ");
        }
        String strTrim = sb.toString().trim();
        Iterator<InterfaceC0166b> it = f1910b.iterator();
        while (it.hasNext()) {
            it.next().a(i, this.d, strTrim, th);
        }
        return strTrim;
    }
}
