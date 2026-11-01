package b.f.j.p;

import java.util.Objects;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: HttpUrlConnectionNetworkFetcher.java */
/* JADX INFO: loaded from: classes3.dex */
public class z extends e {
    public final /* synthetic */ Future a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0.a f643b;

    public z(a0 a0Var, Future future, o0.a aVar) {
        this.a = future;
        this.f643b = aVar;
    }

    @Override // b.f.j.p.y0
    public void a() {
        if (this.a.cancel(false)) {
            n0.a aVar = (n0.a) this.f643b;
            n0 n0Var = n0.this;
            x xVar = aVar.a;
            Objects.requireNonNull(n0Var);
            xVar.a().d(xVar.f642b, "NetworkFetchProducer", null);
            xVar.a.d();
        }
    }
}
