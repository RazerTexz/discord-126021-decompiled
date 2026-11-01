package b.f.j.e;

import com.facebook.common.internal.Supplier;
import java.util.Objects;

/* JADX INFO: compiled from: ImagePipelineExperiments.java */
/* JADX INFO: loaded from: classes.dex */
public class l {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f575b;
    public final boolean c;
    public final Supplier<Boolean> d;
    public boolean e;
    public final boolean f;
    public final int g;

    /* JADX INFO: compiled from: ImagePipelineExperiments.java */
    public class c implements d {
    }

    /* JADX INFO: compiled from: ImagePipelineExperiments.java */
    public interface d {
    }

    public l(b bVar, a aVar) {
        Objects.requireNonNull(bVar);
        this.a = 2048;
        this.f575b = new c();
        this.c = bVar.f576b;
        this.d = bVar.c;
        this.e = true;
        this.f = true;
        this.g = 20;
    }

    /* JADX INFO: compiled from: ImagePipelineExperiments.java */
    public class b {
        public final j.a a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f576b;
        public Supplier<Boolean> c = new b.f.d.d.k(Boolean.FALSE);

        public b(j.a aVar) {
            this.a = aVar;
        }
    }
}
