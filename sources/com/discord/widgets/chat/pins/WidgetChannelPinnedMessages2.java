package com.discord.widgets.chat.pins;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.discord.R;
import com.discord.api.channel.Channel;
import com.discord.api.channel.ChannelUtils;
import com.discord.api.role.GuildRole;
import com.discord.models.guild.Guild;
import com.discord.models.member.GuildMember;
import com.discord.models.message.Message;
import com.discord.stores.StoreStream;
import com.discord.stores.StoreUserSettings;
import com.discord.utilities.embed.InviteEmbedModel;
import com.discord.utilities.rx.ObservableCombineLatestOverloads2;
import com.discord.widgets.chat.list.entries.DividerEntry;
import com.discord.widgets.chat.list.entries.EmptyPinsEntry;
import com.discord.widgets.chat.list.entries.LoadingEntry;
import com.discord.widgets.chat.list.model.WidgetChatListModelMessages;
import com.discord.widgets.guild_role_subscriptions.GuildRoleSubscriptionsFeatureFlag;
import d0.t.CollectionsJVM;
import d0.t.Sets5;
import d0.t._Collections;
import d0.z.d.Intrinsics3;
import d0.z.d.Lambda;
import j0.k.Func1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function10;
import rx.Observable;

/* JADX INFO: renamed from: com.discord.widgets.chat.pins.WidgetChannelPinnedMessages$Model$Companion$get$1, reason: use source file name */
/* JADX INFO: compiled from: WidgetChannelPinnedMessages.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetChannelPinnedMessages2<T, R> implements Func1<List<? extends Message>, Observable<? extends WidgetChannelPinnedMessages.Model>> {
    public final /* synthetic */ Channel $channel;
    public final /* synthetic */ Context $context;

    /* JADX INFO: renamed from: com.discord.widgets.chat.pins.WidgetChannelPinnedMessages$Model$Companion$get$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetChannelPinnedMessages.kt */
    public final class AnonymousClass1 extends Lambda implements Function10<Long, WidgetChatListModelMessages.MessagesWithMetadata, Map<Long, ? extends GuildRole>, Map<Long, ? extends GuildMember>, Map<Long, ? extends String>, Boolean, Boolean, Guild, InviteEmbedModel, Boolean, WidgetChannelPinnedMessages.Model> {
        public final /* synthetic */ List $pinnedMessages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list) {
            super(10);
            this.$pinnedMessages = list;
        }

        @Override // kotlin.jvm.functions.Function10
        public /* bridge */ /* synthetic */ WidgetChannelPinnedMessages.Model invoke(Long l, WidgetChatListModelMessages.MessagesWithMetadata messagesWithMetadata, Map<Long, ? extends GuildRole> map, Map<Long, ? extends GuildMember> map2, Map<Long, ? extends String> map3, Boolean bool, Boolean bool2, Guild guild, InviteEmbedModel inviteEmbedModel, Boolean bool3) {
            return invoke(l.longValue(), messagesWithMetadata, (Map<Long, GuildRole>) map, (Map<Long, GuildMember>) map2, (Map<Long, String>) map3, bool.booleanValue(), bool2.booleanValue(), guild, inviteEmbedModel, bool3.booleanValue());
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0141  */
        public final WidgetChannelPinnedMessages.Model invoke(long j, WidgetChatListModelMessages.MessagesWithMetadata messagesWithMetadata, Map<Long, GuildRole> map, Map<Long, GuildMember> map2, Map<Long, String> map3, boolean z2, boolean z3, Guild guild, InviteEmbedModel inviteEmbedModel, boolean z4) {
            List list;
            List listListOf;
            GuildMember guildMember;
            Set setEmptySet;
            List<Long> roles;
            Intrinsics3.checkNotNullParameter(messagesWithMetadata, "messagesWithMetadata");
            Intrinsics3.checkNotNullParameter(map, "guildRoles");
            Intrinsics3.checkNotNullParameter(map2, "guildMembers");
            Intrinsics3.checkNotNullParameter(map3, "channelNames");
            Intrinsics3.checkNotNullParameter(inviteEmbedModel, "inviteEmbedModel");
            List list2 = this.$pinnedMessages;
            if (list2 != null) {
                if (list2.isEmpty()) {
                    WidgetChannelPinnedMessages2 widgetChannelPinnedMessages2 = WidgetChannelPinnedMessages2.this;
                    String string = widgetChannelPinnedMessages2.$context.getString(ChannelUtils.B(widgetChannelPinnedMessages2.$channel) ? R.string.no_pins_in_dm : R.string.no_pins_in_channel);
                    Intrinsics3.checkNotNullExpressionValue(string, "context.getString(\n     …                        )");
                    listListOf = CollectionsJVM.listOf(new EmptyPinsEntry(string));
                } else {
                    ArrayList arrayList = new ArrayList();
                    int size = this.$pinnedMessages.size();
                    int i = 0;
                    while (i < size) {
                        Message message = (Message) this.$pinnedMessages.get(i);
                        int i2 = i;
                        int i3 = size;
                        ArrayList arrayList2 = arrayList;
                        arrayList2.addAll(WidgetChatListModelMessages.Companion.getMessageItems$default(WidgetChatListModelMessages.INSTANCE, WidgetChannelPinnedMessages2.this.$channel, map2, map, new HashMap(), messagesWithMetadata.getMessageThreads().get(Long.valueOf(message.getId())), messagesWithMetadata.getThreadCountsAndLatestMessages().get(Long.valueOf(message.getId())), message, messagesWithMetadata.getMessageState().get(Long.valueOf(message.getId())), new HashMap(), false, false, null, z2, z3, StoreStream.INSTANCE.getUserSettings().getIsRenderEmbedsEnabled(), j, false, new HashMap(), inviteEmbedModel, false, z4, 524288, null));
                        if (i2 < this.$pinnedMessages.size() - 1) {
                            arrayList2.add(new DividerEntry());
                        }
                        i = i2 + 1;
                        arrayList = arrayList2;
                        size = i3;
                    }
                    list = arrayList;
                }
                guildMember = map2.get(Long.valueOf(j));
                if (guildMember != null || (roles = guildMember.getRoles()) == null || (setEmptySet = _Collections.toHashSet(roles)) == null) {
                    setEmptySet = Sets5.emptySet();
                }
                return new WidgetChannelPinnedMessages.Model(WidgetChannelPinnedMessages2.this.$channel, guild, j, map3, list, setEmptySet, 0L, 0L, 0L, 0L, false, 1984, null);
            }
            listListOf = CollectionsJVM.listOf(new LoadingEntry());
            list = listListOf;
            guildMember = map2.get(Long.valueOf(j));
            if (guildMember != null) {
                setEmptySet = Sets5.emptySet();
            } else {
                setEmptySet = Sets5.emptySet();
            }
            return new WidgetChannelPinnedMessages.Model(WidgetChannelPinnedMessages2.this.$channel, guild, j, map3, list, setEmptySet, 0L, 0L, 0L, 0L, false, 1984, null);
        }
    }

    public WidgetChannelPinnedMessages2(Channel channel, Context context) {
        this.$channel = channel;
        this.$context = context;
    }

    @Override // j0.k.Func1
    public /* bridge */ /* synthetic */ Observable<? extends WidgetChannelPinnedMessages.Model> call(List<? extends Message> list) {
        return call2((List<Message>) list);
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final Observable<? extends WidgetChannelPinnedMessages.Model> call2(List<Message> list) {
        StoreStream.Companion companion = StoreStream.INSTANCE;
        Observable<Long> observableObserveMeId = companion.getUsers().observeMeId();
        WidgetChatListModelMessages.MessagesWithMetadata.Companion companion2 = WidgetChatListModelMessages.MessagesWithMetadata.INSTANCE;
        Intrinsics3.checkNotNullExpressionValue(list, "pinnedMessages");
        return ObservableCombineLatestOverloads2.combineLatest(observableObserveMeId, companion2.get(list), companion.getGuilds().observeRoles(this.$channel.getGuildId()), companion.getGuilds().observeComputed(this.$channel.getGuildId()), companion.getChannels().observeNames(), StoreUserSettings.observeIsAnimatedEmojisEnabled$default(companion.getUserSettings(), false, 1, null), StoreUserSettings.observeIsAutoPlayGifsEnabled$default(companion.getUserSettings(), false, 1, null), companion.getGuilds().observeGuild(this.$channel.getGuildId()), InviteEmbedModel.Companion.observe$default(InviteEmbedModel.INSTANCE, null, null, null, null, 15, null), GuildRoleSubscriptionsFeatureFlag.INSTANCE.getINSTANCE().observeCanGuildSeePurchaseFeedbackLoopSystemMessages(Long.valueOf(this.$channel.getGuildId())), new AnonymousClass1(list));
    }
}
