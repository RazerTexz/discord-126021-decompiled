package b.f.j.r;

import java.util.Objects;

/* JADX INFO: compiled from: FrescoSystrace.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static volatile a a;

    /* JADX INFO: compiled from: FrescoSystrace.java */
    public interface a {
    }

    public static a a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b.f.j.r.a();
                }
            }
        }
        return a;
    }

    public static boolean b() {
        Objects.requireNonNull(a());
        return false;
    }
}
