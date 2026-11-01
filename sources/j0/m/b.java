package j0.m;

import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;

/* JADX INFO: compiled from: ConnectableObservable.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> extends Observable<T> {
    public b(Observable.a<T> aVar) {
        super(aVar);
    }

    public abstract void k0(Action1<? super Subscription> action1);
}
