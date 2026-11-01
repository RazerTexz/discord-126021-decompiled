package b.i.c.o.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.firebase:firebase-dynamic-links@@19.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b.i.a.f.e.h.b<b.i.a.f.e.h.a.d.c> {
    public static final b.i.a.f.e.h.a.g<d> j;
    public static final b.i.a.f.e.h.a.C0112a<d, b.i.a.f.e.h.a.d.c> k;
    public static final b.i.a.f.e.h.a<b.i.a.f.e.h.a.d.c> l;

    static {
        b.i.a.f.e.h.a.g<d> gVar = new b.i.a.f.e.h.a.g<>();
        j = gVar;
        b bVar = new b();
        k = bVar;
        l = new b.i.a.f.e.h.a<>("DynamicLinks.API", bVar, gVar);
    }

    public c(@NonNull Context context) {
        super(context, l, (b.i.a.f.e.h.a.d) null, b.i.a.f.e.h.b.a.a);
    }
}
