package b.i.a.c.s2;

import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1112b;
    public final /* synthetic */ long c;

    public /* synthetic */ z(AnalyticsListener.a aVar, int i, long j) {
        this.a = aVar;
        this.f1112b = i;
        this.c = j;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).f();
    }
}
