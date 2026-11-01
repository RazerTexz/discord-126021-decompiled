package b.f.j.p;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PostprocessorProducer.java */
/* JADX INFO: loaded from: classes3.dex */
public class t0 implements w0<CloseableReference<b.f.j.j.c>> {
    public final w0<CloseableReference<b.f.j.j.c>> a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlatformBitmapFactory f639b;
    public final Executor c;

    /* JADX INFO: compiled from: PostprocessorProducer.java */
    public class b extends p<CloseableReference<b.f.j.j.c>, CloseableReference<b.f.j.j.c>> {
        public final z0 c;
        public final x0 d;
        public final b.f.j.q.b e;
        public boolean f;
        public CloseableReference<b.f.j.j.c> g;
        public int h;
        public boolean i;
        public boolean j;

        /* JADX INFO: compiled from: PostprocessorProducer.java */
        public class a extends e {
            public a(t0 t0Var) {
            }

            @Override // b.f.j.p.y0
            public void a() {
                b bVar = b.this;
                if (bVar.o()) {
                    bVar.f632b.d();
                }
            }
        }

        public b(l<CloseableReference<b.f.j.j.c>> lVar, z0 z0Var, b.f.j.q.b bVar, x0 x0Var) {
            super(lVar);
            this.g = null;
            this.h = 0;
            this.i = false;
            this.j = false;
            this.c = z0Var;
            this.e = bVar;
            this.d = x0Var;
            x0Var.f(new a(t0.this));
        }

        @Override // b.f.j.p.p, b.f.j.p.b
        public void g() {
            if (o()) {
                this.f632b.d();
            }
        }

        @Override // b.f.j.p.p, b.f.j.p.b
        public void h(Throwable th) {
            if (o()) {
                this.f632b.c(th);
            }
        }

        @Override // b.f.j.p.b
        public void i(Object obj, int i) {
            CloseableReference closeableReference = (CloseableReference) obj;
            if (!CloseableReference.y(closeableReference)) {
                if (b.f.j.p.b.e(i)) {
                    q(null, i);
                    return;
                }
                return;
            }
            synchronized (this) {
                if (!this.f) {
                    CloseableReference<b.f.j.j.c> closeableReference2 = this.g;
                    this.g = CloseableReference.n(closeableReference);
                    this.h = i;
                    this.i = true;
                    boolean zS = s();
                    if (closeableReference2 != null) {
                        closeableReference2.close();
                    }
                    if (zS) {
                        t0.this.c.execute(new u0(this));
                    }
                }
            }
        }

        public static void n(b bVar, CloseableReference closeableReference, int i) {
            Objects.requireNonNull(bVar);
            b.c.a.a0.d.i(Boolean.valueOf(CloseableReference.y(closeableReference)));
            if (!(((b.f.j.j.c) closeableReference.u()) instanceof b.f.j.j.d)) {
                bVar.q(closeableReference, i);
                return;
            }
            bVar.c.e(bVar.d, "PostprocessorProducer");
            CloseableReference<b.f.j.j.c> closeableReferenceR = null;
            try {
                try {
                    closeableReferenceR = bVar.r((b.f.j.j.c) closeableReference.u());
                    z0 z0Var = bVar.c;
                    x0 x0Var = bVar.d;
                    z0Var.j(x0Var, "PostprocessorProducer", bVar.p(z0Var, x0Var, bVar.e));
                    bVar.q(closeableReferenceR, i);
                    if (closeableReferenceR != null) {
                        closeableReferenceR.close();
                    }
                } catch (Exception e) {
                    z0 z0Var2 = bVar.c;
                    x0 x0Var2 = bVar.d;
                    z0Var2.k(x0Var2, "PostprocessorProducer", e, bVar.p(z0Var2, x0Var2, bVar.e));
                    if (bVar.o()) {
                        bVar.f632b.c(e);
                    }
                }
            } catch (Throwable th) {
                if (closeableReferenceR != null) {
                    closeableReferenceR.close();
                }
                throw th;
            }
        }

        public final boolean o() {
            synchronized (this) {
                if (this.f) {
                    return false;
                }
                CloseableReference<b.f.j.j.c> closeableReference = this.g;
                this.g = null;
                this.f = true;
                Class<CloseableReference> cls = CloseableReference.j;
                if (closeableReference != null) {
                    closeableReference.close();
                }
                return true;
            }
        }

        public final Map<String, String> p(z0 z0Var, x0 x0Var, b.f.j.q.b bVar) {
            if (z0Var.g(x0Var, "PostprocessorProducer")) {
                return b.f.d.d.f.of("Postprocessor", bVar.getName());
            }
            return null;
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
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v2 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        public final void q(com.facebook.common.references.CloseableReference<b.f.j.j.c> r3, int r4) {
            /*
                r2 = this;
                boolean r0 = b.f.j.p.b.e(r4)
                if (r0 != 0) goto L10
                monitor-enter(r2)
                boolean r1 = r2.f     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)
                if (r1 == 0) goto L18
                goto L10
            Ld:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            L10:
                if (r0 == 0) goto L1d
                boolean r0 = r2.o()
                if (r0 == 0) goto L1d
            L18:
                b.f.j.p.l<O> r0 = r2.f632b
                r0.b(r3, r4)
            L1d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.f.j.p.t0.b.q(com.facebook.common.references.CloseableReference, int):void");
        }

        public final CloseableReference<b.f.j.j.c> r(b.f.j.j.c cVar) {
            b.f.j.j.d dVar = (b.f.j.j.d) cVar;
            CloseableReference<Bitmap> closeableReferenceProcess = this.e.process(dVar.m, t0.this.f639b);
            try {
                b.f.j.j.d dVar2 = new b.f.j.j.d(closeableReferenceProcess, cVar.b(), dVar.o, dVar.p);
                dVar2.e(dVar.k);
                return CloseableReference.A(dVar2);
            } finally {
                Class<CloseableReference> cls = CloseableReference.j;
                if (closeableReferenceProcess != null) {
                    closeableReferenceProcess.close();
                }
            }
        }

        public final synchronized boolean s() {
            if (this.f || !this.i || this.j || !CloseableReference.y(this.g)) {
                return false;
            }
            this.j = true;
            return true;
        }
    }

    /* JADX INFO: compiled from: PostprocessorProducer.java */
    public class c extends p<CloseableReference<b.f.j.j.c>, CloseableReference<b.f.j.j.c>> implements b.f.j.q.d {
        public boolean c;
        public CloseableReference<b.f.j.j.c> d;

        public c(t0 t0Var, b bVar, b.f.j.q.c cVar, x0 x0Var, a aVar) {
            super(bVar);
            this.c = false;
            this.d = null;
            cVar.a(this);
            x0Var.f(new v0(this, t0Var));
        }

        @Override // b.f.j.p.p, b.f.j.p.b
        public void g() {
            if (n()) {
                this.f632b.d();
            }
        }

        @Override // b.f.j.p.p, b.f.j.p.b
        public void h(Throwable th) {
            if (n()) {
                this.f632b.c(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // b.f.j.p.b
        public void i(Object obj, int i) {
            CloseableReference closeableReference = (CloseableReference) obj;
            if (b.f.j.p.b.f(i)) {
                return;
            }
            synchronized (this) {
                if (!this.c) {
                    CloseableReference<b.f.j.j.c> closeableReference2 = this.d;
                    this.d = CloseableReference.n(closeableReference);
                    if (closeableReference2 != null) {
                        closeableReference2.close();
                    }
                }
            }
            synchronized (this) {
                if (!this.c) {
                    CloseableReference closeableReferenceN = CloseableReference.n(this.d);
                    try {
                        this.f632b.b((O) closeableReferenceN, 0);
                    } finally {
                        if (closeableReferenceN != null) {
                            closeableReferenceN.close();
                        }
                    }
                }
            }
        }

        public final boolean n() {
            synchronized (this) {
                if (this.c) {
                    return false;
                }
                CloseableReference<b.f.j.j.c> closeableReference = this.d;
                this.d = null;
                this.c = true;
                Class<CloseableReference> cls = CloseableReference.j;
                if (closeableReference != null) {
                    closeableReference.close();
                }
                return true;
            }
        }
    }

    /* JADX INFO: compiled from: PostprocessorProducer.java */
    public class d extends p<CloseableReference<b.f.j.j.c>, CloseableReference<b.f.j.j.c>> {
        public d(t0 t0Var, b bVar, a aVar) {
            super(bVar);
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
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // b.f.j.p.b
        public void i(java.lang.Object r2, int r3) {
            /*
                r1 = this;
                com.facebook.common.references.CloseableReference r2 = (com.facebook.common.references.CloseableReference) r2
                boolean r0 = b.f.j.p.b.f(r3)
                if (r0 == 0) goto L9
                goto Le
            L9:
                b.f.j.p.l<O> r0 = r1.f632b
                r0.b(r2, r3)
            Le:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.f.j.p.t0.d.i(java.lang.Object, int):void");
        }
    }

    public t0(w0<CloseableReference<b.f.j.j.c>> w0Var, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        Objects.requireNonNull(w0Var);
        this.a = w0Var;
        this.f639b = platformBitmapFactory;
        Objects.requireNonNull(executor);
        this.c = executor;
    }

    @Override // b.f.j.p.w0
    public void b(l<CloseableReference<b.f.j.j.c>> lVar, x0 x0Var) {
        z0 z0VarO = x0Var.o();
        b.f.j.q.b bVar = x0Var.e().f2903s;
        Objects.requireNonNull(bVar);
        b bVar2 = new b(lVar, z0VarO, bVar, x0Var);
        this.a.b(bVar instanceof b.f.j.q.c ? new c(this, bVar2, (b.f.j.q.c) bVar, x0Var, null) : new d(this, bVar2, null), x0Var);
    }
}
