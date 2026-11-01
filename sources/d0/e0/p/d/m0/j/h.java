package d0.e0.p.d.m0.j;

import java.util.Set;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface h {

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public final class a {
        public static boolean getIncludeAnnotationArguments(h hVar) {
            d0.z.d.m.checkNotNullParameter(hVar, "this");
            return hVar.getAnnotationArgumentsRenderingPolicy().getIncludeAnnotationArguments();
        }

        public static boolean getIncludeEmptyAnnotationArguments(h hVar) {
            d0.z.d.m.checkNotNullParameter(hVar, "this");
            return hVar.getAnnotationArgumentsRenderingPolicy().getIncludeEmptyAnnotationArguments();
        }
    }

    d0.e0.p.d.m0.j.a getAnnotationArgumentsRenderingPolicy();

    boolean getDebugMode();

    boolean getEnhancedTypes();

    Set<d0.e0.p.d.m0.g.b> getExcludedTypeAnnotationClasses();

    void setAnnotationArgumentsRenderingPolicy(d0.e0.p.d.m0.j.a aVar);

    void setClassifierNamePolicy(b bVar);

    void setDebugMode(boolean z2);

    void setExcludedTypeAnnotationClasses(Set<d0.e0.p.d.m0.g.b> set);

    void setModifiers(Set<? extends g> set);

    void setParameterNameRenderingPolicy(n nVar);

    void setReceiverAfterName(boolean z2);

    void setRenderCompanionObjectName(boolean z2);

    void setStartFromName(boolean z2);

    void setTextFormat(p pVar);

    void setWithDefinedIn(boolean z2);

    void setWithoutSuperTypes(boolean z2);

    void setWithoutTypeParameters(boolean z2);
}
