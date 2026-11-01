package d0.e0.p.d.m0.e.a.i0;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface c {

    /* JADX INFO: compiled from: context.kt */
    public final class a implements c {
        public static final a a = new a();

        @Override // d0.e0.p.d.m0.e.a.i0.c
        public boolean getCorrectNullabilityForNotNullTypeParameter() {
            return false;
        }

        @Override // d0.e0.p.d.m0.e.a.i0.c
        public boolean getTypeEnhancementImprovements() {
            return false;
        }

        @Override // d0.e0.p.d.m0.e.a.i0.c
        public boolean isReleaseCoroutines() {
            return false;
        }
    }

    boolean getCorrectNullabilityForNotNullTypeParameter();

    boolean getTypeEnhancementImprovements();

    boolean isReleaseCoroutines();
}
