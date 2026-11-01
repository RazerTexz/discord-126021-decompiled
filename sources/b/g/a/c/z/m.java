package b.g.a.c.z;

import b.g.a.a.z;
import b.g.a.c.c0.d0;
import b.g.a.c.c0.g0;
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
        this._attributes = i.a.j;
        this._configOverrides = gVar;
    }

    @Override // b.g.a.c.c0.t.a
    public final Class<?> a(Class<?> cls) {
        return this._mixIns.a(cls);
    }

    @Override // b.g.a.c.z.l
    public final f f(Class<?> cls) {
        f fVarA = this._configOverrides.a(cls);
        return fVarA == null ? f.a.a : fVarA;
    }

    @Override // b.g.a.c.z.l
    public final b.g.a.a.p.b g(Class<?> cls, Class<?> cls2) {
        this._configOverrides.a(cls2);
        b.g.a.a.p.b bVarJ = j(cls);
        if (bVarJ == null) {
            return null;
        }
        return bVarJ.a(null);
    }

    @Override // b.g.a.c.z.l
    public Boolean h() {
        return this._configOverrides._defaultMergeable;
    }

    @Override // b.g.a.c.z.l
    public final b.g.a.a.i.d i(Class<?> cls) {
        g gVar = this._configOverrides;
        Map<Class<?>, ?> map = gVar._overrides;
        if (map != null) {
        }
        Boolean bool = gVar._defaultLeniency;
        if (bool == null) {
            return b.g.a.a.i.d.j;
        }
        return new b.g.a.a.i.d("", null, null, null, null, b.g.a.a.i.b.a, Boolean.valueOf(bool.booleanValue()));
    }

    @Override // b.g.a.c.z.l
    public final b.g.a.a.p.b j(Class<?> cls) {
        this._configOverrides.a(cls);
        b.g.a.a.p.b bVar = this._configOverrides._defaultInclusion;
        if (bVar == null) {
            return null;
        }
        return bVar.a(null);
    }

    @Override // b.g.a.c.z.l
    public final z.a l() {
        return this._configOverrides._defaultSetterInfo;
    }

    @Override // b.g.a.c.z.l
    public final g0<?> m(Class<?> cls, b.g.a.c.c0.c cVar) {
        b.g.a.a.e.a aVar = b.g.a.a.e.a.NONE;
        g0<?> g0Var = this._configOverrides._visibilityChecker;
        int i = this._mapperFeatures;
        int i2 = k;
        g0<?> aVar2 = g0Var;
        if ((i & i2) != i2) {
            g0<?> aVar3 = g0Var;
            if (!q(b.g.a.c.p.AUTO_DETECT_FIELDS)) {
                g0.a aVar4 = (g0.a) g0Var;
                b.g.a.a.e.a aVar5 = aVar4._fieldMinLevel;
                aVar3 = aVar4;
                if (aVar5 != aVar) {
                    aVar3 = new g0.a(aVar4._getterMinLevel, aVar4._isGetterMinLevel, aVar4._setterMinLevel, aVar4._creatorMinLevel, aVar);
                }
            }
            g0<?> aVar6 = aVar3;
            if (!q(b.g.a.c.p.AUTO_DETECT_GETTERS)) {
                g0.a aVar7 = (g0.a) aVar3;
                b.g.a.a.e.a aVar8 = aVar7._getterMinLevel;
                aVar6 = aVar7;
                if (aVar8 != aVar) {
                    aVar6 = new g0.a(aVar, aVar7._isGetterMinLevel, aVar7._setterMinLevel, aVar7._creatorMinLevel, aVar7._fieldMinLevel);
                }
            }
            g0<?> aVar9 = aVar6;
            if (!q(b.g.a.c.p.AUTO_DETECT_IS_GETTERS)) {
                g0.a aVar10 = (g0.a) aVar6;
                b.g.a.a.e.a aVar11 = aVar10._isGetterMinLevel;
                aVar9 = aVar10;
                if (aVar11 != aVar) {
                    aVar9 = new g0.a(aVar10._getterMinLevel, aVar, aVar10._setterMinLevel, aVar10._creatorMinLevel, aVar10._fieldMinLevel);
                }
            }
            g0<?> aVar12 = aVar9;
            if (!q(b.g.a.c.p.AUTO_DETECT_SETTERS)) {
                g0.a aVar13 = (g0.a) aVar9;
                b.g.a.a.e.a aVar14 = aVar13._setterMinLevel;
                aVar12 = aVar13;
                if (aVar14 != aVar) {
                    aVar12 = new g0.a(aVar13._getterMinLevel, aVar13._isGetterMinLevel, aVar, aVar13._creatorMinLevel, aVar13._fieldMinLevel);
                }
            }
            aVar2 = aVar12;
            if (!q(b.g.a.c.p.AUTO_DETECT_CREATORS)) {
                g0.a aVar15 = (g0.a) aVar12;
                b.g.a.a.e.a aVar16 = aVar15._creatorMinLevel;
                aVar2 = aVar15;
                if (aVar16 != aVar) {
                    aVar2 = new g0.a(aVar15._getterMinLevel, aVar15._isGetterMinLevel, aVar15._setterMinLevel, aVar, aVar15._fieldMinLevel);
                }
            }
        }
        b.g.a.c.b bVarE = e();
        g0<?> g0VarB = aVar2;
        if (bVarE != null) {
            g0VarB = bVarE.b(cVar, aVar2);
        }
        if (this._configOverrides.a(cls) == null) {
            return g0VarB;
        }
        g0.a aVar17 = (g0.a) g0VarB;
        Objects.requireNonNull(aVar17);
        return aVar17;
    }

    public abstract T r(int i);

    public final b.g.a.a.n.a s(Class<?> cls, b.g.a.c.c0.c cVar) {
        b.g.a.c.b bVarE = e();
        b.g.a.a.n.a aVarX = bVarE == null ? null : bVarE.x(this, cVar);
        this._configOverrides.a(cls);
        b.g.a.a.n.a aVar = b.g.a.a.n.a.j;
        if (aVarX == null) {
            return null;
        }
        return aVarX;
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
