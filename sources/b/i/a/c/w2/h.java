package b.i.a.c.w2;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ DrmSessionEventListener.a j;
    public final /* synthetic */ DrmSessionEventListener k;

    public /* synthetic */ h(DrmSessionEventListener.a aVar, DrmSessionEventListener drmSessionEventListener) {
        this.j = aVar;
        this.k = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DrmSessionEventListener.a aVar = this.j;
        this.k.J(aVar.a, aVar.f1156b);
    }
}
