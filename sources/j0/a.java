package j0;

import rx.exceptions.MissingBackpressureException;

/* JADX INFO: compiled from: BackpressureOverflow.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BackpressureOverflow.java */
    public final class C0618a implements b {
        public static final C0618a a = new C0618a();

        @Override // j0.a.b
        public boolean a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* JADX INFO: compiled from: BackpressureOverflow.java */
    public interface b {
        boolean a() throws MissingBackpressureException;
    }
}
