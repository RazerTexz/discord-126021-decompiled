package b.i.a.b.j.t;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: SchedulingConfigModule_ConfigFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements c0.a.a {
    public final c0.a.a<b.i.a.b.j.v.a> a;

    public f(c0.a.a<b.i.a.b.j.v.a> aVar) {
        this.a = aVar;
    }

    @Override // c0.a.a
    public Object get() {
        b.i.a.b.j.v.a aVar = this.a.get();
        HashMap map = new HashMap();
        b.i.a.b.d dVar = b.i.a.b.d.DEFAULT;
        b.i.a.b.j.t.h.f.a.AbstractC0089a abstractC0089aA = b.i.a.b.j.t.h.f.a.a();
        abstractC0089aA.b(30000L);
        abstractC0089aA.c(86400000L);
        map.put(dVar, abstractC0089aA.a());
        b.i.a.b.d dVar2 = b.i.a.b.d.HIGHEST;
        b.i.a.b.j.t.h.f.a.AbstractC0089a abstractC0089aA2 = b.i.a.b.j.t.h.f.a.a();
        abstractC0089aA2.b(1000L);
        abstractC0089aA2.c(86400000L);
        map.put(dVar2, abstractC0089aA2.a());
        b.i.a.b.d dVar3 = b.i.a.b.d.VERY_LOW;
        b.i.a.b.j.t.h.f.a.AbstractC0089a abstractC0089aA3 = b.i.a.b.j.t.h.f.a.a();
        abstractC0089aA3.b(86400000L);
        abstractC0089aA3.c(86400000L);
        Set<b.i.a.b.j.t.h.f.b> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(b.i.a.b.j.t.h.f.b.NETWORK_UNMETERED, b.i.a.b.j.t.h.f.b.DEVICE_IDLE)));
        b.i.a.b.j.t.h.c.b bVar = (b.i.a.b.j.t.h.c.b) abstractC0089aA3;
        Objects.requireNonNull(setUnmodifiableSet, "Null flags");
        bVar.c = setUnmodifiableSet;
        map.put(dVar3, bVar.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        int size = map.keySet().size();
        b.i.a.b.d.values();
        if (size < 3) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new b.i.a.b.j.t.h.b(aVar, map);
    }
}
