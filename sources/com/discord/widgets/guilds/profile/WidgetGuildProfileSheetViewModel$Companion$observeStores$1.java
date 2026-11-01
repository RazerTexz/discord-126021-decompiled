package com.discord.widgets.guilds.profile;

import androidx.core.app.NotificationCompat;
import com.discord.models.member.GuildMember;
import com.discord.models.user.MeUser;
import com.discord.stores.StoreStream;
import d0.t.m;
import j0.k.b;
import java.util.Map;
import rx.Observable;

/* JADX INFO: compiled from: WidgetGuildProfileSheetViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetGuildProfileSheetViewModel$Companion$observeStores$1<T, R> implements b<MeUser, Observable<? extends GuildMember>> {
    public final /* synthetic */ long $guildId;

    /* JADX INFO: renamed from: com.discord.widgets.guilds.profile.WidgetGuildProfileSheetViewModel$Companion$observeStores$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetGuildProfileSheetViewModel.kt */
    public final class AnonymousClass1<T, R> implements b<Map<Long, ? extends GuildMember>, GuildMember> {
        public final /* synthetic */ MeUser $me;

        public AnonymousClass1(MeUser meUser) {
            this.$me = meUser;
        }

        @Override // j0.k.b
        public /* bridge */ /* synthetic */ GuildMember call(Map<Long, ? extends GuildMember> map) {
            return call2((Map<Long, GuildMember>) map);
        }

        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final GuildMember call2(Map<Long, GuildMember> map) {
            return map.get(Long.valueOf(this.$me.getId()));
        }
    }

    public WidgetGuildProfileSheetViewModel$Companion$observeStores$1(long j) {
        this.$guildId = j;
    }

    @Override // j0.k.b
    public /* bridge */ /* synthetic */ Observable<? extends GuildMember> call(MeUser meUser) {
        return call2(meUser);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final Observable<? extends GuildMember> call2(MeUser meUser) {
        return StoreStream.INSTANCE.getGuilds().observeComputed(this.$guildId, m.listOf(Long.valueOf(meUser.getId()))).G(new AnonymousClass1(meUser));
    }
}
