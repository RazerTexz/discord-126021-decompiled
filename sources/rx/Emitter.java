package rx;

import j0.g;

/* JADX INFO: loaded from: classes3.dex */
public interface Emitter<T> extends g<T> {

    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }
}
