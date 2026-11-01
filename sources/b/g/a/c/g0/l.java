package b.g.a.c.g0;

import b.g.a.c.v;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: compiled from: PropertyBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class l {
    public final v a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.g.a.c.c f702b;
    public final b.g.a.c.b c;
    public Object d;
    public final b.g.a.a.p.b e;
    public final boolean f;

    public l(v vVar, b.g.a.c.c cVar) {
        this.a = vVar;
        this.f702b = cVar;
        b.g.a.a.p.b bVar = b.g.a.a.p.b.j;
        b.g.a.a.p.b bVarA = b.g.a.a.p.b.j;
        b.g.a.a.p.b bVarC = cVar.c(bVarA);
        vVar.k(cVar.a._class, bVarA);
        bVarA = bVarC != null ? bVarC.a(bVarA) : bVarA;
        b.g.a.a.p.b bVar2 = vVar._configOverrides._defaultInclusion;
        this.e = bVar2 == null ? bVarA : bVar2.a(bVarA);
        this.f = bVarA._valueInclusion == b.g.a.a.p.a.NON_DEFAULT;
        this.c = vVar.e();
    }

    public b.g.a.c.j a(b.g.a.c.c0.b bVar, boolean z2, b.g.a.c.j jVar) throws JsonMappingException {
        b.g.a.c.j jVarE0 = this.c.e0(this.a, bVar, jVar);
        if (jVarE0 != jVar) {
            Class<?> cls = jVarE0._class;
            Class<?> cls2 = jVar._class;
            if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                StringBuilder sbU = b.d.b.a.a.U("Illegal concrete-type annotation for method '");
                sbU.append(bVar.c());
                sbU.append("': class ");
                sbU.append(cls.getName());
                sbU.append(" not a super-type of (declared) class ");
                sbU.append(cls2.getName());
                throw new IllegalArgumentException(sbU.toString());
            }
            z2 = true;
            jVar = jVarE0;
        }
        b.g.a.c.y.e.b bVarK = this.c.K(bVar);
        if (bVarK != null && bVarK != b.g.a.c.y.e.b.DEFAULT_TYPING) {
            z2 = bVarK == b.g.a.c.y.e.b.STATIC;
        }
        if (z2) {
            return jVar.G();
        }
        return null;
    }
}
