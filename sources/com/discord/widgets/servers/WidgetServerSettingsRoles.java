package com.discord.widgets.servers;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import b.a.d.j;
import b.d.b.a.a;
import com.discord.R;
import com.discord.api.role.GuildRole;
import com.discord.app.AppActivity;
import com.discord.app.AppFragment;
import com.discord.app.LoggingConfig;
import com.discord.databinding.WidgetServerSettingsRolesBinding;
import com.discord.restapi.RestAPIParams;
import com.discord.stores.StoreStream;
import com.discord.stores.StoreUser;
import com.discord.utilities.error.Error;
import com.discord.utilities.mg_recycler.DragAndDropAdapter;
import com.discord.utilities.mg_recycler.DragAndDropHelper;
import com.discord.utilities.mg_recycler.MGRecyclerAdapter;
import com.discord.utilities.rest.RestAPI;
import com.discord.utilities.rx.ObservableExtensionsKt;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import d0.g;
import d0.z.d.k;
import d0.z.d.m;
import d0.z.d.o;
import j0.k.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import rx.Observable;

/* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetServerSettingsRoles extends AppFragment {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetServerSettingsRoles.class, "binding", "getBinding()Lcom/discord/databinding/WidgetServerSettingsRolesBinding;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String INTENT_EXTRA_GUILD_ID = "INTENT_EXTRA_GUILD_ID";
    private WidgetServerSettingsRolesAdapter adapter;

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;

    /* JADX INFO: renamed from: guildId$delegate, reason: from kotlin metadata */
    private final Lazy guildId;
    private ItemTouchHelper itemTouchHelper;
    private final LoggingConfig loggingConfig;

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$configureUI$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final class AnonymousClass1 extends o implements Function1<GuildRole, Unit> {
        public final /* synthetic */ Model $data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Model model) {
            super(1);
            this.$data = model;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GuildRole guildRole) {
            invoke2(guildRole);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GuildRole guildRole) {
            m.checkNotNullParameter(guildRole, "<name for destructuring parameter 0>");
            WidgetServerSettingsEditRole.INSTANCE.launch(this.$data.getGuildId(), guildRole.getId(), WidgetServerSettingsRoles.this.requireContext());
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$createRole$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final class AnonymousClass1<T, R> implements b<GuildRole, Observable<? extends GuildRole>> {
        public final /* synthetic */ long $guildId;

        /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$createRole$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
        public final class C04351<T, R> implements b<Map<Long, ? extends GuildRole>, GuildRole> {
            public final /* synthetic */ long $id;

            public C04351(long j) {
                this.$id = j;
            }

            @Override // j0.k.b
            public /* bridge */ /* synthetic */ GuildRole call(Map<Long, ? extends GuildRole> map) {
                return call2((Map<Long, GuildRole>) map);
            }

            /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
            public final GuildRole call2(Map<Long, GuildRole> map) {
                return map.get(Long.valueOf(this.$id));
            }
        }

        public AnonymousClass1(long j) {
            this.$guildId = j;
        }

        @Override // j0.k.b
        public /* bridge */ /* synthetic */ Observable<? extends GuildRole> call(GuildRole guildRole) {
            return call2(guildRole);
        }

        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final Observable<? extends GuildRole> call2(GuildRole guildRole) {
            long id2 = guildRole.getId();
            return StoreStream.INSTANCE.getGuilds().observeRoles(this.$guildId, d0.t.m.listOf(Long.valueOf(id2))).G(new C04351(id2));
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$onViewBoundOrOnResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final /* synthetic */ class AnonymousClass1 extends k implements Function1<Model, Unit> {
        public AnonymousClass1(WidgetServerSettingsRoles widgetServerSettingsRoles) {
            super(1, widgetServerSettingsRoles, WidgetServerSettingsRoles.class, "configureUI", "configureUI(Lcom/discord/widgets/servers/WidgetServerSettingsRoles$Model;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Model model) throws Exception {
            invoke2(model);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Model model) throws Exception {
            WidgetServerSettingsRoles.access$configureUI((WidgetServerSettingsRoles) this.receiver, model);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$processRoleDrop$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final class AnonymousClass1 extends o implements Function1<Void, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
            invoke2(r1);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r4) {
            b.a.d.m.i(WidgetServerSettingsRoles.this, R.string.role_order_updated, 0, 4);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$configureUI$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final class AnonymousClass2 extends o implements Function1<Map<String, ? extends Integer>, Unit> {
        public final /* synthetic */ Model $data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Model model) {
            super(1);
            this.$data = model;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Integer> map) {
            invoke2((Map<String, Integer>) map);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Integer> map) {
            m.checkNotNullParameter(map, "newPositions");
            WidgetServerSettingsRoles.access$processRoleDrop(WidgetServerSettingsRoles.this, map, this.$data);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$createRole$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final class AnonymousClass2 extends o implements Function1<GuildRole, Unit> {
        public final /* synthetic */ Model $dataSnapshot;
        public final /* synthetic */ long $guildId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, Model model) {
            super(1);
            this.$guildId = j;
            this.$dataSnapshot = model;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GuildRole guildRole) throws Exception {
            invoke2(guildRole);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GuildRole guildRole) throws Exception {
            if (guildRole != null) {
                WidgetServerSettingsEditRole.INSTANCE.launch(this.$guildId, guildRole.getId(), WidgetServerSettingsRoles.this.requireContext());
            } else {
                WidgetServerSettingsRoles.access$configureUI(WidgetServerSettingsRoles.this, this.$dataSnapshot);
            }
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$processRoleDrop$2, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final class AnonymousClass2 extends o implements Function1<Error, Unit> {
        public final /* synthetic */ Model $dataSnapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Model model) {
            super(1);
            this.$dataSnapshot = model;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Error error) throws Exception {
            invoke2(error);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Error error) throws Exception {
            m.checkNotNullParameter(error, "it");
            WidgetServerSettingsRoles.access$configureUI(WidgetServerSettingsRoles.this, this.$dataSnapshot);
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.WidgetServerSettingsRoles$configureUI$3, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ Model $data;

        public AnonymousClass3(Model model) {
            this.$data = model;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WidgetServerSettingsRoles.access$createRole(WidgetServerSettingsRoles.this, this.$data.getGuildId(), this.$data);
        }
    }

    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final class Companion {
        private Companion() {
        }

        public final void create(Context context, long guildId) {
            m.checkNotNullParameter(context, "context");
            StoreStream.INSTANCE.getAnalytics().onGuildSettingsPaneViewed("ROLES", guildId);
            Intent intentPutExtra = new Intent().putExtra("INTENT_EXTRA_GUILD_ID", guildId);
            m.checkNotNullExpressionValue(intentPutExtra, "Intent()\n          .putE…_EXTRA_GUILD_ID, guildId)");
            j.d(context, WidgetServerSettingsRoles.class, intentPutExtra);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
    public final /* data */ class Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean canManageRoles;
        private final boolean elevated;
        private final long guildId;
        private final String guildName;
        private final List<DragAndDropAdapter.Payload> roleItems;

        /* JADX INFO: compiled from: WidgetServerSettingsRoles.kt */
        public final class Companion {
            private Companion() {
            }

            public final Observable<Model> get(long guildId) {
                Observable<Model> observableR = StoreUser.observeMe$default(StoreStream.INSTANCE.getUsers(), false, 1, null).Y(new WidgetServerSettingsRoles$Model$Companion$get$1(guildId)).r();
                m.checkNotNullExpressionValue(observableR, "StoreStream\n            …  .distinctUntilChanged()");
                return observableR;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Model(long j, String str, boolean z2, boolean z3, List<? extends DragAndDropAdapter.Payload> list) {
            m.checkNotNullParameter(list, "roleItems");
            this.guildId = j;
            this.guildName = str;
            this.canManageRoles = z2;
            this.elevated = z3;
            this.roleItems = list;
        }

        public final List<DragAndDropAdapter.Payload> component5() {
            return this.roleItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Model copy$default(Model model, long j, String str, boolean z2, boolean z3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = model.guildId;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = model.guildName;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                z2 = model.canManageRoles;
            }
            boolean z4 = z2;
            if ((i & 8) != 0) {
                z3 = model.elevated;
            }
            boolean z5 = z3;
            if ((i & 16) != 0) {
                list = model.roleItems;
            }
            return model.copy(j2, str2, z4, z5, list);
        }

        public final Model copy(long guildId, String guildName, boolean canManageRoles, boolean elevated, List<? extends DragAndDropAdapter.Payload> roleItems) {
            m.checkNotNullParameter(roleItems, "roleItems");
            return new Model(guildId, guildName, canManageRoles, elevated, roleItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return this.guildId == model.guildId && m.areEqual(this.guildName, model.guildName) && this.canManageRoles == model.canManageRoles && this.elevated == model.elevated && m.areEqual(this.roleItems, model.roleItems);
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getCanManageRoles() {
            return this.canManageRoles;
        }

        public final boolean getCanManageRoles() {
            return this.canManageRoles;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getElevated() {
            return this.elevated;
        }

        public final boolean getElevated() {
            return this.elevated;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getGuildId() {
            return this.guildId;
        }

        public final long getGuildId() {
            return this.guildId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGuildName() {
            return this.guildName;
        }

        public final String getGuildName() {
            return this.guildName;
        }

        public final List<DragAndDropAdapter.Payload> getRoleItems() {
            return this.roleItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public int hashCode() {
            int iA = a0.a.a.b.a(this.guildId) * 31;
            String str = this.guildName;
            int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
            boolean z2 = this.canManageRoles;
            ?? r1 = z2;
            if (z2) {
                r1 = 1;
            }
            int i = (iHashCode + r1) * 31;
            boolean z3 = this.elevated;
            int i2 = (i + (z3 ? 1 : z3)) * 31;
            List<DragAndDropAdapter.Payload> list = this.roleItems;
            return i2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbU = a.U("Model(guildId=");
            sbU.append(this.guildId);
            sbU.append(", guildName=");
            sbU.append(this.guildName);
            sbU.append(", canManageRoles=");
            sbU.append(this.canManageRoles);
            sbU.append(", elevated=");
            sbU.append(this.elevated);
            sbU.append(", roleItems=");
            return a.L(sbU, this.roleItems, ")");
        }
    }

    public WidgetServerSettingsRoles() {
        super(R.layout.widget_server_settings_roles);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetServerSettingsRoles$binding$2.INSTANCE, null, 2, null);
        this.guildId = g.lazy(new WidgetServerSettingsRoles$guildId$2(this));
        this.loggingConfig = new LoggingConfig(false, null, WidgetServerSettingsRoles$loggingConfig$1.INSTANCE, 3);
    }

    public static final /* synthetic */ void access$configureUI(WidgetServerSettingsRoles widgetServerSettingsRoles, Model model) throws Exception {
        widgetServerSettingsRoles.configureUI(model);
    }

    public static final /* synthetic */ void access$createRole(WidgetServerSettingsRoles widgetServerSettingsRoles, long j, Model model) {
        widgetServerSettingsRoles.createRole(j, model);
    }

    public static final /* synthetic */ void access$processRoleDrop(WidgetServerSettingsRoles widgetServerSettingsRoles, Map map, Model model) {
        widgetServerSettingsRoles.processRoleDrop(map, model);
    }

    private final void configureUI(Model data) throws Exception {
        if ((data != null ? data.getRoleItems() : null) == null || data.getRoleItems().isEmpty()) {
            AppActivity appActivity = getAppActivity();
            if (appActivity != null) {
                appActivity.onBackPressed();
                return;
            }
            return;
        }
        setActionBarTitle(R.string.roles);
        setActionBarSubtitle(data.getGuildName());
        WidgetServerSettingsRolesAdapter widgetServerSettingsRolesAdapter = this.adapter;
        if (widgetServerSettingsRolesAdapter != null) {
            widgetServerSettingsRolesAdapter.configure(data.getRoleItems(), new AnonymousClass1(data), new AnonymousClass2(data));
        }
        if (data.getCanManageRoles() && data.getElevated()) {
            getBinding().c.setOnClickListener(new AnonymousClass3(data));
            getBinding().c.show();
        } else {
            getBinding().c.hide();
            getBinding().c.setOnClickListener(null);
        }
    }

    private final void createRole(long guildId, Model dataSnapshot) {
        Observable observableY = ObservableExtensionsKt.restSubscribeOn$default(RestAPI.INSTANCE.getApi().createRole(guildId), false, 1, null).Y(new AnonymousClass1(guildId));
        m.checkNotNullExpressionValue(observableY, "RestAPI\n        .api\n   … rolesMap[id] }\n        }");
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui$default(ObservableExtensionsKt.takeSingleUntilTimeout$default(observableY, 0L, false, 3, null), this, null, 2, null), WidgetServerSettingsRoles.class, getContext(), (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass2(guildId, dataSnapshot), 60, (Object) null);
    }

    private final WidgetServerSettingsRolesBinding getBinding() {
        return (WidgetServerSettingsRolesBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final long getGuildId() {
        return ((Number) this.guildId.getValue()).longValue();
    }

    @Override // com.discord.app.AppFragment, com.discord.app.AppLogger.a
    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    @Override // com.discord.app.AppFragment
    public void onViewBound(View view) {
        m.checkNotNullParameter(view, "view");
        super.onViewBound(view);
        AppFragment.setActionBarDisplayHomeAsUpEnabled$default(this, false, 1, null);
        MGRecyclerAdapter.Companion companion = MGRecyclerAdapter.INSTANCE;
        RecyclerView recyclerView = getBinding().d;
        m.checkNotNullExpressionValue(recyclerView, "binding.serverSettingsRolesRecycler");
        this.adapter = (WidgetServerSettingsRolesAdapter) companion.configure(new WidgetServerSettingsRolesAdapter(recyclerView));
        ItemTouchHelper itemTouchHelper = this.itemTouchHelper;
        if (itemTouchHelper != null && itemTouchHelper != null) {
            itemTouchHelper.attachToRecyclerView(null);
        }
        WidgetServerSettingsRolesAdapter widgetServerSettingsRolesAdapter = this.adapter;
        m.checkNotNull(widgetServerSettingsRolesAdapter);
        ItemTouchHelper itemTouchHelper2 = new ItemTouchHelper(new DragAndDropHelper(widgetServerSettingsRolesAdapter, 0, 2, null));
        this.itemTouchHelper = itemTouchHelper2;
        if (itemTouchHelper2 != null) {
            itemTouchHelper2.attachToRecyclerView(getBinding().d);
        }
    }

    @Override // com.discord.app.AppFragment
    public void onViewBoundOrOnResume() {
        super.onViewBoundOrOnResume();
        ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.ui$default(ObservableExtensionsKt.computationLatest(Model.INSTANCE.get(getGuildId())), this, null, 2, null), WidgetServerSettingsRoles.class, (Context) null, (Function1) null, (Function1) null, (Function0) null, (Function0) null, new AnonymousClass1(this), 62, (Object) null);
    }

    private final void processRoleDrop(Map<String, Integer> newPositions, Model dataSnapshot) {
        Set<String> setKeySet = newPositions.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setKeySet.iterator();
        while (true) {
            RestAPIParams.Role roleCreateForPosition = null;
            if (!it.hasNext()) {
                ObservableExtensionsKt.appSubscribe$default(ObservableExtensionsKt.withDimmer$default(ObservableExtensionsKt.ui$default(ObservableExtensionsKt.restSubscribeOn$default(RestAPI.INSTANCE.getApi().batchUpdateRole(dataSnapshot.getGuildId(), arrayList), false, 1, null), this, null, 2, null), getBinding().f2585b, 0L, 2, null), WidgetServerSettingsRoles.class, getContext(), (Function1) null, new AnonymousClass2(dataSnapshot), (Function0) null, (Function0) null, new AnonymousClass1(), 52, (Object) null);
                return;
            }
            String str = (String) it.next();
            Integer num = newPositions.get(str);
            if (num != null) {
                roleCreateForPosition = RestAPIParams.Role.INSTANCE.createForPosition(Long.parseLong(str), num.intValue());
            }
            if (roleCreateForPosition != null) {
                arrayList.add(roleCreateForPosition);
            }
        }
    }
}
