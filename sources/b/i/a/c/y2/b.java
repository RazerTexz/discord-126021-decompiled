package b.i.a.c.y2;

import android.os.HandlerThread;
import b.i.b.a.Supplier2;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Supplier2 {
    public final /* synthetic */ int j;

    public /* synthetic */ b(int i) {
        this.j = i;
    }

    @Override // b.i.b.a.Supplier2
    public final Object get() {
        return new HandlerThread(AsynchronousMediaCodecAdapter.l(this.j, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
