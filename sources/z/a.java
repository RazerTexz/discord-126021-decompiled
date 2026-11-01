package z;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: AndroidExecutors.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int c;
    public static final int d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3857b;
    public static final a a = new a();
    public final Executor e = new b(null);

    /* JADX INFO: compiled from: AndroidExecutors.java */
    public class b implements Executor {
        public b(C0663a c0663a) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f3857b = iAvailableProcessors;
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
