package d0.e0.p.d.m0.c.k1.b;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements d0.e0.p.d.m0.e.a.k0.b {
    public static final a a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0.e0.p.d.m0.g.e f3292b;

    /* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
    public final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final d create(Object obj, d0.e0.p.d.m0.g.e eVar) {
            d0.z.d.m.checkNotNullParameter(obj, "value");
            if (b.isEnumClassOrSpecializedEnumEntryClass(obj.getClass())) {
                return new o(eVar, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new e(eVar, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new h(eVar, (Object[]) obj);
            }
            return obj instanceof Class ? new k(eVar, (Class) obj) : new q(eVar, obj);
        }
    }

    public d(d0.e0.p.d.m0.g.e eVar) {
        this.f3292b = eVar;
    }

    @Override // d0.e0.p.d.m0.e.a.k0.b
    public d0.e0.p.d.m0.g.e getName() {
        return this.f3292b;
    }
}
