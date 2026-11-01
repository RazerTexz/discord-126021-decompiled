package androidx.view;

import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import d0.l;
import d0.w.h.c;
import d0.w.i.a.e;
import d0.w.i.a.k;
import d0.z.d.m;
import java.time.Duration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.objectweb.asm.Opcodes;
import s.a.d2.d;
import s.a.d2.f;

/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlowLiveDataConversions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {96, 100, 101}, m = "invokeSuspend")
    public final class AnonymousClass1<T> extends k implements Function2<s.a.d2.e<? super T>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ LiveData $this_asFlow;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: FlowLiveData.kt */
        @e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        public final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Observer $observer;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Observer observer, Continuation continuation) {
                super(2, continuation);
                this.$observer = observer;
            }

            @Override // d0.w.i.a.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                m.checkNotNullParameter(continuation, "completion");
                return new AnonymousClass2(this.$observer, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.a);
            }

            @Override // d0.w.i.a.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                c.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.throwOnFailure(obj);
                AnonymousClass1.this.$this_asFlow.removeObserver(this.$observer);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowLiveData.kt */
        @e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        public final class C00021 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Observer $observer;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(Observer observer, Continuation continuation) {
                super(2, continuation);
                this.$observer = observer;
            }

            @Override // d0.w.i.a.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                m.checkNotNullParameter(continuation, "completion");
                return new C00021(this.$observer, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00021) create(coroutineScope, continuation)).invokeSuspend(Unit.a);
            }

            @Override // d0.w.i.a.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                c.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.throwOnFailure(obj);
                AnonymousClass1.this.$this_asFlow.observeForever(this.$observer);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData liveData, Continuation continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
        }

        @Override // d0.w.i.a.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m.checkNotNullParameter(continuation, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(obj, continuation)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0097 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0098  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a5 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:29:0x009d, B:31:0x00a5), top: B:45:0x009d }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v3, types: [androidx.lifecycle.Observer, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, s.a.d2.e] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b8 -> B:47:0x0089). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // d0.w.i.a.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.view.FlowLiveDataConversions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {Opcodes.FCMPL}, m = "invokeSuspend")
    public final class AnonymousClass1<T> extends k implements Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ d $this_asLiveData;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.$this_asLiveData = dVar;
        }

        @Override // d0.w.i.a.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m.checkNotNullParameter(continuation, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asLiveData, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(obj, continuation)).invokeSuspend(Unit.a);
        }

        @Override // d0.w.i.a.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = c.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                l.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                d dVar = this.$this_asLiveData;
                FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1 flowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1 = new FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1(liveDataScope);
                this.label = 1;
                if (dVar.a(flowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.throwOnFailure(obj);
            }
            return Unit.a;
        }
    }

    public static final <T> d<T> asFlow(LiveData<T> liveData) {
        m.checkNotNullParameter(liveData, "$this$asFlow");
        return new f(new AnonymousClass1(liveData, null));
    }

    public static /* synthetic */ LiveData asLiveData$default(d dVar, CoroutineContext coroutineContext, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = d0.w.f.j;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(dVar, coroutineContext, j);
    }

    public static final <T> LiveData<T> asLiveData(d<? extends T> dVar) {
        return asLiveData$default(dVar, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(d<? extends T> dVar, CoroutineContext coroutineContext) {
        return asLiveData$default(dVar, coroutineContext, 0L, 2, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(d<? extends T> dVar, CoroutineContext coroutineContext, long j) {
        m.checkNotNullParameter(dVar, "$this$asLiveData");
        m.checkNotNullParameter(coroutineContext, "context");
        return CoroutineLiveDataKt.liveData(coroutineContext, j, new AnonymousClass1(dVar, null));
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(d<? extends T> dVar, CoroutineContext coroutineContext, Duration duration) {
        m.checkNotNullParameter(dVar, "$this$asLiveData");
        m.checkNotNullParameter(coroutineContext, "context");
        m.checkNotNullParameter(duration, "timeout");
        return asLiveData(dVar, coroutineContext, duration.toMillis());
    }

    public static /* synthetic */ LiveData asLiveData$default(d dVar, CoroutineContext coroutineContext, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = d0.w.f.j;
        }
        return asLiveData(dVar, coroutineContext, duration);
    }
}
