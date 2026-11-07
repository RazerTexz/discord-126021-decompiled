package b.i.a.c.s2;

import b.i.a.c.f3.ListenerSet;
import com.google.android.exoplayer2.PlaybackException;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlaybackException f1063b;

    public /* synthetic */ a(AnalyticsListener.a aVar, PlaybackException playbackException) {
        this.a = aVar;
        this.f1063b = playbackException;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).J();
    }
}
