package d0.e0.p.d.m0.o;

import d0.e0.p.d.m0.c.x;
import d0.z.d.m;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements d0.e0.p.d.m0.o.b {
    public final String a;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public final class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f3548b = new a();

        public a() {
            super("must be a member function", null);
        }

        @Override // d0.e0.p.d.m0.o.b
        public boolean check(x xVar) {
            m.checkNotNullParameter(xVar, "functionDescriptor");
            return xVar.getDispatchReceiverParameter() != null;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f3549b = new b();

        public b() {
            super("must be a member or an extension function", null);
        }

        @Override // d0.e0.p.d.m0.o.b
        public boolean check(x xVar) {
            m.checkNotNullParameter(xVar, "functionDescriptor");
            return (xVar.getDispatchReceiverParameter() == null && xVar.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    public f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = str;
    }

    @Override // d0.e0.p.d.m0.o.b
    public String getDescription() {
        return this.a;
    }

    @Override // d0.e0.p.d.m0.o.b
    public String invoke(x xVar) {
        return d0.e0.p.d.m0.o.b.a.invoke(this, xVar);
    }
}
