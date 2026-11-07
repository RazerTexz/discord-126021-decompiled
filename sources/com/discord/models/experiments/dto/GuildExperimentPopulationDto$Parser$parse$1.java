package com.discord.models.experiments.dto;

import com.discord.models.domain.Model;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: GuildExperimentDto.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GuildExperimentPopulationDto$Parser$parse$1 implements Runnable {
    public final /* synthetic */ Ref$ObjectRef $buckets;
    public final /* synthetic */ Model.JsonReader $jsonReader;

    /* JADX INFO: renamed from: com.discord.models.experiments.dto.GuildExperimentPopulationDto$Parser$parse$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: GuildExperimentDto.kt */
    public final class AnonymousClass1<T> implements Model.JsonReader.ItemFactory<GuildExperimentBucketDto> {
        public AnonymousClass1() {
        }

        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public /* bridge */ /* synthetic */ GuildExperimentBucketDto get() {
            return get();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
        public final GuildExperimentBucketDto get() {
            return GuildExperimentBucketDto.Parser.INSTANCE.parse(GuildExperimentPopulationDto$Parser$parse$1.this.$jsonReader);
        }
    }

    public GuildExperimentPopulationDto$Parser$parse$1(Ref$ObjectRef ref$ObjectRef, Model.JsonReader jsonReader) {
        this.$buckets = ref$ObjectRef;
        this.$jsonReader = jsonReader;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        this.$buckets.element = this.$jsonReader.nextList(new AnonymousClass1());
    }
}
