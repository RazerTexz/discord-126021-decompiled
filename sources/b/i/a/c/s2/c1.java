package b.i.a.c.s2;

import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c1 implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1070b;
    public final /* synthetic */ int c;

    public /* synthetic */ c1(AnalyticsListener.a aVar, long j, int i) {
        this.a = aVar;
        this.f1070b = j;
        this.c = i;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).a0();
    }
}
