package b.i.a.c.c3;

import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import b.i.a.c.a3.n0;
import java.util.List;

/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends g {
    public final b.i.a.c.e3.f f;
    public final b.i.a.c.f3.g g;

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public final class a {
        public final long a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f896b;

        public a(long j, long j2) {
            this.a = j;
            this.f896b = j2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.f896b == aVar.f896b;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.f896b);
        }
    }

    public f(n0 n0Var, int[] iArr, int i, b.i.a.c.e3.f fVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List<a> list, b.i.a.c.f3.g gVar) {
        super(n0Var, iArr, i);
        if (j3 < j) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f = fVar;
        b.i.b.b.p.n(list);
        this.g = gVar;
    }

    @Override // b.i.a.c.c3.j
    public int b() {
        return 0;
    }

    @Override // b.i.a.c.c3.g, b.i.a.c.c3.j
    @CallSuper
    public void e() {
    }

    @Override // b.i.a.c.c3.g, b.i.a.c.c3.j
    @CallSuper
    public void g() {
    }

    @Override // b.i.a.c.c3.g, b.i.a.c.c3.j
    public void i(float f) {
    }

    public static void m(List<b.i.b.b.p.a<a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            b.i.b.b.p.a<a> aVar = list.get(i);
            if (aVar != null) {
                aVar.b(new a(j, jArr[i]));
            }
        }
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public class b implements j.b {
        public final b.i.a.c.f3.g a = b.i.a.c.f3.g.a;
    }
}
