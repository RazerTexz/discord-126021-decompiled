package b.i.c.r;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: HeartBeatInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public interface d {

    /* JADX INFO: compiled from: HeartBeatInfo.java */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        a(int i) {
            this.code = i;
        }

        public int f() {
            return this.code;
        }
    }

    @NonNull
    a a(@NonNull String str);
}
