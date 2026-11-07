package b.i.a.c.d3;

import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import b.i.b.a.Predicate3;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Predicate3 {
    public static final /* synthetic */ h a = new h();

    @Override // b.i.b.a.Predicate3
    public final boolean apply(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }
}
