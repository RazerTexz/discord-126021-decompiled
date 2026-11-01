package com.discord.models.domain;

import androidx.core.app.NotificationCompat;
import d0.z.d.m;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import rx.functions.Action1;

/* JADX INFO: compiled from: ModelGuildMemberListUpdate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModelGuildMemberListUpdate$Operation$Parser$parse$1<T> implements Action1<String> {
    public final /* synthetic */ Ref$ObjectRef $index;
    public final /* synthetic */ Ref$ObjectRef $item;
    public final /* synthetic */ Ref$ObjectRef $items;
    public final /* synthetic */ Ref$ObjectRef $range;
    public final /* synthetic */ Model.JsonReader $reader;
    public final /* synthetic */ Ref$ObjectRef $type;

    /* JADX INFO: renamed from: com.discord.models.domain.ModelGuildMemberListUpdate$Operation$Parser$parse$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ModelGuildMemberListUpdate.kt */
    public final class AnonymousClass1<T> implements Model.JsonReader.ItemFactory<Integer> {
        public AnonymousClass1() {
        }

        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public /* bridge */ /* synthetic */ Integer get() {
            return get();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public final Integer get() {
            return ModelGuildMemberListUpdate$Operation$Parser$parse$1.this.$reader.nextIntOrNull();
        }
    }

    /* JADX INFO: renamed from: com.discord.models.domain.ModelGuildMemberListUpdate$Operation$Parser$parse$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: ModelGuildMemberListUpdate.kt */
    public final class AnonymousClass3<T> implements Model.JsonReader.ItemFactory<ModelGuildMemberListUpdate.Operation.Item> {
        public AnonymousClass3() {
        }

        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public /* bridge */ /* synthetic */ ModelGuildMemberListUpdate.Operation.Item get() {
            return get();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public final ModelGuildMemberListUpdate.Operation.Item get() {
            return ModelGuildMemberListUpdate.Operation.Item.Parser.INSTANCE.parse(ModelGuildMemberListUpdate$Operation$Parser$parse$1.this.$reader);
        }
    }

    public ModelGuildMemberListUpdate$Operation$Parser$parse$1(Ref$ObjectRef ref$ObjectRef, Model.JsonReader jsonReader, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5) {
        this.$type = ref$ObjectRef;
        this.$reader = jsonReader;
        this.$index = ref$ObjectRef2;
        this.$range = ref$ObjectRef3;
        this.$item = ref$ObjectRef4;
        this.$items = ref$ObjectRef5;
    }

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(String str) throws IOException {
        call2(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final void call2(String str) throws IOException {
        if (str != null) {
            switch (str.hashCode()) {
                case 3553:
                    if (str.equals("op")) {
                        this.$type.element = (T) this.$reader.nextStringOrNull();
                        return;
                    }
                    break;
                case 3242771:
                    if (str.equals("item")) {
                        this.$item.element = (T) ModelGuildMemberListUpdate.Operation.Item.Parser.INSTANCE.parse(this.$reader);
                        return;
                    }
                    break;
                case 100346066:
                    if (str.equals("index")) {
                        this.$index.element = (T) this.$reader.nextIntOrNull();
                        return;
                    }
                    break;
                case 100526016:
                    if (str.equals("items")) {
                        this.$items.element = (T) this.$reader.nextList(new AnonymousClass3());
                        return;
                    }
                    break;
                case 108280125:
                    if (str.equals("range")) {
                        Ref$ObjectRef ref$ObjectRef = this.$range;
                        List<T> listNextList = this.$reader.nextList(new AnonymousClass1());
                        T t = listNextList.get(0);
                        m.checkNotNullExpressionValue(t, "it[0]");
                        int iIntValue = ((Number) t).intValue();
                        T t2 = listNextList.get(1);
                        m.checkNotNullExpressionValue(t2, "it[1]");
                        ref$ObjectRef.element = (T) new IntRange(iIntValue, ((Number) t2).intValue());
                        return;
                    }
                    break;
            }
        }
        this.$reader.skipValue();
    }
}
