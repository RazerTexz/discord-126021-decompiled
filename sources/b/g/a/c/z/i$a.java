package b.g.a.c.z;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: ContextAttributes.java */
/* JADX INFO: loaded from: classes3.dex */
public class i$a extends i implements Serializable {
    public final Map<?, ?> _shared;
    public transient Map<Object, Object> l;
    private static final long serialVersionUID = 1;
    public static final i$a j = new i$a(Collections.emptyMap());
    public static final Object k = new Object();

    public i$a(Map<?, ?> map) {
        this._shared = map;
        this.l = null;
    }

    public i$a(Map<?, ?> map, Map<Object, Object> map2) {
        this._shared = map;
        this.l = map2;
    }
}
