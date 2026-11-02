package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import b.i.a.b.TransportFactory;
import b.i.a.b.i.CCTDestination;
import b.i.a.b.j.TransportRuntime;
import b.i.c.l.Component4;
import b.i.c.l.ComponentContainer;
import b.i.c.l.ComponentRegistrar;
import b.i.c.l.Dependency2;
import b.i.c.n.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-datatransport@@17.0.3 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    @Override // b.i.c.l.ComponentRegistrar
    public List<Component4<?>> getComponents() {
        Component4.b bVarA = Component4.a(TransportFactory.class);
        bVarA.a(new Dependency2(Context.class, 1, 0));
        bVarA.c(a.a);
        return Collections.singletonList(bVarA.b());
    }

    public static /* synthetic */ TransportFactory lambda$getComponents$0(ComponentContainer componentContainer) {
        TransportRuntime.b((Context) componentContainer.a(Context.class));
        return TransportRuntime.a().c(CCTDestination.e);
    }
}
