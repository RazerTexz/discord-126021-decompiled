package b.i.a.c.f3;

import b.c.a.a0.AnimatableValueParser;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet j;
    public final /* synthetic */ int k;
    public final /* synthetic */ ListenerSet.a l;

    public /* synthetic */ a(CopyOnWriteArraySet copyOnWriteArraySet, int i, ListenerSet.a aVar) {
        this.j = copyOnWriteArraySet;
        this.k = i;
        this.l = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArraySet<ListenerSet.c> copyOnWriteArraySet = this.j;
        int i = this.k;
        ListenerSet.a aVar = this.l;
        for (ListenerSet.c cVar : copyOnWriteArraySet) {
            if (!cVar.d) {
                if (i != -1) {
                    FlagSet.b bVar = cVar.f974b;
                    AnimatableValueParser.D(!bVar.f972b);
                    bVar.a.append(i, true);
                }
                cVar.c = true;
                aVar.invoke(cVar.a);
            }
        }
    }
}
