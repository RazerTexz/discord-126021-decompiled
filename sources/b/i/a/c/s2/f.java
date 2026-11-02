package b.i.a.c.s2;

import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1076b;

    public /* synthetic */ f(AnalyticsListener.a aVar, String str) {
        this.a = aVar;
        this.f1076b = str;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).N();
    }
}
