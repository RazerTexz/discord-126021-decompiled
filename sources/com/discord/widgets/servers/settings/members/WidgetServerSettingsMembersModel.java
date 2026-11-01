package com.discord.widgets.servers.settings.members;

import b.d.b.a.a;
import com.discord.api.role.GuildRole;
import com.discord.models.guild.Guild;
import com.discord.models.member.GuildMember;
import com.discord.models.user.MeUser;
import com.discord.models.user.User;
import com.discord.stores.StoreStream;
import com.discord.utilities.guilds.RoleUtils;
import com.discord.utilities.mg_recycler.MGRecyclerDataPayload;
import com.discord.utilities.rx.ObservableExtensionsKt;
import d0.z.d.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;

/* JADX INFO: compiled from: WidgetServerSettingsMembersModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* data */ class WidgetServerSettingsMembersModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MEMBER_LIST_ITEM_TYPE = 1;
    private final boolean canKick;
    private final boolean canManageMembers;
    private final Guild guild;
    private final MeUser meUser;
    private final List<MemberItem> memberItems;
    private final GuildRole myHighestRole;
    private final Map<Long, GuildRole> roles;

    /* JADX INFO: compiled from: WidgetServerSettingsMembersModel.kt */
    public final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ Comparator access$sortMembersComparator(Companion companion) {
            return companion.sortMembersComparator();
        }

        public static final /* synthetic */ Map access$sortRoles(Companion companion, Map map) {
            return companion.sortRoles(map);
        }

        public final Observable<WidgetServerSettingsMembersModel> get(long guildId, Observable<String> filterPublisher, Observable<Long> roleFilterPublisher) {
            m.checkNotNullParameter(filterPublisher, "filterPublisher");
            m.checkNotNullParameter(roleFilterPublisher, "roleFilterPublisher");
            Observable<R> observableY = StoreStream.INSTANCE.getGuilds().observeComputed(guildId).Y(new WidgetServerSettingsMembersModel$Companion$get$1(guildId, filterPublisher, roleFilterPublisher));
            m.checkNotNullExpressionValue(observableY, "StoreStream\n            …          }\n            }");
            Observable<WidgetServerSettingsMembersModel> observableR = ObservableExtensionsKt.computationLatest(observableY).r();
            m.checkNotNullExpressionValue(observableR, "StoreStream\n            …  .distinctUntilChanged()");
            return observableR;
        }

        private final Comparator<MemberItem> sortMembersComparator() {
            return WidgetServerSettingsMembersModel$Companion$sortMembersComparator$1.INSTANCE;
        }

        private final Map<Long, GuildRole> sortRoles(Map<Long, GuildRole> guildRoles) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(guildRoles.size());
            ArrayList arrayList = new ArrayList(guildRoles.values());
            Collections.sort(arrayList, RoleUtils.getROLE_COMPARATOR());
            for (Object obj : arrayList) {
                linkedHashMap.put(Long.valueOf(((GuildRole) obj).getId()), obj);
            }
            return linkedHashMap;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WidgetServerSettingsMembersModel.kt */
    public final /* data */ class MemberItem implements MGRecyclerDataPayload {
        private final GuildMember guildMember;
        private final boolean isManagable;
        private final String key;
        private final List<GuildRole> roles;
        private final int type;
        private final User user;
        private final String userDisplayName;

        public MemberItem(User user, String str, List<GuildRole> list, boolean z2, GuildMember guildMember) {
            m.checkNotNullParameter(user, "user");
            m.checkNotNullParameter(str, "userDisplayName");
            m.checkNotNullParameter(list, "roles");
            m.checkNotNullParameter(guildMember, "guildMember");
            this.user = user;
            this.userDisplayName = str;
            this.roles = list;
            this.isManagable = z2;
            this.guildMember = guildMember;
            this.key = String.valueOf(user.getId());
            this.type = 1;
        }

        public final List<GuildRole> component3() {
            return this.roles;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MemberItem copy$default(MemberItem memberItem, User user, String str, List list, boolean z2, GuildMember guildMember, int i, Object obj) {
            if ((i & 1) != 0) {
                user = memberItem.user;
            }
            if ((i & 2) != 0) {
                str = memberItem.userDisplayName;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                list = memberItem.roles;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                z2 = memberItem.isManagable;
            }
            boolean z3 = z2;
            if ((i & 16) != 0) {
                guildMember = memberItem.guildMember;
            }
            return memberItem.copy(user, str2, list2, z3, guildMember);
        }

        public final MemberItem copy(User user, String userDisplayName, List<GuildRole> roles, boolean isManagable, GuildMember guildMember) {
            m.checkNotNullParameter(user, "user");
            m.checkNotNullParameter(userDisplayName, "userDisplayName");
            m.checkNotNullParameter(roles, "roles");
            m.checkNotNullParameter(guildMember, "guildMember");
            return new MemberItem(user, userDisplayName, roles, isManagable, guildMember);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MemberItem)) {
                return false;
            }
            MemberItem memberItem = (MemberItem) other;
            return m.areEqual(this.user, memberItem.user) && m.areEqual(this.userDisplayName, memberItem.userDisplayName) && m.areEqual(this.roles, memberItem.roles) && this.isManagable == memberItem.isManagable && m.areEqual(this.guildMember, memberItem.guildMember);
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final GuildMember getGuildMember() {
            return this.guildMember;
        }

        public final GuildMember getGuildMember() {
            return this.guildMember;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsManagable() {
            return this.isManagable;
        }

        @Override // com.discord.utilities.mg_recycler.MGRecyclerDataPayload, com.discord.utilities.recycler.DiffKeyProvider
        public String getKey() {
            return this.key;
        }

        public final List<GuildRole> getRoles() {
            return this.roles;
        }

        @Override // com.discord.utilities.mg_recycler.MGRecyclerDataPayload
        public int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        public final User getUser() {
            return this.user;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUserDisplayName() {
            return this.userDisplayName;
        }

        public final String getUserDisplayName() {
            return this.userDisplayName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [int] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9 */
        public int hashCode() {
            User user = this.user;
            int iHashCode = (user != null ? user.hashCode() : 0) * 31;
            String str = this.userDisplayName;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            List<GuildRole> list = this.roles;
            int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            boolean z2 = this.isManagable;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i = (iHashCode3 + r2) * 31;
            GuildMember guildMember = this.guildMember;
            return i + (guildMember != null ? guildMember.hashCode() : 0);
        }

        public final boolean isManagable() {
            return this.isManagable;
        }

        public String toString() {
            StringBuilder sbU = a.U("MemberItem(user=");
            sbU.append(this.user);
            sbU.append(", userDisplayName=");
            sbU.append(this.userDisplayName);
            sbU.append(", roles=");
            sbU.append(this.roles);
            sbU.append(", isManagable=");
            sbU.append(this.isManagable);
            sbU.append(", guildMember=");
            sbU.append(this.guildMember);
            sbU.append(")");
            return sbU.toString();
        }
    }

    public WidgetServerSettingsMembersModel(Guild guild, Map<Long, GuildRole> map, List<MemberItem> list, GuildRole guildRole, MeUser meUser, boolean z2, boolean z3) {
        m.checkNotNullParameter(guild, "guild");
        m.checkNotNullParameter(map, "roles");
        m.checkNotNullParameter(list, "memberItems");
        m.checkNotNullParameter(meUser, "meUser");
        this.guild = guild;
        this.roles = map;
        this.memberItems = list;
        this.myHighestRole = guildRole;
        this.meUser = meUser;
        this.canKick = z2;
        this.canManageMembers = z3;
    }

    public final Map<Long, GuildRole> component2() {
        return this.roles;
    }

    public final List<MemberItem> component3() {
        return this.memberItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WidgetServerSettingsMembersModel copy$default(WidgetServerSettingsMembersModel widgetServerSettingsMembersModel, Guild guild, Map map, List list, GuildRole guildRole, MeUser meUser, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            guild = widgetServerSettingsMembersModel.guild;
        }
        if ((i & 2) != 0) {
            map = widgetServerSettingsMembersModel.roles;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            list = widgetServerSettingsMembersModel.memberItems;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            guildRole = widgetServerSettingsMembersModel.myHighestRole;
        }
        GuildRole guildRole2 = guildRole;
        if ((i & 16) != 0) {
            meUser = widgetServerSettingsMembersModel.meUser;
        }
        MeUser meUser2 = meUser;
        if ((i & 32) != 0) {
            z2 = widgetServerSettingsMembersModel.canKick;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            z3 = widgetServerSettingsMembersModel.canManageMembers;
        }
        return widgetServerSettingsMembersModel.copy(guild, map2, list2, guildRole2, meUser2, z4, z3);
    }

    public final WidgetServerSettingsMembersModel copy(Guild guild, Map<Long, GuildRole> roles, List<MemberItem> memberItems, GuildRole myHighestRole, MeUser meUser, boolean canKick, boolean canManageMembers) {
        m.checkNotNullParameter(guild, "guild");
        m.checkNotNullParameter(roles, "roles");
        m.checkNotNullParameter(memberItems, "memberItems");
        m.checkNotNullParameter(meUser, "meUser");
        return new WidgetServerSettingsMembersModel(guild, roles, memberItems, myHighestRole, meUser, canKick, canManageMembers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetServerSettingsMembersModel)) {
            return false;
        }
        WidgetServerSettingsMembersModel widgetServerSettingsMembersModel = (WidgetServerSettingsMembersModel) other;
        return m.areEqual(this.guild, widgetServerSettingsMembersModel.guild) && m.areEqual(this.roles, widgetServerSettingsMembersModel.roles) && m.areEqual(this.memberItems, widgetServerSettingsMembersModel.memberItems) && m.areEqual(this.myHighestRole, widgetServerSettingsMembersModel.myHighestRole) && m.areEqual(this.meUser, widgetServerSettingsMembersModel.meUser) && this.canKick == widgetServerSettingsMembersModel.canKick && this.canManageMembers == widgetServerSettingsMembersModel.canManageMembers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanKick() {
        return this.canKick;
    }

    public final boolean getCanKick() {
        return this.canKick;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getCanManageMembers() {
        return this.canManageMembers;
    }

    public final boolean getCanManageMembers() {
        return this.canManageMembers;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Guild getGuild() {
        return this.guild;
    }

    public final Guild getGuild() {
        return this.guild;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MeUser getMeUser() {
        return this.meUser;
    }

    public final MeUser getMeUser() {
        return this.meUser;
    }

    public final List<MemberItem> getMemberItems() {
        return this.memberItems;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GuildRole getMyHighestRole() {
        return this.myHighestRole;
    }

    public final GuildRole getMyHighestRole() {
        return this.myHighestRole;
    }

    public final Map<Long, GuildRole> getRoles() {
        return this.roles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    public int hashCode() {
        Guild guild = this.guild;
        int iHashCode = (guild != null ? guild.hashCode() : 0) * 31;
        Map<Long, GuildRole> map = this.roles;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        List<MemberItem> list = this.memberItems;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        GuildRole guildRole = this.myHighestRole;
        int iHashCode4 = (iHashCode3 + (guildRole != null ? guildRole.hashCode() : 0)) * 31;
        MeUser meUser = this.meUser;
        int iHashCode5 = (iHashCode4 + (meUser != null ? meUser.hashCode() : 0)) * 31;
        boolean z2 = this.canKick;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int i = (iHashCode5 + r1) * 31;
        boolean z3 = this.canManageMembers;
        return i + (z3 ? 1 : z3);
    }

    public String toString() {
        StringBuilder sbU = a.U("WidgetServerSettingsMembersModel(guild=");
        sbU.append(this.guild);
        sbU.append(", roles=");
        sbU.append(this.roles);
        sbU.append(", memberItems=");
        sbU.append(this.memberItems);
        sbU.append(", myHighestRole=");
        sbU.append(this.myHighestRole);
        sbU.append(", meUser=");
        sbU.append(this.meUser);
        sbU.append(", canKick=");
        sbU.append(this.canKick);
        sbU.append(", canManageMembers=");
        return a.O(sbU, this.canManageMembers, ")");
    }
}
