package androidx.activity.contextaware;

import android.content.Context;
import d0.w.h.b;
import d0.w.h.c;
import d0.w.i.a.g;
import d0.z.d.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt {
    private static final Object withContextAvailable$$forInline(ContextAware contextAware, Function1 function1, Continuation continuation) throws Throwable {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        l.mark(0);
        s.a.l lVar = new s.a.l(b.intercepted(continuation), 1);
        lVar.A();
        ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1 contextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1 = new ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1(lVar, contextAware, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1);
        lVar.f(new ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$2(contextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1, contextAware, function1));
        Object objU = lVar.u();
        if (objU == c.getCOROUTINE_SUSPENDED()) {
            g.probeCoroutineSuspended(continuation);
        }
        l.mark(1);
        return objU;
    }

    public static final <R> Object withContextAvailable(ContextAware contextAware, Function1<? super Context, ? extends R> function1, Continuation<? super R> continuation) throws Throwable {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        s.a.l lVar = new s.a.l(b.intercepted(continuation), 1);
        lVar.A();
        ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1 contextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1 = new ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1(lVar, contextAware, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1);
        lVar.f(new ContextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$2(contextAwareKt$withContextAvailable$$inlined$suspendCancellableCoroutine$lambda$1, contextAware, function1));
        Object objU = lVar.u();
        if (objU != c.getCOROUTINE_SUSPENDED()) {
            return objU;
        }
        g.probeCoroutineSuspended(continuation);
        return objU;
    }
}
