package j0.l.a;

import android.R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: compiled from: OperatorSwitch.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y1<T> implements Observable.b<T, Observable<? extends T>> {
    public final boolean j;

    /* JADX INFO: compiled from: OperatorSwitch.java */
    public final class a {
        public static final y1<Object> a = new y1<>(false);
    }

    /* JADX INFO: compiled from: OperatorSwitch.java */
    public final class b<T> extends Subscriber<T> {
        public final long j;
        public final c<T> k;

        public b(long j, c<T> cVar) {
            this.j = j;
            this.k = cVar;
        }

        @Override // j0.g
        public void onCompleted() {
            c<T> cVar = this.k;
            long j = this.j;
            synchronized (cVar) {
                if (cVar.n.get() != j) {
                    return;
                }
                cVar.v = false;
                cVar.f3783s = null;
                cVar.b();
            }
        }

        @Override // j0.g
        public void onError(Throwable th) {
            boolean zC;
            c<T> cVar = this.k;
            long j = this.j;
            synchronized (cVar) {
                if (cVar.n.get() == j) {
                    zC = cVar.c(th);
                    cVar.v = false;
                    cVar.f3783s = null;
                } else {
                    zC = true;
                }
            }
            if (zC) {
                cVar.b();
            } else {
                j0.o.l.b(th);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to j0.l.a.y1$b<T> for r6v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // j0.g
        public void onNext(T r7) {
            /*
                r6 = this;
                j0.l.a.y1$c<T> r0 = r6.k
                monitor-enter(r0)
                java.util.concurrent.atomic.AtomicLong r1 = r0.n     // Catch: java.lang.Throwable -> L1f
                long r1 = r1.get()     // Catch: java.lang.Throwable -> L1f
                long r3 = r6.j     // Catch: java.lang.Throwable -> L1f
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                goto L1e
            L11:
                j0.l.e.n.e<java.lang.Object> r1 = r0.o     // Catch: java.lang.Throwable -> L1f
                if (r7 != 0) goto L17
                java.lang.Object r7 = j0.l.a.e.f3771b     // Catch: java.lang.Throwable -> L1f
            L17:
                r1.e(r6, r7)     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                r0.b()
            L1e:
                return
            L1f:
                r7 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.l.a.y1.b.onNext(java.lang.Object):void");
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            c<T> cVar = this.k;
            long j = this.j;
            synchronized (cVar) {
                if (cVar.n.get() != j) {
                    return;
                }
                long j2 = cVar.r;
                cVar.f3783s = producer;
                producer.j(j2);
            }
        }
    }

    /* JADX INFO: compiled from: OperatorSwitch.java */
    public final class c<T> extends Subscriber<Observable<? extends T>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Producer f3783s;
        public final Subscriber<? super T> k;
        public final boolean m;
        public boolean p;
        public boolean q;
        public long r;
        public volatile boolean t;
        public Throwable u;
        public boolean v;
        public static final Throwable j = new Throwable("Terminal error");
        public final SerialSubscription l = new SerialSubscription();
        public final AtomicLong n = new AtomicLong();
        public final j0.l.e.n.e<Object> o = new j0.l.e.n.e<>(j0.l.e.i.j);

        public c(Subscriber<? super T> subscriber, boolean z2) {
            this.k = subscriber;
            this.m = z2;
        }

        public boolean a(boolean z2, boolean z3, Throwable th, j0.l.e.n.e<Object> eVar, Subscriber<? super T> subscriber, boolean z4) {
            if (this.m) {
                if (!z2 || z3 || !z4) {
                    return false;
                }
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            if (th != null) {
                eVar.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2 || z3 || !z4) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        public void b() {
            Throwable th;
            Throwable th2;
            synchronized (this) {
                if (this.p) {
                    this.q = true;
                    return;
                }
                this.p = true;
                boolean z2 = this.v;
                long j2 = this.r;
                Throwable th3 = this.u;
                if (th3 != null && th3 != (th2 = j) && !this.m) {
                    this.u = th2;
                }
                j0.l.e.n.e<Object> eVar = this.o;
                AtomicLong atomicLong = this.n;
                Subscriber<? super T> subscriber = this.k;
                long j3 = j2;
                Throwable th4 = th3;
                boolean z3 = this.t;
                while (true) {
                    long j4 = 0;
                    while (j4 != j3) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        boolean zIsEmpty = eVar.isEmpty();
                        if (a(z3, z2, th4, eVar, subscriber, zIsEmpty)) {
                            return;
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        b bVar = (b) eVar.poll();
                        R.anim animVar = (Object) e.b(eVar.poll());
                        if (atomicLong.get() == bVar.j) {
                            subscriber.onNext(animVar);
                            j4++;
                        }
                    }
                    if (j4 == j3) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (a(this.t, z2, th4, eVar, subscriber, eVar.isEmpty())) {
                            return;
                        }
                    }
                    synchronized (this) {
                        long j5 = this.r;
                        if (j5 != RecyclerView.FOREVER_NS) {
                            j5 -= j4;
                            this.r = j5;
                        }
                        j3 = j5;
                        if (!this.q) {
                            this.p = false;
                            return;
                        }
                        this.q = false;
                        z3 = this.t;
                        z2 = this.v;
                        th4 = this.u;
                        if (th4 != null && th4 != (th = j) && !this.m) {
                            this.u = th;
                        }
                    }
                }
            }
        }

        public boolean c(Throwable th) {
            Throwable th2 = this.u;
            if (th2 == j) {
                return false;
            }
            if (th2 == null) {
                this.u = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).b());
                arrayList.add(th);
                this.u = new CompositeException(arrayList);
            } else {
                this.u = new CompositeException(th2, th);
            }
            return true;
        }

        @Override // j0.g
        public void onCompleted() {
            this.t = true;
            b();
        }

        @Override // j0.g
        public void onError(Throwable th) {
            boolean zC;
            synchronized (this) {
                zC = c(th);
            }
            if (!zC) {
                j0.o.l.b(th);
            } else {
                this.t = true;
                b();
            }
        }

        @Override // j0.g
        public void onNext(Object obj) {
            b bVar;
            Observable observable = (Observable) obj;
            long jIncrementAndGet = this.n.incrementAndGet();
            Subscription subscription = this.l.j.get();
            if (subscription == j0.l.d.b.INSTANCE) {
                subscription = j0.r.c.a;
            }
            if (subscription != null) {
                subscription.unsubscribe();
            }
            synchronized (this) {
                bVar = new b(jIncrementAndGet, this);
                this.v = true;
                this.f3783s = null;
            }
            this.l.a(bVar);
            observable.i0(bVar);
        }
    }

    public y1(boolean z2) {
        this.j = z2;
    }

    @Override // j0.k.b
    public Object call(Object obj) {
        Subscriber subscriber = (Subscriber) obj;
        c cVar = new c(subscriber, this.j);
        subscriber.add(cVar);
        cVar.k.add(cVar.l);
        cVar.k.add(new j0.r.a(new z1(cVar)));
        cVar.k.setProducer(new a2(cVar));
        return cVar;
    }
}
