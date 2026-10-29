package j0.l.e.o;

/* JADX INFO: compiled from: SpmcArrayQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l<E> extends j<E> {
    private volatile long producerIndex;
    public static final long o = y.a(l.class, "producerIndex");

    public l(int i) {
        super(i);
    }

    public final long i() {
        return this.producerIndex;
    }

    public final void j(long j) {
        y.a.putOrderedLong(this, o, j);
    }
}
