package d0.e0.p.d.m0.n;

import com.discord.models.domain.ModelAuditLogEntry;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 {
    public static final z0 a;

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public final class a extends z0 {
        @Override // d0.e0.p.d.m0.n.z0
        public /* bridge */ /* synthetic */ w0 get(c0 c0Var) {
            return (w0) m96get(c0Var);
        }

        @Override // d0.e0.p.d.m0.n.z0
        public boolean isEmpty() {
            return true;
        }

        /* JADX INFO: renamed from: get, reason: collision with other method in class */
        public Void m96get(c0 c0Var) {
            d0.z.d.m.checkNotNullParameter(c0Var, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new b(null);
        a = new a();
    }

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    public final c1 buildSubstitutor() {
        c1 c1VarCreate = c1.create(this);
        d0.z.d.m.checkNotNullExpressionValue(c1VarCreate, "create(this)");
        return c1VarCreate;
    }

    public d0.e0.p.d.m0.c.g1.g filterAnnotations(d0.e0.p.d.m0.c.g1.g gVar) {
        d0.z.d.m.checkNotNullParameter(gVar, "annotations");
        return gVar;
    }

    public abstract w0 get(c0 c0Var);

    public boolean isEmpty() {
        return false;
    }

    public c0 prepareTopLevelType(c0 c0Var, j1 j1Var) {
        d0.z.d.m.checkNotNullParameter(c0Var, "topLevelType");
        d0.z.d.m.checkNotNullParameter(j1Var, ModelAuditLogEntry.CHANGE_KEY_POSITION);
        return c0Var;
    }
}
