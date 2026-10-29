package b.i.b.b;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: NaturalOrdering.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends g0<Comparable> implements Serializable {
    private static final long serialVersionUID = 0;
    public static final f0 j = new f0();

    @Override // b.i.b.b.g0
    public <S extends Comparable> g0<S> b() {
        return k0.j;
    }

    @Override // b.i.b.b.g0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    private Object readResolve() {
        return j;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
