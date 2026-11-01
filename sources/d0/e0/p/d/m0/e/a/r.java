package d0.e0.p.d.m0.e.a;

import d0.e0.p.d.m0.c.n0;

/* JADX INFO: compiled from: FieldOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements d0.e0.p.d.m0.k.f {
    @Override // d0.e0.p.d.m0.k.f
    public d0.e0.p.d.m0.k.f.a getContract() {
        return d0.e0.p.d.m0.k.f.a.BOTH;
    }

    @Override // d0.e0.p.d.m0.k.f
    public d0.e0.p.d.m0.k.f.b isOverridable(d0.e0.p.d.m0.c.a aVar, d0.e0.p.d.m0.c.a aVar2, d0.e0.p.d.m0.c.e eVar) {
        d0.e0.p.d.m0.k.f.b bVar = d0.e0.p.d.m0.k.f.b.UNKNOWN;
        d0.z.d.m.checkNotNullParameter(aVar, "superDescriptor");
        d0.z.d.m.checkNotNullParameter(aVar2, "subDescriptor");
        if (!(aVar2 instanceof n0) || !(aVar instanceof n0)) {
            return bVar;
        }
        n0 n0Var = (n0) aVar2;
        n0 n0Var2 = (n0) aVar;
        if (!d0.z.d.m.areEqual(n0Var.getName(), n0Var2.getName())) {
            return bVar;
        }
        if (d0.e0.p.d.m0.e.a.i0.l.c.isJavaField(n0Var) && d0.e0.p.d.m0.e.a.i0.l.c.isJavaField(n0Var2)) {
            return d0.e0.p.d.m0.k.f.b.OVERRIDABLE;
        }
        return (d0.e0.p.d.m0.e.a.i0.l.c.isJavaField(n0Var) || d0.e0.p.d.m0.e.a.i0.l.c.isJavaField(n0Var2)) ? d0.e0.p.d.m0.k.f.b.INCOMPATIBLE : bVar;
    }
}
