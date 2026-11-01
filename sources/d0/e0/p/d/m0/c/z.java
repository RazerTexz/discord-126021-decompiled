package d0.e0.p.d.m0.c;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Modality.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum z {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    public static final a j = new a(null);

    /* JADX INFO: compiled from: Modality.kt */
    public final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final z convertFromFlags(boolean z2, boolean z3, boolean z4) {
            if (z2) {
                return z.SEALED;
            }
            if (z3) {
                return z.ABSTRACT;
            }
            return z4 ? z.OPEN : z.FINAL;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static z[] valuesCustom() {
        z[] zVarArrValuesCustom = values();
        z[] zVarArr = new z[zVarArrValuesCustom.length];
        System.arraycopy(zVarArrValuesCustom, 0, zVarArr, 0, zVarArrValuesCustom.length);
        return zVarArr;
    }
}
