package f0.e0.k.i;

import d0.z.d.m;
import f0.y;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements k {
    public static final j.a a = new a();

    /* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
    public final class a implements j.a {
        @Override // f0.e0.k.i.j.a
        public boolean a(SSLSocket sSLSocket) {
            m.checkParameterIsNotNull(sSLSocket, "sslSocket");
            f0.e0.k.d.a aVar = f0.e0.k.d.e;
            return f0.e0.k.d.d && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // f0.e0.k.i.j.a
        public k b(SSLSocket sSLSocket) {
            m.checkParameterIsNotNull(sSLSocket, "sslSocket");
            return new i();
        }
    }

    @Override // f0.e0.k.i.k
    public boolean a(SSLSocket sSLSocket) {
        m.checkParameterIsNotNull(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // f0.e0.k.i.k
    public boolean b() {
        f0.e0.k.d.a aVar = f0.e0.k.d.e;
        return f0.e0.k.d.d;
    }

    @Override // f0.e0.k.i.k
    public String c(SSLSocket sSLSocket) {
        m.checkParameterIsNotNull(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // f0.e0.k.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends y> list) {
        m.checkParameterIsNotNull(sSLSocket, "sslSocket");
        m.checkParameterIsNotNull(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = f0.e0.k.h.c.a(list).toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
