package p507d0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p507d0.p592z.p594d.C12238m;

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C11227e implements Comparable<C11227e> {

    /* JADX INFO: renamed from: j */
    public static final C11227e f22290j;

    /* JADX INFO: renamed from: k */
    public final int f22291k;

    /* JADX INFO: renamed from: l */
    public final int f22292l;

    /* JADX INFO: renamed from: m */
    public final int f22293m;

    /* JADX INFO: renamed from: n */
    public final int f22294n;

    /* JADX INFO: renamed from: d0.e$a */
    /* JADX INFO: compiled from: KotlinVersion.kt */
    public final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f22290j = C12061f.get();
    }

    public C11227e(int i, int i2, int i3) {
        this.f22292l = i;
        this.f22293m = i2;
        this.f22294n = i3;
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            this.f22291k = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11227e)) {
            obj = null;
        }
        C11227e c11227e = (C11227e) obj;
        return c11227e != null && this.f22291k == c11227e.f22291k;
    }

    public int hashCode() {
        return this.f22291k;
    }

    public String toString() {
        return "" + this.f22292l + '.' + this.f22293m + '.' + this.f22294n;
    }

    @Override // java.lang.Comparable
    public int compareTo(C11227e c11227e) {
        C12238m.checkNotNullParameter(c11227e, "other");
        return this.f22291k - c11227e.f22291k;
    }
}
