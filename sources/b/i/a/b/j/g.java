package b.i.a.b.j;

import java.util.concurrent.Executors;

/* JADX INFO: compiled from: ExecutionModule_ExecutorFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements c0.a.a {

    /* JADX INFO: compiled from: ExecutionModule_ExecutorFactory.java */
    public final class a {
        public static final g a = new g();
    }

    @Override // c0.a.a
    public Object get() {
        return new h(Executors.newSingleThreadExecutor());
    }
}
