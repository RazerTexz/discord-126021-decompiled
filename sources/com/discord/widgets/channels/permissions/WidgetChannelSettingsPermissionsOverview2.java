package com.discord.widgets.channels.permissions;

import androidx.core.app.NotificationCompat;
import com.discord.api.channel.Channel;
import com.discord.api.role.GuildRole;
import com.discord.models.guild.Guild;
import com.discord.models.user.MeUser;
import com.discord.stores.StoreStream;
import com.discord.stores.StoreUser;
import d0.z.d.Intrinsics3;
import j0.k.Func1;
import j0.l.e.ScalarSynchronousObservable;
import java.util.Map;
import rx.Observable;
import rx.functions.Func4;

/* JADX INFO: renamed from: com.discord.widgets.channels.permissions.WidgetChannelSettingsPermissionsOverview$Model$Companion$get$1, reason: use source file name */
/* JADX INFO: compiled from: WidgetChannelSettingsPermissionsOverview.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetChannelSettingsPermissionsOverview2<T, R> implements Func1<Channel, Observable<? extends WidgetChannelSettingsPermissionsOverview.Model>> {
    public final /* synthetic */ long $channelId;

    /* JADX INFO: renamed from: com.discord.widgets.channels.permissions.WidgetChannelSettingsPermissionsOverview$Model$Companion$get$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetChannelSettingsPermissionsOverview.kt */
    public final class AnonymousClass1<T1, T2, T3, T4, R> implements Func4<Guild, MeUser, Long, Map<Long, ? extends GuildRole>, WidgetChannelSettingsPermissionsOverview.Model> {
        public final /* synthetic */ Channel $channel;

        public AnonymousClass1(Channel channel) {
            this.$channel = channel;
        }

        @Override // rx.functions.Func4
        public /* bridge */ /* synthetic */ WidgetChannelSettingsPermissionsOverview.Model call(Guild guild, MeUser meUser, Long l, Map<Long, ? extends GuildRole> map) {
            return call2(guild, meUser, l, (Map<Long, GuildRole>) map);
        }

        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final WidgetChannelSettingsPermissionsOverview.Model call2(Guild guild, MeUser meUser, Long l, Map<Long, GuildRole> map) {
            if (!WidgetChannelSettingsPermissionsOverview.Model.INSTANCE.isValid(meUser, guild, this.$channel, l)) {
                return null;
            }
            Intrinsics3.checkNotNullExpressionValue(meUser, "meUser");
            Intrinsics3.checkNotNull(guild);
            Channel channel = this.$channel;
            Intrinsics3.checkNotNull(l);
            long jLongValue = l.longValue();
            Intrinsics3.checkNotNullExpressionValue(map, "roles");
            return new WidgetChannelSettingsPermissionsOverview.Model(meUser, guild, channel, jLongValue, map);
        }
    }

    public WidgetChannelSettingsPermissionsOverview2(long j) {
        this.$channelId = j;
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final Observable<? extends WidgetChannelSettingsPermissionsOverview.Model> call2(Channel channel) {
        if (channel == null) {
            return new ScalarSynchronousObservable(null);
        }
        StoreStream.Companion companion = StoreStream.INSTANCE;
        return Observable.h(companion.getGuilds().observeGuild(channel.getGuildId()), StoreUser.observeMe$default(companion.getUsers(), false, 1, null), companion.getPermissions().observePermissionsForChannel(this.$channelId), companion.getGuilds().observeRoles(channel.getGuildId()), new AnonymousClass1(channel));
    }

    @Override // j0.k.Func1
    public /* bridge */ /* synthetic */ Observable<? extends WidgetChannelSettingsPermissionsOverview.Model> call(Channel channel) {
        return call2(channel);
    }
}
