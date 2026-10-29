package d0.e0.p.d.m0.i;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<e$a, g$f<?, ?>> f3427b;
    public static final e a = new e(true);

    public e() {
        this.f3427b = new HashMap();
    }

    public final void add(g$f<?, ?> g_f) {
        this.f3427b.put(new e$a(g_f.getContainingTypeDefaultInstance(), g_f.getNumber()), g_f);
    }

    public <ContainingType extends n> g$f<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (g$f) this.f3427b.get(new e$a(containingtype, i));
    }

    public static e getEmptyRegistry() {
        return a;
    }

    public static e newInstance() {
        return new e();
    }

    public e(boolean z2) {
        this.f3427b = Collections.emptyMap();
    }
}
