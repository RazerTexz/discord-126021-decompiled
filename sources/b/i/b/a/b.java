package b.i.b.a;

/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements h<Character> {

    /* JADX INFO: renamed from: b.i.b.a.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharMatcher.java */
    public final class C0130b extends a {
        public final char a;

        public C0130b(char c) {
            this.a = c;
        }

        @Override // b.i.b.a.b
        public boolean b(char c) {
            return c == this.a;
        }

        public String toString() {
            StringBuilder sbU = b.d.b.a.a.U("CharMatcher.is('");
            char c = this.a;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
                c = (char) (c >> 4);
            }
            sbU.append(String.copyValueOf(cArr));
            sbU.append("')");
            return sbU.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public abstract class a extends b {
        @Override // b.i.b.a.h
        @Deprecated
        public boolean apply(Character ch) {
            return b(ch.charValue());
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public abstract class c extends a {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public final class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f1641b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // b.i.b.a.b
        public int a(CharSequence charSequence, int i) {
            b.i.a.f.e.o.f.C(i, charSequence.length());
            return -1;
        }

        @Override // b.i.b.a.b
        public boolean b(char c) {
            return false;
        }
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        b.i.a.f.e.o.f.C(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean b(char c2);
}
