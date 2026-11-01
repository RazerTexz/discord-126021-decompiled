package i0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: CallAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public interface e<R, T> {

    /* JADX INFO: compiled from: CallAdapter.java */
    public abstract class a {
        public abstract e<?, ?> a(Type type, Annotation[] annotationArr, y yVar);
    }

    Type a();

    T b(d<R> dVar);
}
