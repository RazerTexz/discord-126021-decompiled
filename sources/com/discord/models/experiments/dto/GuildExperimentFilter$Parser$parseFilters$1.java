package com.discord.models.experiments.dto;

import com.discord.models.domain.Model;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: GuildExperimentFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GuildExperimentFilter$Parser$parseFilters$1<T> implements Model.JsonReader.ItemFactory<Unit> {
    public final /* synthetic */ List $filters;
    public final /* synthetic */ Model.JsonReader $reader;

    /* JADX INFO: renamed from: com.discord.models.experiments.dto.GuildExperimentFilter$Parser$parseFilters$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: GuildExperimentFilter.kt */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Ref$ObjectRef $filterHash;

        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef) {
            this.$filterHash = ref$ObjectRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.$filterHash.element = (T) GuildExperimentFilter$Parser$parseFilters$1.this.$reader.nextLongOrNull();
        }
    }

    /* JADX INFO: renamed from: com.discord.models.experiments.dto.GuildExperimentFilter$Parser$parseFilters$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: GuildExperimentFilter.kt */
    public final class AnonymousClass2 implements Runnable {
        public final /* synthetic */ Ref$ObjectRef $filterHash;

        public AnonymousClass2(Ref$ObjectRef ref$ObjectRef) {
            this.$filterHash = ref$ObjectRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GuildExperimentFilter guildExperimentFilterInvoke;
            Function1<Model.JsonReader, GuildExperimentFilter> function1 = GuildExperimentFilter.Parser.INSTANCE.getParsers().get((Long) this.$filterHash.element);
            if (function1 != null && (guildExperimentFilterInvoke = function1.invoke(GuildExperimentFilter$Parser$parseFilters$1.this.$reader)) != null) {
                GuildExperimentFilter$Parser$parseFilters$1.this.$filters.add(guildExperimentFilterInvoke);
            }
            this.$filterHash.element = null;
        }
    }

    public GuildExperimentFilter$Parser$parseFilters$1(Model.JsonReader jsonReader, List list) {
        this.$reader = jsonReader;
        this.$filters = list;
    }

    @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
    public /* bridge */ /* synthetic */ Unit get() throws IOException {
        get2();
        return Unit.a;
    }

    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public final void get2() throws IOException {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        this.$reader.nextListIndexed(new AnonymousClass1(ref$ObjectRef), new AnonymousClass2(ref$ObjectRef));
    }
}
