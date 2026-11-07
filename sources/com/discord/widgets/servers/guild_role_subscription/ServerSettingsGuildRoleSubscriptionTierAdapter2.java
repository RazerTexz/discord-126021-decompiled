package com.discord.widgets.servers.guild_role_subscription;

import a0.a.a.b;
import b.d.b.a.outline;
import com.discord.utilities.recycler.DiffKeyProvider;
import d0.z.d.Intrinsics3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.discord.widgets.servers.guild_role_subscription.ServerSettingsGuildRoleSubscriptionTierAdapterItem, reason: use source file name */
/* JADX INFO: compiled from: ServerSettingsGuildRoleSubscriptionTierAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ServerSettingsGuildRoleSubscriptionTierAdapter2 implements DiffKeyProvider {

    /* JADX INFO: renamed from: com.discord.widgets.servers.guild_role_subscription.ServerSettingsGuildRoleSubscriptionTierAdapterItem$AddTier */
    /* JADX INFO: compiled from: ServerSettingsGuildRoleSubscriptionTierAdapter.kt */
    public final class AddTier extends ServerSettingsGuildRoleSubscriptionTierAdapter2 {
        public static final AddTier INSTANCE = new AddTier();
        private static final String key = "AddTierItem";

        private AddTier() {
            super(null);
        }

        @Override // com.discord.utilities.recycler.DiffKeyProvider
        public String getKey() {
            return key;
        }
    }

    /* JADX INFO: renamed from: com.discord.widgets.servers.guild_role_subscription.ServerSettingsGuildRoleSubscriptionTierAdapterItem$Tier */
    /* JADX INFO: compiled from: ServerSettingsGuildRoleSubscriptionTierAdapter.kt */
    public final /* data */ class Tier extends ServerSettingsGuildRoleSubscriptionTierAdapter2 {
        private final long applicationId;
        private final boolean isPublished;
        private final String key;
        private final Long tierImageAssetId;
        private final long tierListingId;
        private final String tierName;
        private final int tierPrice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tier(long j, String str, int i, long j2, boolean z2, Long l) {
            super(null);
            Intrinsics3.checkNotNullParameter(str, "tierName");
            this.tierListingId = j;
            this.tierName = str;
            this.tierPrice = i;
            this.applicationId = j2;
            this.isPublished = z2;
            this.tierImageAssetId = l;
            this.key = String.valueOf(j);
        }

        public static /* synthetic */ Tier copy$default(Tier tier, long j, String str, int i, long j2, boolean z2, Long l, int i2, Object obj) {
            return tier.copy((i2 & 1) != 0 ? tier.tierListingId : j, (i2 & 2) != 0 ? tier.tierName : str, (i2 & 4) != 0 ? tier.tierPrice : i, (i2 & 8) != 0 ? tier.applicationId : j2, (i2 & 16) != 0 ? tier.isPublished : z2, (i2 & 32) != 0 ? tier.tierImageAssetId : l);
        }

        public final Tier copy(long tierListingId, String tierName, int tierPrice, long applicationId, boolean isPublished, Long tierImageAssetId) {
            Intrinsics3.checkNotNullParameter(tierName, "tierName");
            return new Tier(tierListingId, tierName, tierPrice, applicationId, isPublished, tierImageAssetId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tier)) {
                return false;
            }
            Tier tier = (Tier) other;
            return this.tierListingId == tier.tierListingId && Intrinsics3.areEqual(this.tierName, tier.tierName) && this.tierPrice == tier.tierPrice && this.applicationId == tier.applicationId && this.isPublished == tier.isPublished && Intrinsics3.areEqual(this.tierImageAssetId, tier.tierImageAssetId);
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getApplicationId() {
            return this.applicationId;
        }

        public final long getApplicationId() {
            return this.applicationId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsPublished() {
            return this.isPublished;
        }

        @Override // com.discord.utilities.recycler.DiffKeyProvider
        public String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getTierImageAssetId() {
            return this.tierImageAssetId;
        }

        public final Long getTierImageAssetId() {
            return this.tierImageAssetId;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTierListingId() {
            return this.tierListingId;
        }

        public final long getTierListingId() {
            return this.tierListingId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTierName() {
            return this.tierName;
        }

        public final String getTierName() {
            return this.tierName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getTierPrice() {
            return this.tierPrice;
        }

        public final int getTierPrice() {
            return this.tierPrice;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v8, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        public int hashCode() {
            int iA = b.a(this.tierListingId) * 31;
            String str = this.tierName;
            int iA2 = (b.a(this.applicationId) + ((((iA + (str != null ? str.hashCode() : 0)) * 31) + this.tierPrice) * 31)) * 31;
            boolean z2 = this.isPublished;
            ?? r0 = z2;
            if (z2) {
                r0 = 1;
            }
            int i = (iA2 + r0) * 31;
            Long l = this.tierImageAssetId;
            return i + (l != null ? l.hashCode() : 0);
        }

        public final boolean isPublished() {
            return this.isPublished;
        }

        public String toString() {
            StringBuilder sbU = outline.U("Tier(tierListingId=");
            sbU.append(this.tierListingId);
            sbU.append(", tierName=");
            sbU.append(this.tierName);
            sbU.append(", tierPrice=");
            sbU.append(this.tierPrice);
            sbU.append(", applicationId=");
            sbU.append(this.applicationId);
            sbU.append(", isPublished=");
            sbU.append(this.isPublished);
            sbU.append(", tierImageAssetId=");
            return outline.G(sbU, this.tierImageAssetId, ")");
        }
    }

    private ServerSettingsGuildRoleSubscriptionTierAdapter2() {
    }

    public /* synthetic */ ServerSettingsGuildRoleSubscriptionTierAdapter2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
