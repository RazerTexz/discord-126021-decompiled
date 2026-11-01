package d0.e0.p.d.m0.b;

import d0.e0.p.d.m0.c.c0;
import d0.e0.p.d.m0.c.f0;
import d0.t.u;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: BuiltInsLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    public static final C0506a a = C0506a.a;

    /* JADX INFO: renamed from: d0.e0.p.d.m0.b.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuiltInsLoader.kt */
    public final class C0506a {
        public static final /* synthetic */ C0506a a = new C0506a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy<a> f3209b = d0.g.lazy(d0.i.PUBLICATION, C0507a.j);

        /* JADX INFO: renamed from: d0.e0.p.d.m0.b.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BuiltInsLoader.kt */
        public final class C0507a extends d0.z.d.o implements Function0<a> {
            public static final C0507a j = new C0507a();

            public C0507a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ a invoke() {
                return invoke();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final a invoke() {
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(a.class, a.class.getClassLoader());
                d0.z.d.m.checkNotNullExpressionValue(serviceLoaderLoad, "implementations");
                a aVar = (a) u.firstOrNull(serviceLoaderLoad);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        public final a getInstance() {
            return f3209b.getValue();
        }
    }

    f0 createPackageFragmentProvider(d0.e0.p.d.m0.m.o oVar, c0 c0Var, Iterable<? extends d0.e0.p.d.m0.c.h1.b> iterable, d0.e0.p.d.m0.c.h1.c cVar, d0.e0.p.d.m0.c.h1.a aVar, boolean z2);
}
