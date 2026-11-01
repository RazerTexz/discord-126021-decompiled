package d0.e0.p.d.m0.e.a;

import d0.e0.p.d.m0.c.c1;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements d0.e0.p.d.m0.k.f {
    public static final a a = new a(null);

    /* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final d0.e0.p.d.m0.e.b.k a(d0.e0.p.d.m0.c.x xVar, c1 c1Var) {
            if (!d0.e0.p.d.m0.e.b.u.forceSingleValueParameterBoxing(xVar)) {
                boolean z2 = false;
                if (xVar.getValueParameters().size() == 1) {
                    d0.e0.p.d.m0.c.m containingDeclaration = xVar.getContainingDeclaration();
                    d0.e0.p.d.m0.c.e eVar = containingDeclaration instanceof d0.e0.p.d.m0.c.e ? (d0.e0.p.d.m0.c.e) containingDeclaration : null;
                    if (eVar != null) {
                        List<c1> valueParameters = xVar.getValueParameters();
                        d0.z.d.m.checkNotNullExpressionValue(valueParameters, "f.valueParameters");
                        d0.e0.p.d.m0.c.h declarationDescriptor = ((c1) d0.t.u.single((List) valueParameters)).getType().getConstructor().getDeclarationDescriptor();
                        d0.e0.p.d.m0.c.e eVar2 = declarationDescriptor instanceof d0.e0.p.d.m0.c.e ? (d0.e0.p.d.m0.c.e) declarationDescriptor : null;
                        if (eVar2 != null) {
                            z2 = d0.e0.p.d.m0.b.h.isPrimitiveClass(eVar) && d0.z.d.m.areEqual(d0.e0.p.d.m0.k.x.a.getFqNameSafe(eVar), d0.e0.p.d.m0.k.x.a.getFqNameSafe(eVar2));
                        }
                    }
                }
                if (!z2) {
                    d0.e0.p.d.m0.n.c0 type = c1Var.getType();
                    d0.z.d.m.checkNotNullExpressionValue(type, "valueParameterDescriptor.type");
                    return d0.e0.p.d.m0.e.b.u.mapToJvmType(type);
                }
            }
            d0.e0.p.d.m0.n.c0 type2 = c1Var.getType();
            d0.z.d.m.checkNotNullExpressionValue(type2, "valueParameterDescriptor.type");
            return d0.e0.p.d.m0.e.b.u.mapToJvmType(d0.e0.p.d.m0.n.o1.a.makeNullable(type2));
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(d0.e0.p.d.m0.c.a aVar, d0.e0.p.d.m0.c.a aVar2) {
            d0.z.d.m.checkNotNullParameter(aVar, "superDescriptor");
            d0.z.d.m.checkNotNullParameter(aVar2, "subDescriptor");
            if ((aVar2 instanceof d0.e0.p.d.m0.e.a.h0.f) && (aVar instanceof d0.e0.p.d.m0.c.x)) {
                d0.e0.p.d.m0.e.a.h0.f fVar = (d0.e0.p.d.m0.e.a.h0.f) aVar2;
                fVar.getValueParameters().size();
                d0.e0.p.d.m0.c.x xVar = (d0.e0.p.d.m0.c.x) aVar;
                xVar.getValueParameters().size();
                List<c1> valueParameters = fVar.getOriginal().getValueParameters();
                d0.z.d.m.checkNotNullExpressionValue(valueParameters, "subDescriptor.original.valueParameters");
                List<c1> valueParameters2 = xVar.getOriginal().getValueParameters();
                d0.z.d.m.checkNotNullExpressionValue(valueParameters2, "superDescriptor.original.valueParameters");
                for (Pair pair : d0.t.u.zip(valueParameters, valueParameters2)) {
                    c1 c1Var = (c1) pair.component1();
                    c1 c1Var2 = (c1) pair.component2();
                    d0.z.d.m.checkNotNullExpressionValue(c1Var, "subParameter");
                    boolean z2 = a((d0.e0.p.d.m0.c.x) aVar2, c1Var) instanceof d0.e0.p.d.m0.e.b.k.d;
                    d0.z.d.m.checkNotNullExpressionValue(c1Var2, "superParameter");
                    if (z2 != (a(xVar, c1Var2) instanceof d0.e0.p.d.m0.e.b.k.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // d0.e0.p.d.m0.k.f
    public d0.e0.p.d.m0.k.f.a getContract() {
        return d0.e0.p.d.m0.k.f.a.CONFLICTS_ONLY;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[ADDED_TO_REGION] */
    @Override // d0.e0.p.d.m0.k.f
    public d0.e0.p.d.m0.k.f.b isOverridable(d0.e0.p.d.m0.c.a aVar, d0.e0.p.d.m0.c.a aVar2, d0.e0.p.d.m0.c.e eVar) {
        d0.e0.p.d.m0.c.b overriddenSpecialBuiltin;
        Boolean boolValueOf;
        boolean z2;
        d0.e0.p.d.m0.c.x xVar;
        Boolean boolValueOf2;
        d0.e0.p.d.m0.k.f.b bVar = d0.e0.p.d.m0.k.f.b.INCOMPATIBLE;
        d0.z.d.m.checkNotNullParameter(aVar, "superDescriptor");
        d0.z.d.m.checkNotNullParameter(aVar2, "subDescriptor");
        boolean z3 = false;
        if ((aVar instanceof d0.e0.p.d.m0.c.b) && (aVar2 instanceof d0.e0.p.d.m0.c.x) && !d0.e0.p.d.m0.b.h.isBuiltIn(aVar2)) {
            h hVar = h.m;
            d0.e0.p.d.m0.c.x xVar2 = (d0.e0.p.d.m0.c.x) aVar2;
            d0.e0.p.d.m0.g.e name = xVar2.getName();
            d0.z.d.m.checkNotNullExpressionValue(name, "subDescriptor.name");
            if (hVar.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
                overriddenSpecialBuiltin = d0.getOverriddenSpecialBuiltin((d0.e0.p.d.m0.c.b) aVar);
                boolValueOf = Boolean.valueOf(xVar2.isHiddenToOvercomeSignatureClash());
                z2 = aVar instanceof d0.e0.p.d.m0.c.x;
                if (z2) {
                    xVar = (d0.e0.p.d.m0.c.x) aVar;
                } else {
                    xVar = null;
                }
                if (xVar == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(xVar.isHiddenToOvercomeSignatureClash());
                }
                if (!(!d0.z.d.m.areEqual(boolValueOf, boolValueOf2))) {
                    if (eVar instanceof d0.e0.p.d.m0.e.a.h0.d) {
                        if (overriddenSpecialBuiltin instanceof d0.e0.p.d.m0.c.x) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                    }
                } else if (eVar instanceof d0.e0.p.d.m0.e.a.h0.d) {
                    if (overriddenSpecialBuiltin instanceof d0.e0.p.d.m0.c.x) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                }
            } else {
                g gVar = g.m;
                d0.e0.p.d.m0.g.e name2 = xVar2.getName();
                d0.z.d.m.checkNotNullExpressionValue(name2, "subDescriptor.name");
                if (gVar.getSameAsRenamedInJvmBuiltin(name2)) {
                    overriddenSpecialBuiltin = d0.getOverriddenSpecialBuiltin((d0.e0.p.d.m0.c.b) aVar);
                    boolValueOf = Boolean.valueOf(xVar2.isHiddenToOvercomeSignatureClash());
                    z2 = aVar instanceof d0.e0.p.d.m0.c.x;
                    if (z2) {
                        xVar = (d0.e0.p.d.m0.c.x) aVar;
                    } else {
                        xVar = null;
                    }
                    if (xVar == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(xVar.isHiddenToOvercomeSignatureClash());
                    }
                    if (!(!d0.z.d.m.areEqual(boolValueOf, boolValueOf2)) && (overriddenSpecialBuiltin == null || !xVar2.isHiddenToOvercomeSignatureClash())) {
                        z3 = true;
                    } else if ((eVar instanceof d0.e0.p.d.m0.e.a.h0.d) && xVar2.getInitialSignatureDescriptor() == null && overriddenSpecialBuiltin != null && !d0.hasRealKotlinSuperClassWithOverrideOf(eVar, overriddenSpecialBuiltin)) {
                        if ((overriddenSpecialBuiltin instanceof d0.e0.p.d.m0.c.x) || !z2 || h.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((d0.e0.p.d.m0.c.x) overriddenSpecialBuiltin) == null) {
                            z3 = true;
                        } else {
                            String strComputeJvmDescriptor$default = d0.e0.p.d.m0.e.b.u.computeJvmDescriptor$default(xVar2, false, false, 2, null);
                            d0.e0.p.d.m0.c.x original = ((d0.e0.p.d.m0.c.x) aVar).getOriginal();
                            d0.z.d.m.checkNotNullExpressionValue(original, "superDescriptor.original");
                            if (!d0.z.d.m.areEqual(strComputeJvmDescriptor$default, d0.e0.p.d.m0.e.b.u.computeJvmDescriptor$default(original, false, false, 2, null))) {
                                z3 = true;
                            }
                        }
                    }
                }
            }
        }
        return (z3 || a.doesJavaOverrideHaveIncompatibleValueParameterKinds(aVar, aVar2)) ? bVar : d0.e0.p.d.m0.k.f.b.UNKNOWN;
    }
}
