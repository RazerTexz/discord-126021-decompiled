package b.i.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LongSerializationPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static final n j;
    public static final n k;
    public static final /* synthetic */ n[] l;

    /* JADX INFO: compiled from: LongSerializationPolicy.java */
    public final enum a extends n {
        public a(String str, int i) {
            super(str, i, null);
        }
    }

    /* JADX INFO: compiled from: LongSerializationPolicy.java */
    public final enum b extends n {
        public b(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        j = aVar;
        b bVar = new b("STRING", 1);
        k = bVar;
        l = new n[]{aVar, bVar};
    }

    public n(String str, int i, a aVar) {
        super(str, i);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) l.clone();
    }
}
