package d0.e0.p.d;

import d0.e0.p.d.m0.c.n0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w {
    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    public static final d0.e0.p.d.l0.d access$computeCallerForAccessor(s.a aVar, boolean z2) {
        d.e setterSignature;
        Method setterMethod;
        d0.e0.p.d.l0.d aVar2;
        d0.e0.p.d.m0.f.a0.a.c setter;
        Method unboxMethod;
        if (i.l.getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection().matches(aVar.getProperty().getSignature())) {
            return d0.e0.p.d.l0.j.a;
        }
        t tVar = new t(aVar);
        v vVar = new v(aVar, z2, new u(aVar), tVar);
        e eVarMapPropertySignature = f0.f3198b.mapPropertySignature(aVar.getProperty().getDescriptor());
        if (eVarMapPropertySignature instanceof e.c) {
            e.c cVar = (e.c) eVarMapPropertySignature;
            d0.e0.p.d.m0.f.a0.a.d signature = cVar.getSignature();
            if (z2) {
                if (signature.hasGetter()) {
                    setter = signature.getGetter();
                } else {
                    setter = null;
                }
            } else if (signature.hasSetter()) {
                setter = signature.getSetter();
            } else {
                setter = null;
            }
            Method methodFindMethodBySignature = setter != null ? aVar.getProperty().getContainer().findMethodBySignature(cVar.getNameResolver().getString(setter.getName()), cVar.getNameResolver().getString(setter.getDesc())) : null;
            if (methodFindMethodBySignature == null) {
                if (d0.e0.p.d.m0.k.g.isUnderlyingPropertyOfInlineClass(aVar.getProperty().getDescriptor()) && d0.z.d.m.areEqual(aVar.getProperty().getDescriptor().getVisibility(), d0.e0.p.d.m0.c.t.d)) {
                    Class<?> inlineClass = d0.e0.p.d.l0.h.toInlineClass(aVar.getProperty().getDescriptor().getContainingDeclaration());
                    if (inlineClass == null || (unboxMethod = d0.e0.p.d.l0.h.getUnboxMethod(inlineClass, aVar.getProperty().getDescriptor())) == null) {
                        StringBuilder sbU = b.d.b.a.a.U("Underlying property of inline class ");
                        sbU.append(aVar.getProperty());
                        sbU.append(" should have a field");
                        throw new a0(sbU.toString());
                    }
                    aVar2 = aVar.isBound() ? new d0.e0.p.d.l0.i.a(unboxMethod, getBoundReceiver(aVar)) : new d0.e0.p.d.l0.i.b(unboxMethod);
                } else {
                    Field javaField = aVar.getProperty().getJavaField();
                    if (javaField == null) {
                        StringBuilder sbU2 = b.d.b.a.a.U("No accessors or field is found for property ");
                        sbU2.append(aVar.getProperty());
                        throw new a0(sbU2.toString());
                    }
                    aVar2 = vVar.invoke2(javaField);
                }
            } else if (!Modifier.isStatic(methodFindMethodBySignature.getModifiers())) {
                aVar2 = aVar.isBound() ? new d0.e0.p.d.l0.e.h.a(methodFindMethodBySignature, getBoundReceiver(aVar)) : new d0.e0.p.d.l0.e.h.d(methodFindMethodBySignature);
            } else if (tVar.invoke2()) {
                aVar2 = aVar.isBound() ? new d0.e0.p.d.l0.e.h.b(methodFindMethodBySignature) : new d0.e0.p.d.l0.e.h.C0505e(methodFindMethodBySignature);
            } else {
                aVar2 = aVar.isBound() ? new d0.e0.p.d.l0.e.h.c(methodFindMethodBySignature, getBoundReceiver(aVar)) : new d0.e0.p.d.l0.e.h.f(methodFindMethodBySignature);
            }
        } else if (eVarMapPropertySignature instanceof e.a) {
            aVar2 = vVar.invoke2(((e.a) eVarMapPropertySignature).getField());
        } else {
            if (!(eVarMapPropertySignature instanceof e.b)) {
                if (!(eVarMapPropertySignature instanceof e.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z2) {
                    setterSignature = ((e.d) eVarMapPropertySignature).getGetterSignature();
                } else {
                    setterSignature = ((e.d) eVarMapPropertySignature).getSetterSignature();
                    if (setterSignature == null) {
                        StringBuilder sbU3 = b.d.b.a.a.U("No setter found for property ");
                        sbU3.append(aVar.getProperty());
                        throw new a0(sbU3.toString());
                    }
                }
                Method methodFindMethodBySignature2 = aVar.getProperty().getContainer().findMethodBySignature(setterSignature.getMethodName(), setterSignature.getMethodDesc());
                if (methodFindMethodBySignature2 != null) {
                    Modifier.isStatic(methodFindMethodBySignature2.getModifiers());
                    return aVar.isBound() ? new d0.e0.p.d.l0.e.h.a(methodFindMethodBySignature2, getBoundReceiver(aVar)) : new d0.e0.p.d.l0.e.h.d(methodFindMethodBySignature2);
                }
                StringBuilder sbU4 = b.d.b.a.a.U("No accessor found for property ");
                sbU4.append(aVar.getProperty());
                throw new a0(sbU4.toString());
            }
            if (z2) {
                setterMethod = ((e.b) eVarMapPropertySignature).getGetterMethod();
            } else {
                e.b bVar = (e.b) eVarMapPropertySignature;
                setterMethod = bVar.getSetterMethod();
                if (setterMethod == null) {
                    StringBuilder sbU5 = b.d.b.a.a.U("No source found for setter of Java method property: ");
                    sbU5.append(bVar.getGetterMethod());
                    throw new a0(sbU5.toString());
                }
            }
            aVar2 = aVar.isBound() ? new d0.e0.p.d.l0.e.h.a(setterMethod, getBoundReceiver(aVar)) : new d0.e0.p.d.l0.e.h.d(setterMethod);
        }
        return d0.e0.p.d.l0.h.createInlineClassAwareCallerIfNeeded$default(aVar2, aVar.getDescriptor(), false, 2, null);
    }

    public static final boolean access$isJvmFieldPropertyInCompanionObject(n0 n0Var) {
        d0.e0.p.d.m0.c.m containingDeclaration = n0Var.getContainingDeclaration();
        d0.z.d.m.checkNotNullExpressionValue(containingDeclaration, "containingDeclaration");
        if (!d0.e0.p.d.m0.k.e.isCompanionObject(containingDeclaration)) {
            return false;
        }
        d0.e0.p.d.m0.c.m containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        return !(d0.e0.p.d.m0.k.e.isInterface(containingDeclaration2) || d0.e0.p.d.m0.k.e.isAnnotationClass(containingDeclaration2)) || ((n0Var instanceof d0.e0.p.d.m0.l.b.e0.j) && d0.e0.p.d.m0.f.a0.b.h.isMovedFromInterfaceCompanion(((d0.e0.p.d.m0.l.b.e0.j) n0Var).getProto()));
    }

    public static final Object getBoundReceiver(s.a<?, ?> aVar) {
        d0.z.d.m.checkNotNullParameter(aVar, "$this$boundReceiver");
        return aVar.getProperty().getBoundReceiver();
    }
}
