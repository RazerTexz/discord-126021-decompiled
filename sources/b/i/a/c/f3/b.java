package b.i.a.c.f3;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Handler.Callback {
    public final /* synthetic */ ListenerSet j;

    public /* synthetic */ b(ListenerSet listenerSet) {
        this.j = listenerSet;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ListenerSet listenerSet = this.j;
        Iterator it = listenerSet.d.iterator();
        while (it.hasNext()) {
            ListenerSet.c cVar = (ListenerSet.c) it.next();
            ListenerSet.b<T> bVar = listenerSet.c;
            if (!cVar.d && cVar.c) {
                FlagSet flagSetB = cVar.f974b.b();
                cVar.f974b = new FlagSet.b();
                cVar.c = false;
                bVar.a(cVar.a, flagSetB);
            }
            if (listenerSet.f973b.e(0)) {
                return true;
            }
        }
        return true;
    }
}
