package androidx.core.graphics;

import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import com.discord.models.domain.ModelAuditLogEntry;
import d0.z.d.Intrinsics3;

/* JADX INFO: renamed from: androidx.core.graphics.PorterDuffKt, reason: use source file name */
/* JADX INFO: compiled from: PorterDuff.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PorterDuff {
    public static final PorterDuffColorFilter toColorFilter(android.graphics.PorterDuff.Mode mode, int i) {
        Intrinsics3.checkNotNullParameter(mode, "<this>");
        return new PorterDuffColorFilter(i, mode);
    }

    public static final PorterDuffXfermode toXfermode(android.graphics.PorterDuff.Mode mode) {
        Intrinsics3.checkNotNullParameter(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
