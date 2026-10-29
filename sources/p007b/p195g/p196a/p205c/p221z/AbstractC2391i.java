package p007b.p195g.p196a.p205c.p221z;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: b.g.a.c.z.i */
/* JADX INFO: compiled from: ContextAttributes.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2391i {

    /* JADX INFO: renamed from: b.g.a.c.z.i$a */
    /* JADX INFO: compiled from: ContextAttributes.java */
    public class a extends AbstractC2391i implements Serializable {
        public final Map<?, ?> _shared;

        /* JADX INFO: renamed from: l */
        public transient Map<Object, Object> f5089l;
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: j */
        public static final a f5087j = new a(Collections.emptyMap());

        /* JADX INFO: renamed from: k */
        public static final Object f5088k = new Object();

        public a(Map<?, ?> map) {
            this._shared = map;
            this.f5089l = null;
        }

        public a(Map<?, ?> map, Map<Object, Object> map2) {
            this._shared = map;
            this.f5089l = map2;
        }
    }
}
