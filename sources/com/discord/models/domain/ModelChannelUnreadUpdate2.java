package com.discord.models.domain;

import androidx.core.app.NotificationCompat;
import d0.z.d.Intrinsics3;
import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;
import rx.functions.Action1;

/* JADX INFO: renamed from: com.discord.models.domain.ModelChannelUnreadUpdate$Parser$parse$1, reason: use source file name */
/* JADX INFO: compiled from: ModelChannelUnreadUpdate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModelChannelUnreadUpdate2<T> implements Action1<String> {
    public final /* synthetic */ Ref$ObjectRef $channelReadStates;
    public final /* synthetic */ Model.JsonReader $reader;

    /* JADX INFO: renamed from: com.discord.models.domain.ModelChannelUnreadUpdate$Parser$parse$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ModelChannelUnreadUpdate.kt */
    public final class AnonymousClass1<T> implements Model.JsonReader.ItemFactory<ModelReadState> {
        public AnonymousClass1() {
        }

        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public /* bridge */ /* synthetic */ ModelReadState get() {
            return get();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public final ModelReadState get() {
            return ModelReadState.Parser.INSTANCE.parse(ModelChannelUnreadUpdate2.this.$reader);
        }
    }

    public ModelChannelUnreadUpdate2(Ref$ObjectRef ref$ObjectRef, Model.JsonReader jsonReader) {
        this.$channelReadStates = ref$ObjectRef;
        this.$reader = jsonReader;
    }

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(String str) throws IOException {
        call2(str);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final void call2(String str) throws IOException {
        if (str == null || str.hashCode() != -298662154 || !str.equals("channel_unread_updates")) {
            this.$reader.skipValue();
            return;
        }
        Ref$ObjectRef ref$ObjectRef = this.$channelReadStates;
        T t = (T) this.$reader.nextList(new AnonymousClass1());
        Intrinsics3.checkNotNullExpressionValue(t, "reader.nextList { ModelR…te.Parser.parse(reader) }");
        ref$ObjectRef.element = t;
    }
}
