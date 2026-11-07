package com.discord.widgets.chat.list.adapter;

import androidx.core.app.NotificationCompat;
import com.discord.stores.StoreMessageUploads;
import com.discord.utilities.rest.SendUtils;
import d0.t._Collections;
import j0.k.Func1;
import j0.l.e.ScalarSynchronousObservable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rx.Observable;

/* JADX INFO: compiled from: WidgetChatListAdapterItemUploadProgress.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetChatListAdapterItemUploadProgress$ModelProvider$get$2<T, R> implements Func1<StoreMessageUploads.MessageUploadState, Observable<? extends WidgetChatListAdapterItemUploadProgress.Model>> {
    public final /* synthetic */ long $throttleIntervalMs;

    public WidgetChatListAdapterItemUploadProgress$ModelProvider$get$2(long j) {
        this.$throttleIntervalMs = j;
    }

    @Override // j0.k.Func1
    public /* bridge */ /* synthetic */ Observable<? extends WidgetChatListAdapterItemUploadProgress.Model> call(StoreMessageUploads.MessageUploadState messageUploadState) {
        return call2(messageUploadState);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final Observable<? extends WidgetChatListAdapterItemUploadProgress.Model> call2(StoreMessageUploads.MessageUploadState messageUploadState) {
        if (messageUploadState instanceof StoreMessageUploads.MessageUploadState.None) {
            return new ScalarSynchronousObservable(WidgetChatListAdapterItemUploadProgress.Model.None.INSTANCE);
        }
        if (messageUploadState instanceof StoreMessageUploads.MessageUploadState.Preprocessing) {
            StoreMessageUploads.MessageUploadState.Preprocessing preprocessing = (StoreMessageUploads.MessageUploadState.Preprocessing) messageUploadState;
            return new ScalarSynchronousObservable(new WidgetChatListAdapterItemUploadProgress.Model.Preprocessing(preprocessing.getNumFiles(), preprocessing.getDisplayName(), preprocessing.getMimeType()));
        }
        if (!(messageUploadState instanceof StoreMessageUploads.MessageUploadState.Uploading)) {
            throw new NoWhenBranchMatchedException();
        }
        List<SendUtils.FileUpload> uploads = ((StoreMessageUploads.MessageUploadState.Uploading) messageUploadState).getUploads();
        if (uploads.size() == 1) {
            return WidgetChatListAdapterItemUploadProgress.ModelProvider.access$getSingleUploadObservable(WidgetChatListAdapterItemUploadProgress.ModelProvider.INSTANCE, (SendUtils.FileUpload) _Collections.first((List) uploads), this.$throttleIntervalMs);
        }
        return uploads.size() <= 3 ? WidgetChatListAdapterItemUploadProgress.ModelProvider.access$getFewUploadsObservable(WidgetChatListAdapterItemUploadProgress.ModelProvider.INSTANCE, uploads, this.$throttleIntervalMs) : WidgetChatListAdapterItemUploadProgress.ModelProvider.access$getManyUploadsObservable(WidgetChatListAdapterItemUploadProgress.ModelProvider.INSTANCE, uploads, this.$throttleIntervalMs);
    }
}
