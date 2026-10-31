package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.NonNull;
import b.i.a.g.d.l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DateValidatorPointForward implements CalendarConstraints$DateValidator {
    private final long point;
    public static final Parcelable$Creator<DateValidatorPointForward> CREATOR = new DateValidatorPointForward$a();

    public /* synthetic */ DateValidatorPointForward(long j, DateValidatorPointForward$a dateValidatorPointForward$a) {
        this(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.point == ((DateValidatorPointForward) obj).point;
    }

    @NonNull
    public static DateValidatorPointForward from(long j) {
        return new DateValidatorPointForward(j);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints$DateValidator
    public boolean isValid(long j) {
        return j >= this.point;
    }

    @NonNull
    public static DateValidatorPointForward now() {
        return from(l.h().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }

    private DateValidatorPointForward(long j) {
        this.point = j;
    }
}
