package b.i.a.c.f3;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: b.i.a.c.f3.p, reason: use source file name */
/* JADX INFO: compiled from: ListenerSet.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ListenerSet<T> {
    public final Clock4 a;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerWrapper f973b;
    public boolean g;
    public final ArrayDeque<Runnable> e = new ArrayDeque<>();
    public final ArrayDeque<Runnable> f = new ArrayDeque<>();

    /* JADX INFO: renamed from: b.i.a.c.f3.p$a */
    /* JADX INFO: compiled from: ListenerSet.java */
    public interface a<T> {
        void invoke(T t);
    }

    /* JADX INFO: renamed from: b.i.a.c.f3.p$b */
    /* JADX INFO: compiled from: ListenerSet.java */
    public interface b<T> {
        void a(T t, FlagSet flagSet);
    }

    public ListenerSet(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, Clock4 clock4, b<T> bVar) {
        this.a = clock4;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.f973b = clock4.b(looper, new b.i.a.c.f3.b(this));
    }

    public void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.f973b.e(0)) {
            HandlerWrapper handlerWrapper = this.f973b;
            handlerWrapper.d(handlerWrapper.c(0));
        }
        boolean z2 = !this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (z2) {
            return;
        }
        while (!this.e.isEmpty()) {
            this.e.peekFirst().run();
            this.e.removeFirst();
        }
    }

    public void b(int i, a<T> aVar) {
        this.f.add(new b.i.a.c.f3.a(new CopyOnWriteArraySet(this.d), i, aVar));
    }

    public void c() {
        for (c<T> cVar : this.d) {
            b<T> bVar = this.c;
            cVar.d = true;
            if (cVar.c) {
                bVar.a(cVar.a, cVar.f974b.b());
            }
        }
        this.d.clear();
        this.g = true;
    }

    /* JADX INFO: renamed from: b.i.a.c.f3.p$c */
    /* JADX INFO: compiled from: ListenerSet.java */
    public final class c<T> {
        public final T a;
        public boolean c;
        public boolean d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlagSet.b f974b = new FlagSet.b();

        public c(T t) {
            this.a = t;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }
}
