package d0.e0.p.d.m0.e.a.k0;

import java.util.Collection;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface a extends l {

    /* JADX INFO: renamed from: d0.e0.p.d.m0.e.a.k0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: javaElements.kt */
    public final class C0527a {
        public static boolean isFreshlySupportedTypeUseAnnotation(a aVar) {
            d0.z.d.m.checkNotNullParameter(aVar, "this");
            return false;
        }

        public static boolean isIdeExternalAnnotation(a aVar) {
            d0.z.d.m.checkNotNullParameter(aVar, "this");
            return false;
        }
    }

    Collection<b> getArguments();

    d0.e0.p.d.m0.g.a getClassId();

    boolean isFreshlySupportedTypeUseAnnotation();

    boolean isIdeExternalAnnotation();

    g resolve();
}
