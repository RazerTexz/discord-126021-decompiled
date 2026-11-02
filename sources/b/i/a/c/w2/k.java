package b.i.a.c.w2;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ DrmSessionEventListener.a j;
    public final /* synthetic */ DrmSessionEventListener k;
    public final /* synthetic */ Exception l;

    public /* synthetic */ k(DrmSessionEventListener.a aVar, DrmSessionEventListener drmSessionEventListener, Exception exc) {
        this.j = aVar;
        this.k = drmSessionEventListener;
        this.l = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DrmSessionEventListener.a aVar = this.j;
        this.k.u(aVar.a, aVar.f1156b, this.l);
    }
}
