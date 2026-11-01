package b.g.a.c.c0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: BasicBeanDescription.java */
/* JADX INFO: loaded from: classes3.dex */
public class q extends b.g.a.c.c {
    public final b0 c;
    public final b.g.a.c.z.l<?> d;
    public final b.g.a.c.b e;
    public final c f;
    public Class<?>[] g;
    public boolean h;
    public List<s> i;
    public a0 j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f693b = new Class[0];

    public q(b.g.a.c.z.l<?> lVar, b.g.a.c.j jVar, c cVar, List<s> list) {
        super(jVar);
        this.c = null;
        this.d = lVar;
        if (lVar == null) {
            this.e = null;
        } else {
            this.e = lVar.e();
        }
        this.f = cVar;
        this.i = list;
    }

    @Override // b.g.a.c.c
    public b.g.a.a.i.d a(b.g.a.a.i.d dVar) {
        b.g.a.a.i.d dVarH;
        b.g.a.c.b bVar = this.e;
        if (bVar == null || (dVarH = bVar.h(this.f)) == null) {
            dVarH = null;
        }
        b.g.a.a.i.d dVarI = this.d.i(this.f.l);
        if (dVarI != null) {
            return dVarH == null ? dVarI : dVarH.k(dVarI);
        }
        return dVarH;
    }

    @Override // b.g.a.c.c
    public i b() {
        b0 b0Var = this.c;
        if (b0Var == null) {
            return null;
        }
        if (!b0Var.i) {
            b0Var.h();
        }
        LinkedList<i> linkedList = b0Var.r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return b0Var.r.get(0);
        }
        b0Var.i("Multiple 'as-value' properties defined (%s vs %s)", b0Var.r.get(0), b0Var.r.get(1));
        throw null;
    }

    @Override // b.g.a.c.c
    public b.g.a.a.p.b c(b.g.a.a.p.b bVar) {
        b.g.a.a.p.b bVarZ;
        b.g.a.c.b bVar2 = this.e;
        if (bVar2 == null || (bVarZ = bVar2.z(this.f)) == null) {
            return bVar;
        }
        return bVar == null ? bVarZ : bVar.a(bVarZ);
    }

    public List<s> d() {
        if (this.i == null) {
            b0 b0Var = this.c;
            if (!b0Var.i) {
                b0Var.h();
            }
            this.i = new ArrayList(b0Var.j.values());
        }
        return this.i;
    }

    public static q e(b.g.a.c.z.l<?> lVar, b.g.a.c.j jVar, c cVar) {
        return new q(lVar, jVar, cVar, Collections.emptyList());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(b0 b0Var) {
        b.g.a.c.j jVar = b0Var.d;
        c cVar = b0Var.e;
        super(jVar);
        this.c = b0Var;
        b.g.a.c.z.l<?> lVar = b0Var.a;
        this.d = lVar;
        if (lVar == null) {
            this.e = null;
        } else {
            this.e = lVar.e();
        }
        this.f = cVar;
        a0 a0VarR = b0Var.g.r(b0Var.e);
        this.j = a0VarR != null ? b0Var.g.s(b0Var.e, a0VarR) : a0VarR;
    }
}
