package b.f.j.p;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: compiled from: PostprocessedBitmapMemoryCacheProducer.java */
/* JADX INFO: loaded from: classes3.dex */
public class s0 implements w0<CloseableReference<b.f.j.j.c>> {
    public final b.f.j.c.w<CacheKey, b.f.j.j.c> a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.f.j.c.i f637b;
    public final w0<CloseableReference<b.f.j.j.c>> c;

    /* JADX INFO: compiled from: PostprocessedBitmapMemoryCacheProducer.java */
    public class a extends p<CloseableReference<b.f.j.j.c>, CloseableReference<b.f.j.j.c>> {
        public final CacheKey c;
        public final boolean d;
        public final b.f.j.c.w<CacheKey, b.f.j.j.c> e;
        public final boolean f;

        public a(l<CloseableReference<b.f.j.j.c>> lVar, CacheKey cacheKey, boolean z2, b.f.j.c.w<CacheKey, b.f.j.j.c> wVar, boolean z3) {
            super(lVar);
            this.c = cacheKey;
            this.d = z2;
            this.e = wVar;
            this.f = z3;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v8 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // b.f.j.p.b
        public void i(java.lang.Object r4, int r5) {
            /*
                r3 = this;
                com.facebook.common.references.CloseableReference r4 = (com.facebook.common.references.CloseableReference) r4
                r0 = 0
                if (r4 != 0) goto L11
                boolean r4 = b.f.j.p.b.e(r5)
                if (r4 == 0) goto L3e
                b.f.j.p.l<O> r4 = r3.f632b
                r4.b(r0, r5)
                goto L3e
            L11:
                boolean r1 = b.f.j.p.b.f(r5)
                if (r1 == 0) goto L1c
                boolean r1 = r3.d
                if (r1 != 0) goto L1c
                goto L3e
            L1c:
                boolean r1 = r3.f
                if (r1 == 0) goto L28
                b.f.j.c.w<com.facebook.cache.common.CacheKey, b.f.j.j.c> r0 = r3.e
                com.facebook.cache.common.CacheKey r1 = r3.c
                com.facebook.common.references.CloseableReference r0 = r0.a(r1, r4)
            L28:
                b.f.j.p.l<O> r1 = r3.f632b     // Catch: java.lang.Throwable -> L3f
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.a(r2)     // Catch: java.lang.Throwable -> L3f
                b.f.j.p.l<O> r1 = r3.f632b     // Catch: java.lang.Throwable -> L3f
                if (r0 == 0) goto L34
                r4 = r0
            L34:
                r1.b(r4, r5)     // Catch: java.lang.Throwable -> L3f
                java.lang.Class<com.facebook.common.references.CloseableReference> r4 = com.facebook.common.references.CloseableReference.j
                if (r0 == 0) goto L3e
                r0.close()
            L3e:
                return
            L3f:
                r4 = move-exception
                java.lang.Class<com.facebook.common.references.CloseableReference> r5 = com.facebook.common.references.CloseableReference.j
                if (r0 == 0) goto L47
                r0.close()
            L47:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: b.f.j.p.s0.a.i(java.lang.Object, int):void");
        }
    }

    public s0(b.f.j.c.w<CacheKey, b.f.j.j.c> wVar, b.f.j.c.i iVar, w0<CloseableReference<b.f.j.j.c>> w0Var) {
        this.a = wVar;
        this.f637b = iVar;
        this.c = w0Var;
    }

    @Override // b.f.j.p.w0
    public void b(l<CloseableReference<b.f.j.j.c>> lVar, x0 x0Var) {
        z0 z0VarO = x0Var.o();
        ImageRequest imageRequestE = x0Var.e();
        Object objB = x0Var.b();
        b.f.j.q.b bVar = imageRequestE.f2903s;
        if (bVar == null || bVar.getPostprocessorCacheKey() == null) {
            this.c.b(lVar, x0Var);
            return;
        }
        z0VarO.e(x0Var, "PostprocessedBitmapMemoryCacheProducer");
        CacheKey cacheKeyC = ((b.f.j.c.n) this.f637b).c(imageRequestE, objB);
        CloseableReference<b.f.j.j.c> closeableReference = x0Var.e().b(1) ? this.a.get(cacheKeyC) : null;
        if (closeableReference == null) {
            a aVar = new a(lVar, cacheKeyC, bVar instanceof b.f.j.q.c, this.a, x0Var.e().b(2));
            z0VarO.j(x0Var, "PostprocessedBitmapMemoryCacheProducer", z0VarO.g(x0Var, "PostprocessedBitmapMemoryCacheProducer") ? b.f.d.d.f.of("cached_value_found", "false") : null);
            this.c.b(aVar, x0Var);
        } else {
            z0VarO.j(x0Var, "PostprocessedBitmapMemoryCacheProducer", z0VarO.g(x0Var, "PostprocessedBitmapMemoryCacheProducer") ? b.f.d.d.f.of("cached_value_found", "true") : null);
            z0VarO.c(x0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            x0Var.i("memory_bitmap", "postprocessed");
            lVar.a(1.0f);
            lVar.b(closeableReference, 1);
            closeableReference.close();
        }
    }
}
