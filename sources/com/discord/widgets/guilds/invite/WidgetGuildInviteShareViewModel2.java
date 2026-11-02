package com.discord.widgets.guilds.invite;

import androidx.core.app.NotificationCompat;
import b.d.b.a.outline;
import com.discord.api.channel.Channel;
import com.discord.api.channel.ChannelUtils;
import com.discord.models.user.User;
import d0.Tuples;
import d0.g0.Strings4;
import d0.g0.StringsJVM;
import d0.t.CollectionsJVM;
import d0.t.Iterables2;
import d0.t.Maps6;
import d0.t.Sets5;
import d0.t._Collections;
import d0.z.d.Intrinsics3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import rx.functions.Func5;

/* JADX INFO: renamed from: com.discord.widgets.guilds.invite.WidgetGuildInviteShareViewModel$observeViewStateFromStores$1, reason: use source file name */
/* JADX INFO: compiled from: WidgetGuildInviteShareViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetGuildInviteShareViewModel2<T1, T2, T3, T4, T5, R> implements Func5<WidgetInviteModel, List<? extends InviteSuggestion>, String, Map<String, ? extends Set<? extends Long>>, Unit, WidgetGuildInviteShareViewModel.ViewState.Loaded> {
    public final /* synthetic */ WidgetGuildInviteShareViewModel this$0;

    public WidgetGuildInviteShareViewModel2(WidgetGuildInviteShareViewModel widgetGuildInviteShareViewModel) {
        this.this$0 = widgetGuildInviteShareViewModel;
    }

    @Override // rx.functions.Func5
    public /* bridge */ /* synthetic */ WidgetGuildInviteShareViewModel.ViewState.Loaded call(WidgetInviteModel widgetInviteModel, List<? extends InviteSuggestion> list, String str, Map<String, ? extends Set<? extends Long>> map, Unit unit) {
        return call2(widgetInviteModel, list, str, (Map<String, ? extends Set<Long>>) map, unit);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0140 A[SYNTHETIC] */
    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public final WidgetGuildInviteShareViewModel.ViewState.Loaded call2(WidgetInviteModel widgetInviteModel, List<? extends InviteSuggestion> list, String str, Map<String, ? extends Set<Long>> map, Unit unit) {
        boolean zContains;
        ArrayList arrayList;
        List listListOf;
        InviteSuggestionItem userItem;
        boolean z2;
        Intrinsics3.checkNotNullExpressionValue(map, "sentInvites");
        String strAccess$getInviteLink$p = WidgetGuildInviteShareViewModel.access$getInviteLink$p(this.this$0, widgetInviteModel.getInvite());
        Intrinsics3.checkNotNullExpressionValue(strAccess$getInviteLink$p, "widgetInviteModel.invite.inviteLink");
        Set<Long> setEmptySet = map.get(strAccess$getInviteLink$p);
        if (setEmptySet == null) {
            setEmptySet = Sets5.emptySet();
        }
        Set<Long> set = setEmptySet;
        boolean z3 = false;
        if (str == null || StringsJVM.isBlank(str)) {
            Intrinsics3.checkNotNullExpressionValue(list, "inviteSuggestions");
        } else {
            ArrayList arrayListA0 = outline.a0(list, "inviteSuggestions");
            for (Object obj : list) {
                InviteSuggestion inviteSuggestion = (InviteSuggestion) obj;
                if (inviteSuggestion instanceof InviteSuggestion.ChannelItem) {
                    zContains = Strings4.contains((CharSequence) ChannelUtils.c(((InviteSuggestion.ChannelItem) inviteSuggestion).getChannel()), (CharSequence) str, true);
                } else {
                    if (!(inviteSuggestion instanceof InviteSuggestion.UserSuggestion)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zContains = Strings4.contains((CharSequence) ((InviteSuggestion.UserSuggestion) inviteSuggestion).getUser().getUsername(), (CharSequence) str, true);
                }
                if (zContains) {
                    arrayListA0.add(obj);
                }
            }
            list = arrayListA0;
        }
        List<Channel> dms = widgetInviteModel.getDms();
        ArrayList arrayList2 = new ArrayList(Iterables2.collectionSizeOrDefault(dms, 10));
        for (Channel channel : dms) {
            User userA = ChannelUtils.a(channel);
            arrayList2.add(Tuples.to(userA != null ? Long.valueOf(userA.getId()) : null, Long.valueOf(channel.getId())));
        }
        Map map2 = Maps6.toMap(arrayList2);
        if (true ^ list.isEmpty()) {
            arrayList = new ArrayList(Iterables2.collectionSizeOrDefault(list, 10));
            for (InviteSuggestion inviteSuggestion2 : list) {
                if (inviteSuggestion2 instanceof InviteSuggestion.ChannelItem) {
                    InviteSuggestion.ChannelItem channelItem = (InviteSuggestion.ChannelItem) inviteSuggestion2;
                    userItem = new InviteSuggestionItem.ChannelItem(channelItem.getChannel(), set.contains(Long.valueOf(channelItem.getChannel().getId())));
                } else {
                    if (inviteSuggestion2 instanceof InviteSuggestion.UserSuggestion) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InviteSuggestion.UserSuggestion userSuggestion = (InviteSuggestion.UserSuggestion) inviteSuggestion2;
                    userItem = new InviteSuggestionItem.UserItem(userSuggestion.getUser(), _Collections.contains(set, map2.get(Long.valueOf(userSuggestion.getUser().getId()))));
                }
                arrayList.add(userItem);
            }
            listListOf = arrayList;
        } else if (str == null || StringsJVM.isBlank(str)) {
            arrayList = new ArrayList(Iterables2.collectionSizeOrDefault(list, 10));
            while (r11.hasNext()) {
                if (inviteSuggestion2 instanceof InviteSuggestion.ChannelItem) {
                    InviteSuggestion.ChannelItem channelItem2 = (InviteSuggestion.ChannelItem) inviteSuggestion2;
                    userItem = new InviteSuggestionItem.ChannelItem(channelItem2.getChannel(), set.contains(Long.valueOf(channelItem2.getChannel().getId())));
                } else {
                    if (inviteSuggestion2 instanceof InviteSuggestion.UserSuggestion) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InviteSuggestion.UserSuggestion userSuggestion2 = (InviteSuggestion.UserSuggestion) inviteSuggestion2;
                    userItem = new InviteSuggestionItem.UserItem(userSuggestion2.getUser(), _Collections.contains(set, map2.get(Long.valueOf(userSuggestion2.getUser().getId()))));
                }
                arrayList.add(userItem);
            }
            listListOf = arrayList;
        } else {
            listListOf = CollectionsJVM.listOf(InviteSuggestionItem.INSTANCE);
        }
        if (widgetInviteModel.getInvite() != null) {
            if (!widgetInviteModel.getInvite().isStatic() && !widgetInviteModel.isInviteFromStore()) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = true;
        }
        Intrinsics3.checkNotNullExpressionValue(widgetInviteModel, "widgetInviteModel");
        Intrinsics3.checkNotNullExpressionValue(str, "filter");
        return new WidgetGuildInviteShareViewModel.ViewState.Loaded(widgetInviteModel, listListOf, str, map, z2);
    }
}
