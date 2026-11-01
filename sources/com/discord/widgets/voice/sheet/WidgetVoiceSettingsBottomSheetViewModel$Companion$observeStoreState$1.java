package com.discord.widgets.voice.sheet;

import androidx.core.app.NotificationCompat;
import com.discord.stores.StoreStageChannels;
import com.discord.widgets.stage.StageRoles;
import com.discord.widgets.voice.model.CallModel;
import j0.k.b;
import j0.l.e.k;
import rx.Observable;

/* JADX INFO: compiled from: WidgetVoiceSettingsBottomSheetViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WidgetVoiceSettingsBottomSheetViewModel$Companion$observeStoreState$1<T, R> implements b<CallModel, Observable<? extends WidgetVoiceSettingsBottomSheetViewModel.StoreState>> {
    public final /* synthetic */ long $channelId;
    public final /* synthetic */ StoreStageChannels $stageChannelsStore;

    /* JADX INFO: renamed from: com.discord.widgets.voice.sheet.WidgetVoiceSettingsBottomSheetViewModel$Companion$observeStoreState$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetVoiceSettingsBottomSheetViewModel.kt */
    public final class AnonymousClass1<T, R> implements b<StageRoles, WidgetVoiceSettingsBottomSheetViewModel.StoreState.Valid> {
        public final /* synthetic */ CallModel $callModel;

        public AnonymousClass1(CallModel callModel) {
            this.$callModel = callModel;
        }

        @Override // j0.k.b
        public /* bridge */ /* synthetic */ WidgetVoiceSettingsBottomSheetViewModel.StoreState.Valid call(StageRoles stageRoles) {
            return call2(stageRoles);
        }

        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final WidgetVoiceSettingsBottomSheetViewModel.StoreState.Valid call2(StageRoles stageRoles) {
            return new WidgetVoiceSettingsBottomSheetViewModel.StoreState.Valid(this.$callModel, stageRoles, null);
        }
    }

    public WidgetVoiceSettingsBottomSheetViewModel$Companion$observeStoreState$1(StoreStageChannels storeStageChannels, long j) {
        this.$stageChannelsStore = storeStageChannels;
        this.$channelId = j;
    }

    @Override // j0.k.b
    public /* bridge */ /* synthetic */ Observable<? extends WidgetVoiceSettingsBottomSheetViewModel.StoreState> call(CallModel callModel) {
        return call2(callModel);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final Observable<? extends WidgetVoiceSettingsBottomSheetViewModel.StoreState> call2(CallModel callModel) {
        return callModel == null ? new k(WidgetVoiceSettingsBottomSheetViewModel.StoreState.Invalid.INSTANCE) : this.$stageChannelsStore.observeMyRoles(this.$channelId).G(new AnonymousClass1(callModel));
    }
}
