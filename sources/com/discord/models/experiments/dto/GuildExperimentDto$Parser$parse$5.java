package com.discord.models.experiments.dto;

import com.discord.models.domain.Model;
import d0.z.d.Intrinsics3;
import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: GuildExperimentDto.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GuildExperimentDto$Parser$parse$5 implements Runnable {
    public final /* synthetic */ Model.JsonReader $jsonReader;
    public final /* synthetic */ Ref$ObjectRef $overrides;

    /* JADX INFO: renamed from: com.discord.models.experiments.dto.GuildExperimentDto$Parser$parse$5$1, reason: invalid class name */
    /* JADX INFO: compiled from: GuildExperimentDto.kt */
    public final class AnonymousClass1<T> implements Model.JsonReader.ItemFactory<GuildExperimentOverridesDto> {
        public AnonymousClass1() {
        }

        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public /* bridge */ /* synthetic */ GuildExperimentOverridesDto get() {
            return get();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public final GuildExperimentOverridesDto get() {
            return GuildExperimentOverridesDto.Parser.INSTANCE.parse(GuildExperimentDto$Parser$parse$5.this.$jsonReader);
        }
    }

    public GuildExperimentDto$Parser$parse$5(Ref$ObjectRef ref$ObjectRef, Model.JsonReader jsonReader) {
        this.$overrides = ref$ObjectRef;
        this.$jsonReader = jsonReader;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Ref$ObjectRef ref$ObjectRef = this.$overrides;
        ?? NextList = this.$jsonReader.nextList(new AnonymousClass1());
        Intrinsics3.checkNotNullExpressionValue(NextList, "jsonReader.nextList { Gu…arser.parse(jsonReader) }");
        ref$ObjectRef.element = NextList;
    }
}
