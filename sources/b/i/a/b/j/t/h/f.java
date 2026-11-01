package b.i.a.b.j.t.h;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: SchedulerConfig.java */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class f {

    /* JADX INFO: compiled from: SchedulerConfig.java */
    @AutoValue
    public abstract class a {

        /* JADX INFO: renamed from: b.i.a.b.j.t.h.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        public abstract class AbstractC0089a {
            public abstract a a();

            public abstract AbstractC0089a b(long j);

            public abstract AbstractC0089a c(long j);
        }

        public static AbstractC0089a a() {
            c.b bVar = new c.b();
            Set<b> setEmptySet = Collections.emptySet();
            Objects.requireNonNull(setEmptySet, "Null flags");
            bVar.c = setEmptySet;
            return bVar;
        }

        public abstract long b();

        public abstract Set<b> c();

        public abstract long d();
    }

    /* JADX INFO: compiled from: SchedulerConfig.java */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract b.i.a.b.j.v.a a();

    public long b(b.i.a.b.d dVar, long j, int i) {
        long jA = j - a().a();
        a aVar = c().get(dVar);
        long jB = aVar.b();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jB * Math.max(1.0d, Math.log(10000.0d) / Math.log((jB > 1 ? jB : 2L) * ((long) i2)))), jA), aVar.d());
    }

    public abstract Map<b.i.a.b.d, a> c();
}
