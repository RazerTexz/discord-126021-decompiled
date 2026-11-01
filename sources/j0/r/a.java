package j0.r;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.functions.Action0;

/* JADX INFO: compiled from: BooleanSubscription.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Subscription {
    public final AtomicReference<Action0> k;
    public static final Action0 j = new C0639a();

    /* JADX INFO: renamed from: j0.r.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BooleanSubscription.java */
    public final class C0639a implements Action0 {
        @Override // rx.functions.Action0
        public void call() {
        }
    }

    public a() {
        this.k = new AtomicReference<>();
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.k.get() == j;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        Action0 andSet;
        Action0 action0 = this.k.get();
        Action0 action1 = j;
        if (action0 == action1 || (andSet = this.k.getAndSet(action1)) == null || andSet == action1) {
            return;
        }
        andSet.call();
    }

    public a(Action0 action0) {
        this.k = new AtomicReference<>(action0);
    }
}
