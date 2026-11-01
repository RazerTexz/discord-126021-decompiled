package f0.e0.j;

import com.discord.api.permission.Permission;
import d0.t.u;
import g0.x;
import g0.y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.ranges.IntProgression;
import okio.ByteString;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Closeable {
    public static final Logger j;
    public static final m k = null;
    public final a l;
    public final c.a m;
    public final g0.g n;
    public final boolean o;

    /* JADX INFO: compiled from: Http2Reader.kt */
    public final class a implements x {
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public final g0.g o;

        public a(g0.g gVar) {
            d0.z.d.m.checkParameterIsNotNull(gVar, "source");
            this.o = gVar;
        }

        @Override // g0.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // g0.x
        public long i0(g0.e eVar, long j) throws IOException {
            int i;
            int i2;
            d0.z.d.m.checkParameterIsNotNull(eVar, "sink");
            do {
                int i3 = this.m;
                if (i3 != 0) {
                    long jI0 = this.o.i0(eVar, Math.min(j, i3));
                    if (jI0 == -1) {
                        return -1L;
                    }
                    this.m -= (int) jI0;
                    return jI0;
                }
                this.o.skip(this.n);
                this.n = 0;
                if ((this.k & 4) != 0) {
                    return -1L;
                }
                i = this.l;
                int iT = f0.e0.c.t(this.o);
                this.m = iT;
                this.j = iT;
                int i4 = this.o.readByte() & 255;
                this.k = this.o.readByte() & 255;
                m mVar = m.k;
                Logger logger = m.j;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(d.e.b(true, this.l, this.j, i4, this.k));
                }
                i2 = this.o.readInt() & Integer.MAX_VALUE;
                this.l = i2;
                if (i4 != 9) {
                    throw new IOException(i4 + " != TYPE_CONTINUATION");
                }
            } while (i2 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // g0.x
        public y timeout() {
            return this.o.timeout();
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    public interface b {
        void a();

        void b(boolean z2, s sVar);

        void c(boolean z2, int i, int i2, List<f0.e0.j.b> list);

        void d(int i, long j);

        void e(boolean z2, int i, g0.g gVar, int i2) throws IOException;

        void f(boolean z2, int i, int i2);

        void g(int i, int i2, int i3, boolean z2);

        void h(int i, f0.e0.j.a aVar);

        void i(int i, int i2, List<f0.e0.j.b> list) throws IOException;

        void j(int i, f0.e0.j.a aVar, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        d0.z.d.m.checkExpressionValueIsNotNull(logger, "Logger.getLogger(Http2::class.java.name)");
        j = logger;
    }

    public m(g0.g gVar, boolean z2) {
        d0.z.d.m.checkParameterIsNotNull(gVar, "source");
        this.n = gVar;
        this.o = z2;
        a aVar = new a(gVar);
        this.l = aVar;
        this.m = new c.a(aVar, 4096, 0, 4);
    }

    public final boolean a(boolean z2, b bVar) throws IOException {
        f0.e0.j.a aVar;
        f0.e0.j.a aVar2;
        d0.z.d.m.checkParameterIsNotNull(bVar, "handler");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        try {
            this.n.p0(9L);
            int iT = f0.e0.c.t(this.n);
            if (iT > 16384) {
                throw new IOException(b.d.b.a.a.q("FRAME_SIZE_ERROR: ", iT));
            }
            int i4 = this.n.readByte() & 255;
            int i5 = this.n.readByte() & 255;
            int i6 = this.n.readInt() & Integer.MAX_VALUE;
            Logger logger = j;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d.e.b(true, i6, iT, i4, i5));
            }
            if (z2 && i4 != 4) {
                StringBuilder sbU = b.d.b.a.a.U("Expected a SETTINGS frame but was ");
                sbU.append(d.e.a(i4));
                throw new IOException(sbU.toString());
            }
            switch (i4) {
                case 0:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z3 = (i5 & 1) != 0;
                    if ((i5 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int i7 = i5 & 8;
                    if (i7 != 0) {
                        byte b2 = this.n.readByte();
                        byte[] bArr = f0.e0.c.a;
                        i = b2 & 255;
                    }
                    if (i7 != 0) {
                        iT--;
                    }
                    if (i > iT) {
                        throw new IOException(b.d.b.a.a.s("PROTOCOL_ERROR padding ", i, " > remaining length ", iT));
                    }
                    bVar.e(z3, i6, this.n, iT - i);
                    this.n.skip(i);
                    return true;
                case 1:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z4 = (i5 & 1) != 0;
                    int i8 = i5 & 8;
                    if (i8 != 0) {
                        byte b3 = this.n.readByte();
                        byte[] bArr2 = f0.e0.c.a;
                        i3 = b3 & 255;
                    }
                    if ((i5 & 32) != 0) {
                        d(bVar, i6);
                        iT -= 5;
                    }
                    if (i8 != 0) {
                        iT--;
                    }
                    if (i3 > iT) {
                        throw new IOException(b.d.b.a.a.s("PROTOCOL_ERROR padding ", i3, " > remaining length ", iT));
                    }
                    bVar.c(z4, i6, -1, c(iT - i3, i3, i5, i6));
                    return true;
                case 2:
                    if (iT != 5) {
                        throw new IOException(b.d.b.a.a.r("TYPE_PRIORITY length: ", iT, " != 5"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    d(bVar, i6);
                    return true;
                case 3:
                    if (iT != 4) {
                        throw new IOException(b.d.b.a.a.r("TYPE_RST_STREAM length: ", iT, " != 4"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i9 = this.n.readInt();
                    f0.e0.j.a[] aVarArrValues = f0.e0.j.a.values();
                    int i10 = 0;
                    while (true) {
                        if (i10 < 14) {
                            aVar = aVarArrValues[i10];
                            if (!(aVar.f() == i9)) {
                                i10++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        throw new IOException(b.d.b.a.a.q("TYPE_RST_STREAM unexpected error code: ", i9));
                    }
                    bVar.h(i6, aVar);
                    return true;
                case 4:
                    if (i6 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((i5 & 1) != 0) {
                        if (iT != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        bVar.a();
                    } else {
                        if (iT % 6 != 0) {
                            throw new IOException(b.d.b.a.a.q("TYPE_SETTINGS length % 6 != 0: ", iT));
                        }
                        s sVar = new s();
                        IntProgression intProgressionStep = d0.d0.f.step(d0.d0.f.until(0, iT), 6);
                        int first = intProgressionStep.getFirst();
                        int last = intProgressionStep.getLast();
                        int step = intProgressionStep.getStep();
                        if (step < 0 ? first >= last : first <= last) {
                            while (true) {
                                short s2 = this.n.readShort();
                                byte[] bArr3 = f0.e0.c.a;
                                int i11 = s2 & 65535;
                                int i12 = this.n.readInt();
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        i11 = 4;
                                    } else if (i11 == 4) {
                                        i11 = 7;
                                        if (i12 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                    } else if (i11 == 5 && (i12 < 16384 || i12 > 16777215)) {
                                        throw new IOException(b.d.b.a.a.q("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", i12));
                                    }
                                } else if (i12 != 0 && i12 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                sVar.c(i11, i12);
                                if (first != last) {
                                    first += step;
                                }
                            }
                        }
                        bVar.b(false, sVar);
                    }
                    return true;
                case 5:
                    if (i6 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int i13 = i5 & 8;
                    if (i13 != 0) {
                        byte b4 = this.n.readByte();
                        byte[] bArr4 = f0.e0.c.a;
                        i2 = b4 & 255;
                    }
                    int i14 = this.n.readInt() & Integer.MAX_VALUE;
                    int i15 = iT - 4;
                    if (i13 != 0) {
                        i15--;
                    }
                    if (i2 > i15) {
                        throw new IOException(b.d.b.a.a.s("PROTOCOL_ERROR padding ", i2, " > remaining length ", i15));
                    }
                    bVar.i(i6, i14, c(i15 - i2, i2, i5, i6));
                    return true;
                case 6:
                    if (iT != 8) {
                        throw new IOException(b.d.b.a.a.q("TYPE_PING length != 8: ", iT));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    bVar.f((i5 & 1) != 0, this.n.readInt(), this.n.readInt());
                    return true;
                case 7:
                    if (iT < 8) {
                        throw new IOException(b.d.b.a.a.q("TYPE_GOAWAY length < 8: ", iT));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i16 = this.n.readInt();
                    int i17 = this.n.readInt();
                    int i18 = iT - 8;
                    f0.e0.j.a[] aVarArrValues2 = f0.e0.j.a.values();
                    int i19 = 0;
                    while (true) {
                        if (i19 < 14) {
                            aVar2 = aVarArrValues2[i19];
                            if (!(aVar2.f() == i17)) {
                                i19++;
                            }
                        } else {
                            aVar2 = null;
                        }
                    }
                    if (aVar2 == null) {
                        throw new IOException(b.d.b.a.a.q("TYPE_GOAWAY unexpected error code: ", i17));
                    }
                    ByteString byteStringO = ByteString.j;
                    if (i18 > 0) {
                        byteStringO = this.n.o(i18);
                    }
                    bVar.j(i16, aVar2, byteStringO);
                    return true;
                case 8:
                    if (iT != 4) {
                        throw new IOException(b.d.b.a.a.q("TYPE_WINDOW_UPDATE length !=4: ", iT));
                    }
                    int i20 = this.n.readInt();
                    byte[] bArr5 = f0.e0.c.a;
                    long j2 = ((long) i20) & 2147483647L;
                    if (j2 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    bVar.d(i6, j2);
                    return true;
                default:
                    this.n.skip(iT);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(b bVar) throws IOException {
        d0.z.d.m.checkParameterIsNotNull(bVar, "handler");
        if (this.o) {
            if (!a(true, bVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        g0.g gVar = this.n;
        ByteString byteString = d.a;
        ByteString byteStringO = gVar.o(byteString.j());
        Logger logger = j;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder sbU = b.d.b.a.a.U("<< CONNECTION ");
            sbU.append(byteStringO.k());
            logger.fine(f0.e0.c.j(sbU.toString(), new Object[0]));
        }
        if (!d0.z.d.m.areEqual(byteString, byteStringO)) {
            StringBuilder sbU2 = b.d.b.a.a.U("Expected a connection header but was ");
            sbU2.append(byteStringO.q());
            throw new IOException(sbU2.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    public final List<f0.e0.j.b> c(int i, int i2, int i3, int i4) throws IOException {
        boolean z2;
        a aVar = this.l;
        aVar.m = i;
        aVar.j = i;
        aVar.n = i2;
        aVar.k = i3;
        aVar.l = i4;
        c.a aVar2 = this.m;
        while (!aVar2.f3635b.w()) {
            byte b2 = aVar2.f3635b.readByte();
            byte[] bArr = f0.e0.c.a;
            int i5 = b2 & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((i5 & 128) == 128) {
                int iG = aVar2.g(i5, Opcodes.LAND) - 1;
                if (iG >= 0) {
                    c cVar = c.c;
                    if (iG <= c.a.length - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    c cVar2 = c.c;
                    int iB = aVar2.b(iG - c.a.length);
                    if (iB >= 0) {
                        f0.e0.j.b[] bVarArr = aVar2.c;
                        if (iB < bVarArr.length) {
                            List<f0.e0.j.b> list = aVar2.a;
                            f0.e0.j.b bVar = bVarArr[iB];
                            if (bVar == null) {
                                d0.z.d.m.throwNpe();
                            }
                            list.add(bVar);
                        }
                    }
                    StringBuilder sbU = b.d.b.a.a.U("Header index too large ");
                    sbU.append(iG + 1);
                    throw new IOException(sbU.toString());
                }
                c cVar3 = c.c;
                aVar2.a.add(c.a[iG]);
            } else if (i5 == 64) {
                c cVar4 = c.c;
                ByteString byteStringF = aVar2.f();
                cVar4.a(byteStringF);
                aVar2.e(-1, new f0.e0.j.b(byteStringF, aVar2.f()));
            } else if ((i5 & 64) == 64) {
                aVar2.e(-1, new f0.e0.j.b(aVar2.d(aVar2.g(i5, 63) - 1), aVar2.f()));
            } else if ((i5 & 32) == 32) {
                int iG2 = aVar2.g(i5, 31);
                aVar2.h = iG2;
                if (iG2 < 0 || iG2 > aVar2.g) {
                    StringBuilder sbU2 = b.d.b.a.a.U("Invalid dynamic table size update ");
                    sbU2.append(aVar2.h);
                    throw new IOException(sbU2.toString());
                }
                int i6 = aVar2.f;
                if (iG2 < i6) {
                    if (iG2 == 0) {
                        aVar2.a();
                    } else {
                        aVar2.c(i6 - iG2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                c cVar5 = c.c;
                ByteString byteStringF2 = aVar2.f();
                cVar5.a(byteStringF2);
                aVar2.a.add(new f0.e0.j.b(byteStringF2, aVar2.f()));
            } else {
                aVar2.a.add(new f0.e0.j.b(aVar2.d(aVar2.g(i5, 15) - 1), aVar2.f()));
            }
        }
        c.a aVar3 = this.m;
        List<f0.e0.j.b> list2 = u.toList(aVar3.a);
        aVar3.a.clear();
        return list2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.n.close();
    }

    public final void d(b bVar, int i) throws IOException {
        int i2 = this.n.readInt();
        boolean z2 = (i2 & ((int) Permission.USE_APPLICATION_COMMANDS)) != 0;
        byte b2 = this.n.readByte();
        byte[] bArr = f0.e0.c.a;
        bVar.g(i, i2 & Integer.MAX_VALUE, (b2 & 255) + 1, z2);
    }
}
