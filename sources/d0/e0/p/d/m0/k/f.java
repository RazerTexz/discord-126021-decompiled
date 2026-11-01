package d0.e0.p.d.m0.k;

/* JADX INFO: compiled from: ExternalOverridabilityCondition.java */
/* JADX INFO: loaded from: classes3.dex */
public interface f {

    /* JADX INFO: compiled from: ExternalOverridabilityCondition.java */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* JADX INFO: compiled from: ExternalOverridabilityCondition.java */
    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    a getContract();

    b isOverridable(d0.e0.p.d.m0.c.a aVar, d0.e0.p.d.m0.c.a aVar2, d0.e0.p.d.m0.c.e eVar);
}
