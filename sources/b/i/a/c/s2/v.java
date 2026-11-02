package b.i.a.c.s2;

import b.i.a.c.f3.ListenerSet;
import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Metadata f1106b;

    public /* synthetic */ v(AnalyticsListener.a aVar, Metadata metadata) {
        this.a = aVar;
        this.f1106b = metadata;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).f0();
    }
}
