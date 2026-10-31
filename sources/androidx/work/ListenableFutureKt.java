package androidx.work;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo$Scope;
import b.i.b.d.a.a;
import d0.w.h.b;
import d0.w.h.c;
import d0.w.i.a.g;
import d0.z.d.l;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ListenableFutureKt {
    @RestrictTo({RestrictTo$Scope.LIBRARY_GROUP})
    private static final Object await$$forInline(a aVar, Continuation continuation) throws Throwable {
        if (aVar.isDone()) {
            try {
                return aVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        }
        l.mark(0);
        s.a.l lVar = new s.a.l(b.intercepted(continuation), 1);
        aVar.addListener(new ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1(lVar, aVar), DirectExecutor.INSTANCE);
        Object objU = lVar.u();
        if (objU == c.getCOROUTINE_SUSPENDED()) {
            g.probeCoroutineSuspended(continuation);
        }
        l.mark(1);
        return objU;
    }

    @RestrictTo({RestrictTo$Scope.LIBRARY_GROUP})
    public static final <R> Object await(a<R> aVar, Continuation<? super R> continuation) throws Throwable {
        if (aVar.isDone()) {
            try {
                return aVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        }
        s.a.l lVar = new s.a.l(b.intercepted(continuation), 1);
        aVar.addListener(new ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1(lVar, aVar), DirectExecutor.INSTANCE);
        Object objU = lVar.u();
        if (objU == c.getCOROUTINE_SUSPENDED()) {
            g.probeCoroutineSuspended(continuation);
        }
        return objU;
    }
}
