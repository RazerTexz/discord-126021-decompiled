package com.google.gson.internal.bind;

import b.i.d.a;
import b.i.d.d;
import b.i.d.o;
import b.i.d.p.c;
import b.i.d.q.g;
import b.i.d.q.y.b;
import com.google.gson.internal.Excluder;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements o {
    public final g j;
    public final d k;
    public final Excluder l;
    public final JsonAdapterAnnotationTypeAdapterFactory m;
    public final b n = b.a;

    public ReflectiveTypeAdapterFactory(g gVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.j = gVar;
        this.k = dVar;
        this.l = excluder;
        this.m = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public boolean a(Field field, boolean z2) {
        boolean z3;
        Excluder excluder = this.l;
        Class<?> type = field.getType();
        if (!(excluder.b(type) || excluder.f(type, z2))) {
            if ((excluder.l & field.getModifiers()) == 0 && ((excluder.k == -1.0d || excluder.i((c) field.getAnnotation(c.class), (b.i.d.p.d) field.getAnnotation(b.i.d.p.d.class))) && !field.isSynthetic() && ((excluder.m || !excluder.h(field.getType())) && !excluder.g(field.getType())))) {
                List<a> list = z2 ? excluder.n : excluder.o;
                if (!list.isEmpty()) {
                    b.i.d.b bVar = new b.i.d.b(field);
                    Iterator<a> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().a(bVar)) {
                                z3 = true;
                            }
                        }
                    }
                }
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // b.i.d.o
    public <T> com.google.gson.TypeAdapter<T> create(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:443)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:373)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$4(ClassGen.java:305)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
