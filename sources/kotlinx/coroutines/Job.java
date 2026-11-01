package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import s.a.m0;
import s.a.p;
import s.a.r;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface Job extends CoroutineContext.Element {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: kotlinx.coroutines.Job$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Job.kt */
    public final class Companion implements CoroutineContext.Key<Job> {
        public static final /* synthetic */ Companion a = new Companion();

        static {
            int i = CoroutineExceptionHandler.g;
        }
    }

    p D(r child);

    boolean a();

    void b(CancellationException cause);

    Sequence<Job> e();

    m0 n(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> handler);

    CancellationException q();

    boolean start();

    m0 u(Function1<? super Throwable, Unit> handler);
}
