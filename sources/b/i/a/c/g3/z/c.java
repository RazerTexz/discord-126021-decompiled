package b.i.a.c.g3.z;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.Iterator;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ SphericalGLSurfaceView j;

    public /* synthetic */ c(SphericalGLSurfaceView sphericalGLSurfaceView) {
        this.j = sphericalGLSurfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.j;
        Surface surface = sphericalGLSurfaceView.r;
        if (surface != null) {
            Iterator<SphericalGLSurfaceView.b> it = sphericalGLSurfaceView.j.iterator();
            while (it.hasNext()) {
                it.next().q(surface);
            }
        }
        SurfaceTexture surfaceTexture = sphericalGLSurfaceView.q;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        sphericalGLSurfaceView.q = null;
        sphericalGLSurfaceView.r = null;
    }
}
