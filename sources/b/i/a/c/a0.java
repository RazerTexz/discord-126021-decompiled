package b.i.a.c;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements b.i.a.c.f3.p.a {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1.f f805b;
    public final /* synthetic */ y1.f c;

    public /* synthetic */ a0(int i, y1.f fVar, y1.f fVar2) {
        this.a = i;
        this.f805b = fVar;
        this.c = fVar2;
    }

    @Override // b.i.a.c.f3.p.a
    public final void invoke(Object obj) {
        int i = this.a;
        y1.f fVar = this.f805b;
        y1.f fVar2 = this.c;
        y1.c cVar = (y1.c) obj;
        cVar.j(i);
        cVar.g(fVar, fVar2, i);
    }
}
