package b.i.a.d.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import b.i.a.a.b;
import b.i.a.a.c;

/* JADX INFO: compiled from: IGetInstallReferrerService.java */
/* JADX INFO: loaded from: classes3.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: b.i.a.d.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IGetInstallReferrerService.java */
    public abstract class AbstractBinderC0107a extends b implements a {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: renamed from: b.i.a.d.a.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IGetInstallReferrerService.java */
        public class C0108a extends b.i.a.a.a implements a {
            public C0108a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // b.i.a.d.a.a
            public final Bundle B(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i = c.a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        this.a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain.recycle();
                        Bundle bundle2 = (Bundle) (parcelObtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain2));
                        parcelObtain2.recycle();
                        return bundle2;
                    } catch (RuntimeException e) {
                        parcelObtain2.recycle();
                        throw e;
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }
    }

    Bundle B(Bundle bundle) throws RemoteException;
}
