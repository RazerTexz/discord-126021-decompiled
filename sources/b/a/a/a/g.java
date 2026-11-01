package b.a.a.a;

import com.discord.models.domain.ModelSubscription;
import com.discord.utilities.premium.GuildBoostUtils;
import d0.z.d.m;
import d0.z.d.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: GuildBoostCancelViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o implements Function1<GuildBoostUtils.ModifyGuildBoostSlotResult, Unit> {
    public final /* synthetic */ ModelSubscription $subscription;
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, ModelSubscription modelSubscription) {
        super(1);
        this.this$0 = fVar;
        this.$subscription = modelSubscription;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(GuildBoostUtils.ModifyGuildBoostSlotResult modifyGuildBoostSlotResult) {
        GuildBoostUtils.ModifyGuildBoostSlotResult modifyGuildBoostSlotResult2 = modifyGuildBoostSlotResult;
        m.checkNotNullParameter(modifyGuildBoostSlotResult2, "result");
        int iOrdinal = modifyGuildBoostSlotResult2.ordinal();
        if (iOrdinal == 0) {
            this.this$0.updateViewState(new f.c.b(this.$subscription));
        } else if (iOrdinal == 1) {
            this.this$0.updateViewState(new f.c.d(this.$subscription));
        } else if (iOrdinal == 2) {
            this.this$0.updateViewState(new f.c.b(this.$subscription));
        }
        return Unit.a;
    }
}
