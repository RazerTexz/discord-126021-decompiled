package b.i.a.c.s2;

import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    public /* synthetic */ u(AnalyticsListener.a aVar) {
        this.a = aVar;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).a();
    }
}
