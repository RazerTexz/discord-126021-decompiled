package b.f.j.p;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: compiled from: BitmapMemoryCacheProducer.java */
/* JADX INFO: loaded from: classes3.dex */
public class h implements w0<CloseableReference<b.f.j.j.c>> {
    public final b.f.j.c.w<CacheKey, b.f.j.j.c> a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.f.j.c.i f613b;
    public final w0<CloseableReference<b.f.j.j.c>> c;

    /* JADX INFO: compiled from: BitmapMemoryCacheProducer.java */
    public class a extends p<CloseableReference<b.f.j.j.c>, CloseableReference<b.f.j.j.c>> {
        public final /* synthetic */ CacheKey c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, CacheKey cacheKey, boolean z2) {
            super(lVar);
            this.c = cacheKey;
            this.d = z2;
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
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v9 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // b.f.j.p.b
        public void i(java.lang.Object r7, int r8) {
            /*
                r6 = this;
                com.facebook.common.references.CloseableReference r7 = (com.facebook.common.references.CloseableReference) r7
                b.f.j.r.b.b()     // Catch: java.lang.Throwable -> La9
                boolean r0 = b.f.j.p.b.e(r8)     // Catch: java.lang.Throwable -> La9
                r1 = 0
                if (r7 != 0) goto L18
                if (r0 == 0) goto L13
                b.f.j.p.l<O> r7 = r6.f632b     // Catch: java.lang.Throwable -> La9
                r7.b(r1, r8)     // Catch: java.lang.Throwable -> La9
            L13:
                b.f.j.r.b.b()
                goto La8
            L18:
                java.lang.Object r2 = r7.u()     // Catch: java.lang.Throwable -> La9
                b.f.j.j.c r2 = (b.f.j.j.c) r2     // Catch: java.lang.Throwable -> La9
                boolean r2 = r2.d()     // Catch: java.lang.Throwable -> La9
                if (r2 != 0) goto La1
                r2 = 8
                boolean r2 = b.f.j.p.b.m(r8, r2)     // Catch: java.lang.Throwable -> La9
                if (r2 == 0) goto L2e
                goto La1
            L2e:
                if (r0 != 0) goto L74
                b.f.j.p.h r2 = b.f.j.p.h.this     // Catch: java.lang.Throwable -> La9
                b.f.j.c.w<com.facebook.cache.common.CacheKey, b.f.j.j.c> r2 = r2.a     // Catch: java.lang.Throwable -> La9
                com.facebook.cache.common.CacheKey r3 = r6.c     // Catch: java.lang.Throwable -> La9
                com.facebook.common.references.CloseableReference r2 = r2.get(r3)     // Catch: java.lang.Throwable -> La9
                if (r2 == 0) goto L74
                java.lang.Object r3 = r7.u()     // Catch: java.lang.Throwable -> L6f
                b.f.j.j.c r3 = (b.f.j.j.c) r3     // Catch: java.lang.Throwable -> L6f
                b.f.j.j.i r3 = r3.b()     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r4 = r2.u()     // Catch: java.lang.Throwable -> L6f
                b.f.j.j.c r4 = (b.f.j.j.c) r4     // Catch: java.lang.Throwable -> L6f
                b.f.j.j.i r4 = r4.b()     // Catch: java.lang.Throwable -> L6f
                r5 = r4
                b.f.j.j.h r5 = (b.f.j.j.h) r5     // Catch: java.lang.Throwable -> L6f
                boolean r5 = r5.d     // Catch: java.lang.Throwable -> L6f
                if (r5 != 0) goto L66
                b.f.j.j.h r4 = (b.f.j.j.h) r4     // Catch: java.lang.Throwable -> L6f
                int r4 = r4.f591b     // Catch: java.lang.Throwable -> L6f
                b.f.j.j.h r3 = (b.f.j.j.h) r3     // Catch: java.lang.Throwable -> L6f
                int r3 = r3.f591b     // Catch: java.lang.Throwable -> L6f
                if (r4 < r3) goto L62
                goto L66
            L62:
                r2.close()     // Catch: java.lang.Throwable -> La9
                goto L74
            L66:
                b.f.j.p.l<O> r7 = r6.f632b     // Catch: java.lang.Throwable -> L6f
                r7.b(r2, r8)     // Catch: java.lang.Throwable -> L6f
                r2.close()     // Catch: java.lang.Throwable -> La9
                goto L13
            L6f:
                r7 = move-exception
                r2.close()     // Catch: java.lang.Throwable -> La9
                throw r7     // Catch: java.lang.Throwable -> La9
            L74:
                boolean r2 = r6.d     // Catch: java.lang.Throwable -> La9
                if (r2 == 0) goto L82
                b.f.j.p.h r1 = b.f.j.p.h.this     // Catch: java.lang.Throwable -> La9
                b.f.j.c.w<com.facebook.cache.common.CacheKey, b.f.j.j.c> r1 = r1.a     // Catch: java.lang.Throwable -> La9
                com.facebook.cache.common.CacheKey r2 = r6.c     // Catch: java.lang.Throwable -> La9
                com.facebook.common.references.CloseableReference r1 = r1.a(r2, r7)     // Catch: java.lang.Throwable -> La9
            L82:
                if (r0 == 0) goto L8b
                b.f.j.p.l<O> r0 = r6.f632b     // Catch: java.lang.Throwable -> L9a
                r2 = 1065353216(0x3f800000, float:1.0)
                r0.a(r2)     // Catch: java.lang.Throwable -> L9a
            L8b:
                b.f.j.p.l<O> r0 = r6.f632b     // Catch: java.lang.Throwable -> L9a
                if (r1 == 0) goto L90
                r7 = r1
            L90:
                r0.b(r7, r8)     // Catch: java.lang.Throwable -> L9a
                if (r1 == 0) goto L13
                r1.close()     // Catch: java.lang.Throwable -> La9
                goto L13
            L9a:
                r7 = move-exception
                if (r1 == 0) goto La0
                r1.close()     // Catch: java.lang.Throwable -> La9
            La0:
                throw r7     // Catch: java.lang.Throwable -> La9
            La1:
                b.f.j.p.l<O> r0 = r6.f632b     // Catch: java.lang.Throwable -> La9
                r0.b(r7, r8)     // Catch: java.lang.Throwable -> La9
                goto L13
            La8:
                return
            La9:
                r7 = move-exception
                b.f.j.r.b.b()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: b.f.j.p.h.a.i(java.lang.Object, int):void");
        }
    }

    public h(b.f.j.c.w<CacheKey, b.f.j.j.c> wVar, b.f.j.c.i iVar, w0<CloseableReference<b.f.j.j.c>> w0Var) {
        this.a = wVar;
        this.f613b = iVar;
        this.c = w0Var;
    }

    @Override // b.f.j.p.w0
    public void b(l<CloseableReference<b.f.j.j.c>> lVar, x0 x0Var) {
        try {
            b.f.j.r.b.b();
            z0 z0VarO = x0Var.o();
            z0VarO.e(x0Var, d());
            CacheKey cacheKeyA = ((b.f.j.c.n) this.f613b).a(x0Var.e(), x0Var.b());
            CloseableReference<b.f.j.j.c> closeableReference = x0Var.e().b(1) ? this.a.get(cacheKeyA) : null;
            if (closeableReference != null) {
                x0Var.j(closeableReference.u().a());
                boolean z2 = ((b.f.j.j.h) closeableReference.u().b()).d;
                if (z2) {
                    z0VarO.j(x0Var, d(), z0VarO.g(x0Var, d()) ? b.f.d.d.f.of("cached_value_found", "true") : null);
                    z0VarO.c(x0Var, d(), true);
                    x0Var.i("memory_bitmap", c());
                    lVar.a(1.0f);
                }
                lVar.b(closeableReference, z2 ? 1 : 0);
                closeableReference.close();
                if (z2) {
                    return;
                }
            }
            if (x0Var.q().g() >= ImageRequest.c.BITMAP_MEMORY_CACHE.g()) {
                z0VarO.j(x0Var, d(), z0VarO.g(x0Var, d()) ? b.f.d.d.f.of("cached_value_found", "false") : null);
                z0VarO.c(x0Var, d(), false);
                x0Var.i("memory_bitmap", c());
                lVar.b(null, 1);
                return;
            }
            l<CloseableReference<b.f.j.j.c>> lVarE = e(lVar, cacheKeyA, x0Var.e().b(2));
            z0VarO.j(x0Var, d(), z0VarO.g(x0Var, d()) ? b.f.d.d.f.of("cached_value_found", "false") : null);
            b.f.j.r.b.b();
            this.c.b(lVarE, x0Var);
            b.f.j.r.b.b();
        } finally {
            b.f.j.r.b.b();
        }
    }

    public String c() {
        return "pipe_bg";
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public l<CloseableReference<b.f.j.j.c>> e(l<CloseableReference<b.f.j.j.c>> lVar, CacheKey cacheKey, boolean z2) {
        return new a(lVar, cacheKey, z2);
    }
}
