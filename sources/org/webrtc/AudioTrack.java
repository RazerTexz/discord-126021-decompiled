package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j) {
        super(j);
    }

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    private static native void nativeSetVolume(long j, double d);

    public void setVolume(double d) {
        nativeSetVolume(getNativeAudioTrack(), d);
    }
}
