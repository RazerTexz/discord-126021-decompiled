package b.i.a.c;

import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements ListenerSet.a {
    public final /* synthetic */ PlaybackInfo a;

    public /* synthetic */ o(PlaybackInfo playbackInfo) {
        this.a = playbackInfo;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        PlaybackInfo playbackInfo = this.a;
        Player2.c cVar = (Player2.c) obj;
        cVar.i(playbackInfo.h);
        cVar.r(playbackInfo.h);
    }
}
