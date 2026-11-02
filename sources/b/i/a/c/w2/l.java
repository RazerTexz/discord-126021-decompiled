package b.i.a.c.w2;

import java.util.Objects;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ DrmSessionEventListener.a j;
    public final /* synthetic */ DrmSessionEventListener k;
    public final /* synthetic */ int l;

    public /* synthetic */ l(DrmSessionEventListener.a aVar, DrmSessionEventListener drmSessionEventListener, int i) {
        this.j = aVar;
        this.k = drmSessionEventListener;
        this.l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DrmSessionEventListener.a aVar = this.j;
        DrmSessionEventListener drmSessionEventListener = this.k;
        int i = this.l;
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(drmSessionEventListener);
        drmSessionEventListener.c0(aVar.a, aVar.f1156b, i);
    }
}
