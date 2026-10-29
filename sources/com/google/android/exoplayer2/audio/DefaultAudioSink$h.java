package com.google.android.exoplayer2.audio;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(29)
public final class DefaultAudioSink$h {
    public final /* synthetic */ DefaultAudioSink c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioTrack$StreamEventCallback f2924b;
    public final Handler a = new Handler();

    public DefaultAudioSink$h(DefaultAudioSink defaultAudioSink) {
        this.c = defaultAudioSink;
        this.f2924b = new DefaultAudioSink$h$a(this, defaultAudioSink);
    }
}
