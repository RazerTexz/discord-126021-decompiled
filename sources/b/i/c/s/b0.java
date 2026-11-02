package b.i.c.s;

import android.util.Log;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final d0.a j;

    public b0(d0.a aVar) {
        this.j = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0.a aVar = this.j;
        String action = aVar.a.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseInstanceId", sb.toString());
        aVar.a();
    }
}
