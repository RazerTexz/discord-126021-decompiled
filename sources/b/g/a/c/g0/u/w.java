package b.g.a.c.g0.u;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.math.BigDecimal;

/* JADX INFO: compiled from: NumberSerializers.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w<T> extends p0<T> implements b.g.a.c.g0.i {
    public final boolean _isInt;
    public final b.g.a.b.f.b _numberType;
    public final String _schemaType;

    public w(Class<?> cls, b.g.a.b.f.b bVar, String str) {
        super(cls, false);
        this._numberType = bVar;
        this._schemaType = str;
        this._isInt = bVar == b.g.a.b.f.b.INT || bVar == b.g.a.b.f.b.LONG || bVar == b.g.a.b.f.b.BIG_INTEGER;
    }

    @Override // b.g.a.c.g0.i
    public b.g.a.c.n<?> a(b.g.a.c.x xVar, b.g.a.c.d dVar) throws JsonMappingException {
        b.g.a.a.i.d dVarL = l(xVar, dVar, this._handledType);
        if (dVarL == null || dVarL.e().ordinal() != 8) {
            return this;
        }
        if (this._handledType != BigDecimal.class) {
            return t0.k;
        }
        v vVar = v.k;
        return v.a.k;
    }
}
