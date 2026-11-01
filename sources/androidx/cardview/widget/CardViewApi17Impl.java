package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(17)
public class CardViewApi17Impl extends CardViewBaseImpl {

    /* JADX INFO: renamed from: androidx.cardview.widget.CardViewApi17Impl$1, reason: invalid class name */
    public class AnonymousClass1 implements RoundRectDrawableWithShadow.RoundRectHelper {
        public AnonymousClass1() {
        }

        @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
        public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // androidx.cardview.widget.CardViewBaseImpl, androidx.cardview.widget.CardViewImpl
    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new AnonymousClass1();
    }
}
