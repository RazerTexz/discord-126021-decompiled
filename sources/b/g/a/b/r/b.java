package b.g.a.b.r;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: CharsToNameCanonicalizer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b.g.a.b.r.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharsToNameCanonicalizer.java */
    public final class C0082b {
        public C0082b(int i, int i2, String[] strArr, a[] aVarArr) {
        }
    }

    /* JADX INFO: compiled from: CharsToNameCanonicalizer.java */
    public final class a {
    }

    public b(int i) {
        new AtomicReference(new C0082b(0, 0, new String[64], new a[32]));
    }

    public static b a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new b((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }
}
