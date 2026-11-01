package b.c.a.a0;

import android.graphics.PointF;
import java.io.IOException;

/* JADX INFO: compiled from: PointFParser.java */
/* JADX INFO: loaded from: classes.dex */
public class w implements h0<PointF> {
    public static final w a = new w();

    @Override // b.c.a.a0.h0
    public PointF a(b.c.a.a0.i0.c cVar, float f) throws IOException {
        b.c.a.a0.i0.c.b bVarU = cVar.u();
        if (bVarU == b.c.a.a0.i0.c.b.BEGIN_ARRAY) {
            return p.b(cVar, f);
        }
        if (bVarU == b.c.a.a0.i0.c.b.BEGIN_OBJECT) {
            return p.b(cVar, f);
        }
        if (bVarU == b.c.a.a0.i0.c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.n()) * f, ((float) cVar.n()) * f);
            while (cVar.e()) {
                cVar.C();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarU);
    }
}
