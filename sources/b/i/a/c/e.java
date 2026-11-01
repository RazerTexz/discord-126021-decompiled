package b.i.a.c;

import android.content.Context;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements b.i.b.a.l {
    public final /* synthetic */ Context j;

    public /* synthetic */ e(Context context) {
        this.j = context;
    }

    @Override // b.i.b.a.l
    public final Object get() {
        b.i.a.c.e3.p pVar;
        Context context = this.j;
        b.i.b.b.p<Long> pVar2 = b.i.a.c.e3.p.a;
        synchronized (b.i.a.c.e3.p.class) {
            if (b.i.a.c.e3.p.g == null) {
                b.i.a.c.e3.p.b bVar = new b.i.a.c.e3.p.b(context);
                b.i.a.c.e3.p.g = new b.i.a.c.e3.p(bVar.a, bVar.f947b, bVar.c, bVar.d, bVar.e, null);
            }
            pVar = b.i.a.c.e3.p.g;
        }
        return pVar;
    }
}
