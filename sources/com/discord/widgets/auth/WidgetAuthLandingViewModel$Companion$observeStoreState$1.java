package com.discord.widgets.auth;

import androidx.core.app.NotificationCompat;
import com.discord.stores.StoreGuildTemplates;
import j0.k.b;
import j0.l.e.k;
import rx.Observable;
import rx.functions.Action0;

/* JADX INFO: compiled from: WidgetAuthLandingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetAuthLandingViewModel$Companion$observeStoreState$1<T, R> implements b<String, Observable<? extends StoreGuildTemplates.GuildTemplateState>> {
    public final /* synthetic */ StoreGuildTemplates $storeGuildTemplates;

    /* JADX INFO: renamed from: com.discord.widgets.auth.WidgetAuthLandingViewModel$Companion$observeStoreState$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetAuthLandingViewModel.kt */
    public final class AnonymousClass1 implements Action0 {
        public final /* synthetic */ String $guildTemplateCode;

        public AnonymousClass1(String str) {
            this.$guildTemplateCode = str;
        }

        @Override // rx.functions.Action0
        public final void call() {
            WidgetAuthLandingViewModel$Companion$observeStoreState$1.this.$storeGuildTemplates.maybeInitTemplateState(this.$guildTemplateCode);
        }
    }

    public WidgetAuthLandingViewModel$Companion$observeStoreState$1(StoreGuildTemplates storeGuildTemplates) {
        this.$storeGuildTemplates = storeGuildTemplates;
    }

    @Override // j0.k.b
    public /* bridge */ /* synthetic */ Observable<? extends StoreGuildTemplates.GuildTemplateState> call(String str) {
        return call2(str);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final Observable<? extends StoreGuildTemplates.GuildTemplateState> call2(String str) {
        return str != null ? this.$storeGuildTemplates.observeGuildTemplate(str).v(new AnonymousClass1(str)) : new k(StoreGuildTemplates.GuildTemplateState.None.INSTANCE);
    }
}
