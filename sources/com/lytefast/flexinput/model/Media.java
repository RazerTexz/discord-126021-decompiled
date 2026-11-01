package com.lytefast.flexinput.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import d0.z.d.m;

/* JADX INFO: compiled from: Media.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Media extends Attachment<String> {
    public boolean j;
    public Long k;
    public static final Parcelable.Creator<Media> CREATOR = new a();

    /* JADX INFO: compiled from: Media.kt */
    public final class a implements Parcelable.Creator<Media> {
        @Override // android.os.Parcelable.Creator
        public Media createFromParcel(Parcel parcel) {
            m.checkNotNullParameter(parcel, "parcel");
            return new Media(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Media[] newArray(int i) {
            return new Media[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Media(long j, Uri uri, String str, String str2, boolean z2, Long l) {
        super(j, uri, str, str2, false, 16, null);
        m.checkNotNullParameter(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        m.checkNotNullParameter(str, "displayName");
        this.j = z2;
        this.k = l;
    }

    public String toString() {
        StringBuilder sbU = b.d.b.a.a.U("MediaAttachment(uri=");
        sbU.append(getUri());
        sbU.append(", duration=");
        sbU.append(this.k);
        sbU.append(')');
        return sbU.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Media(Parcel parcel) {
        super(parcel);
        m.checkNotNullParameter(parcel, "parcelIn");
    }
}
