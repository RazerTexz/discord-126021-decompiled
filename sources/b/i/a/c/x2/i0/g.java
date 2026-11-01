package b.i.a.c.x2.i0;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import b.i.a.c.f3.e0;
import b.i.a.c.f3.u;
import b.i.a.c.f3.x;
import b.i.a.c.j1;
import b.i.a.c.x2.s;
import b.i.a.c.x2.t;
import b.i.a.c.x2.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes3.dex */
public class g implements b.i.a.c.x2.h {
    public int A;
    public int B;
    public boolean C;
    public b.i.a.c.x2.j D;
    public w[] E;
    public w[] F;
    public boolean G;
    public static final byte[] a = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public final int c;
    public final List<j1> d;
    public final SparseArray<b> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f1215b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public x f1216s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public b f1218y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1219z;
    public final x f;
    public final x g;
    public final x h;
    public final byte[] i;
    public final x j;
    public final b.i.a.c.z2.i.b k;
    public final x l;
    public final ArrayDeque<d.a> m;
    public final ArrayDeque<a> n;
    public int o;
    public int p;
    public long q;
    public int r;
    public long t;
    public int u;
    public long v;
    public long w;

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public final class a {
        public final long a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1220b;

        public a(long j, int i) {
            this.a = j;
            this.f1220b = i;
        }
    }

    static {
        j1.b bVar = new j1.b();
        bVar.k = "application/x-emsg";
        f1215b = bVar.a();
    }

    public g(int i) {
        List listEmptyList = Collections.emptyList();
        this.c = i;
        this.d = Collections.unmodifiableList(listEmptyList);
        this.k = new b.i.a.c.z2.i.b();
        this.l = new x(16);
        this.f = new x(u.a);
        this.g = new x(5);
        this.h = new x();
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.j = new x(bArr);
        this.m = new ArrayDeque<>();
        this.n = new ArrayDeque<>();
        this.e = new SparseArray<>();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f1217x = -9223372036854775807L;
        this.D = b.i.a.c.x2.j.d;
        this.E = new w[0];
        this.F = new w[0];
    }

    public static int a(int i) throws ParserException {
        if (i >= 0) {
            return i;
        }
        throw b.d.b.a.a.w0(38, "Unexpected negative value: ", i, null);
    }

    @Override // b.i.a.c.x2.h
    public boolean b(b.i.a.c.x2.i iVar) throws IOException {
        return l.a(iVar, true, false);
    }

    public final void c() {
        this.o = 0;
        this.r = 0;
    }

    public final f d(SparseArray<f> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        f fVar = sparseArray.get(i);
        Objects.requireNonNull(fVar);
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:103:0x0221  */
    /* JADX WARN: Code duplicated, block: B:106:0x0236 A[LOOP:10: B:106:0x0236->B:108:0x023c, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:108:0x023c A[LOOP:10: B:106:0x0236->B:108:0x023c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x024c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0255  */
    /* JADX WARN: Code duplicated, block: B:114:0x025f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0261  */
    /* JADX WARN: Code duplicated, block: B:118:0x0268  */
    /* JADX WARN: Code duplicated, block: B:121:0x0272  */
    /* JADX WARN: Code duplicated, block: B:122:0x0275  */
    /* JADX WARN: Code duplicated, block: B:126:0x0287  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:207:0x0588  */
    /* JADX WARN: Code duplicated, block: B:208:0x059f  */
    /* JADX WARN: Code duplicated, block: B:210:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:217:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:220:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:228:0x0604  */
    /* JADX WARN: Code duplicated, block: B:230:0x060d A[LOOP:1: B:229:0x060b->B:230:0x060d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x0625  */
    /* JADX WARN: Code duplicated, block: B:234:0x0632  */
    /* JADX WARN: Code duplicated, block: B:253:0x065f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0662  */
    /* JADX WARN: Code duplicated, block: B:257:0x0681  */
    /* JADX WARN: Code duplicated, block: B:258:0x0686  */
    /* JADX WARN: Code duplicated, block: B:259:0x068b  */
    /* JADX WARN: Code duplicated, block: B:315:0x0714  */
    /* JADX WARN: Code duplicated, block: B:318:0x071a  */
    /* JADX WARN: Code duplicated, block: B:320:0x0720  */
    /* JADX WARN: Code duplicated, block: B:322:0x0726  */
    /* JADX WARN: Code duplicated, block: B:327:0x074a  */
    /* JADX WARN: Code duplicated, block: B:329:0x0750  */
    /* JADX WARN: Code duplicated, block: B:344:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0743 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x073c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x075b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:384:0x0248 A[EDGE_INSN: B:384:0x0248->B:109:0x0248 BREAK  A[LOOP:10: B:106:0x0236->B:108:0x023c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x015c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // b.i.a.c.x2.h
    public int e(b.i.a.c.x2.i iVar, s sVar) throws IOException {
        char c;
        p pVar;
        m mVar;
        w wVar;
        long j;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        n nVarB;
        w.a aVar;
        a aVarRemoveFirst;
        long j3;
        w[] wVarArr;
        int length;
        int i5;
        byte[] bArr;
        int i6;
        int i7;
        int i8;
        int iB;
        int iF;
        boolean z2;
        String str;
        byte b2;
        int i9;
        n nVarB2;
        x xVar;
        int i10;
        o oVar;
        boolean z3;
        String strN;
        String strN2;
        long jF;
        long j4;
        long jU;
        long jX;
        long jX2;
        long j5;
        long jB;
        long position;
        int i11;
        int i12;
        boolean z4;
        boolean z5;
        long j6;
        long position2;
        boolean z6;
        int size;
        int i13;
        while (true) {
            int i14 = this.o;
            int i15 = 1;
            if (i14 == 0) {
                if (this.r != 0) {
                    j5 = this.q;
                    if (j5 == 1) {
                        iVar.readFully(this.l.a, 8, 8);
                        this.r += 8;
                        this.q = this.l.x();
                    } else if (j5 == 0) {
                        jB = iVar.b();
                        if (jB == -1 && !this.m.isEmpty()) {
                            jB = this.m.peek().f1209b;
                        }
                        if (jB != -1) {
                            this.q = (jB - iVar.getPosition()) + ((long) this.r);
                        }
                    }
                    if (this.q >= this.r) {
                        throw ParserException.b("Atom size less than header length (unsupported).");
                    }
                    position = iVar.getPosition() - ((long) this.r);
                    i11 = this.p;
                    if ((i11 != 1836019558 || i11 == 1835295092) && !this.G) {
                        this.D.a(new t.b(this.w, position));
                        this.G = true;
                    }
                    if (this.p == 1836019558) {
                        size = this.e.size();
                        for (i13 = 0; i13 < size; i13++) {
                            o oVar2 = this.e.valueAt(i13).f1221b;
                            Objects.requireNonNull(oVar2);
                            oVar2.c = position;
                            oVar2.f1232b = position;
                        }
                    }
                    i12 = this.p;
                    if (i12 == 1835295092) {
                        this.f1218y = null;
                        this.t = position + this.q;
                        this.o = 2;
                    } else {
                        if (i12 != 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1836019558 || i12 == 1953653094 || i12 == 1836475768 || i12 == 1701082227) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            position2 = (iVar.getPosition() + this.q) - 8;
                            this.m.push(new d.a(this.p, position2));
                            if (this.q == this.r) {
                                j(position2);
                            } else {
                                c();
                            }
                        } else {
                            if (i12 != 1751411826 || i12 == 1835296868 || i12 == 1836476516 || i12 == 1936286840 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1668576371 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1937011571 || i12 == 1952867444 || i12 == 1952868452 || i12 == 1953196132 || i12 == 1953654136 || i12 == 1953658222 || i12 == 1886614376 || i12 == 1935763834 || i12 == 1935763823 || i12 == 1936027235 || i12 == 1970628964 || i12 == 1935828848 || i12 == 1936158820 || i12 == 1701606260 || i12 == 1835362404 || i12 == 1701671783) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                if (this.r == 8) {
                                    throw ParserException.b("Leaf atom defines extended atom size (unsupported).");
                                }
                                j6 = this.q;
                                if (j6 <= 2147483647L) {
                                    throw ParserException.b("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                x xVar2 = new x((int) j6);
                                System.arraycopy(this.l.a, 0, xVar2.a, 0, 8);
                                this.f1216s = xVar2;
                                this.o = 1;
                            } else {
                                if (this.q <= 2147483647L) {
                                    throw ParserException.b("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                this.f1216s = null;
                                this.o = 1;
                            }
                        }
                    }
                    z6 = true;
                } else if (iVar.c(this.l.a, 0, 8, true)) {
                    this.r = 8;
                    this.l.E(0);
                    this.q = this.l.u();
                    this.p = this.l.f();
                    j5 = this.q;
                    if (j5 == 1) {
                        iVar.readFully(this.l.a, 8, 8);
                        this.r += 8;
                        this.q = this.l.x();
                    } else if (j5 == 0) {
                        jB = iVar.b();
                        if (jB == -1) {
                            jB = this.m.peek().f1209b;
                        }
                        if (jB != -1) {
                            this.q = (jB - iVar.getPosition()) + ((long) this.r);
                        }
                    }
                    if (this.q >= this.r) {
                        throw ParserException.b("Atom size less than header length (unsupported).");
                    }
                    position = iVar.getPosition() - ((long) this.r);
                    i11 = this.p;
                    if (i11 != 1836019558) {
                        this.D.a(new t.b(this.w, position));
                        this.G = true;
                    } else {
                        this.D.a(new t.b(this.w, position));
                        this.G = true;
                    }
                    if (this.p == 1836019558) {
                        size = this.e.size();
                        while (i13 < size) {
                            o oVar3 = this.e.valueAt(i13).f1221b;
                            Objects.requireNonNull(oVar3);
                            oVar3.c = position;
                            oVar3.f1232b = position;
                        }
                    }
                    i12 = this.p;
                    if (i12 == 1835295092) {
                        this.f1218y = null;
                        this.t = position + this.q;
                        this.o = 2;
                    } else {
                        if (i12 != 1836019574) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            position2 = (iVar.getPosition() + this.q) - 8;
                            this.m.push(new d.a(this.p, position2));
                            if (this.q == this.r) {
                                j(position2);
                            } else {
                                c();
                            }
                        } else {
                            if (i12 != 1751411826) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (z5) {
                                if (this.r == 8) {
                                    throw ParserException.b("Leaf atom defines extended atom size (unsupported).");
                                }
                                j6 = this.q;
                                if (j6 <= 2147483647L) {
                                    throw ParserException.b("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                x xVar3 = new x((int) j6);
                                System.arraycopy(this.l.a, 0, xVar3.a, 0, 8);
                                this.f1216s = xVar3;
                                this.o = 1;
                            } else {
                                if (this.q <= 2147483647L) {
                                    throw ParserException.b("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                this.f1216s = null;
                                this.o = 1;
                            }
                        }
                    }
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    return -1;
                }
            } else if (i14 == 1) {
                int i16 = ((int) this.q) - this.r;
                x xVar4 = this.f1216s;
                if (xVar4 != null) {
                    iVar.readFully(xVar4.a, 8, i16);
                    int i17 = this.p;
                    d.b bVar = new d.b(i17, xVar4);
                    long position3 = iVar.getPosition();
                    if (!this.m.isEmpty()) {
                        this.m.peek().c.add(bVar);
                    } else if (i17 == 1936286840) {
                        xVar4.E(8);
                        int iF2 = (xVar4.f() >> 24) & 255;
                        xVar4.F(4);
                        long jU2 = xVar4.u();
                        if (iF2 == 0) {
                            jX = xVar4.u();
                            jX2 = xVar4.u();
                        } else {
                            jX = xVar4.x();
                            jX2 = xVar4.x();
                        }
                        long j7 = position3 + jX2;
                        long jF2 = e0.F(jX, 1000000L, jU2);
                        xVar4.F(2);
                        int iY = xVar4.y();
                        int[] iArr = new int[iY];
                        long[] jArr = new long[iY];
                        long[] jArr2 = new long[iY];
                        long[] jArr3 = new long[iY];
                        int i18 = 0;
                        long jF3 = jF2;
                        while (i18 < iY) {
                            int iF3 = xVar4.f();
                            if ((iF3 & Integer.MIN_VALUE) != 0) {
                                throw ParserException.a("Unhandled indirect reference", null);
                            }
                            long jU3 = xVar4.u();
                            iArr[i18] = iF3 & Integer.MAX_VALUE;
                            jArr[i18] = j7;
                            jArr3[i18] = jF3;
                            long j8 = jX + jU3;
                            int i19 = i18;
                            int i20 = iY;
                            long[] jArr4 = jArr2;
                            long[] jArr5 = jArr3;
                            jF3 = e0.F(j8, 1000000L, jU2);
                            jArr4[i19] = jF3 - jArr5[i19];
                            xVar4.F(4);
                            j7 += (long) iArr[i19];
                            i18 = i19 + 1;
                            jArr2 = jArr4;
                            jArr3 = jArr5;
                            jArr = jArr;
                            jX = j8;
                            iY = i20;
                        }
                        Pair pairCreate = Pair.create(Long.valueOf(jF2), new b.i.a.c.x2.c(iArr, jArr, jArr2, jArr3));
                        this.f1217x = ((Long) pairCreate.first).longValue();
                        this.D.a((t) pairCreate.second);
                        this.G = true;
                    } else if (i17 == 1701671783 && this.E.length != 0) {
                        xVar4.E(8);
                        int iF4 = (xVar4.f() >> 24) & 255;
                        long j9 = -9223372036854775807L;
                        if (iF4 == 0) {
                            strN = xVar4.n();
                            Objects.requireNonNull(strN);
                            strN2 = xVar4.n();
                            Objects.requireNonNull(strN2);
                            long jU4 = xVar4.u();
                            long jF4 = e0.F(xVar4.u(), 1000000L, jU4);
                            long j10 = this.f1217x;
                            j9 = j10 != -9223372036854775807L ? j10 + jF4 : -9223372036854775807L;
                            jF = e0.F(xVar4.u(), 1000L, jU4);
                            j4 = j9;
                            j9 = jF4;
                            jU = xVar4.u();
                        } else if (iF4 != 1) {
                            b.d.b.a.a.g0(46, "Skipping unsupported emsg version: ", iF4, "FragmentedMp4Extractor");
                        } else {
                            long jU5 = xVar4.u();
                            long jF5 = e0.F(xVar4.x(), 1000000L, jU5);
                            jF = e0.F(xVar4.u(), 1000L, jU5);
                            jU = xVar4.u();
                            strN = xVar4.n();
                            Objects.requireNonNull(strN);
                            strN2 = xVar4.n();
                            Objects.requireNonNull(strN2);
                            j4 = jF5;
                        }
                        byte[] bArr2 = new byte[xVar4.a()];
                        int iA = xVar4.a();
                        System.arraycopy(xVar4.a, xVar4.f984b, bArr2, 0, iA);
                        xVar4.f984b += iA;
                        b.i.a.c.z2.i.b bVar2 = this.k;
                        bVar2.a.reset();
                        try {
                            DataOutputStream dataOutputStream = bVar2.f1322b;
                            dataOutputStream.writeBytes(strN);
                            dataOutputStream.writeByte(0);
                            DataOutputStream dataOutputStream2 = bVar2.f1322b;
                            dataOutputStream2.writeBytes(strN2);
                            dataOutputStream2.writeByte(0);
                            bVar2.f1322b.writeLong(jF);
                            bVar2.f1322b.writeLong(jU);
                            bVar2.f1322b.write(bArr2);
                            bVar2.f1322b.flush();
                            x xVar5 = new x(bVar2.a.toByteArray());
                            int iA2 = xVar5.a();
                            for (w wVar2 : this.E) {
                                xVar5.E(0);
                                wVar2.c(xVar5, iA2);
                            }
                            if (j4 == -9223372036854775807L) {
                                this.n.addLast(new a(j9, iA2));
                                this.u += iA2;
                            } else {
                                for (w wVar3 : this.E) {
                                    wVar3.d(j4, 1, iA2, 0, null);
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } else {
                    iVar.l(i16);
                }
                j(iVar.getPosition());
            } else if (i14 != 2) {
                b bVar3 = this.f1218y;
                if (bVar3 == null) {
                    SparseArray<b> sparseArray = this.e;
                    int size2 = sparseArray.size();
                    long j11 = Long.MAX_VALUE;
                    b bVar4 = null;
                    for (int i21 = 0; i21 < size2; i21++) {
                        b bVarValueAt = sparseArray.valueAt(i21);
                        boolean z7 = bVarValueAt.l;
                        if ((z7 || bVarValueAt.f != bVarValueAt.d.f1233b) && (!z7 || bVarValueAt.h != bVarValueAt.f1221b.d)) {
                            long jA = bVarValueAt.a();
                            if (jA < j11) {
                                bVar4 = bVarValueAt;
                                j11 = jA;
                            }
                        }
                    }
                    if (bVar4 == null) {
                        int position4 = (int) (this.t - iVar.getPosition());
                        if (position4 < 0) {
                            throw ParserException.a("Offset to end of mdat was negative.", null);
                        }
                        iVar.l(position4);
                        c();
                        i15 = 0;
                    } else {
                        int iA3 = (int) (bVar4.a() - iVar.getPosition());
                        if (iA3 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iA3 = 0;
                        }
                        iVar.l(iA3);
                        this.f1218y = bVar4;
                        bVar3 = bVar4;
                        c = 6;
                        if (this.o != 3) {
                            pVar = bVar3.d;
                            mVar = pVar.a;
                            wVar = bVar3.a;
                            if (bVar3.l) {
                                j = bVar3.f1221b.i[bVar3.f];
                            } else {
                                j = pVar.f[bVar3.f];
                            }
                            j2 = j;
                            i = mVar.j;
                            if (i != 0) {
                                while (true) {
                                    i2 = this.A;
                                    i3 = this.f1219z;
                                    if (i2 < i3) {
                                        break;
                                    }
                                    this.A += wVar.b(iVar, i3 - i2, false);
                                }
                            } else {
                                bArr = this.g.a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                i6 = i + 1;
                                i7 = 4 - i;
                                while (this.A < this.f1219z) {
                                    i8 = this.B;
                                    if (i8 == 0) {
                                        iVar.readFully(bArr, i7, i6);
                                        this.g.E(0);
                                        iF = this.g.f();
                                        if (iF >= i15) {
                                            throw ParserException.a("Invalid NAL length", null);
                                        }
                                        this.B = iF - 1;
                                        this.f.E(0);
                                        wVar.c(this.f, 4);
                                        wVar.c(this.g, i15);
                                        if (this.F.length > 0) {
                                            str = mVar.f.w;
                                            b2 = bArr[4];
                                            byte[] bArr3 = u.a;
                                            if ((!"video/avc".equals(str) && (b2 & 31) == c) || ("video/hevc".equals(str) && ((b2 & 126) >> i15) == 39)) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                        this.C = z2;
                                        this.A += 5;
                                        this.f1219z += i7;
                                    } else {
                                        if (this.C) {
                                            this.h.A(i8);
                                            iVar.readFully(this.h.a, 0, this.B);
                                            wVar.c(this.h, this.B);
                                            iB = this.B;
                                            x xVar6 = this.h;
                                            int iF5 = u.f(xVar6.a, xVar6.c);
                                            this.h.E("video/hevc".equals(mVar.f.w) ? 1 : 0);
                                            this.h.D(iF5);
                                            b.c.a.a0.d.J(j2, this.h, this.F);
                                        } else {
                                            iB = wVar.b(iVar, i8, false);
                                        }
                                        this.A += iB;
                                        this.B -= iB;
                                        c = 6;
                                        i15 = 1;
                                    }
                                }
                            }
                            if (!bVar3.l) {
                                i4 = bVar3.d.g[bVar3.f];
                            } else if (bVar3.f1221b.j[bVar3.f]) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            if (bVar3.b() != null) {
                                i4 |= BasicMeasure.EXACTLY;
                            }
                            int i22 = i4;
                            nVarB = bVar3.b();
                            if (nVarB != null) {
                                aVar = nVarB.c;
                            } else {
                                aVar = null;
                            }
                            wVar.d(j2, i22, this.f1219z, 0, aVar);
                            while (!this.n.isEmpty()) {
                                aVarRemoveFirst = this.n.removeFirst();
                                this.u -= aVarRemoveFirst.f1220b;
                                j3 = aVarRemoveFirst.a + j2;
                                wVarArr = this.E;
                                i5 = 0;
                                for (length = wVarArr.length; i5 < length; length = length) {
                                    wVarArr[i5].d(j3, 1, aVarRemoveFirst.f1220b, this.u, null);
                                    i5++;
                                }
                            }
                            if (!bVar3.c()) {
                                this.f1218y = null;
                            }
                            this.o = 3;
                            i15 = 1;
                        } else {
                            if (bVar3.l) {
                                i9 = bVar3.f1221b.h[bVar3.f];
                            } else {
                                i9 = bVar3.d.d[bVar3.f];
                            }
                            this.f1219z = i9;
                            if (bVar3.f < bVar3.i) {
                                iVar.l(i9);
                                nVarB2 = bVar3.b();
                                if (nVarB2 != null) {
                                    xVar = bVar3.f1221b.n;
                                    i10 = nVarB2.d;
                                    if (i10 != 0) {
                                        xVar.F(i10);
                                    }
                                    oVar = bVar3.f1221b;
                                    int i23 = bVar3.f;
                                    if (oVar.k || !oVar.l[i23]) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        xVar.F(xVar.y() * 6);
                                    }
                                }
                                if (!bVar3.c()) {
                                    this.f1218y = null;
                                }
                                this.o = 3;
                            } else {
                                if (bVar3.d.a.g == 1) {
                                    this.f1219z = i9 - 8;
                                    iVar.l(8);
                                }
                                if ("audio/ac4".equals(bVar3.d.a.f.w)) {
                                    this.A = bVar3.d(this.f1219z, 7);
                                    b.i.a.c.t2.n.a(this.f1219z, this.j);
                                    bVar3.a.c(this.j, 7);
                                    this.A += 7;
                                } else {
                                    this.A = bVar3.d(this.f1219z, 0);
                                }
                                this.f1219z += this.A;
                                this.o = 4;
                                this.B = 0;
                                pVar = bVar3.d;
                                mVar = pVar.a;
                                wVar = bVar3.a;
                                if (bVar3.l) {
                                    j = pVar.f[bVar3.f];
                                } else {
                                    j = bVar3.f1221b.i[bVar3.f];
                                }
                                j2 = j;
                                i = mVar.j;
                                if (i != 0) {
                                    while (true) {
                                        i2 = this.A;
                                        i3 = this.f1219z;
                                        if (i2 < i3) {
                                            break;
                                            break;
                                        }
                                        this.A += wVar.b(iVar, i3 - i2, false);
                                    }
                                } else {
                                    bArr = this.g.a;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    i6 = i + 1;
                                    i7 = 4 - i;
                                    while (this.A < this.f1219z) {
                                        i8 = this.B;
                                        if (i8 == 0) {
                                            iVar.readFully(bArr, i7, i6);
                                            this.g.E(0);
                                            iF = this.g.f();
                                            if (iF >= i15) {
                                                throw ParserException.a("Invalid NAL length", null);
                                            }
                                            this.B = iF - 1;
                                            this.f.E(0);
                                            wVar.c(this.f, 4);
                                            wVar.c(this.g, i15);
                                            if (this.F.length > 0) {
                                                str = mVar.f.w;
                                                b2 = bArr[4];
                                                byte[] bArr4 = u.a;
                                                if ((!"video/avc".equals(str) && (b2 & 31) == c) || ("video/hevc".equals(str) && ((b2 & 126) >> i15) == 39)) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                            } else {
                                                z2 = false;
                                            }
                                            this.C = z2;
                                            this.A += 5;
                                            this.f1219z += i7;
                                        } else {
                                            if (this.C) {
                                                this.h.A(i8);
                                                iVar.readFully(this.h.a, 0, this.B);
                                                wVar.c(this.h, this.B);
                                                iB = this.B;
                                                x xVar7 = this.h;
                                                int iF6 = u.f(xVar7.a, xVar7.c);
                                                this.h.E("video/hevc".equals(mVar.f.w) ? 1 : 0);
                                                this.h.D(iF6);
                                                b.c.a.a0.d.J(j2, this.h, this.F);
                                            } else {
                                                iB = wVar.b(iVar, i8, false);
                                            }
                                            this.A += iB;
                                            this.B -= iB;
                                            c = 6;
                                            i15 = 1;
                                        }
                                    }
                                }
                                if (!bVar3.l) {
                                    i4 = bVar3.d.g[bVar3.f];
                                } else if (bVar3.f1221b.j[bVar3.f]) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if (bVar3.b() != null) {
                                    i4 |= BasicMeasure.EXACTLY;
                                }
                                int i24 = i4;
                                nVarB = bVar3.b();
                                if (nVarB != null) {
                                    aVar = nVarB.c;
                                } else {
                                    aVar = null;
                                }
                                wVar.d(j2, i24, this.f1219z, 0, aVar);
                                while (!this.n.isEmpty()) {
                                    aVarRemoveFirst = this.n.removeFirst();
                                    this.u -= aVarRemoveFirst.f1220b;
                                    j3 = aVarRemoveFirst.a + j2;
                                    wVarArr = this.E;
                                    i5 = 0;
                                    while (i5 < length) {
                                        wVarArr[i5].d(j3, 1, aVarRemoveFirst.f1220b, this.u, null);
                                        i5++;
                                    }
                                }
                                if (!bVar3.c()) {
                                    this.f1218y = null;
                                }
                                this.o = 3;
                                i15 = 1;
                            }
                        }
                    }
                } else {
                    c = 6;
                    if (this.o != 3) {
                        pVar = bVar3.d;
                        mVar = pVar.a;
                        wVar = bVar3.a;
                        if (bVar3.l) {
                            j = pVar.f[bVar3.f];
                        } else {
                            j = bVar3.f1221b.i[bVar3.f];
                        }
                        j2 = j;
                        i = mVar.j;
                        if (i != 0) {
                            while (true) {
                                i2 = this.A;
                                i3 = this.f1219z;
                                if (i2 < i3) {
                                    break;
                                    break;
                                }
                                this.A += wVar.b(iVar, i3 - i2, false);
                            }
                        } else {
                            bArr = this.g.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            i6 = i + 1;
                            i7 = 4 - i;
                            while (this.A < this.f1219z) {
                                i8 = this.B;
                                if (i8 == 0) {
                                    iVar.readFully(bArr, i7, i6);
                                    this.g.E(0);
                                    iF = this.g.f();
                                    if (iF >= i15) {
                                        throw ParserException.a("Invalid NAL length", null);
                                    }
                                    this.B = iF - 1;
                                    this.f.E(0);
                                    wVar.c(this.f, 4);
                                    wVar.c(this.g, i15);
                                    if (this.F.length > 0) {
                                        str = mVar.f.w;
                                        b2 = bArr[4];
                                        byte[] bArr5 = u.a;
                                        if ((!"video/avc".equals(str) && (b2 & 31) == c) || ("video/hevc".equals(str) && ((b2 & 126) >> i15) == 39)) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    this.C = z2;
                                    this.A += 5;
                                    this.f1219z += i7;
                                } else {
                                    if (this.C) {
                                        this.h.A(i8);
                                        iVar.readFully(this.h.a, 0, this.B);
                                        wVar.c(this.h, this.B);
                                        iB = this.B;
                                        x xVar8 = this.h;
                                        int iF7 = u.f(xVar8.a, xVar8.c);
                                        this.h.E("video/hevc".equals(mVar.f.w) ? 1 : 0);
                                        this.h.D(iF7);
                                        b.c.a.a0.d.J(j2, this.h, this.F);
                                    } else {
                                        iB = wVar.b(iVar, i8, false);
                                    }
                                    this.A += iB;
                                    this.B -= iB;
                                    c = 6;
                                    i15 = 1;
                                }
                            }
                        }
                        if (!bVar3.l) {
                            i4 = bVar3.d.g[bVar3.f];
                        } else if (bVar3.f1221b.j[bVar3.f]) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        if (bVar3.b() != null) {
                            i4 |= BasicMeasure.EXACTLY;
                        }
                        int i25 = i4;
                        nVarB = bVar3.b();
                        if (nVarB != null) {
                            aVar = nVarB.c;
                        } else {
                            aVar = null;
                        }
                        wVar.d(j2, i25, this.f1219z, 0, aVar);
                        while (!this.n.isEmpty()) {
                            aVarRemoveFirst = this.n.removeFirst();
                            this.u -= aVarRemoveFirst.f1220b;
                            j3 = aVarRemoveFirst.a + j2;
                            wVarArr = this.E;
                            i5 = 0;
                            while (i5 < length) {
                                wVarArr[i5].d(j3, 1, aVarRemoveFirst.f1220b, this.u, null);
                                i5++;
                            }
                        }
                        if (!bVar3.c()) {
                            this.f1218y = null;
                        }
                        this.o = 3;
                        i15 = 1;
                    } else {
                        if (bVar3.l) {
                            i9 = bVar3.d.d[bVar3.f];
                        } else {
                            i9 = bVar3.f1221b.h[bVar3.f];
                        }
                        this.f1219z = i9;
                        if (bVar3.f < bVar3.i) {
                            iVar.l(i9);
                            nVarB2 = bVar3.b();
                            if (nVarB2 != null) {
                                xVar = bVar3.f1221b.n;
                                i10 = nVarB2.d;
                                if (i10 != 0) {
                                    xVar.F(i10);
                                }
                                oVar = bVar3.f1221b;
                                int i26 = bVar3.f;
                                if (oVar.k) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    xVar.F(xVar.y() * 6);
                                }
                            }
                            if (!bVar3.c()) {
                                this.f1218y = null;
                            }
                            this.o = 3;
                        } else {
                            if (bVar3.d.a.g == 1) {
                                this.f1219z = i9 - 8;
                                iVar.l(8);
                            }
                            if ("audio/ac4".equals(bVar3.d.a.f.w)) {
                                this.A = bVar3.d(this.f1219z, 7);
                                b.i.a.c.t2.n.a(this.f1219z, this.j);
                                bVar3.a.c(this.j, 7);
                                this.A += 7;
                            } else {
                                this.A = bVar3.d(this.f1219z, 0);
                            }
                            this.f1219z += this.A;
                            this.o = 4;
                            this.B = 0;
                            pVar = bVar3.d;
                            mVar = pVar.a;
                            wVar = bVar3.a;
                            if (bVar3.l) {
                                j = pVar.f[bVar3.f];
                            } else {
                                j = bVar3.f1221b.i[bVar3.f];
                            }
                            j2 = j;
                            i = mVar.j;
                            if (i != 0) {
                                while (true) {
                                    i2 = this.A;
                                    i3 = this.f1219z;
                                    if (i2 < i3) {
                                        break;
                                        break;
                                    }
                                    this.A += wVar.b(iVar, i3 - i2, false);
                                }
                            } else {
                                bArr = this.g.a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                i6 = i + 1;
                                i7 = 4 - i;
                                while (this.A < this.f1219z) {
                                    i8 = this.B;
                                    if (i8 == 0) {
                                        iVar.readFully(bArr, i7, i6);
                                        this.g.E(0);
                                        iF = this.g.f();
                                        if (iF >= i15) {
                                            throw ParserException.a("Invalid NAL length", null);
                                        }
                                        this.B = iF - 1;
                                        this.f.E(0);
                                        wVar.c(this.f, 4);
                                        wVar.c(this.g, i15);
                                        if (this.F.length > 0) {
                                            str = mVar.f.w;
                                            b2 = bArr[4];
                                            byte[] bArr6 = u.a;
                                            if ((!"video/avc".equals(str) && (b2 & 31) == c) || ("video/hevc".equals(str) && ((b2 & 126) >> i15) == 39)) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                        this.C = z2;
                                        this.A += 5;
                                        this.f1219z += i7;
                                    } else {
                                        if (this.C) {
                                            this.h.A(i8);
                                            iVar.readFully(this.h.a, 0, this.B);
                                            wVar.c(this.h, this.B);
                                            iB = this.B;
                                            x xVar9 = this.h;
                                            int iF8 = u.f(xVar9.a, xVar9.c);
                                            this.h.E("video/hevc".equals(mVar.f.w) ? 1 : 0);
                                            this.h.D(iF8);
                                            b.c.a.a0.d.J(j2, this.h, this.F);
                                        } else {
                                            iB = wVar.b(iVar, i8, false);
                                        }
                                        this.A += iB;
                                        this.B -= iB;
                                        c = 6;
                                        i15 = 1;
                                    }
                                }
                            }
                            if (!bVar3.l) {
                                i4 = bVar3.d.g[bVar3.f];
                            } else if (bVar3.f1221b.j[bVar3.f]) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            if (bVar3.b() != null) {
                                i4 |= BasicMeasure.EXACTLY;
                            }
                            int i27 = i4;
                            nVarB = bVar3.b();
                            if (nVarB != null) {
                                aVar = nVarB.c;
                            } else {
                                aVar = null;
                            }
                            wVar.d(j2, i27, this.f1219z, 0, aVar);
                            while (!this.n.isEmpty()) {
                                aVarRemoveFirst = this.n.removeFirst();
                                this.u -= aVarRemoveFirst.f1220b;
                                j3 = aVarRemoveFirst.a + j2;
                                wVarArr = this.E;
                                i5 = 0;
                                while (i5 < length) {
                                    wVarArr[i5].d(j3, 1, aVarRemoveFirst.f1220b, this.u, null);
                                    i5++;
                                }
                            }
                            if (!bVar3.c()) {
                                this.f1218y = null;
                            }
                            this.o = 3;
                            i15 = 1;
                        }
                    }
                }
                if (i15 != 0) {
                    return 0;
                }
            } else {
                int size3 = this.e.size();
                long j12 = Long.MAX_VALUE;
                b bVarValueAt2 = null;
                for (int i28 = 0; i28 < size3; i28++) {
                    o oVar4 = this.e.valueAt(i28).f1221b;
                    if (oVar4.o) {
                        long j13 = oVar4.c;
                        if (j13 < j12) {
                            bVarValueAt2 = this.e.valueAt(i28);
                            j12 = j13;
                        }
                    }
                }
                if (bVarValueAt2 == null) {
                    this.o = 3;
                } else {
                    int position5 = (int) (j12 - iVar.getPosition());
                    if (position5 < 0) {
                        throw ParserException.a("Offset to encryption data was negative.", null);
                    }
                    iVar.l(position5);
                    o oVar5 = bVarValueAt2.f1221b;
                    x xVar10 = oVar5.n;
                    iVar.readFully(xVar10.a, 0, xVar10.c);
                    oVar5.n.E(0);
                    oVar5.o = false;
                }
            }
        }
    }

    @Override // b.i.a.c.x2.h
    public void f(b.i.a.c.x2.j jVar) {
        int i;
        this.D = jVar;
        c();
        w[] wVarArr = new w[2];
        this.E = wVarArr;
        int i2 = 100;
        int i3 = 0;
        if ((this.c & 4) != 0) {
            wVarArr[0] = this.D.p(100, 5);
            i2 = 101;
            i = 1;
        } else {
            i = 0;
        }
        w[] wVarArr2 = (w[]) e0.D(this.E, i);
        this.E = wVarArr2;
        for (w wVar : wVarArr2) {
            wVar.e(f1215b);
        }
        this.F = new w[this.d.size()];
        while (i3 < this.F.length) {
            w wVarP = this.D.p(i2, 3);
            wVarP.e(this.d.get(i3));
            this.F[i3] = wVarP;
            i3++;
            i2++;
        }
    }

    @Override // b.i.a.c.x2.h
    public void g(long j, long j2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.valueAt(i).e();
        }
        this.n.clear();
        this.u = 0;
        this.v = j2;
        this.m.clear();
        c();
    }

    @Nullable
    public static DrmInitData h(List<d.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            d.b bVar = list.get(i);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f1210b.a;
                j jVarV1 = b.c.a.a0.d.v1(bArr);
                UUID uuid = jVarV1 == null ? null : jVarV1.a;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void i(x xVar, int i, o oVar) throws ParserException {
        xVar.E(i + 8);
        int iF = xVar.f() & ViewCompat.MEASURED_SIZE_MASK;
        if ((iF & 1) != 0) {
            throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iF & 2) != 0;
        int iW = xVar.w();
        if (iW == 0) {
            Arrays.fill(oVar.l, 0, oVar.e, false);
            return;
        }
        int i2 = oVar.e;
        if (iW != i2) {
            throw ParserException.a(b.d.b.a.a.h(80, "Senc sample count ", iW, " is different from fragment sample count", i2), null);
        }
        Arrays.fill(oVar.l, 0, iW, z2);
        int iA = xVar.a();
        x xVar2 = oVar.n;
        byte[] bArr = xVar2.a;
        if (bArr.length < iA) {
            bArr = new byte[iA];
        }
        xVar2.a = bArr;
        xVar2.c = iA;
        xVar2.f984b = 0;
        oVar.k = true;
        oVar.o = true;
        xVar.e(bArr, 0, iA);
        oVar.n.E(0);
        oVar.o = false;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x035d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0370 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0372  */
    /* JADX WARN: Code duplicated, block: B:146:0x037b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0384  */
    /* JADX WARN: Code duplicated, block: B:150:0x038d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0396  */
    /* JADX WARN: Code duplicated, block: B:154:0x039f  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:170:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:281:0x0680  */
    public final void j(long j) throws ParserException {
        g gVar;
        byte[] bArr;
        SparseArray<b> sparseArray;
        d.a aVar;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr2;
        int i5;
        o oVar;
        int i6;
        long j2;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z2;
        int i7;
        long j3;
        long j4;
        int i8;
        int iF;
        int iF2;
        int iF3;
        int iF4;
        boolean z3;
        g gVar2 = this;
        g gVar3 = gVar2;
        while (!gVar3.m.isEmpty() && gVar3.m.peek().f1209b == j) {
            d.a aVarPop = gVar3.m.pop();
            int i9 = aVarPop.a;
            int i10 = 12;
            if (i9 == 1836019574) {
                b.c.a.a0.d.E(true, "Unexpected moov box.");
                DrmInitData drmInitDataH = h(aVarPop.c);
                d.a aVarB = aVarPop.b(1836475768);
                Objects.requireNonNull(aVarB);
                SparseArray<f> sparseArray2 = new SparseArray<>();
                int size = aVarB.c.size();
                long jU = -9223372036854775807L;
                int i11 = 0;
                while (i11 < size) {
                    d.b bVar = aVarB.c.get(i11);
                    int i12 = bVar.a;
                    if (i12 == 1953654136) {
                        x xVar = bVar.f1210b;
                        xVar.E(i10);
                        Pair pairCreate = Pair.create(Integer.valueOf(xVar.f()), new f(xVar.f() - 1, xVar.f(), xVar.f(), xVar.f()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (f) pairCreate.second);
                    } else {
                        if (i12 == 1835362404) {
                            x xVar2 = bVar.f1210b;
                            xVar2.E(8);
                            jU = ((xVar2.f() >> 24) & 255) == 0 ? xVar2.u() : xVar2.x();
                        }
                        i11++;
                        i10 = 12;
                    }
                    i11++;
                    i10 = 12;
                }
                ArrayList arrayList = (ArrayList) e.e(aVarPop, new b.i.a.c.x2.p(), jU, drmInitDataH, (gVar3.c & 16) != 0, false, new c(gVar3));
                int size2 = arrayList.size();
                if (gVar3.e.size() == 0) {
                    for (int i13 = 0; i13 < size2; i13++) {
                        p pVar = (p) arrayList.get(i13);
                        m mVar = pVar.a;
                        gVar3.e.put(mVar.a, new b(gVar3.D.p(i13, mVar.f1230b), pVar, gVar3.d(sparseArray2, mVar.a)));
                        gVar3.w = Math.max(gVar3.w, mVar.e);
                    }
                    gVar3.D.j();
                } else {
                    b.c.a.a0.d.D(gVar3.e.size() == size2);
                    for (int i14 = 0; i14 < size2; i14++) {
                        p pVar2 = (p) arrayList.get(i14);
                        m mVar2 = pVar2.a;
                        b bVar2 = gVar3.e.get(mVar2.a);
                        f fVarD = gVar3.d(sparseArray2, mVar2.a);
                        bVar2.d = pVar2;
                        bVar2.e = fVarD;
                        bVar2.a.e(pVar2.a.f);
                        bVar2.e();
                    }
                }
                gVar = gVar2;
            } else {
                int i15 = 8;
                if (i9 == 1836019558) {
                    SparseArray<b> sparseArray3 = gVar3.e;
                    int i16 = gVar3.c;
                    byte[] bArr3 = gVar3.i;
                    int size3 = aVarPop.d.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        d.a aVar2 = aVarPop.d.get(i17);
                        if (aVar2.a == 1953653094) {
                            d.b bVarC = aVar2.c(1952868452);
                            Objects.requireNonNull(bVarC);
                            x xVar3 = bVarC.f1210b;
                            xVar3.E(i15);
                            int iF5 = xVar3.f() & ViewCompat.MEASURED_SIZE_MASK;
                            b bVar3 = sparseArray3.get(xVar3.f());
                            if (bVar3 == null) {
                                bVar3 = null;
                            } else {
                                if ((iF5 & 1) != 0) {
                                    long jX = xVar3.x();
                                    o oVar2 = bVar3.f1221b;
                                    oVar2.f1232b = jX;
                                    oVar2.c = jX;
                                }
                                f fVar = bVar3.e;
                                bVar3.f1221b.a = new f((iF5 & 2) != 0 ? xVar3.f() - 1 : fVar.a, (iF5 & 8) != 0 ? xVar3.f() : fVar.f1214b, (iF5 & 16) != 0 ? xVar3.f() : fVar.c, (iF5 & 32) != 0 ? xVar3.f() : fVar.d);
                            }
                            if (bVar3 == null) {
                                bArr = bArr3;
                                sparseArray = sparseArray3;
                                aVar = aVarPop;
                                i = i16;
                                i2 = size3;
                                i3 = i17;
                            } else {
                                o oVar3 = bVar3.f1221b;
                                long j5 = oVar3.p;
                                boolean z4 = oVar3.q;
                                bVar3.e();
                                bVar3.l = true;
                                d.b bVarC2 = aVar2.c(1952867444);
                                if (bVarC2 == null || (i16 & 2) != 0) {
                                    oVar3.p = j5;
                                    oVar3.q = z4;
                                } else {
                                    x xVar4 = bVarC2.f1210b;
                                    xVar4.E(i15);
                                    oVar3.p = ((xVar4.f() >> 24) & 255) == 1 ? xVar4.x() : xVar4.u();
                                    oVar3.q = true;
                                }
                                List<d.b> list = aVar2.c;
                                int size4 = list.size();
                                int i18 = 0;
                                int i19 = 0;
                                int i20 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i18 >= size4) {
                                        break;
                                    }
                                    SparseArray<b> sparseArray4 = sparseArray3;
                                    d.b bVar4 = list.get(i18);
                                    int i21 = size3;
                                    if (bVar4.a == 1953658222) {
                                        x xVar5 = bVar4.f1210b;
                                        xVar5.E(12);
                                        int iW = xVar5.w();
                                        if (iW > 0) {
                                            i20 += iW;
                                            i19++;
                                        }
                                    }
                                    i18++;
                                    size3 = i21;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i2 = size3;
                                bVar3.h = 0;
                                bVar3.g = 0;
                                bVar3.f = 0;
                                o oVar4 = bVar3.f1221b;
                                oVar4.d = i19;
                                oVar4.e = i20;
                                if (oVar4.g.length < i19) {
                                    oVar4.f = new long[i19];
                                    oVar4.g = new int[i19];
                                }
                                if (oVar4.h.length < i20) {
                                    int i22 = (i20 * Opcodes.LUSHR) / 100;
                                    oVar4.h = new int[i22];
                                    oVar4.i = new long[i22];
                                    oVar4.j = new boolean[i22];
                                    oVar4.l = new boolean[i22];
                                }
                                int i23 = 0;
                                int i24 = 0;
                                int i25 = 0;
                                while (i23 < size4) {
                                    d.b bVar5 = list.get(i23);
                                    if (bVar5.a == i4) {
                                        int i26 = i25 + 1;
                                        x xVar6 = bVar5.f1210b;
                                        xVar6.E(8);
                                        int iF6 = xVar6.f() & ViewCompat.MEASURED_SIZE_MASK;
                                        m mVar3 = bVar3.d.a;
                                        o oVar5 = bVar3.f1221b;
                                        f fVar2 = oVar5.a;
                                        int i27 = e0.a;
                                        oVar5.g[i25] = xVar6.w();
                                        long[] jArr2 = oVar5.f;
                                        jArr2[i25] = oVar5.f1232b;
                                        if ((iF6 & 1) != 0) {
                                            jArr2[i25] = jArr2[i25] + ((long) xVar6.f());
                                        }
                                        boolean z5 = (iF6 & 4) != 0;
                                        int iF7 = fVar2.d;
                                        if (z5) {
                                            iF7 = xVar6.f();
                                        }
                                        boolean z6 = (iF6 & 256) != 0;
                                        boolean z7 = (iF6 & 512) != 0;
                                        boolean z8 = (iF6 & 1024) != 0;
                                        boolean z9 = (iF6 & 2048) != 0;
                                        long[] jArr3 = mVar3.h;
                                        if (jArr3 != null) {
                                            i6 = iF7;
                                            oVar = oVar3;
                                            if (jArr3.length == 1 && jArr3[0] == 0) {
                                                j2 = mVar3.i[0];
                                            }
                                            iArr = oVar5.h;
                                            jArr = oVar5.i;
                                            zArr = oVar5.j;
                                            if (mVar3.f1230b == 2 || (i16 & 1) == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            i7 = oVar5.g[i25] + i24;
                                            j3 = mVar3.c;
                                            j4 = oVar5.p;
                                            i8 = i24;
                                            while (i8 < i7) {
                                                if (z6) {
                                                    iF = xVar6.f();
                                                } else {
                                                    iF = fVar2.f1214b;
                                                }
                                                a(iF);
                                                if (z7) {
                                                    iF2 = xVar6.f();
                                                } else {
                                                    iF2 = fVar2.c;
                                                }
                                                a(iF2);
                                                if (z8) {
                                                    iF3 = xVar6.f();
                                                } else if (i8 == 0 || !z5) {
                                                    iF3 = fVar2.d;
                                                } else {
                                                    iF3 = i6;
                                                }
                                                if (z9) {
                                                    iF4 = xVar6.f();
                                                } else {
                                                    iF4 = 0;
                                                }
                                                jArr[i8] = e0.F((((long) iF4) + j4) - j2, 1000000L, j3);
                                                if (!oVar5.q) {
                                                    jArr[i8] = jArr[i8] + bVar3.d.h;
                                                }
                                                iArr[i8] = iF2;
                                                if (((iF3 >> 16) & 1) == 0 || (z2 && i8 != 0)) {
                                                    z3 = false;
                                                } else {
                                                    z3 = true;
                                                }
                                                zArr[i8] = z3;
                                                j4 += (long) iF;
                                                i8++;
                                                i7 = i7;
                                                xVar6 = xVar6;
                                                z6 = z6;
                                                z7 = z7;
                                                z5 = z5;
                                                z8 = z8;
                                                z9 = z9;
                                            }
                                            int i28 = i7;
                                            oVar5.p = j4;
                                            i25 = i26;
                                            i24 = i28;
                                        } else {
                                            i6 = iF7;
                                            oVar = oVar3;
                                        }
                                        j2 = 0;
                                        iArr = oVar5.h;
                                        jArr = oVar5.i;
                                        zArr = oVar5.j;
                                        if (mVar3.f1230b == 2) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        i7 = oVar5.g[i25] + i24;
                                        j3 = mVar3.c;
                                        j4 = oVar5.p;
                                        i8 = i24;
                                        while (i8 < i7) {
                                            if (z6) {
                                                iF = xVar6.f();
                                            } else {
                                                iF = fVar2.f1214b;
                                            }
                                            a(iF);
                                            if (z7) {
                                                iF2 = xVar6.f();
                                            } else {
                                                iF2 = fVar2.c;
                                            }
                                            a(iF2);
                                            if (z8) {
                                                iF3 = xVar6.f();
                                            } else if (i8 == 0) {
                                                iF3 = fVar2.d;
                                            } else {
                                                iF3 = fVar2.d;
                                            }
                                            if (z9) {
                                                iF4 = xVar6.f();
                                            } else {
                                                iF4 = 0;
                                            }
                                            jArr[i8] = e0.F((((long) iF4) + j4) - j2, 1000000L, j3);
                                            if (!oVar5.q) {
                                                jArr[i8] = jArr[i8] + bVar3.d.h;
                                            }
                                            iArr[i8] = iF2;
                                            if (((iF3 >> 16) & 1) == 0) {
                                                z3 = false;
                                            } else {
                                                z3 = false;
                                            }
                                            zArr[i8] = z3;
                                            j4 += (long) iF;
                                            i8++;
                                            i7 = i7;
                                            xVar6 = xVar6;
                                            z6 = z6;
                                            z7 = z7;
                                            z5 = z5;
                                            z8 = z8;
                                            z9 = z9;
                                        }
                                        int i29 = i7;
                                        oVar5.p = j4;
                                        i25 = i26;
                                        i24 = i29;
                                    } else {
                                        bArr3 = bArr3;
                                        i23 = i23;
                                        aVarPop = aVarPop;
                                        oVar = oVar3;
                                    }
                                    i23++;
                                    i16 = i16;
                                    list = list;
                                    size4 = size4;
                                    i17 = i17;
                                    aVar2 = aVar2;
                                    aVarPop = aVarPop;
                                    bArr3 = bArr3;
                                    oVar3 = oVar;
                                    i4 = 1953658222;
                                }
                                byte[] bArr4 = bArr3;
                                aVar = aVarPop;
                                i = i16;
                                i3 = i17;
                                o oVar6 = oVar3;
                                m mVar4 = bVar3.d.a;
                                f fVar3 = oVar6.a;
                                Objects.requireNonNull(fVar3);
                                n nVarA = mVar4.a(fVar3.a);
                                d.b bVarC3 = aVar2.c(1935763834);
                                if (bVarC3 != null) {
                                    Objects.requireNonNull(nVarA);
                                    x xVar7 = bVarC3.f1210b;
                                    int i30 = nVarA.d;
                                    xVar7.E(8);
                                    if ((xVar7.f() & ViewCompat.MEASURED_SIZE_MASK & 1) == 1) {
                                        xVar7.F(8);
                                    }
                                    int iT = xVar7.t();
                                    int iW2 = xVar7.w();
                                    int i31 = oVar6.e;
                                    if (iW2 > i31) {
                                        throw ParserException.a(b.d.b.a.a.h(78, "Saiz sample count ", iW2, " is greater than fragment sample count", i31), null);
                                    }
                                    if (iT == 0) {
                                        boolean[] zArr2 = oVar6.l;
                                        i5 = 0;
                                        for (int i32 = 0; i32 < iW2; i32++) {
                                            int iT2 = xVar7.t();
                                            i5 += iT2;
                                            zArr2[i32] = iT2 > i30;
                                        }
                                    } else {
                                        i5 = (iT * iW2) + 0;
                                        Arrays.fill(oVar6.l, 0, iW2, iT > i30);
                                    }
                                    Arrays.fill(oVar6.l, iW2, oVar6.e, false);
                                    if (i5 > 0) {
                                        x xVar8 = oVar6.n;
                                        byte[] bArr5 = xVar8.a;
                                        if (bArr5.length < i5) {
                                            bArr5 = new byte[i5];
                                        }
                                        xVar8.C(bArr5, i5);
                                        oVar6.k = true;
                                        oVar6.o = true;
                                    }
                                }
                                d.b bVarC4 = aVar2.c(1935763823);
                                if (bVarC4 != null) {
                                    x xVar9 = bVarC4.f1210b;
                                    xVar9.E(8);
                                    int iF8 = xVar9.f();
                                    if ((16777215 & iF8 & 1) == 1) {
                                        xVar9.F(8);
                                    }
                                    int iW3 = xVar9.w();
                                    if (iW3 != 1) {
                                        throw b.d.b.a.a.w0(40, "Unexpected saio entry count: ", iW3, null);
                                    }
                                    oVar6.c += ((iF8 >> 24) & 255) == 0 ? xVar9.u() : xVar9.x();
                                }
                                byte[] bArr6 = null;
                                d.b bVarC5 = aVar2.c(1936027235);
                                if (bVarC5 != null) {
                                    i(bVarC5.f1210b, 0, oVar6);
                                }
                                String str = nVarA != null ? nVarA.f1231b : null;
                                x xVar10 = null;
                                x xVar11 = null;
                                for (int i33 = 0; i33 < aVar2.c.size(); i33++) {
                                    d.b bVar6 = aVar2.c.get(i33);
                                    x xVar12 = bVar6.f1210b;
                                    int i34 = bVar6.a;
                                    if (i34 == 1935828848) {
                                        xVar12.E(12);
                                        if (xVar12.f() == 1936025959) {
                                            xVar10 = xVar12;
                                        }
                                    } else if (i34 == 1936158820) {
                                        xVar12.E(12);
                                        if (xVar12.f() == 1936025959) {
                                            xVar11 = xVar12;
                                        }
                                    }
                                }
                                if (xVar10 != null && xVar11 != null) {
                                    xVar10.E(8);
                                    int iF9 = (xVar10.f() >> 24) & 255;
                                    xVar10.F(4);
                                    if (iF9 == 1) {
                                        xVar10.F(4);
                                    }
                                    if (xVar10.f() != 1) {
                                        throw ParserException.b("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    xVar11.E(8);
                                    int iF10 = (xVar11.f() >> 24) & 255;
                                    xVar11.F(4);
                                    if (iF10 == 1) {
                                        if (xVar11.u() == 0) {
                                            throw ParserException.b("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iF10 >= 2) {
                                        xVar11.F(4);
                                    }
                                    if (xVar11.u() != 1) {
                                        throw ParserException.b("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    xVar11.F(1);
                                    int iT3 = xVar11.t();
                                    int i35 = (iT3 & 240) >> 4;
                                    int i36 = iT3 & 15;
                                    boolean z10 = xVar11.t() == 1;
                                    if (z10) {
                                        int iT4 = xVar11.t();
                                        byte[] bArr7 = new byte[16];
                                        System.arraycopy(xVar11.a, xVar11.f984b, bArr7, 0, 16);
                                        xVar11.f984b += 16;
                                        if (iT4 == 0) {
                                            int iT5 = xVar11.t();
                                            bArr6 = new byte[iT5];
                                            System.arraycopy(xVar11.a, xVar11.f984b, bArr6, 0, iT5);
                                            xVar11.f984b += iT5;
                                        }
                                        oVar6.k = true;
                                        oVar6.m = new n(z10, str, iT4, bArr7, i35, i36, bArr6);
                                    }
                                }
                                int size5 = aVar2.c.size();
                                int i37 = 0;
                                while (i37 < size5) {
                                    d.b bVar7 = aVar2.c.get(i37);
                                    if (bVar7.a == 1970628964) {
                                        x xVar13 = bVar7.f1210b;
                                        xVar13.E(8);
                                        bArr2 = bArr4;
                                        System.arraycopy(xVar13.a, xVar13.f984b, bArr2, 0, 16);
                                        xVar13.f984b += 16;
                                        if (Arrays.equals(bArr2, a)) {
                                            i(xVar13, 16, oVar6);
                                        }
                                    } else {
                                        bArr2 = bArr4;
                                    }
                                    i37++;
                                    bArr4 = bArr2;
                                }
                                bArr = bArr4;
                            }
                        } else {
                            bArr = bArr3;
                            sparseArray = sparseArray3;
                            aVar = aVarPop;
                            i = i16;
                            i2 = size3;
                            i3 = i17;
                        }
                        i17 = i3 + 1;
                        i15 = 8;
                        bArr3 = bArr;
                        i16 = i;
                        size3 = i2;
                        sparseArray3 = sparseArray;
                        aVarPop = aVar;
                    }
                    DrmInitData drmInitDataH2 = h(aVarPop.c);
                    gVar = this;
                    if (drmInitDataH2 != null) {
                        int size6 = gVar.e.size();
                        for (int i38 = 0; i38 < size6; i38++) {
                            b bVarValueAt = gVar.e.valueAt(i38);
                            m mVar5 = bVarValueAt.d.a;
                            f fVar4 = bVarValueAt.f1221b.a;
                            int i39 = e0.a;
                            n nVarA2 = mVar5.a(fVar4.a);
                            DrmInitData drmInitDataA = drmInitDataH2.a(nVarA2 != null ? nVarA2.f1231b : null);
                            j1.b bVarA = bVarValueAt.d.a.f.a();
                            bVarA.n = drmInitDataA;
                            bVarValueAt.a.e(bVarA.a());
                        }
                    }
                    if (gVar.v != -9223372036854775807L) {
                        int size7 = gVar.e.size();
                        for (int i40 = 0; i40 < size7; i40++) {
                            b bVarValueAt2 = gVar.e.valueAt(i40);
                            long j6 = gVar.v;
                            int i41 = bVarValueAt2.f;
                            while (true) {
                                o oVar7 = bVarValueAt2.f1221b;
                                if (i41 >= oVar7.e || oVar7.i[i41] >= j6) {
                                    break;
                                }
                                if (oVar7.j[i41]) {
                                    bVarValueAt2.i = i41;
                                }
                                i41++;
                            }
                        }
                        gVar.v = -9223372036854775807L;
                    }
                    gVar3 = gVar;
                } else {
                    gVar = gVar2;
                    if (!gVar3.m.isEmpty()) {
                        gVar3.m.peek().d.add(aVarPop);
                    }
                }
            }
            gVar2 = gVar;
        }
        c();
    }

    @Override // b.i.a.c.x2.h
    public void release() {
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public final class b {
        public final w a;
        public p d;
        public f e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f1221b = new o();
        public final x c = new x();
        public final x j = new x(1);
        public final x k = new x();

        public b(w wVar, p pVar, f fVar) {
            this.a = wVar;
            this.d = pVar;
            this.e = fVar;
            this.d = pVar;
            this.e = fVar;
            wVar.e(pVar.a.f);
            e();
        }

        public long a() {
            return !this.l ? this.d.c[this.f] : this.f1221b.f[this.h];
        }

        @Nullable
        public n b() {
            if (!this.l) {
                return null;
            }
            o oVar = this.f1221b;
            f fVar = oVar.a;
            int i = e0.a;
            int i2 = fVar.a;
            n nVarA = oVar.m;
            if (nVarA == null) {
                nVarA = this.d.a.a(i2);
            }
            if (nVarA == null || !nVarA.a) {
                return null;
            }
            return nVarA;
        }

        public boolean c() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.f1221b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public int d(int i, int i2) {
            x xVar;
            n nVarB = b();
            if (nVarB == null) {
                return 0;
            }
            int length = nVarB.d;
            if (length != 0) {
                xVar = this.f1221b.n;
            } else {
                byte[] bArr = nVarB.e;
                int i3 = e0.a;
                x xVar2 = this.k;
                int length2 = bArr.length;
                xVar2.a = bArr;
                xVar2.c = length2;
                xVar2.f984b = 0;
                length = bArr.length;
                xVar = xVar2;
            }
            o oVar = this.f1221b;
            boolean z2 = oVar.k && oVar.l[this.f];
            boolean z3 = z2 || i2 != 0;
            x xVar3 = this.j;
            xVar3.a[0] = (byte) ((z3 ? 128 : 0) | length);
            xVar3.E(0);
            this.a.f(this.j, 1, 1);
            this.a.f(xVar, length, 1);
            if (!z3) {
                return length + 1;
            }
            if (!z2) {
                this.c.A(8);
                x xVar4 = this.c;
                byte[] bArr2 = xVar4.a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i2 >> 8) & 255);
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                this.a.f(xVar4, 8, 1);
                return length + 1 + 8;
            }
            x xVar5 = this.f1221b.n;
            int iY = xVar5.y();
            xVar5.F(-2);
            int i4 = (iY * 6) + 2;
            if (i2 != 0) {
                this.c.A(i4);
                byte[] bArr3 = this.c.a;
                xVar5.e(bArr3, 0, i4);
                int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & 255);
                bArr3[3] = (byte) (i5 & 255);
                xVar5 = this.c;
            }
            this.a.f(xVar5, i4, 1);
            return length + 1 + i4;
        }

        public void e() {
            o oVar = this.f1221b;
            oVar.d = 0;
            oVar.p = 0L;
            oVar.q = false;
            oVar.k = false;
            oVar.o = false;
            oVar.m = null;
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }
    }
}
