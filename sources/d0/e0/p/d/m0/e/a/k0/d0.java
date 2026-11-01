package d0.e0.p.d.m0.e.a.k0;

import java.util.Iterator;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface d0 extends d {

    /* JADX INFO: compiled from: javaElements.kt */
    public final class a {
        public static d0.e0.p.d.m0.e.a.k0.a findAnnotation(d0 d0Var, d0.e0.p.d.m0.g.b bVar) {
            Object obj;
            Object next;
            d0.e0.p.d.m0.g.a classId;
            d0.z.d.m.checkNotNullParameter(d0Var, "this");
            d0.z.d.m.checkNotNullParameter(bVar, "fqName");
            Iterator<T> it = d0Var.getAnnotations().iterator();
            do {
                obj = null;
                if (it.hasNext()) {
                    next = it.next();
                    classId = ((d0.e0.p.d.m0.e.a.k0.a) next).getClassId();
                }
                return (d0.e0.p.d.m0.e.a.k0.a) obj;
            } while (!d0.z.d.m.areEqual(classId != null ? classId.asSingleFqName() : null, bVar));
            obj = next;
            return (d0.e0.p.d.m0.e.a.k0.a) obj;
        }
    }
}
