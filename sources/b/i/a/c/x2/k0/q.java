package b.i.a.c.x2.k0;

import android.util.Log;
import androidx.annotation.Nullable;
import b.i.a.c.j1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: H263Reader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements o {
    public static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final j0 f1269b;
    public b g;
    public long h;
    public String i;
    public b.i.a.c.x2.w j;
    public boolean k;
    public final boolean[] d = new boolean[4];
    public final a e = new a(128);
    public long l = -9223372036854775807L;

    @Nullable
    public final w f = new w(Opcodes.GETSTATIC, 128);

    @Nullable
    public final b.i.a.c.f3.x c = new b.i.a.c.f3.x();

    /* JADX INFO: compiled from: H263Reader.java */
    public final class a {
        public static final byte[] a = {0, 0, 1};
        public int c;
        public int d;
        public int e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1270b;
        public byte[] f;

        public a(int i) {
            this.f = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f1270b) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f;
                int length = bArr2.length;
                int i4 = this.d;
                if (length < i4 + i3) {
                    this.f = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f, this.d, i3);
                this.d += i3;
            }
        }

        public void b() {
            this.f1270b = false;
            this.d = 0;
            this.c = 0;
        }
    }

    /* JADX INFO: compiled from: H263Reader.java */
    public final class b {
        public final b.i.a.c.x2.w a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1271b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(b.i.a.c.x2.w wVar) {
            this.a = wVar;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = (i2 - i) + i3;
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
        }
    }

    public q(@Nullable j0 j0Var) {
        this.f1269b = j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f A[LOOP:1: B:79:0x019d->B:80:0x019f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
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
    @Override // b.i.a.c.x2.k0.o
    public void b(b.i.a.c.f3.x xVar) {
        int i;
        int i2;
        boolean z2;
        b.i.a.c.f3.w wVar;
        int iG;
        float[] fArr;
        float f;
        int iG2;
        int i3;
        int i4;
        int iG3;
        int iG4;
        b.c.a.a0.d.H(this.g);
        b.c.a.a0.d.H(this.j);
        int i5 = xVar.f984b;
        int i6 = xVar.c;
        byte[] bArr = xVar.a;
        this.h += (long) xVar.a();
        this.j.c(xVar, xVar.a());
        while (true) {
            int iB = b.i.a.c.f3.u.b(bArr, i5, i6, this.d);
            if (iB == i6) {
                if (!this.k) {
                    this.e.a(bArr, i5, i6);
                }
                this.g.a(bArr, i5, i6);
                w wVar2 = this.f;
                if (wVar2 != null) {
                    wVar2.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iB + 3;
            int i8 = xVar.a[i7] & 255;
            int i9 = iB - i5;
            if (this.k) {
                i = i6;
            } else {
                if (i9 > 0) {
                    this.e.a(bArr, i5, iB);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                a aVar = this.e;
                int i11 = aVar.c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i8 == 179 || i8 == 181) {
                                    aVar.d -= i10;
                                    aVar.f1270b = false;
                                    z2 = true;
                                }
                                if (z2) {
                                    b.i.a.c.x2.w wVar3 = this.j;
                                    a aVar2 = this.e;
                                    int i12 = aVar2.e;
                                    String str = this.i;
                                    Objects.requireNonNull(str);
                                    byte[] bArrCopyOf = Arrays.copyOf(aVar2.f, aVar2.d);
                                    wVar = new b.i.a.c.f3.w(bArrCopyOf);
                                    wVar.n(i12);
                                    wVar.n(4);
                                    wVar.l();
                                    wVar.m(8);
                                    if (wVar.f()) {
                                        wVar.m(4);
                                        wVar.m(3);
                                    }
                                    iG = wVar.g(4);
                                    if (iG == 15) {
                                        iG3 = wVar.g(8);
                                        iG4 = wVar.g(8);
                                        if (iG4 == 0) {
                                            Log.w("H263Reader", "Invalid aspect ratio");
                                            i = i6;
                                            f = 1.0f;
                                        } else {
                                            f = iG3 / iG4;
                                            i = i6;
                                        }
                                    } else {
                                        fArr = a;
                                        i = i6;
                                        if (iG < fArr.length) {
                                            f = fArr[iG];
                                        } else {
                                            Log.w("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                        }
                                    }
                                    if (wVar.f()) {
                                        wVar.m(2);
                                        wVar.m(1);
                                        if (wVar.f()) {
                                            wVar.m(15);
                                            wVar.l();
                                            wVar.m(15);
                                            wVar.l();
                                            wVar.m(15);
                                            wVar.l();
                                            wVar.m(3);
                                            wVar.m(11);
                                            wVar.l();
                                            wVar.m(15);
                                            wVar.l();
                                        }
                                    }
                                    if (wVar.g(2) != 0) {
                                        Log.w("H263Reader", "Unhandled video object layer shape");
                                    }
                                    wVar.l();
                                    iG2 = wVar.g(16);
                                    wVar.l();
                                    if (wVar.f()) {
                                        if (iG2 == 0) {
                                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            i4 = 0;
                                            for (i3 = iG2 - 1; i3 > 0; i3 >>= 1) {
                                                i4++;
                                            }
                                            wVar.m(i4);
                                        }
                                    }
                                    wVar.l();
                                    int iG5 = wVar.g(13);
                                    wVar.l();
                                    int iG6 = wVar.g(13);
                                    wVar.l();
                                    wVar.l();
                                    j1.b bVar = new j1.b();
                                    bVar.a = str;
                                    bVar.k = "video/mp4v-es";
                                    bVar.p = iG5;
                                    bVar.q = iG6;
                                    bVar.t = f;
                                    bVar.m = Collections.singletonList(bArrCopyOf);
                                    wVar3.e(bVar.a());
                                    this.k = true;
                                } else {
                                    i = i6;
                                }
                            } else if ((i8 & 240) != 32) {
                                Log.w("H263Reader", "Unexpected start code value");
                                aVar.b();
                            } else {
                                aVar.e = aVar.d;
                                aVar.c = 4;
                            }
                        } else if (i8 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            aVar.b();
                        } else {
                            aVar.c = 3;
                        }
                    } else if (i8 != 181) {
                        Log.w("H263Reader", "Unexpected start code value");
                        aVar.b();
                    } else {
                        aVar.c = 2;
                    }
                } else if (i8 == 176) {
                    aVar.c = 1;
                    aVar.f1270b = true;
                }
                byte[] bArr2 = a.a;
                aVar.a(bArr2, 0, bArr2.length);
                z2 = false;
                if (z2) {
                    b.i.a.c.x2.w wVar4 = this.j;
                    a aVar3 = this.e;
                    int i13 = aVar3.e;
                    String str2 = this.i;
                    Objects.requireNonNull(str2);
                    byte[] bArrCopyOf2 = Arrays.copyOf(aVar3.f, aVar3.d);
                    wVar = new b.i.a.c.f3.w(bArrCopyOf2);
                    wVar.n(i13);
                    wVar.n(4);
                    wVar.l();
                    wVar.m(8);
                    if (wVar.f()) {
                        wVar.m(4);
                        wVar.m(3);
                    }
                    iG = wVar.g(4);
                    if (iG == 15) {
                        iG3 = wVar.g(8);
                        iG4 = wVar.g(8);
                        if (iG4 == 0) {
                            Log.w("H263Reader", "Invalid aspect ratio");
                            i = i6;
                            f = 1.0f;
                        } else {
                            f = iG3 / iG4;
                            i = i6;
                        }
                    } else {
                        fArr = a;
                        i = i6;
                        if (iG < fArr.length) {
                            f = fArr[iG];
                        } else {
                            Log.w("H263Reader", "Invalid aspect ratio");
                            f = 1.0f;
                        }
                    }
                    if (wVar.f()) {
                        wVar.m(2);
                        wVar.m(1);
                        if (wVar.f()) {
                            wVar.m(15);
                            wVar.l();
                            wVar.m(15);
                            wVar.l();
                            wVar.m(15);
                            wVar.l();
                            wVar.m(3);
                            wVar.m(11);
                            wVar.l();
                            wVar.m(15);
                            wVar.l();
                        }
                    }
                    if (wVar.g(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    wVar.l();
                    iG2 = wVar.g(16);
                    wVar.l();
                    if (wVar.f()) {
                        if (iG2 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            i4 = 0;
                            while (i3 > 0) {
                                i4++;
                            }
                            wVar.m(i4);
                        }
                    }
                    wVar.l();
                    int iG7 = wVar.g(13);
                    wVar.l();
                    int iG8 = wVar.g(13);
                    wVar.l();
                    wVar.l();
                    j1.b bVar2 = new j1.b();
                    bVar2.a = str2;
                    bVar2.k = "video/mp4v-es";
                    bVar2.p = iG7;
                    bVar2.q = iG8;
                    bVar2.t = f;
                    bVar2.m = Collections.singletonList(bArrCopyOf2);
                    wVar4.e(bVar2.a());
                    this.k = true;
                } else {
                    i = i6;
                }
            }
            this.g.a(bArr, i5, iB);
            w wVar5 = this.f;
            if (wVar5 != null) {
                if (i9 > 0) {
                    wVar5.a(bArr, i5, iB);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (this.f.b(i2)) {
                    w wVar6 = this.f;
                    int iF = b.i.a.c.f3.u.f(wVar6.d, wVar6.e);
                    b.i.a.c.f3.x xVar2 = this.c;
                    int i14 = b.i.a.c.f3.e0.a;
                    xVar2.C(this.f.d, iF);
                    this.f1269b.a(this.l, this.c);
                }
                if (i8 == 178) {
                    if (xVar.a[iB + 2] == 1) {
                        this.f.d(i8);
                    }
                }
            }
            int i15 = i - iB;
            long j = this.h - ((long) i15);
            b bVar3 = this.g;
            boolean z3 = this.k;
            if (bVar3.e == 182 && z3 && bVar3.f1271b) {
                long j2 = bVar3.h;
                if (j2 != -9223372036854775807L) {
                    bVar3.a.d(j2, bVar3.d ? 1 : 0, (int) (j - bVar3.g), i15, null);
                }
            }
            if (bVar3.e != 179) {
                bVar3.g = j;
            }
            b bVar4 = this.g;
            long j3 = this.l;
            bVar4.e = i8;
            bVar4.d = false;
            bVar4.f1271b = i8 == 182 || i8 == 179;
            bVar4.c = i8 == 182;
            bVar4.f = 0;
            bVar4.h = j3;
            i6 = i;
            i5 = i7;
        }
    }

    @Override // b.i.a.c.x2.k0.o
    public void c() {
        b.i.a.c.f3.u.a(this.d);
        this.e.b();
        b bVar = this.g;
        if (bVar != null) {
            bVar.f1271b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.c();
        }
        this.h = 0L;
        this.l = -9223372036854775807L;
    }

    @Override // b.i.a.c.x2.k0.o
    public void d() {
    }

    @Override // b.i.a.c.x2.k0.o
    public void e(b.i.a.c.x2.j jVar, i0.d dVar) {
        dVar.a();
        this.i = dVar.b();
        b.i.a.c.x2.w wVarP = jVar.p(dVar.c(), 2);
        this.j = wVarP;
        this.g = new b(wVarP);
        j0 j0Var = this.f1269b;
        if (j0Var != null) {
            j0Var.b(jVar, dVar);
        }
    }

    @Override // b.i.a.c.x2.k0.o
    public void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }
}
