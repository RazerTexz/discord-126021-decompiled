package b.i.a.c.s2;

import b.i.a.c.a3.LoadEventInfo;
import b.i.a.c.a3.MediaLoadData;
import b.i.a.c.f3.ListenerSet;
import java.io.IOException;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f1077b;
    public final /* synthetic */ MediaLoadData c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ f0(AnalyticsListener.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
        this.a = aVar;
        this.f1077b = loadEventInfo;
        this.c = mediaLoadData;
        this.d = iOException;
        this.e = z2;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).u();
    }
}
