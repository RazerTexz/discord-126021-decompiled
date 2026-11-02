package b.i.a.c.e3.b0;

import java.util.Comparator;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    public static final /* synthetic */ b j = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CacheSpan cacheSpan = (CacheSpan) obj;
        CacheSpan cacheSpan2 = (CacheSpan) obj2;
        long j2 = cacheSpan.o;
        long j3 = cacheSpan2.o;
        if (j2 - j3 == 0) {
            return cacheSpan.f(cacheSpan2);
        }
        return j2 < j3 ? -1 : 1;
    }
}
