package b.i.a.c.x2;

/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a$e {
    public final long c;
    public final long d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1162b;
    public static final a$e a = new a$e(-3, -9223372036854775807L, -1);

    public a$e(int i, long j, long j2) {
        this.f1162b = i;
        this.c = j;
        this.d = j2;
    }

    public static a$e a(long j, long j2) {
        return new a$e(-1, j, j2);
    }

    public static a$e b(long j) {
        return new a$e(0, -9223372036854775807L, j);
    }

    public static a$e c(long j, long j2) {
        return new a$e(-2, j, j2);
    }
}
