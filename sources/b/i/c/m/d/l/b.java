package b.i.c.m.d.l;

import android.content.Context;
import b.i.c.m.d.k.h;
import b.i.c.m.d.k.x;
import java.io.File;

/* JADX INFO: compiled from: LogFileManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    public final InterfaceC0138b c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1707b;
    public static final c a = new c(null);
    public b.i.c.m.d.l.a d = a;

    /* JADX INFO: renamed from: b.i.c.m.d.l.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LogFileManager.java */
    public interface InterfaceC0138b {
    }

    /* JADX INFO: compiled from: LogFileManager.java */
    public final class c implements b.i.c.m.d.l.a {
        public c(a aVar) {
        }

        @Override // b.i.c.m.d.l.a
        public void a() {
        }

        @Override // b.i.c.m.d.l.a
        public String b() {
            return null;
        }

        @Override // b.i.c.m.d.l.a
        public byte[] c() {
            return null;
        }

        @Override // b.i.c.m.d.l.a
        public void d() {
        }

        @Override // b.i.c.m.d.l.a
        public void e(long j, String str) {
        }
    }

    public b(Context context, InterfaceC0138b interfaceC0138b) {
        this.f1707b = context;
        this.c = interfaceC0138b;
        a(null);
    }

    public final void a(String str) {
        this.d.a();
        this.d = a;
        if (str == null) {
            return;
        }
        if (!h.j(this.f1707b, "com.crashlytics.CollectCustomLogs", true)) {
            b.i.c.m.d.b.a.b("Preferences requested no custom logs. Aborting log file creation.");
        } else {
            this.d = new e(new File(((x.j) this.c).a(), b.d.b.a.a.y("crashlytics-userlog-", str, ".temp")), 65536);
        }
    }

    public b(Context context, InterfaceC0138b interfaceC0138b, String str) {
        this.f1707b = context;
        this.c = interfaceC0138b;
        a(str);
    }
}
