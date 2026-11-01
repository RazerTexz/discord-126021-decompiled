package b.f.j.n;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.util.Pools;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: ArtDecoder.java */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public class a extends b {
    public a(b.f.j.l.d dVar, int i, Pools.SynchronizedPool synchronizedPool) {
        super(dVar, i, synchronizedPool);
    }

    @Override // b.f.j.n.b
    public int d(int i, int i2, BitmapFactory.Options options) {
        return b.f.k.a.c(i, i2, (Bitmap.Config) Preconditions.checkNotNull(options.inPreferredConfig));
    }
}
