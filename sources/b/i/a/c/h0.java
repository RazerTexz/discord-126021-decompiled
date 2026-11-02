package b.i.a.c;

import android.os.Bundle;
import b.i.a.c.f3.BundleableUtil;
import b.i.a.c.f3.Util2;
import b.i.a.c.g3.ColorInfo;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Bundleable.a {
    public static final /* synthetic */ h0 a = new h0();

    @Override // b.i.a.c.Bundleable.a
    public final Bundleable a(Bundle bundle) {
        Format2 format2 = Format2.j;
        Format2.b bVar = new Format2.b();
        if (bundle != null) {
            ClassLoader classLoader = BundleableUtil.class.getClassLoader();
            int i = Util2.a;
            bundle.setClassLoader(classLoader);
        }
        int i2 = 0;
        String string = bundle.getString(Format2.d(0));
        Format2 format3 = Format2.j;
        bVar.a = (String) Format2.b(string, format3.l);
        bVar.f1021b = (String) Format2.b(bundle.getString(Format2.d(1)), format3.m);
        bVar.c = (String) Format2.b(bundle.getString(Format2.d(2)), format3.n);
        bVar.d = bundle.getInt(Format2.d(3), format3.o);
        bVar.e = bundle.getInt(Format2.d(4), format3.p);
        bVar.f = bundle.getInt(Format2.d(5), format3.q);
        bVar.g = bundle.getInt(Format2.d(6), format3.r);
        bVar.h = (String) Format2.b(bundle.getString(Format2.d(7)), format3.t);
        bVar.i = (Metadata) Format2.b((Metadata) bundle.getParcelable(Format2.d(8)), format3.u);
        bVar.j = (String) Format2.b(bundle.getString(Format2.d(9)), format3.v);
        bVar.k = (String) Format2.b(bundle.getString(Format2.d(10)), format3.w);
        bVar.l = bundle.getInt(Format2.d(11), format3.f1018x);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strD = Format2.d(12);
            String string2 = Integer.toString(i2, 36);
            StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + String.valueOf(strD).length() + 1);
            sb.append(strD);
            sb.append("_");
            sb.append(string2);
            byte[] byteArray = bundle.getByteArray(sb.toString());
            if (byteArray == null) {
                bVar.m = arrayList;
                bVar.n = (DrmInitData) bundle.getParcelable(Format2.d(13));
                String strD2 = Format2.d(14);
                Format2 format4 = Format2.j;
                bVar.o = bundle.getLong(strD2, format4.A);
                bVar.p = bundle.getInt(Format2.d(15), format4.B);
                bVar.q = bundle.getInt(Format2.d(16), format4.C);
                bVar.r = bundle.getFloat(Format2.d(17), format4.D);
                bVar.f1022s = bundle.getInt(Format2.d(18), format4.E);
                bVar.t = bundle.getFloat(Format2.d(19), format4.F);
                bVar.u = bundle.getByteArray(Format2.d(20));
                bVar.v = bundle.getInt(Format2.d(21), format4.H);
                int i3 = ColorInfo.j;
                bVar.w = (ColorInfo) BundleableUtil.c(b.i.a.c.g3.a.a, bundle.getBundle(Format2.d(22)));
                bVar.f1023x = bundle.getInt(Format2.d(23), format4.J);
                bVar.f1024y = bundle.getInt(Format2.d(24), format4.K);
                bVar.f1025z = bundle.getInt(Format2.d(25), format4.L);
                bVar.A = bundle.getInt(Format2.d(26), format4.M);
                bVar.B = bundle.getInt(Format2.d(27), format4.N);
                bVar.C = bundle.getInt(Format2.d(28), format4.O);
                bVar.D = bundle.getInt(Format2.d(29), format4.P);
                return bVar.a();
            }
            arrayList.add(byteArray);
            i2++;
        }
    }
}
