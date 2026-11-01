package s.a.c2;

import com.discord.widgets.chat.input.MentionUtilsKt;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
public class t<E> extends r {
    public final E m;
    public final CancellableContinuation<Unit> n;

    /* JADX WARN: Multi-variable type inference failed */
    public t(E e, CancellableContinuation<? super Unit> cancellableContinuation) {
        this.m = e;
        this.n = cancellableContinuation;
    }

    @Override // s.a.c2.r
    public void q() {
        this.n.r(s.a.m.a);
    }

    @Override // s.a.c2.r
    public E r() {
        return this.m;
    }

    @Override // s.a.c2.r
    public void s(i<?> iVar) {
        CancellableContinuation<Unit> cancellableContinuation = this.n;
        Throwable thW = iVar.w();
        d0.k.a aVar = d0.k.j;
        cancellableContinuation.resumeWith(d0.k.m97constructorimpl(d0.l.createFailure(thW)));
    }

    @Override // s.a.c2.r
    public s.a.a.t t(s.a.a.k.b bVar) {
        if (this.n.c(Unit.a, null) != null) {
            return s.a.m.a;
        }
        return null;
    }

    @Override // s.a.a.k
    public String toString() {
        return getClass().getSimpleName() + MentionUtilsKt.MENTIONS_CHAR + b.i.a.f.e.o.f.l0(this) + '(' + this.m + ')';
    }
}
