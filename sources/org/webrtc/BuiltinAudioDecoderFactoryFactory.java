package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class BuiltinAudioDecoderFactoryFactory implements AudioDecoderFactoryFactory {
    @Override // org.webrtc.AudioDecoderFactoryFactory
    public long createNativeAudioDecoderFactory() {
        return nativeCreateBuiltinAudioDecoderFactory();
    }

    private static native long nativeCreateBuiltinAudioDecoderFactory();
}
