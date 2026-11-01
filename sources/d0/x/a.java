package d0.x;

import d0.t.k;
import d0.z.d.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d0.x.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlatformImplementations.kt */
    public final class C0602a {
        public static final Method a;

        /* JADX WARN: Code duplicated, block: B:10:0x003a  */
        static {
            Method method;
            boolean z2;
            Method[] methods = Throwable.class.getMethods();
            m.checkNotNullExpressionValue(methods, "throwableMethods");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods[i];
                m.checkNotNullExpressionValue(method, "it");
                if (m.areEqual(method.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    m.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                    if (m.areEqual((Class) k.singleOrNull(parameterTypes), Throwable.class)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                } else {
                    i++;
                }
            }
            a = method;
            for (Method method2 : methods) {
                m.checkNotNullExpressionValue(method2, "it");
                if (m.areEqual(method2.getName(), "getSuppressed")) {
                    return;
                }
            }
        }
    }

    public void addSuppressed(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        m.checkNotNullParameter(th, "cause");
        m.checkNotNullParameter(th2, "exception");
        Method method = C0602a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public d0.c0.c defaultPlatformRandom() {
        return new d0.c0.b();
    }
}
