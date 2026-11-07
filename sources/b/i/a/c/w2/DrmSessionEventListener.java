package b.i.a.c.w2;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import b.i.a.c.a3.MediaSource2;
import b.i.a.c.f3.Util2;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: b.i.a.c.w2.s, reason: use source file name */
/* JADX INFO: compiled from: DrmSessionEventListener.java */
/* JADX INFO: loaded from: classes3.dex */
public interface DrmSessionEventListener {
    void J(int i, @Nullable MediaSource2.a aVar);

    void S(int i, @Nullable MediaSource2.a aVar);

    void c0(int i, @Nullable MediaSource2.a aVar, int i2);

    void d0(int i, @Nullable MediaSource2.a aVar);

    void i0(int i, @Nullable MediaSource2.a aVar);

    void u(int i, @Nullable MediaSource2.a aVar, Exception exc);

    /* JADX INFO: renamed from: b.i.a.c.w2.s$a */
    /* JADX INFO: compiled from: DrmSessionEventListener.java */
    public class a {
        public final int a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final MediaSource2.a f1156b;
        public final CopyOnWriteArrayList<C0031a> c;

        /* JADX INFO: renamed from: b.i.a.c.w2.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DrmSessionEventListener.java */
        public final class C0031a {
            public Handler a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public DrmSessionEventListener f1157b;

            public C0031a(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.a = handler;
                this.f1157b = drmSessionEventListener;
            }
        }

        public a() {
            this.c = new CopyOnWriteArrayList<>();
            this.a = 0;
            this.f1156b = null;
        }

        public void a() {
            for (C0031a c0031a : this.c) {
                Util2.E(c0031a.a, new i(this, c0031a.f1157b));
            }
        }

        public void b() {
            for (C0031a c0031a : this.c) {
                Util2.E(c0031a.a, new h(this, c0031a.f1157b));
            }
        }

        public void c() {
            for (C0031a c0031a : this.c) {
                Util2.E(c0031a.a, new j(this, c0031a.f1157b));
            }
        }

        public void d(int i) {
            for (C0031a c0031a : this.c) {
                Util2.E(c0031a.a, new l(this, c0031a.f1157b, i));
            }
        }

        public void e(Exception exc) {
            for (C0031a c0031a : this.c) {
                Util2.E(c0031a.a, new k(this, c0031a.f1157b, exc));
            }
        }

        public void f() {
            for (C0031a c0031a : this.c) {
                Util2.E(c0031a.a, new g(this, c0031a.f1157b));
            }
        }

        @CheckResult
        public a g(int i, @Nullable MediaSource2.a aVar) {
            return new a(this.c, i, aVar);
        }

        public a(CopyOnWriteArrayList<C0031a> copyOnWriteArrayList, int i, @Nullable MediaSource2.a aVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.f1156b = aVar;
        }
    }
}
