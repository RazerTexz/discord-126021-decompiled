package b.i.a.c.s2;

import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1071b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ d(AnalyticsListener.a aVar, String str, long j, long j2) {
        this.a = aVar;
        this.f1071b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.i0();
        analyticsListener.M();
        analyticsListener.T();
    }
}
