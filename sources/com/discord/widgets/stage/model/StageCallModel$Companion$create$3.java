package com.discord.widgets.stage.model;

import com.discord.stores.StoreVoiceParticipants;
import com.discord.widgets.voice.fullscreen.stage.StageCallItem;
import d0.z.d.m;
import d0.z.d.o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: StageCallModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StageCallModel$Companion$create$3 extends o implements Function1<StageCallItem.SpeakerItem, StoreVoiceParticipants.VoiceUser> {
    public static final StageCallModel$Companion$create$3 INSTANCE = new StageCallModel$Companion$create$3();

    public StageCallModel$Companion$create$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ StoreVoiceParticipants.VoiceUser invoke(StageCallItem.SpeakerItem speakerItem) {
        return invoke2(speakerItem);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final StoreVoiceParticipants.VoiceUser invoke2(StageCallItem.SpeakerItem speakerItem) {
        m.checkNotNullParameter(speakerItem, "it");
        return speakerItem.getVoiceUser();
    }
}
