package b.g.a.c.c0;

import b.g.a.a.h0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: POJOPropertyBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class c0 extends s implements Comparable<c0> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d<j> f687s;
    public final boolean l;
    public final b.g.a.c.z.l<?> m;
    public final b.g.a.c.b n;
    public final b.g.a.c.t o;
    public final b.g.a.c.t p;
    public d<g> q;
    public d<m> r;
    public d<j> t;
    public transient b.g.a.c.s u;
    public transient b.g.a.c.b.a v;
    public static final b.g.a.c.b.a k = new b.g.a.c.b.a(1, "");

    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public class a implements e<Class<?>[]> {
        public a() {
        }

        @Override // b.g.a.c.c0.c0.e
        public Class<?>[] a(i iVar) {
            return c0.this.n.R(iVar);
        }
    }

    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public class b implements e<b.g.a.c.b.a> {
        public b() {
        }

        @Override // b.g.a.c.c0.c0.e
        public b.g.a.c.b.a a(i iVar) {
            return c0.this.n.D(iVar);
        }
    }

    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public class c implements e<Boolean> {
        public c() {
        }

        @Override // b.g.a.c.c0.c0.e
        public Boolean a(i iVar) {
            return c0.this.n.d0(iVar);
        }
    }

    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public final class d<T> {
        public final T a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d<T> f688b;
        public final b.g.a.c.t c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public d(T t, d<T> dVar, b.g.a.c.t tVar, boolean z2, boolean z3, boolean z4) {
            this.a = t;
            this.f688b = dVar;
            b.g.a.c.t tVar2 = (tVar == null || tVar.d()) ? null : tVar;
            this.c = tVar2;
            if (z2) {
                if (tVar2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!tVar.c()) {
                    z2 = false;
                }
            }
            this.d = z2;
            this.e = z3;
            this.f = z4;
        }

        public d<T> a(d<T> dVar) {
            d<T> dVar2 = this.f688b;
            return dVar2 == null ? c(dVar) : c(dVar2.a(dVar));
        }

        public d<T> b() {
            d<T> dVar = this.f688b;
            if (dVar == null) {
                return this;
            }
            d<T> dVarB = dVar.b();
            if (this.c != null) {
                return dVarB.c == null ? c(null) : c(dVarB);
            }
            if (dVarB.c != null) {
                return dVarB;
            }
            boolean z2 = this.e;
            if (z2 == dVarB.e) {
                return c(dVarB);
            }
            return z2 ? c(null) : dVarB;
        }

        public d<T> c(d<T> dVar) {
            return dVar == this.f688b ? this : new d<>(this.a, dVar, this.c, this.d, this.e, this.f);
        }

        public d<T> d() {
            d<T> dVarD;
            if (!this.f) {
                d<T> dVar = this.f688b;
                return (dVar == null || (dVarD = dVar.d()) == this.f688b) ? this : c(dVarD);
            }
            d<T> dVar2 = this.f688b;
            if (dVar2 == null) {
                return null;
            }
            return dVar2.d();
        }

        public d<T> e() {
            return this.f688b == null ? this : new d<>(this.a, null, this.c, this.d, this.e, this.f);
        }

        public d<T> f() {
            d<T> dVar = this.f688b;
            d<T> dVarF = dVar == null ? null : dVar.f();
            return this.e ? c(dVarF) : dVarF;
        }

        public String toString() {
            String str = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.a.toString(), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.d));
            if (this.f688b == null) {
                return str;
            }
            StringBuilder sbX = b.d.b.a.a.X(str, ", ");
            sbX.append(this.f688b.toString());
            return sbX.toString();
        }
    }

    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public interface e<T> {
        T a(i iVar);
    }

    public c0(b.g.a.c.z.l<?> lVar, b.g.a.c.b bVar, boolean z2, b.g.a.c.t tVar) {
        this.m = lVar;
        this.n = bVar;
        this.p = tVar;
        this.o = tVar;
        this.l = z2;
    }

    public final <T extends i> d<T> A(d<T> dVar, p pVar) {
        i iVar = (i) dVar.a.l(pVar);
        d<T> dVar2 = dVar.f688b;
        if (dVar2 != null) {
            dVar = dVar.c(A(dVar2, pVar));
        }
        return iVar == dVar.a ? dVar : new d<>(iVar, dVar.f688b, dVar.c, dVar.d, dVar.e, dVar.f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:5)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void B(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:5)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:443)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:373)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$4(ClassGen.java:305)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public final Set<b.g.a.c.t> C(d<? extends i> dVar, Set<b.g.a.c.t> set) {
        for (d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.f688b) {
            if (dVar2.d && dVar2.c != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(dVar2.c);
            }
        }
        return set;
    }

    public final <T extends i> p D(d<T> dVar) {
        p pVar = dVar.a.k;
        d<T> dVar2 = dVar.f688b;
        return dVar2 != null ? p.c(pVar, D(dVar2)) : pVar;
    }

    public int E(j jVar) {
        String strC = jVar.c();
        if (!strC.startsWith("get") || strC.length() <= 3) {
            return (!strC.startsWith("is") || strC.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p F(int i, d<? extends i>... dVarArr) {
        d<? extends i> dVar = dVarArr[i];
        p pVarC = ((i) dVar.a).k;
        d<? extends i> dVar2 = dVar.f688b;
        if (dVar2 != null) {
            pVarC = p.c(pVarC, D(dVar2));
        }
        do {
            i++;
            if (i >= dVarArr.length) {
                return pVarC;
            }
        } while (dVarArr[i] == null);
        return p.c(pVarC, F(i, dVarArr));
    }

    public final <T> d<T> G(d<T> dVar) {
        return dVar == null ? dVar : dVar.d();
    }

    public final <T> d<T> H(d<T> dVar) {
        return dVar == null ? dVar : dVar.f();
    }

    public int I(j jVar) {
        String strC = jVar.c();
        return (!strC.startsWith("set") || strC.length() <= 3) ? 2 : 1;
    }

    public final <T> d<T> J(d<T> dVar) {
        return dVar == null ? dVar : dVar.b();
    }

    public void K(c0 c0Var) {
        this.q = N(this.q, c0Var.q);
        this.r = N(this.r, c0Var.r);
        this.f687s = N(this.f687s, c0Var.f687s);
        this.t = N(this.t, c0Var.t);
    }

    public Set<b.g.a.c.t> L() {
        Set<b.g.a.c.t> setC = C(this.r, C(this.t, C(this.f687s, C(this.q, null))));
        return setC == null ? Collections.emptySet() : setC;
    }

    public <T> T M(e<T> eVar) {
        d<j> dVar;
        d<g> dVar2;
        T tA = null;
        if (this.n == null) {
            return null;
        }
        if (this.l) {
            d<j> dVar3 = this.f687s;
            if (dVar3 != null) {
                tA = eVar.a(dVar3.a);
            }
        } else {
            d<m> dVar4 = this.r;
            tA = dVar4 != null ? eVar.a(dVar4.a) : null;
            if (tA == null && (dVar = this.t) != null) {
                tA = eVar.a(dVar.a);
            }
        }
        return (tA != null || (dVar2 = this.q) == null) ? tA : eVar.a(dVar2.a);
    }

    public static <T> d<T> N(d<T> dVar, d<T> dVar2) {
        if (dVar == null) {
            return dVar2;
        }
        if (dVar2 == null) {
            return dVar;
        }
        d<T> dVar3 = dVar.f688b;
        return dVar3 == null ? dVar.c(dVar2) : dVar.c(dVar3.a(dVar2));
    }

    @Override // java.lang.Comparable
    public int compareTo(c0 c0Var) {
        c0 c0Var2 = c0Var;
        if (this.r != null) {
            if (c0Var2.r == null) {
                return -1;
            }
        } else if (c0Var2.r != null) {
            return 1;
        }
        return p().compareTo(c0Var2.p());
    }

    @Override // b.g.a.c.c0.s
    public boolean f() {
        return (this.r == null && this.t == null && this.q == null) ? false : true;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.a.p.b g() {
        i iVarJ = j();
        b.g.a.c.b bVar = this.n;
        b.g.a.a.p.b bVarZ = bVar == null ? null : bVar.z(iVarJ);
        if (bVarZ != null) {
            return bVarZ;
        }
        b.g.a.a.p.b bVar2 = b.g.a.a.p.b.j;
        return b.g.a.a.p.b.j;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.b.a h() {
        b.g.a.c.b.a aVar = this.v;
        if (aVar != null) {
            if (aVar == k) {
                return null;
            }
            return aVar;
        }
        b.g.a.c.b.a aVar2 = (b.g.a.c.b.a) M(new b());
        this.v = aVar2 == null ? k : aVar2;
        return aVar2;
    }

    @Override // b.g.a.c.c0.s
    public Class<?>[] i() {
        return (Class[]) M(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.g.a.c.c0.s
    public m k() {
        d dVar = this.r;
        if (dVar == null) {
            return null;
        }
        do {
            T t = dVar.a;
            if (((m) t)._owner instanceof b.g.a.c.c0.e) {
                return (m) t;
            }
            dVar = dVar.f688b;
        } while (dVar != null);
        return this.r.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.g.a.c.c0.s
    public g l() {
        d<g> dVar = this.q;
        if (dVar == null) {
            return null;
        }
        g gVar = dVar.a;
        for (d dVar2 = dVar.f688b; dVar2 != null; dVar2 = dVar2.f688b) {
            g gVar2 = (g) dVar2.a;
            Class<?> clsG = gVar.g();
            Class<?> clsG2 = gVar2.g();
            if (clsG != clsG2) {
                if (clsG.isAssignableFrom(clsG2)) {
                    gVar = gVar2;
                } else if (clsG2.isAssignableFrom(clsG)) {
                }
            }
            StringBuilder sbU = b.d.b.a.a.U("Multiple fields representing property \"");
            sbU.append(p());
            sbU.append("\": ");
            sbU.append(gVar.h());
            sbU.append(" vs ");
            sbU.append(gVar2.h());
            throw new IllegalArgumentException(sbU.toString());
        }
        return gVar;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.t m() {
        return this.o;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.g.a.c.c0.s
    public j n() {
        int iE;
        int iE2;
        d dVar = this.f687s;
        if (dVar == null) {
            return null;
        }
        d dVar2 = dVar.f688b;
        if (dVar2 == null) {
            return (j) dVar.a;
        }
        while (dVar2 != null) {
            Class<?> clsG = ((j) dVar.a).g();
            Class<?> clsG2 = ((j) dVar2.a).g();
            if (clsG == clsG2) {
                iE = E((j) dVar2.a);
                iE2 = E((j) dVar.a);
                if (iE != iE2) {
                    StringBuilder sbU = b.d.b.a.a.U("Conflicting getter definitions for property \"");
                    sbU.append(p());
                    sbU.append("\": ");
                    sbU.append(((j) dVar.a).h());
                    sbU.append(" vs ");
                    sbU.append(((j) dVar2.a).h());
                    throw new IllegalArgumentException(sbU.toString());
                }
                if (iE < iE2) {
                    dVar = dVar2;
                }
            } else if (clsG.isAssignableFrom(clsG2)) {
                dVar = dVar2;
            } else if (clsG2.isAssignableFrom(clsG)) {
                continue;
            } else {
                iE = E((j) dVar2.a);
                iE2 = E((j) dVar.a);
                if (iE != iE2) {
                    StringBuilder sbU2 = b.d.b.a.a.U("Conflicting getter definitions for property \"");
                    sbU2.append(p());
                    sbU2.append("\": ");
                    sbU2.append(((j) dVar.a).h());
                    sbU2.append(" vs ");
                    sbU2.append(((j) dVar2.a).h());
                    throw new IllegalArgumentException(sbU2.toString());
                }
                if (iE < iE2) {
                    dVar = dVar2;
                }
            }
            dVar2 = dVar2.f688b;
        }
        this.f687s = dVar.e();
        return (j) dVar.a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    @Override // b.g.a.c.c0.s
    public b.g.a.c.s o() {
        j jVar;
        b.g.a.c.s sVar;
        h0 h0VarA;
        boolean z2;
        Class<?> cls;
        Boolean boolM;
        if (this.u == null) {
            h0 h0VarB = null;
            if (this.l) {
                d<j> dVar = this.f687s;
                if (dVar != null) {
                    jVar = dVar.a;
                } else {
                    d<g> dVar2 = this.q;
                    if (dVar2 != null) {
                        jVar = dVar2.a;
                    } else {
                        jVar = null;
                    }
                }
            } else {
                d<m> dVar3 = this.r;
                if (dVar3 != null) {
                    jVar = dVar3.a;
                } else {
                    d<j> dVar4 = this.t;
                    if (dVar4 != null) {
                        jVar = dVar4.a;
                    } else {
                        d<g> dVar5 = this.q;
                        if (dVar5 != null) {
                            jVar = dVar5.a;
                        } else {
                            d<j> dVar6 = this.f687s;
                            if (dVar6 != null) {
                                jVar = dVar6.a;
                            } else {
                                jVar = null;
                            }
                        }
                    }
                }
            }
            if (jVar == null) {
                this.u = b.g.a.c.s.l;
            } else {
                Boolean boolA0 = this.n.a0(jVar);
                String strW = this.n.w(jVar);
                Integer numB = this.n.B(jVar);
                String strV = this.n.v(jVar);
                if (boolA0 == null && numB == null && strV == null) {
                    b.g.a.c.s sVar2 = b.g.a.c.s.l;
                    if (strW != null) {
                        sVar2 = new b.g.a.c.s(sVar2._required, strW, sVar2._index, sVar2._defaultValue, sVar2.m, sVar2._valueNulls, sVar2._contentNulls);
                    }
                    this.u = sVar2;
                } else {
                    b.g.a.c.s sVar3 = b.g.a.c.s.j;
                    if (strW != null || numB != null || strV != null) {
                        sVar = new b.g.a.c.s(boolA0, strW, numB, strV, null, null, null);
                    } else if (boolA0 == null) {
                        sVar = b.g.a.c.s.l;
                    } else {
                        sVar = boolA0.booleanValue() ? b.g.a.c.s.j : b.g.a.c.s.k;
                    }
                    this.u = sVar;
                }
                if (!this.l) {
                    b.g.a.c.s sVarA = this.u;
                    i iVarJ = j();
                    b.g.a.c.b bVar = this.n;
                    if (bVar != null) {
                        if (iVarJ == null || (boolM = bVar.m(jVar)) == null) {
                            z2 = true;
                        } else {
                            if (boolM.booleanValue()) {
                                sVarA = sVarA.a(new b.g.a.c.s.a(iVarJ, false));
                            }
                            z2 = false;
                        }
                        b.g.a.a.z.a aVarM = this.n.M(jVar);
                        if (aVarM != null) {
                            h0VarB = aVarM.b();
                            h0VarA = aVarM.a();
                        } else {
                            h0VarA = null;
                        }
                    } else {
                        h0VarA = null;
                        z2 = true;
                    }
                    if (z2 || h0VarB == null || h0VarA == null) {
                        if (jVar instanceof j) {
                            j jVar2 = (j) jVar;
                            if (jVar2.o() > 0) {
                                cls = jVar2.n(0)._class;
                            } else {
                                cls = jVar.e()._class;
                            }
                        } else {
                            cls = jVar.e()._class;
                        }
                        Objects.requireNonNull(this.m.f(cls));
                    }
                    if (z2 || h0VarB == null || h0VarA == null) {
                        b.g.a.a.z.a aVarL = this.m.l();
                        if (h0VarB == null) {
                            h0VarB = aVarL.b();
                        }
                        if (h0VarA == null) {
                            h0VarA = aVarL.a();
                        }
                        if (z2) {
                            if (Boolean.TRUE.equals(this.m.h()) && iVarJ != null) {
                                sVarA = sVarA.a(new b.g.a.c.s.a(iVarJ, true));
                            }
                        }
                    }
                    h0 h0Var = h0VarB;
                    h0 h0Var2 = h0VarA;
                    if (h0Var != null || h0Var2 != null) {
                        sVarA = new b.g.a.c.s(sVarA._required, sVarA._description, sVarA._index, sVarA._defaultValue, sVarA.m, h0Var, h0Var2);
                    }
                    this.u = sVarA;
                }
            }
        }
        return this.u;
    }

    @Override // b.g.a.c.c0.s
    public String p() {
        b.g.a.c.t tVar = this.o;
        if (tVar == null) {
            return null;
        }
        return tVar._simpleName;
    }

    @Override // b.g.a.c.c0.s
    public i q() {
        if (this.l) {
            return j();
        }
        i iVarK = k();
        if (iVarK == null && (iVarK = s()) == null) {
            iVarK = l();
        }
        return iVarK == null ? j() : iVarK;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d A[PHI: r0
      0x003d: PHI (r0v3 b.g.a.c.c0.b) = (r0v2 b.g.a.c.c0.b), (r0v5 b.g.a.c.c0.b) binds: [B:16:0x0030, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b.g.a.c.c0.s
    public Class<?> r() {
        b.g.a.c.j jVarE;
        if (this.l) {
            b.g.a.c.c0.b bVarN = n();
            jVarE = (bVarN == null && (bVarN = l()) == null) ? b.g.a.c.h0.n.k() : bVarN.e();
        } else {
            b.g.a.c.c0.b bVarK = k();
            if (bVarK == null) {
                j jVarS = s();
                if (jVarS != null) {
                    jVarE = jVarS.n(0);
                } else {
                    bVarK = l();
                    if (bVarK == null) {
                        jVarE = bVarK.e();
                    } else {
                        jVarE = bVarK.e();
                    }
                }
            } else if (bVarK == null || (bVarK = n()) != null) {
                jVarE = bVarK.e();
            } else {
                jVarE = b.g.a.c.h0.n.k();
            }
        }
        return jVarE._class;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.g.a.c.c0.s
    public j s() {
        j jVar;
        j jVar2;
        int I;
        int I2;
        b.g.a.c.b bVar;
        j jVarF0;
        d dVar = this.t;
        if (dVar == null) {
            return null;
        }
        d dVar2 = dVar.f688b;
        if (dVar2 == null) {
            return (j) dVar.a;
        }
        while (dVar2 != null) {
            Class<?> clsG = ((j) dVar.a).g();
            Class<?> clsG2 = ((j) dVar2.a).g();
            if (clsG == clsG2) {
                jVar = (j) dVar2.a;
                jVar2 = (j) dVar.a;
                I = I(jVar);
                I2 = I(jVar2);
                if (I != I2) {
                    bVar = this.n;
                    if (bVar == null) {
                        jVarF0 = bVar.f0(this.m, jVar2, jVar);
                        if (jVarF0 != jVar2) {
                            if (jVarF0 != jVar) {
                            }
                            dVar = dVar2;
                        } else {
                            continue;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", p(), ((j) dVar.a).h(), ((j) dVar2.a).h()));
                }
                if (I < I2) {
                    dVar = dVar2;
                }
            } else if (clsG.isAssignableFrom(clsG2)) {
                dVar = dVar2;
            } else if (clsG2.isAssignableFrom(clsG)) {
                continue;
            } else {
                jVar = (j) dVar2.a;
                jVar2 = (j) dVar.a;
                I = I(jVar);
                I2 = I(jVar2);
                if (I != I2) {
                    bVar = this.n;
                    if (bVar == null) {
                        jVarF0 = bVar.f0(this.m, jVar2, jVar);
                        if (jVarF0 != jVar2) {
                            if (jVarF0 != jVar) {
                            }
                            dVar = dVar2;
                        } else {
                            continue;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", p(), ((j) dVar.a).h(), ((j) dVar2.a).h()));
                }
                if (I < I2) {
                    dVar = dVar2;
                }
            }
            dVar2 = dVar2.f688b;
        }
        this.t = dVar.e();
        return (j) dVar.a;
    }

    @Override // b.g.a.c.c0.s
    public b.g.a.c.t t() {
        b.g.a.c.b bVar;
        if (q() == null || (bVar = this.n) == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public String toString() {
        StringBuilder sbU = b.d.b.a.a.U("[Property '");
        sbU.append(this.o);
        sbU.append("'; ctors: ");
        sbU.append(this.r);
        sbU.append(", field(s): ");
        sbU.append(this.q);
        sbU.append(", getter(s): ");
        sbU.append(this.f687s);
        sbU.append(", setter(s): ");
        sbU.append(this.t);
        sbU.append("]");
        return sbU.toString();
    }

    @Override // b.g.a.c.c0.s
    public boolean u() {
        return x(this.q) || x(this.f687s) || x(this.t) || w(this.r);
    }

    @Override // b.g.a.c.c0.s
    public boolean v() {
        Boolean bool = (Boolean) M(new c());
        return bool != null && bool.booleanValue();
    }

    public final <T> boolean w(d<T> dVar) {
        while (dVar != null) {
            if (dVar.c != null && dVar.d) {
                return true;
            }
            dVar = dVar.f688b;
        }
        return false;
    }

    public final <T> boolean x(d<T> dVar) {
        while (dVar != null) {
            b.g.a.c.t tVar = dVar.c;
            if (tVar != null && tVar.c()) {
                return true;
            }
            dVar = dVar.f688b;
        }
        return false;
    }

    public final <T> boolean y(d<T> dVar) {
        while (dVar != null) {
            if (dVar.f) {
                return true;
            }
            dVar = dVar.f688b;
        }
        return false;
    }

    public final <T> boolean z(d<T> dVar) {
        while (dVar != null) {
            if (dVar.e) {
                return true;
            }
            dVar = dVar.f688b;
        }
        return false;
    }

    public c0(b.g.a.c.z.l<?> lVar, b.g.a.c.b bVar, boolean z2, b.g.a.c.t tVar, b.g.a.c.t tVar2) {
        this.m = lVar;
        this.n = bVar;
        this.p = tVar;
        this.o = tVar2;
        this.l = z2;
    }

    public c0(c0 c0Var, b.g.a.c.t tVar) {
        this.m = c0Var.m;
        this.n = c0Var.n;
        this.p = c0Var.p;
        this.o = tVar;
        this.q = c0Var.q;
        this.r = c0Var.r;
        this.f687s = c0Var.f687s;
        this.t = c0Var.t;
        this.l = c0Var.l;
    }
}
