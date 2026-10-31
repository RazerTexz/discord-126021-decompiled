package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }

    public static native long nativeCreateDecoder();
}
