package b.f.j.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import b.f.j.a.a.e;
import com.facebook.common.references.CloseableReference;

/* JADX INFO: compiled from: AnimatedImageCompositor.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    public final b.f.j.a.a.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f551b;
    public final Paint c;

    /* JADX INFO: compiled from: AnimatedImageCompositor.java */
    public interface a {
        void a(int i, Bitmap bitmap);

        CloseableReference<Bitmap> b(int i);
    }

    public d(b.f.j.a.a.a aVar, a aVar2) {
        this.a = aVar;
        this.f551b = aVar2;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final void a(Canvas canvas, b.f.j.a.a.b bVar) {
        int i = bVar.a;
        int i2 = bVar.f543b;
        canvas.drawRect(i, i2, i + bVar.c, i2 + bVar.d, this.c);
    }

    public final boolean b(b.f.j.a.a.b bVar) {
        return bVar.a == 0 && bVar.f543b == 0 && bVar.c == ((b.f.j.a.c.a) this.a).d.width() && bVar.d == ((b.f.j.a.c.a) this.a).d.height();
    }

    public final boolean c(int i) {
        if (i == 0) {
            return true;
        }
        b.f.j.a.a.b[] bVarArr = ((b.f.j.a.c.a) this.a).f;
        b.f.j.a.a.b bVar = bVarArr[i];
        b.f.j.a.a.b bVar2 = bVarArr[i - 1];
        if (bVar.e == 2 && b(bVar)) {
            return true;
        }
        return bVar2.f == 2 && b(bVar2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    public void d(int i, Bitmap bitmap) {
        b.f.j.t.a aVar;
        int i2;
        Canvas canvas = new Canvas(bitmap);
        int i3 = 0;
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (c(i)) {
            i3 = i;
        } else {
            for (int i4 = i - 1; i4 >= 0; i4--) {
                b.f.j.a.a.b bVar = ((b.f.j.a.c.a) this.a).f[i4];
                int i5 = bVar.f;
                if (i5 == 1) {
                    i2 = 1;
                } else if (i5 != 2) {
                    i2 = i5 == 3 ? 3 : 4;
                } else if (b(bVar)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int iH = b.c.a.y.b.h(i2);
                if (iH == 0) {
                    b.f.j.a.a.b bVar2 = ((b.f.j.a.c.a) this.a).f[i4];
                    CloseableReference<Bitmap> closeableReferenceB = this.f551b.b(i4);
                    if (closeableReferenceB != null) {
                        try {
                            canvas.drawBitmap(closeableReferenceB.u(), 0.0f, 0.0f, (Paint) null);
                            if (bVar2.f == 2) {
                                a(canvas, bVar2);
                            }
                            i3 = i4 + 1;
                            closeableReferenceB.close();
                            break;
                        } catch (Throwable th) {
                            closeableReferenceB.close();
                            throw th;
                        }
                    }
                    if (c(i4)) {
                        i3 = i4;
                        break;
                    }
                } else if (iH == 1) {
                    i3 = i4 + 1;
                    break;
                } else {
                    if (iH == 3) {
                        i3 = i4;
                        break;
                    }
                }
            }
        }
        while (i3 < i) {
            b.f.j.a.a.b bVar3 = ((b.f.j.a.c.a) this.a).f[i3];
            int i6 = bVar3.f;
            if (i6 != 3) {
                if (bVar3.e == 2) {
                    a(canvas, bVar3);
                }
                ((b.f.j.a.c.a) this.a).d(i3, canvas);
                this.f551b.a(i3, bitmap);
                if (i6 == 2) {
                    a(canvas, bVar3);
                }
            }
            i3++;
        }
        b.f.j.a.a.b bVar4 = ((b.f.j.a.c.a) this.a).f[i];
        if (bVar4.e == 2) {
            a(canvas, bVar4);
        }
        ((b.f.j.a.c.a) this.a).d(i, canvas);
        e eVar = ((b.f.j.a.c.a) this.a).f548b;
        if (eVar == null || (aVar = eVar.d) == null) {
            return;
        }
        aVar.a(bitmap);
    }
}
