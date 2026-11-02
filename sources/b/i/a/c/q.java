package b.i.a.c;

import b.i.a.c.c3.TrackSelectionArray;
import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements ListenerSet.a {
    public final /* synthetic */ PlaybackInfo a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackSelectionArray f1055b;

    public /* synthetic */ q(PlaybackInfo playbackInfo, TrackSelectionArray trackSelectionArray) {
        this.a = playbackInfo;
        this.f1055b = trackSelectionArray;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        PlaybackInfo playbackInfo = this.a;
        ((Player2.c) obj).Y(playbackInfo.i, this.f1055b);
    }
}
