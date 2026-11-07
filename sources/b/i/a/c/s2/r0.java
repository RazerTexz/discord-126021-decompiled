package b.i.a.c.s2;

import b.i.a.c.MediaMetadata;
import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0 implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaMetadata f1101b;

    public /* synthetic */ r0(AnalyticsListener.a aVar, MediaMetadata mediaMetadata) {
        this.a = aVar;
        this.f1101b = mediaMetadata;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o0();
    }
}
