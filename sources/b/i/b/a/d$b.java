package b.i.b.a;

import java.io.Serializable;

/* JADX INFO: compiled from: Equivalence.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d$b extends d<Object> implements Serializable {
    private static final long serialVersionUID = 1;
    public static final d$b j = new d$b();

    @Override // b.i.b.a.d
    public boolean a(Object obj, Object obj2) {
        return false;
    }

    @Override // b.i.b.a.d
    public int b(Object obj) {
        return System.identityHashCode(obj);
    }

    private Object readResolve() {
        return j;
    }
}
