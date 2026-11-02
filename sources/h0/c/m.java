package h0.c;

import org.webrtc.VideoFrame;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ VideoFrame.I420Buffer j;

    public /* synthetic */ m(VideoFrame.I420Buffer i420Buffer) {
        this.j = i420Buffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.release();
    }
}
