package b.g.a.b.t;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: ThreadLocalBufferManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class l {
    public final Map<SoftReference<b.g.a.b.t.a>, Boolean> a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<b.g.a.b.t.a> f679b = new ReferenceQueue<>();

    /* JADX INFO: compiled from: ThreadLocalBufferManager.java */
    public final class a {
        public static final l a = new l();
    }
}
