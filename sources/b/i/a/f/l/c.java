package b.i.a.f.l;

import androidx.core.app.NotificationCompat;
import b.c.a.a0.AnimatableValueParser;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final b.i.a.f.e.h.a.g<b.i.a.f.l.b.a> a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.i.a.f.e.h.a.g<b.i.a.f.l.b.a> f1590b;
    public static final b.i.a.f.e.h.a.C0035a<b.i.a.f.l.b.a, a> c;
    public static final b.i.a.f.e.h.a.C0035a<b.i.a.f.l.b.a, g> d;

    static {
        b.i.a.f.e.h.a.g<b.i.a.f.l.b.a> gVar = new b.i.a.f.e.h.a.g<>();
        a = gVar;
        b.i.a.f.e.h.a.g<b.i.a.f.l.b.a> gVar2 = new b.i.a.f.e.h.a.g<>();
        f1590b = gVar2;
        e eVar = new e();
        c = eVar;
        d dVar = new d();
        d = dVar;
        new Scope("profile");
        new Scope(NotificationCompat.CATEGORY_EMAIL);
        AnimatableValueParser.z(eVar, "Cannot construct an Api with a null ClientBuilder");
        AnimatableValueParser.z(gVar, "Cannot construct an Api with a null ClientKey");
        AnimatableValueParser.z(dVar, "Cannot construct an Api with a null ClientBuilder");
        AnimatableValueParser.z(gVar2, "Cannot construct an Api with a null ClientKey");
    }
}
