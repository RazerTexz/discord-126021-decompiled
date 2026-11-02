package b.i.e.s.b;

import b.i.e.n.BitMatrix;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b.i.e.s.b.c, reason: use source file name */
/* JADX INFO: compiled from: DataMask.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DataMask {
    public static final DataMask j;
    public static final DataMask k;
    public static final DataMask l;
    public static final DataMask m;
    public static final DataMask n;
    public static final DataMask o;
    public static final DataMask p;
    public static final DataMask q;
    public static final /* synthetic */ DataMask[] r;

    /* JADX INFO: renamed from: b.i.e.s.b.c$a */
    /* JADX INFO: compiled from: DataMask.java */
    public final enum a extends DataMask {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // b.i.e.s.b.DataMask
        public boolean f(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    /* JADX INFO: renamed from: b.i.e.s.b.c$b */
    /* JADX INFO: compiled from: DataMask.java */
    public final enum b extends DataMask {
        public b(String str, int i) {
            super(str, i, null);
        }

        @Override // b.i.e.s.b.DataMask
        public boolean f(int i, int i2) {
            return (i & 1) == 0;
        }
    }

    /* JADX INFO: renamed from: b.i.e.s.b.c$c */
    /* JADX INFO: compiled from: DataMask.java */
    public final enum c extends DataMask {
        public c(String str, int i) {
            super(str, i, null);
        }

        @Override // b.i.e.s.b.DataMask
        public boolean f(int i, int i2) {
            return i2 % 3 == 0;
        }
    }

    /* JADX INFO: renamed from: b.i.e.s.b.c$d */
    /* JADX INFO: compiled from: DataMask.java */
    public final enum d extends DataMask {
        public d(String str, int i) {
            super(str, i, null);
        }

        @Override // b.i.e.s.b.DataMask
        public boolean f(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    }

    /* JADX INFO: renamed from: b.i.e.s.b.c$e */
    /* JADX INFO: compiled from: DataMask.java */
    public final enum e extends DataMask {
        public e(String str, int i) {
            super(str, i, null);
        }

        @Override // b.i.e.s.b.DataMask
        public boolean f(int i, int i2) {
            return (((i2 / 3) + (i / 2)) & 1) == 0;
        }
    }

    /* JADX INFO: renamed from: b.i.e.s.b.c$f */
    /* JADX INFO: compiled from: DataMask.java */
    public final enum f extends DataMask {
        public f(String str, int i) {
            super(str, i, null);
        }

        @Override // b.i.e.s.b.DataMask
        public boolean f(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    }

    /* JADX INFO: renamed from: b.i.e.s.b.c$g */
    /* JADX INFO: compiled from: DataMask.java */
    public final enum g extends DataMask {
        public g(String str, int i) {
            super(str, i, null);
        }

        @Override // b.i.e.s.b.DataMask
        public boolean f(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    }

    /* JADX INFO: renamed from: b.i.e.s.b.c$h */
    /* JADX INFO: compiled from: DataMask.java */
    public final enum h extends DataMask {
        public h(String str, int i) {
            super(str, i, null);
        }

        @Override // b.i.e.s.b.DataMask
        public boolean f(int i, int i2) {
            return ((((i * i2) % 3) + (i + i2)) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        j = aVar;
        b bVar = new b("DATA_MASK_001", 1);
        k = bVar;
        c cVar = new c("DATA_MASK_010", 2);
        l = cVar;
        d dVar = new d("DATA_MASK_011", 3);
        m = dVar;
        e eVar = new e("DATA_MASK_100", 4);
        n = eVar;
        f fVar = new f("DATA_MASK_101", 5);
        o = fVar;
        g gVar = new g("DATA_MASK_110", 6);
        p = gVar;
        h hVar = new h("DATA_MASK_111", 7);
        q = hVar;
        r = new DataMask[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar};
    }

    public DataMask(String str, int i, a aVar) {
        super(str, i);
    }

    public abstract boolean f(int i, int i2);

    public final void g(BitMatrix bitMatrix, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (f(i2, i3)) {
                    bitMatrix.b(i3, i2);
                }
            }
        }
    }

    public static DataMask valueOf(String str) {
        return (DataMask) Enum.valueOf(DataMask.class, str);
    }

    public static DataMask[] values() {
        return (DataMask[]) r.clone();
    }
}
