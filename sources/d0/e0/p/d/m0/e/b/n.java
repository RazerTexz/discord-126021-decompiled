package d0.e0.p.d.m0.e.b;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface n extends d0.e0.p.d.m0.l.b.s {

    /* JADX INFO: compiled from: KotlinClassFinder.kt */
    public abstract class a {

        /* JADX INFO: renamed from: d0.e0.p.d.m0.e.b.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public final class C0537a extends a {
            public final byte[] getContent() {
                return null;
            }
        }

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public final class b extends a {
            public final p a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(p pVar, byte[] bArr) {
                super(null);
                d0.z.d.m.checkNotNullParameter(pVar, "kotlinJvmBinaryClass");
                this.a = pVar;
            }

            public final p getKotlinJvmBinaryClass() {
                return this.a;
            }

            public /* synthetic */ b(p pVar, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(pVar, (i & 2) != 0 ? null : bArr);
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final p toKotlinJvmBinaryClass() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar == null) {
                return null;
            }
            return bVar.getKotlinJvmBinaryClass();
        }
    }

    a findKotlinClassOrContent(d0.e0.p.d.m0.e.a.k0.g gVar);

    a findKotlinClassOrContent(d0.e0.p.d.m0.g.a aVar);
}
