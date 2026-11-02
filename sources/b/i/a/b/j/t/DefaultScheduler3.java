package b.i.a.b.j.t;

import b.i.a.b.TransportScheduleCallback;
import b.i.a.b.j.EventInternal;
import b.i.a.b.j.TransportContext;
import b.i.a.b.j.TransportRuntime;
import b.i.a.b.j.q.BackendRegistry;
import b.i.a.b.j.t.h.WorkScheduler;
import b.i.a.b.j.t.i.EventStore;
import b.i.a.b.j.u.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: b.i.a.b.j.t.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultScheduler3 implements Scheduler2 {
    public final Executor c;
    public final BackendRegistry d;
    public final EventStore e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkScheduler f781b;
    public final SynchronizationGuard f;
    public static final Logger a = Logger.getLogger(TransportRuntime.class.getName());

    public DefaultScheduler3(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.c = executor;
        this.d = backendRegistry;
        this.f781b = workScheduler;
        this.e = eventStore;
        this.f = synchronizationGuard;
    }

    @Override // b.i.a.b.j.t.Scheduler2
    public void a(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.c.execute(new DefaultScheduler(this, transportContext, transportScheduleCallback, eventInternal));
    }
}
