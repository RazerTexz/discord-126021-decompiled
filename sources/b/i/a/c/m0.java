package b.i.a.c;

import java.util.Objects;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ s1 j;
    public final /* synthetic */ b.i.b.b.p.a k;
    public final /* synthetic */ b.i.a.c.a3.a0.a l;

    public /* synthetic */ m0(s1 s1Var, b.i.b.b.p.a aVar, b.i.a.c.a3.a0.a aVar2) {
        this.j = s1Var;
        this.k = aVar;
        this.l = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        s1 s1Var = this.j;
        b.i.b.b.p.a aVar = this.k;
        b.i.a.c.a3.a0.a aVar2 = this.l;
        b.i.a.c.s2.g1 g1Var = s1Var.c;
        b.i.b.b.p pVarC = aVar.c();
        b.i.a.c.s2.g1.a aVar3 = g1Var.m;
        y1 y1Var = g1Var.p;
        Objects.requireNonNull(y1Var);
        Objects.requireNonNull(aVar3);
        aVar3.f1081b = b.i.b.b.p.n(pVarC);
        if (!pVarC.isEmpty()) {
            aVar3.e = (b.i.a.c.a3.a0.a) pVarC.get(0);
            Objects.requireNonNull(aVar2);
            aVar3.f = aVar2;
        }
        if (aVar3.d == null) {
            aVar3.d = b.i.a.c.s2.g1.a.b(y1Var, aVar3.f1081b, aVar3.e, aVar3.a);
        }
        aVar3.d(y1Var.K());
    }
}
