package b.i.a.c.e3;

import java.util.Comparator;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Comparator {
    public static final /* synthetic */ c j = new c();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = SlidingPercentile.a;
        return Float.compare(((SlidingPercentile.b) obj).c, ((SlidingPercentile.b) obj2).c);
    }
}
