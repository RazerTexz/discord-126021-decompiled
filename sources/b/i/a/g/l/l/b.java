package b.i.a.g.l.l;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: FadeModeEvaluators.java */
/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(21)
public class b {
    public static final b.i.a.g.l.l.a a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.i.a.g.l.l.a f1636b = new C0129b();
    public static final b.i.a.g.l.l.a c = new c();
    public static final b.i.a.g.l.l.a d = new d();

    /* JADX INFO: renamed from: b.i.a.g.l.l.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public final class C0129b implements b.i.a.g.l.l.a {
        @Override // b.i.a.g.l.l.a
        public b.i.a.g.l.l.c a(float f, float f2, float f3) {
            return b.i.a.g.l.l.c.a(k.g(255, 0, f2, f3, f), 255);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public final class a implements b.i.a.g.l.l.a {
        @Override // b.i.a.g.l.l.a
        public b.i.a.g.l.l.c a(float f, float f2, float f3) {
            return new b.i.a.g.l.l.c(255, k.g(0, 255, f2, f3, f), true);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public final class c implements b.i.a.g.l.l.a {
        @Override // b.i.a.g.l.l.a
        public b.i.a.g.l.l.c a(float f, float f2, float f3) {
            return b.i.a.g.l.l.c.a(k.g(255, 0, f2, f3, f), k.g(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public final class d implements b.i.a.g.l.l.a {
        @Override // b.i.a.g.l.l.a
        public b.i.a.g.l.l.c a(float f, float f2, float f3) {
            float fA = b.d.b.a.a.a(f3, f2, 0.35f, f2);
            return b.i.a.g.l.l.c.a(k.g(255, 0, f2, fA, f), k.g(0, 255, fA, f3, f));
        }
    }
}
