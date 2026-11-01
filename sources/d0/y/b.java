package d0.y;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final void closeFinally(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            d0.b.addSuppressed(th, th2);
        }
    }
}
