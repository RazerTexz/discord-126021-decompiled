package f0;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static final t a = new a();

    /* JADX INFO: compiled from: EventListener.kt */
    public final class a extends t {
    }

    /* JADX INFO: compiled from: EventListener.kt */
    public interface b {
        t a(e eVar);
    }

    public void a(e eVar, k kVar) {
        d0.z.d.m.checkParameterIsNotNull(eVar, NotificationCompat.CATEGORY_CALL);
        d0.z.d.m.checkParameterIsNotNull(kVar, "connection");
    }
}
