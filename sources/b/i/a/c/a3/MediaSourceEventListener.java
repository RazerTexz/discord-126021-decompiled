package b.i.a.c.a3;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import b.i.a.c.f3.Util2;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: b.i.a.c.a3.b0, reason: use source file name */
/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes3.dex */
public interface MediaSourceEventListener {
    void X(int i, @Nullable MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void g0(int i, @Nullable MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2);

    void o(int i, @Nullable MediaSource2.a aVar, MediaLoadData mediaLoadData);

    void q(int i, @Nullable MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void x(int i, @Nullable MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: b.i.a.c.a3.b0$a */
    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public class a {
        public final int a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final MediaSource2.a f807b;
        public final CopyOnWriteArrayList<C0027a> c;
        public final long d;

        /* JADX INFO: renamed from: b.i.a.c.a3.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        public final class C0027a {
            public Handler a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public MediaSourceEventListener f808b;

            public C0027a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.a = handler;
                this.f808b = mediaSourceEventListener;
            }
        }

        public a() {
            this.c = new CopyOnWriteArrayList<>();
            this.a = 0;
            this.f807b = null;
            this.d = 0L;
        }

        public final long a(long j) {
            long jM = Util2.M(j);
            if (jM == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + jM;
        }

        public void b(MediaLoadData mediaLoadData) {
            for (C0027a c0027a : this.c) {
                Util2.E(c0027a.a, new d(this, c0027a.f808b, mediaLoadData));
            }
        }

        public void c(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (C0027a c0027a : this.c) {
                Util2.E(c0027a.a, new f(this, c0027a.f808b, loadEventInfo, mediaLoadData));
            }
        }

        public void d(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (C0027a c0027a : this.c) {
                Util2.E(c0027a.a, new c(this, c0027a.f808b, loadEventInfo, mediaLoadData));
            }
        }

        public void e(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
            for (C0027a c0027a : this.c) {
                Util2.E(c0027a.a, new b(this, c0027a.f808b, loadEventInfo, mediaLoadData, iOException, z2));
            }
        }

        public void f(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (C0027a c0027a : this.c) {
                Util2.E(c0027a.a, new e(this, c0027a.f808b, loadEventInfo, mediaLoadData));
            }
        }

        @CheckResult
        public a g(int i, @Nullable MediaSource2.a aVar, long j) {
            return new a(this.c, i, aVar, j);
        }

        public a(CopyOnWriteArrayList<C0027a> copyOnWriteArrayList, int i, @Nullable MediaSource2.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.f807b = aVar;
            this.d = j;
        }
    }
}
