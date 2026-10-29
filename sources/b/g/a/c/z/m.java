package b.g.a.c.z;

import b.g.a.a.e$a;
import b.g.a.a.i$b;
import b.g.a.a.i$d;
import b.g.a.a.n$a;
import b.g.a.a.p$b;
import b.g.a.a.z$a;
import b.g.a.c.c0.d0;
import b.g.a.c.c0.g0;
import b.g.a.c.c0.g0$a;
import b.g.a.c.i0.p;
import b.g.a.c.t;
import b.g.a.c.z.e;
import b.g.a.c.z.m;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: MapperConfigBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m<CFG extends e, T extends m<CFG, T>> extends l<T> implements Serializable {
    public final i _attributes;
    public final g _configOverrides;
    public final d0 _mixIns;
    public final t _rootName;
    public final p _rootNames;
    public final b.g.a.c.e0.d _subtypeResolver;
    public final Class<?> _view;
    public static final int j = l.c(b.g.a.c.p.class);
    public static final int k = (((b.g.a.c.p.AUTO_DETECT_FIELDS.g() | b.g.a.c.p.AUTO_DETECT_GETTERS.g()) | b.g.a.c.p.AUTO_DETECT_IS_GETTERS.g()) | b.g.a.c.p.AUTO_DETECT_SETTERS.g()) | b.g.a.c.p.AUTO_DETECT_CREATORS.g();

    public m(a aVar, b.g.a.c.e0.d dVar, d0 d0Var, p pVar, g gVar) {
        super(aVar, j);
        this._mixIns = d0Var;
        this._subtypeResolver = dVar;
        this._rootNames = pVar;
        this._rootName = null;
        this._view = null;
        this._attributes = i$a.j;
        this._configOverrides = gVar;
    }

    @Override // b.g.a.c.c0.t$a
    public final Class<?> a(Class<?> cls) {
        return this._mixIns.a(cls);
    }

    @Override // b.g.a.c.z.l
    public final f f(Class<?> cls) {
        f fVarA = this._configOverrides.a(cls);
        return fVarA == null ? f$a.a : fVarA;
    }

    @Override // b.g.a.c.z.l
    public final p$b g(Class<?> cls, Class<?> cls2) {
        this._configOverrides.a(cls2);
        p$b p_bJ = j(cls);
        if (p_bJ == null) {
            return null;
        }
        return p_bJ.a(null);
    }

    @Override // b.g.a.c.z.l
    public Boolean h() {
        return this._configOverrides._defaultMergeable;
    }

    @Override // b.g.a.c.z.l
    public final i$d i(Class<?> cls) {
        g gVar = this._configOverrides;
        Map<Class<?>, ?> map = gVar._overrides;
        if (map != null) {
        }
        Boolean bool = gVar._defaultLeniency;
        if (bool == null) {
            return i$d.j;
        }
        return new i$d("", null, null, null, null, i$b.a, Boolean.valueOf(bool.booleanValue()));
    }

    @Override // b.g.a.c.z.l
    public final p$b j(Class<?> cls) {
        this._configOverrides.a(cls);
        p$b p_b = this._configOverrides._defaultInclusion;
        if (p_b == null) {
            return null;
        }
        return p_b.a(null);
    }

    @Override // b.g.a.c.z.l
    public final z$a l() {
        return this._configOverrides._defaultSetterInfo;
    }

    @Override // b.g.a.c.z.l
    public final g0<?> m(Class<?> cls, b.g.a.c.c0.c cVar) {
        e$a e_a = e$a.NONE;
        g0<?> g0Var = this._configOverrides._visibilityChecker;
        int i = this._mapperFeatures;
        int i2 = k;
        g0<?> g0_a = g0Var;
        if ((i & i2) != i2) {
            g0<?> g0_a2 = g0Var;
            if (!q(b.g.a.c.p.AUTO_DETECT_FIELDS)) {
                g0$a g0_a3 = (g0$a) g0Var;
                e$a e_a2 = g0_a3._fieldMinLevel;
                g0_a2 = g0_a3;
                if (e_a2 != e_a) {
                    g0_a2 = new g0$a(g0_a3._getterMinLevel, g0_a3._isGetterMinLevel, g0_a3._setterMinLevel, g0_a3._creatorMinLevel, e_a);
                }
            }
            g0<?> g0_a4 = g0_a2;
            if (!q(b.g.a.c.p.AUTO_DETECT_GETTERS)) {
                g0$a g0_a5 = (g0$a) g0_a2;
                e$a e_a3 = g0_a5._getterMinLevel;
                g0_a4 = g0_a5;
                if (e_a3 != e_a) {
                    g0_a4 = new g0$a(e_a, g0_a5._isGetterMinLevel, g0_a5._setterMinLevel, g0_a5._creatorMinLevel, g0_a5._fieldMinLevel);
                }
            }
            g0<?> g0_a6 = g0_a4;
            if (!q(b.g.a.c.p.AUTO_DETECT_IS_GETTERS)) {
                g0$a g0_a7 = (g0$a) g0_a4;
                e$a e_a4 = g0_a7._isGetterMinLevel;
                g0_a6 = g0_a7;
                if (e_a4 != e_a) {
                    g0_a6 = new g0$a(g0_a7._getterMinLevel, e_a, g0_a7._setterMinLevel, g0_a7._creatorMinLevel, g0_a7._fieldMinLevel);
                }
            }
            g0<?> g0_a8 = g0_a6;
            if (!q(b.g.a.c.p.AUTO_DETECT_SETTERS)) {
                g0$a g0_a9 = (g0$a) g0_a6;
                e$a e_a5 = g0_a9._setterMinLevel;
                g0_a8 = g0_a9;
                if (e_a5 != e_a) {
                    g0_a8 = new g0$a(g0_a9._getterMinLevel, g0_a9._isGetterMinLevel, e_a, g0_a9._creatorMinLevel, g0_a9._fieldMinLevel);
                }
            }
            g0_a = g0_a8;
            if (!q(b.g.a.c.p.AUTO_DETECT_CREATORS)) {
                g0$a g0_a10 = (g0$a) g0_a8;
                e$a e_a6 = g0_a10._creatorMinLevel;
                g0_a = g0_a10;
                if (e_a6 != e_a) {
                    g0_a = new g0$a(g0_a10._getterMinLevel, g0_a10._isGetterMinLevel, g0_a10._setterMinLevel, e_a, g0_a10._fieldMinLevel);
                }
            }
        }
        b.g.a.c.b bVarE = e();
        g0<?> g0VarB = g0_a;
        if (bVarE != null) {
            g0VarB = bVarE.b(cVar, g0_a);
        }
        if (this._configOverrides.a(cls) == null) {
            return g0VarB;
        }
        g0$a g0_a11 = (g0$a) g0VarB;
        Objects.requireNonNull(g0_a11);
        return g0_a11;
    }

    public abstract T r(int i);

    public final n$a s(Class<?> cls, b.g.a.c.c0.c cVar) {
        b.g.a.c.b bVarE = e();
        n$a n_aX = bVarE == null ? null : bVarE.x(this, cVar);
        this._configOverrides.a(cls);
        n$a n_a = n$a.j;
        if (n_aX == null) {
            return null;
        }
        return n_aX;
    }

    public final T t(b.g.a.c.p... pVarArr) {
        int i = this._mapperFeatures;
        for (b.g.a.c.p pVar : pVarArr) {
            i &= ~pVar.g();
        }
        return i == this._mapperFeatures ? this : (T) r(i);
    }

    public m(m<CFG, T> mVar, int i) {
        super(mVar, i);
        this._mixIns = mVar._mixIns;
        this._subtypeResolver = mVar._subtypeResolver;
        this._rootNames = mVar._rootNames;
        this._rootName = mVar._rootName;
        this._view = mVar._view;
        this._attributes = mVar._attributes;
        this._configOverrides = mVar._configOverrides;
    }
}
