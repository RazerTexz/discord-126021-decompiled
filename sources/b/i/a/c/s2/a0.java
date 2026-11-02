package b.i.a.c.s2;

import b.i.a.c.Player2;
import b.i.a.c.f3.ListenerSet;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements ListenerSet.a {
    public final /* synthetic */ AnalyticsListener.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Player2.b f1064b;

    public /* synthetic */ a0(AnalyticsListener.a aVar, Player2.b bVar) {
        this.a = aVar;
        this.f1064b = bVar;
    }

    @Override // b.i.a.c.f3.ListenerSet.a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).P();
    }
}
