package b.i.a.c.x2.g0;

import b.i.a.c.x2.i;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {
    public c d;
    public int e;
    public int f;
    public long g;
    public final byte[] a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<C0103b> f1183b = new ArrayDeque<>();
    public final g c = new g();

    /* JADX INFO: renamed from: b.i.a.c.x2.g0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public final class C0103b {
        public final int a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f1184b;

        public C0103b(int i, long j, a aVar) {
            this.a = i;
            this.f1184b = j;
        }
    }

    public final long a(i iVar, int i) throws IOException {
        iVar.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }
}
