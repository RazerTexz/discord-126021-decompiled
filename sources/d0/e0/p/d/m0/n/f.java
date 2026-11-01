package d0.e0.p.d.m0.n;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements d0.e0.p.d.m0.n.n1.n {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3523b;
    public ArrayDeque<d0.e0.p.d.m0.n.n1.i> c;
    public Set<d0.e0.p.d.m0.n.n1.i> d;

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public enum a {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            a[] aVarArr = new a[aVarArrValuesCustom.length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, aVarArrValuesCustom.length);
            return aVarArr;
        }
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public abstract class b {

        /* JADX INFO: renamed from: d0.e0.p.d.m0.n.f$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public final class C0579b extends b {
            public static final C0579b a = new C0579b();

            public C0579b() {
                super(null);
            }

            @Override // d0.e0.p.d.m0.n.f.b
            public d0.e0.p.d.m0.n.n1.i transformType(f fVar, d0.e0.p.d.m0.n.n1.h hVar) {
                d0.z.d.m.checkNotNullParameter(fVar, "context");
                d0.z.d.m.checkNotNullParameter(hVar, "type");
                return fVar.lowerBoundIfFlexible(hVar);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public abstract class a extends b {
            public a() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public final class c extends b {
            public static final c a = new c();

            public c() {
                super(null);
            }

            @Override // d0.e0.p.d.m0.n.f.b
            public /* bridge */ /* synthetic */ d0.e0.p.d.m0.n.n1.i transformType(f fVar, d0.e0.p.d.m0.n.n1.h hVar) {
                return (d0.e0.p.d.m0.n.n1.i) m95transformType(fVar, hVar);
            }

            /* JADX INFO: renamed from: transformType, reason: collision with other method in class */
            public Void m95transformType(f fVar, d0.e0.p.d.m0.n.n1.h hVar) {
                d0.z.d.m.checkNotNullParameter(fVar, "context");
                d0.z.d.m.checkNotNullParameter(hVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: compiled from: AbstractTypeChecker.kt */
        public final class d extends b {
            public static final d a = new d();

            public d() {
                super(null);
            }

            @Override // d0.e0.p.d.m0.n.f.b
            public d0.e0.p.d.m0.n.n1.i transformType(f fVar, d0.e0.p.d.m0.n.n1.h hVar) {
                d0.z.d.m.checkNotNullParameter(fVar, "context");
                d0.z.d.m.checkNotNullParameter(hVar, "type");
                return fVar.upperBoundIfFlexible(hVar);
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public abstract d0.e0.p.d.m0.n.n1.i transformType(f fVar, d0.e0.p.d.m0.n.n1.h hVar);
    }

    public static final /* synthetic */ int access$getArgumentsDepth(f fVar) {
        return fVar.a;
    }

    public static final /* synthetic */ void access$setArgumentsDepth(f fVar, int i) {
        fVar.a = i;
    }

    public static /* synthetic */ Boolean addSubtypeConstraint$default(f fVar, d0.e0.p.d.m0.n.n1.h hVar, d0.e0.p.d.m0.n.n1.h hVar2, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return fVar.addSubtypeConstraint(hVar, hVar2, z2);
    }

    public Boolean addSubtypeConstraint(d0.e0.p.d.m0.n.n1.h hVar, d0.e0.p.d.m0.n.n1.h hVar2, boolean z2) {
        d0.z.d.m.checkNotNullParameter(hVar, "subType");
        d0.z.d.m.checkNotNullParameter(hVar2, "superType");
        return null;
    }

    public final void clear() {
        ArrayDeque<d0.e0.p.d.m0.n.n1.i> arrayDeque = this.c;
        d0.z.d.m.checkNotNull(arrayDeque);
        arrayDeque.clear();
        Set<d0.e0.p.d.m0.n.n1.i> set = this.d;
        d0.z.d.m.checkNotNull(set);
        set.clear();
        this.f3523b = false;
    }

    public boolean customIsSubtypeOf(d0.e0.p.d.m0.n.n1.h hVar, d0.e0.p.d.m0.n.n1.h hVar2) {
        d0.z.d.m.checkNotNullParameter(hVar, "subType");
        d0.z.d.m.checkNotNullParameter(hVar2, "superType");
        return true;
    }

    public List<d0.e0.p.d.m0.n.n1.i> fastCorrespondingSupertypes(d0.e0.p.d.m0.n.n1.i iVar, d0.e0.p.d.m0.n.n1.l lVar) {
        return d0.e0.p.d.m0.n.n1.n.a.fastCorrespondingSupertypes(this, iVar, lVar);
    }

    public d0.e0.p.d.m0.n.n1.k get(d0.e0.p.d.m0.n.n1.j jVar, int i) {
        return d0.e0.p.d.m0.n.n1.n.a.get(this, jVar, i);
    }

    public d0.e0.p.d.m0.n.n1.k getArgumentOrNull(d0.e0.p.d.m0.n.n1.i iVar, int i) {
        return d0.e0.p.d.m0.n.n1.n.a.getArgumentOrNull(this, iVar, i);
    }

    public a getLowerCapturedTypePolicy(d0.e0.p.d.m0.n.n1.i iVar, d0.e0.p.d.m0.n.n1.c cVar) {
        d0.z.d.m.checkNotNullParameter(iVar, "subType");
        d0.z.d.m.checkNotNullParameter(cVar, "superType");
        return a.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<d0.e0.p.d.m0.n.n1.i> getSupertypesDeque() {
        return this.c;
    }

    public final Set<d0.e0.p.d.m0.n.n1.i> getSupertypesSet() {
        return this.d;
    }

    public boolean hasFlexibleNullability(d0.e0.p.d.m0.n.n1.h hVar) {
        return d0.e0.p.d.m0.n.n1.n.a.hasFlexibleNullability(this, hVar);
    }

    public final void initialize() {
        this.f3523b = true;
        if (this.c == null) {
            this.c = new ArrayDeque<>(4);
        }
        if (this.d == null) {
            this.d = d0.e0.p.d.m0.p.j.j.create();
        }
    }

    public boolean isClassType(d0.e0.p.d.m0.n.n1.i iVar) {
        return d0.e0.p.d.m0.n.n1.n.a.isClassType(this, iVar);
    }

    public boolean isDefinitelyNotNullType(d0.e0.p.d.m0.n.n1.h hVar) {
        return d0.e0.p.d.m0.n.n1.n.a.isDefinitelyNotNullType(this, hVar);
    }

    public boolean isDynamic(d0.e0.p.d.m0.n.n1.h hVar) {
        return d0.e0.p.d.m0.n.n1.n.a.isDynamic(this, hVar);
    }

    public abstract boolean isErrorTypeEqualsToAnything();

    public boolean isIntegerLiteralType(d0.e0.p.d.m0.n.n1.i iVar) {
        return d0.e0.p.d.m0.n.n1.n.a.isIntegerLiteralType(this, iVar);
    }

    @Override // d0.e0.p.d.m0.n.n1.n
    public boolean isMarkedNullable(d0.e0.p.d.m0.n.n1.h hVar) {
        return d0.e0.p.d.m0.n.n1.n.a.isMarkedNullable(this, hVar);
    }

    public boolean isNothing(d0.e0.p.d.m0.n.n1.h hVar) {
        return d0.e0.p.d.m0.n.n1.n.a.isNothing(this, hVar);
    }

    public abstract boolean isStubTypeEqualsToAnything();

    @Override // d0.e0.p.d.m0.n.n1.n
    public d0.e0.p.d.m0.n.n1.i lowerBoundIfFlexible(d0.e0.p.d.m0.n.n1.h hVar) {
        return d0.e0.p.d.m0.n.n1.n.a.lowerBoundIfFlexible(this, hVar);
    }

    public abstract d0.e0.p.d.m0.n.n1.h prepareType(d0.e0.p.d.m0.n.n1.h hVar);

    public abstract d0.e0.p.d.m0.n.n1.h refineType(d0.e0.p.d.m0.n.n1.h hVar);

    public int size(d0.e0.p.d.m0.n.n1.j jVar) {
        return d0.e0.p.d.m0.n.n1.n.a.size(this, jVar);
    }

    public abstract b substitutionSupertypePolicy(d0.e0.p.d.m0.n.n1.i iVar);

    @Override // d0.e0.p.d.m0.n.n1.n
    public d0.e0.p.d.m0.n.n1.l typeConstructor(d0.e0.p.d.m0.n.n1.h hVar) {
        return d0.e0.p.d.m0.n.n1.n.a.typeConstructor(this, hVar);
    }

    @Override // d0.e0.p.d.m0.n.n1.n
    public d0.e0.p.d.m0.n.n1.i upperBoundIfFlexible(d0.e0.p.d.m0.n.n1.h hVar) {
        return d0.e0.p.d.m0.n.n1.n.a.upperBoundIfFlexible(this, hVar);
    }
}
