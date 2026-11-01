package b.i.a.c.y2;

import android.media.MediaCodec;
import java.util.Objects;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ w a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f1304b;

    public /* synthetic */ i(w wVar, t.c cVar) {
        this.a = wVar;
        this.f1304b = cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        w wVar = this.a;
        t.c cVar = this.f1304b;
        Objects.requireNonNull(wVar);
        ((b.i.a.c.g3.r.b) cVar).b(wVar, j, j2);
    }
}
