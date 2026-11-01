package d0.e0.p.d.m0.c.h1;

import d0.e0.p.d.m0.c.t0;
import d0.z.d.m;

/* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface c {

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public final class a implements c {
        public static final a a = new a();

        @Override // d0.e0.p.d.m0.c.h1.c
        public boolean isFunctionAvailable(d0.e0.p.d.m0.c.e eVar, t0 t0Var) {
            m.checkNotNullParameter(eVar, "classDescriptor");
            m.checkNotNullParameter(t0Var, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
    public final class b implements c {
        public static final b a = new b();

        @Override // d0.e0.p.d.m0.c.h1.c
        public boolean isFunctionAvailable(d0.e0.p.d.m0.c.e eVar, t0 t0Var) {
            m.checkNotNullParameter(eVar, "classDescriptor");
            m.checkNotNullParameter(t0Var, "functionDescriptor");
            return !t0Var.getAnnotations().hasAnnotation(d.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME());
        }
    }

    boolean isFunctionAvailable(d0.e0.p.d.m0.c.e eVar, t0 t0Var);
}
