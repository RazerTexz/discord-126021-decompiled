package b.f.d.g;

/* JADX INFO: compiled from: NoOpMemoryTrimmableRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements c {
    public static d a;

    @Override // b.f.d.g.c
    public void a(b bVar) {
    }

    public static synchronized d b() {
        if (a == null) {
            a = new d();
        }
        return a;
    }
}
