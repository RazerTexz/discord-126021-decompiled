package d0.e0.p.d.m0.e.b;

import java.util.List;

/* JADX INFO: compiled from: PackagePartProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface v {

    /* JADX INFO: compiled from: PackagePartProvider.kt */
    public final class a implements v {
        public static final a a = new a();

        @Override // d0.e0.p.d.m0.e.b.v
        public List<String> findPackageParts(String str) {
            d0.z.d.m.checkNotNullParameter(str, "packageFqName");
            return d0.t.n.emptyList();
        }
    }

    List<String> findPackageParts(String str);
}
