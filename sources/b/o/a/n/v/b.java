package b.o.a.n.v;

/* JADX INFO: compiled from: CameraOrchestrator.java */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Runnable {
    public final /* synthetic */ a j;

    public b(a aVar) {
        this.j = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.c<?> cVar;
        synchronized (this.j.e) {
            cVar = null;
            if (!this.j.d) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (a.c<?> cVar2 : this.j.c) {
                    if (cVar2.e <= jCurrentTimeMillis) {
                        cVar = cVar2;
                        break;
                    }
                }
                if (cVar != null) {
                    this.j.d = true;
                }
            }
        }
        if (cVar != null) {
            a aVar = this.j;
            b.o.a.r.g gVar = b.o.a.n.i.this.k;
            gVar.c(new c(aVar, cVar, gVar));
        }
    }
}
