package b.f.g.g;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: GestureDetector.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    @VisibleForTesting
    public long e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final float f524b;

    @VisibleForTesting
    public float f;

    @VisibleForTesting
    public float g;

    @VisibleForTesting
    public InterfaceC0069a a = null;

    @VisibleForTesting
    public boolean c = false;

    @VisibleForTesting
    public boolean d = false;

    /* JADX INFO: renamed from: b.f.g.g.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GestureDetector.java */
    public interface InterfaceC0069a {
    }

    public a(Context context) {
        this.f524b = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
