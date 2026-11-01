package b.i.c.u.p;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: InstallationResponse.java */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class d {

    /* JADX INFO: compiled from: InstallationResponse.java */
    public enum a {
        OK,
        BAD_CONFIG
    }

    @Nullable
    public abstract f a();

    @Nullable
    public abstract String b();

    @Nullable
    public abstract String c();

    @Nullable
    public abstract a d();

    @Nullable
    public abstract String e();
}
