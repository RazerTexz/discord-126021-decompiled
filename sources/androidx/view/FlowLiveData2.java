package androidx.view;

import androidx.exifinterface.media.ExifInterface;
import s.a.c2.Channel4;

/* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$observer$1, reason: use source file name */
/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlowLiveData2<T> implements Observer<T> {
    public final /* synthetic */ Channel4 $channel;

    public FlowLiveData2(Channel4 channel4) {
        this.$channel = channel4;
    }

    @Override // androidx.view.Observer
    public final void onChanged(T t) {
        this.$channel.offer(t);
    }
}
