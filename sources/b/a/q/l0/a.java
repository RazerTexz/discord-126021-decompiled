package b.a.q.l0;

import com.discord.models.domain.ModelAuditLogEntry;
import d0.z.d.m;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: WiredHeadsetState.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b.a.q.l0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WiredHeadsetState.kt */
    public final class C0041a extends a {
        public final String a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0041a(String str, boolean z2) {
            super(false, null);
            m.checkNotNullParameter(str, ModelAuditLogEntry.CHANGE_KEY_NAME);
            this.a = str;
            this.f265b = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0041a)) {
                return false;
            }
            C0041a c0041a = (C0041a) obj;
            return m.areEqual(this.a, c0041a.a) && this.f265b == c0041a.f265b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            String str = this.a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z2 = this.f265b;
            ?? r1 = z2;
            if (z2) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        public String toString() {
            StringBuilder sbU = b.d.b.a.a.U("PluggedIn(name=");
            sbU.append(this.a);
            sbU.append(", hasMic=");
            return b.d.b.a.a.O(sbU, this.f265b, ")");
        }
    }

    /* JADX INFO: compiled from: WiredHeadsetState.kt */
    public final class b extends a {
        public static final b a = new b();

        public b() {
            super(false, null);
        }

        public String toString() {
            return "WiredHeadsetState.Unplugged";
        }
    }

    public a(boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
