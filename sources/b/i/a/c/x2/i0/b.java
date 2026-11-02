package b.i.a.c.x2.i0;

import android.net.Uri;
import b.i.a.c.x2.Extractor;
import b.i.a.c.x2.ExtractorsFactory;
import b.i.a.c.x2.ExtractorsFactory2;
import java.util.Map;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements ExtractorsFactory2 {
    public static final /* synthetic */ b a = new b();

    @Override // b.i.a.c.x2.ExtractorsFactory2
    public final Extractor[] a() {
        return new Extractor[]{new Mp4Extractor(0)};
    }

    @Override // b.i.a.c.x2.ExtractorsFactory2
    public /* synthetic */ Extractor[] b(Uri uri, Map map) {
        return ExtractorsFactory.a(this, uri, map);
    }
}
