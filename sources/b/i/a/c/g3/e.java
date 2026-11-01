package b.i.a.c.g3;

import b.i.a.c.f3.e0;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ x.a j;
    public final /* synthetic */ Exception k;

    public /* synthetic */ e(x.a aVar, Exception exc) {
        this.j = aVar;
        this.k = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.a aVar = this.j;
        Exception exc = this.k;
        x xVar = aVar.f995b;
        int i = e0.a;
        xVar.V(exc);
    }
}
