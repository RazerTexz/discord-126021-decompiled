package b.g.a.c.c0;

import java.io.Serializable;

/* JADX INFO: compiled from: ConcreteBeanPropertyBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v implements b.g.a.c.d, Serializable {
    private static final long serialVersionUID = 1;
    public final b.g.a.c.s _metadata;

    public v(b.g.a.c.s sVar) {
        this._metadata = sVar == null ? b.g.a.c.s.l : sVar;
    }

    @Override // b.g.a.c.d
    public b.g.a.a.i.d a(b.g.a.c.z.l<?> lVar, Class<?> cls) {
        i member;
        b.g.a.a.i.d dVarI = lVar.i(cls);
        b.g.a.c.b bVarE = lVar.e();
        b.g.a.a.i.d dVarH = (bVarE == null || (member = getMember()) == null) ? null : bVarE.h(member);
        if (dVarI == null) {
            return dVarH == null ? b.g.a.c.d.c : dVarH;
        }
        return dVarH == null ? dVarI : dVarI.k(dVarH);
    }

    @Override // b.g.a.c.d
    public b.g.a.a.p.b b(b.g.a.c.z.l<?> lVar, Class<?> cls) {
        b.g.a.c.b bVarE = lVar.e();
        i member = getMember();
        if (member == null) {
            return lVar.j(cls);
        }
        b.g.a.a.p.b bVarG = lVar.g(cls, member.d());
        if (bVarE == null) {
            return bVarG;
        }
        b.g.a.a.p.b bVarZ = bVarE.z(member);
        return bVarG == null ? bVarZ : bVarG.a(bVarZ);
    }

    public v(v vVar) {
        this._metadata = vVar._metadata;
    }
}
