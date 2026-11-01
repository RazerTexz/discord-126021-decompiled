package b.f.l.a;

/* JADX INFO: compiled from: TransformGestureDetector.java */
/* JADX INFO: loaded from: classes3.dex */
public class b implements b.f.l.a.a.InterfaceC0076a {
    public final b.f.l.a.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f648b = null;

    /* JADX INFO: compiled from: TransformGestureDetector.java */
    public interface a {
        void b(b bVar);

        void c(b bVar);
    }

    public b(b.f.l.a.a aVar) {
        this.a = aVar;
        aVar.h = this;
    }

    public final float a(float[] fArr, int i) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        if (i > 0) {
            return f / i;
        }
        return 0.0f;
    }

    public float b() {
        b.f.l.a.a aVar = this.a;
        return a(aVar.d, aVar.f647b);
    }

    public float c() {
        b.f.l.a.a aVar = this.a;
        return a(aVar.e, aVar.f647b);
    }

    public void d() {
        b.f.l.a.a aVar = this.a;
        if (aVar.a) {
            aVar.c();
            for (int i = 0; i < 2; i++) {
                aVar.d[i] = aVar.f[i];
                aVar.e[i] = aVar.g[i];
            }
            aVar.b();
        }
    }
}
