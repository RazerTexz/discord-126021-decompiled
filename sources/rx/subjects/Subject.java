package rx.subjects;

import j0.g;
import rx.Observable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Subject<T, R> extends Observable<R> implements g<T> {
    public Subject(Observable.a<R> aVar) {
        super(aVar);
    }
}
