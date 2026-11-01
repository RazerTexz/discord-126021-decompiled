package kotlinx.coroutines;

import d0.w.b;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s.a.u0;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {

    /* JADX INFO: compiled from: Executors.kt */
    public final class a extends b<CoroutineDispatcher, ExecutorCoroutineDispatcher> {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
            super(CoroutineDispatcher.INSTANCE, u0.j);
        }
    }

    static {
        new a(null);
    }

    public abstract Executor H();
}
