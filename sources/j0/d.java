package j0;

import j0.o.l;
import rx.functions.Action1;

/* JADX INFO: compiled from: Completable.java */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public final a a;

    /* JADX INFO: compiled from: Completable.java */
    public interface a extends Action1<e> {
    }

    public d(a aVar) {
        j0.k.b<a, a> bVar = l.d;
        this.a = bVar != null ? bVar.call(aVar) : aVar;
    }
}
