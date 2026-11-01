package b.f.b.b;

import android.os.StatFs;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheKey;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DiskStorageCache.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements h {
    public final long c;
    public final long d;
    public final CountDownLatch e;
    public long f;
    public final b.f.b.a.b g;

    @VisibleForTesting
    public final Set<String> h;
    public long i;
    public final b.f.d.i.a j;
    public final b.f.b.b.c k;
    public final g l;
    public final b.f.b.a.a m;
    public final boolean n;
    public final b o;
    public final b.f.d.k.a p;
    public static final long a = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f463b = TimeUnit.MINUTES.toMillis(30);
    public final Object q = new Object();

    /* JADX INFO: compiled from: DiskStorageCache.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.q) {
                d.this.e();
            }
            Objects.requireNonNull(d.this);
            d.this.e.countDown();
        }
    }

    /* JADX INFO: compiled from: DiskStorageCache.java */
    public class c {
        public final long a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f465b;
        public final long c;

        public c(long j, long j2, long j3) {
            this.a = j;
            this.f465b = j2;
            this.c = j3;
        }
    }

    public d(b.f.b.b.c cVar, g gVar, c cVar2, b.f.b.a.b bVar, b.f.b.a.a aVar, b.f.d.a.a aVar2, Executor executor, boolean z2) {
        b.f.d.i.a aVar3;
        this.c = cVar2.f465b;
        long j = cVar2.c;
        this.d = j;
        this.f = j;
        b.f.d.i.a aVar4 = b.f.d.i.a.a;
        synchronized (b.f.d.i.a.class) {
            if (b.f.d.i.a.a == null) {
                b.f.d.i.a.a = new b.f.d.i.a();
            }
            aVar3 = b.f.d.i.a.a;
        }
        this.j = aVar3;
        this.k = cVar;
        this.l = gVar;
        this.i = -1L;
        this.g = bVar;
        this.m = aVar;
        this.o = new b();
        this.p = b.f.d.k.c.a;
        this.n = z2;
        this.h = new HashSet();
        if (!z2) {
            this.e = new CountDownLatch(0);
        } else {
            this.e = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    public final void a(long j, int i) throws IOException {
        try {
            Collection<b.f.b.b.c.a> collectionC = c(this.k.e());
            long jA = this.o.a() - j;
            int i2 = 0;
            long j2 = 0;
            for (b.f.b.b.c.a aVar : (ArrayList) collectionC) {
                if (j2 > jA) {
                    break;
                }
                long jG = this.k.g(aVar);
                this.h.remove(aVar.getId());
                if (jG > 0) {
                    i2++;
                    j2 += jG;
                    i iVarA = i.a();
                    aVar.getId();
                    Objects.requireNonNull((b.f.b.a.e) this.g);
                    iVarA.b();
                }
            }
            this.o.b(-j2, -i2);
            this.k.a();
        } catch (IOException e) {
            b.f.b.a.a aVar2 = this.m;
            e.getMessage();
            Objects.requireNonNull((b.f.b.a.d) aVar2);
            throw e;
        }
    }

    public b.f.a.a b(CacheKey cacheKey) {
        b.f.a.a aVarD;
        i iVarA = i.a();
        iVarA.d = cacheKey;
        try {
            try {
                synchronized (this.q) {
                    List<String> listZ0 = b.c.a.a0.d.z0(cacheKey);
                    int i = 0;
                    String str = null;
                    aVarD = null;
                    while (true) {
                        ArrayList arrayList = (ArrayList) listZ0;
                        if (i >= arrayList.size() || (aVarD = this.k.d((str = (String) arrayList.get(i)), cacheKey)) != null) {
                            break;
                            break;
                        }
                        i++;
                    }
                    if (aVarD == null) {
                        Objects.requireNonNull((b.f.b.a.e) this.g);
                        this.h.remove(str);
                    } else {
                        Objects.requireNonNull(str);
                        Objects.requireNonNull((b.f.b.a.e) this.g);
                        this.h.add(str);
                    }
                }
                iVarA.b();
                return aVarD;
            } catch (IOException unused) {
                Objects.requireNonNull((b.f.b.a.d) this.m);
                Objects.requireNonNull((b.f.b.a.e) this.g);
                iVarA.b();
                return null;
            }
        } catch (Throwable th) {
            iVarA.b();
            throw th;
        }
    }

    public final Collection<b.f.b.b.c.a> c(Collection<b.f.b.b.c.a> collection) {
        Objects.requireNonNull((b.f.d.k.c) this.p);
        long jCurrentTimeMillis = System.currentTimeMillis() + a;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (b.f.b.b.c.a aVar : collection) {
            if (aVar.a() > jCurrentTimeMillis) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.l.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public b.f.a.a d(CacheKey cacheKey, b.f.b.a.g gVar) throws IOException {
        String strW1;
        b.f.a.a aVarB;
        i iVarA = i.a();
        iVarA.d = cacheKey;
        Objects.requireNonNull((b.f.b.a.e) this.g);
        synchronized (this.q) {
            try {
                try {
                    if (cacheKey instanceof b.f.b.a.c) {
                        throw null;
                    }
                    strW1 = b.c.a.a0.d.W1(cacheKey);
                    try {
                    } catch (Throwable th) {
                        iVarA.b();
                        throw th;
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            b.f.b.b.c.b bVarG = g(strW1, cacheKey);
            try {
                b.f.b.b.a.f fVar = (b.f.b.b.a.f) bVarG;
                fVar.c(gVar, cacheKey);
                synchronized (this.q) {
                    aVarB = fVar.b(cacheKey);
                    this.h.add(strW1);
                    this.o.b(aVarB.a(), 1L);
                }
                aVarB.a();
                this.o.a();
                Objects.requireNonNull((b.f.b.a.e) this.g);
                if (!fVar.a()) {
                    b.f.d.e.a.a(d.class, "Failed to delete temp file");
                }
                iVarA.b();
                return aVarB;
            } catch (Throwable th3) {
                if (!((b.f.b.b.a.f) bVarG).a()) {
                    b.f.d.e.a.a(d.class, "Failed to delete temp file");
                }
                throw th3;
            }
        } catch (IOException e2) {
            Objects.requireNonNull((b.f.b.a.e) this.g);
            b.f.d.e.a.b(d.class, "Failed inserting a file into the cache", e2);
            throw e2;
        }
    }

    public final boolean e() {
        boolean z2;
        long j;
        long j2;
        Objects.requireNonNull((b.f.d.k.c) this.p);
        long jCurrentTimeMillis = System.currentTimeMillis();
        b bVar = this.o;
        synchronized (bVar) {
            z2 = bVar.a;
        }
        long jMax = -1;
        if (z2) {
            long j3 = this.i;
            if (j3 != -1 && jCurrentTimeMillis - j3 <= f463b) {
                return false;
            }
        }
        Objects.requireNonNull((b.f.d.k.c) this.p);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j4 = a + jCurrentTimeMillis2;
        Set<String> hashSet = (this.n && this.h.isEmpty()) ? this.h : this.n ? new HashSet<>() : null;
        try {
            long size = 0;
            boolean z3 = false;
            int i = 0;
            for (b.f.b.b.c.a aVar : this.k.e()) {
                i++;
                size += aVar.getSize();
                if (aVar.a() > j4) {
                    aVar.getSize();
                    j2 = j4;
                    jMax = Math.max(aVar.a() - jCurrentTimeMillis2, jMax);
                    z3 = true;
                } else {
                    j2 = j4;
                    if (this.n) {
                        Objects.requireNonNull(hashSet);
                        hashSet.add(aVar.getId());
                    }
                }
                j4 = j2;
            }
            if (z3) {
                Objects.requireNonNull((b.f.b.a.d) this.m);
            }
            b bVar2 = this.o;
            synchronized (bVar2) {
                j = bVar2.c;
            }
            long j5 = i;
            if (j != j5 || this.o.a() != size) {
                if (this.n && this.h != hashSet) {
                    Objects.requireNonNull(hashSet);
                    this.h.clear();
                    this.h.addAll(hashSet);
                }
                b bVar3 = this.o;
                synchronized (bVar3) {
                    bVar3.c = j5;
                    bVar3.f464b = size;
                    bVar3.a = true;
                }
            }
            this.i = jCurrentTimeMillis2;
            return true;
        } catch (IOException e) {
            b.f.b.a.a aVar2 = this.m;
            e.getMessage();
            Objects.requireNonNull((b.f.b.a.d) aVar2);
            return false;
        }
    }

    public void f(CacheKey cacheKey) {
        synchronized (this.q) {
            try {
                List<String> listZ0 = b.c.a.a0.d.z0(cacheKey);
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) listZ0;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    String str = (String) arrayList.get(i);
                    this.k.f(str);
                    this.h.remove(str);
                    i++;
                }
            } catch (IOException e) {
                b.f.b.a.a aVar = this.m;
                e.getMessage();
                Objects.requireNonNull((b.f.b.a.d) aVar);
            }
        }
    }

    public final b.f.b.b.c.b g(String str, CacheKey cacheKey) throws IOException {
        synchronized (this.q) {
            boolean zE = e();
            h();
            long jA = this.o.a();
            if (jA > this.f && !zE) {
                b bVar = this.o;
                synchronized (bVar) {
                    bVar.a = false;
                    bVar.c = -1L;
                    bVar.f464b = -1L;
                }
                e();
            }
            long j = this.f;
            if (jA > j) {
                a((j * 9) / 10, 1);
            }
        }
        return this.k.b(str, cacheKey);
    }

    public final void h() {
        long availableBlocksLong;
        boolean z2 = true;
        char c2 = this.k.isExternal() ? (char) 2 : (char) 1;
        b.f.d.i.a aVar = this.j;
        long jA = this.d - this.o.a();
        aVar.a();
        aVar.a();
        if (aVar.h.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - aVar.g > b.f.d.i.a.f473b) {
                    aVar.b();
                }
                aVar.h.unlock();
            } catch (Throwable th) {
                aVar.h.unlock();
                throw th;
            }
        }
        StatFs statFs = c2 == 1 ? aVar.c : aVar.e;
        if (statFs != null) {
            availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } else {
            availableBlocksLong = 0;
        }
        if (availableBlocksLong > 0 && availableBlocksLong >= jA) {
            z2 = false;
        }
        if (z2) {
            this.f = this.c;
        } else {
            this.f = this.d;
        }
    }

    /* JADX INFO: compiled from: DiskStorageCache.java */
    @VisibleForTesting
    public class b {
        public boolean a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f464b = -1;
        public long c = -1;

        public synchronized long a() {
            return this.f464b;
        }

        public synchronized void b(long j, long j2) {
            if (this.a) {
                this.f464b += j;
                this.c += j2;
            }
        }
    }
}
