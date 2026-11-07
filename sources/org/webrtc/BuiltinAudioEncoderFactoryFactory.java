package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class BuiltinAudioEncoderFactoryFactory implements AudioEncoderFactoryFactory {
    @Override // org.webrtc.AudioEncoderFactoryFactory
    public long createNativeAudioEncoderFactory() {
        return nativeCreateBuiltinAudioEncoderFactory();
    }

    private static native long nativeCreateBuiltinAudioEncoderFactory();
}
