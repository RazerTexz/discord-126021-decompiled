package b.i.c.u.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: TokenResult.java */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class f {

    /* JADX INFO: compiled from: TokenResult.java */
    @AutoValue.Builder
    public abstract class a {
        @NonNull
        public abstract f a();

        @NonNull
        public abstract a b(long j);
    }

    /* JADX INFO: compiled from: TokenResult.java */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    public static a a() {
        b.i.c.u.p.b.C0154b c0154b = new b.i.c.u.p.b.C0154b();
        c0154b.b(0L);
        return c0154b;
    }

    @Nullable
    public abstract b b();

    @Nullable
    public abstract String c();

    @NonNull
    public abstract long d();
}
