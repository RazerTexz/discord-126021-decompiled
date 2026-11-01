package b.g.a.c.i0;

import java.util.Objects;

/* JADX INFO: compiled from: SimpleBeanPropertyDefinition.java */
/* JADX INFO: loaded from: classes3.dex */
public class q extends b.g.a.c.c0.s {
    public final b.g.a.c.b k;
    public final b.g.a.c.c0.i l;
    public final b.g.a.c.s m;
    public final b.g.a.c.t n;
    public final b.g.a.a.p.b o;

    public q(b.g.a.c.b bVar, b.g.a.c.c0.i iVar, b.g.a.c.t tVar, b.g.a.c.s sVar, b.g.a.a.p.b bVar2) {
        this.k = bVar;
        this.l = iVar;
        this.n = tVar;
        this.m = sVar == null ? b.g.a.c.s.k : sVar;
        this.o = bVar2;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.a.p.b g() {
        return this.o;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.c0.m k() {
        b.g.a.c.c0.i iVar = this.l;
        if (iVar instanceof b.g.a.c.c0.m) {
            return (b.g.a.c.c0.m) iVar;
        }
        return null;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.c0.g l() {
        b.g.a.c.c0.i iVar = this.l;
        if (iVar instanceof b.g.a.c.c0.g) {
            return (b.g.a.c.c0.g) iVar;
        }
        return null;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.t m() {
        return this.n;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.c0.j n() {
        b.g.a.c.c0.i iVar = this.l;
        if ((iVar instanceof b.g.a.c.c0.j) && ((b.g.a.c.c0.j) iVar).o() == 0) {
            return (b.g.a.c.c0.j) this.l;
        }
        return null;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.s o() {
        return this.m;
    }

    @Override // b.g.a.c.c0.s
    public String p() {
        return this.n._simpleName;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.c0.i q() {
        return this.l;
    }

    @Override // b.g.a.c.c0.s
    public Class<?> r() {
        b.g.a.c.c0.i iVar = this.l;
        return iVar == null ? Object.class : iVar.d();
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.c0.j s() {
        b.g.a.c.c0.i iVar = this.l;
        if ((iVar instanceof b.g.a.c.c0.j) && ((b.g.a.c.c0.j) iVar).o() == 1) {
            return (b.g.a.c.c0.j) this.l;
        }
        return null;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.t t() {
        b.g.a.c.b bVar = this.k;
        if (bVar != null && this.l != null) {
            Objects.requireNonNull(bVar);
        }
        return null;
    }

    @Override // b.g.a.c.c0.s
    public boolean u() {
        return false;
    }

    public static q w(b.g.a.c.z.l<?> lVar, b.g.a.c.c0.i iVar, b.g.a.c.t tVar, b.g.a.c.s sVar, b.g.a.a.p.a aVar) {
        b.g.a.a.p.b bVar;
        b.g.a.a.p.a aVar2;
        if (aVar == null || aVar == (aVar2 = b.g.a.a.p.a.USE_DEFAULTS)) {
            bVar = b.g.a.c.c0.s.j;
        } else {
            bVar = aVar != aVar2 ? new b.g.a.a.p.b(aVar, null, null, null) : b.g.a.a.p.b.j;
        }
        return new q(lVar.e(), iVar, tVar, sVar, bVar);
    }
}
