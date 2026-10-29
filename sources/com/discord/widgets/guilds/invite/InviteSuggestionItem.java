package com.discord.widgets.guilds.invite;

import com.discord.utilities.mg_recycler.MGRecyclerDataPayload;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: InviteSuggestionItem.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class InviteSuggestionItem implements MGRecyclerDataPayload {
    public static final InviteSuggestionItem$SearchNoResultsItem SearchNoResultsItem = new InviteSuggestionItem$SearchNoResultsItem(null);
    private final int type;
    private static final String key = "SEARCH_NO_RESULTS";

    private InviteSuggestionItem() {
        this.type = -1;
    }

    public static final /* synthetic */ String access$getKey$cp() {
        return key;
    }

    @Override // com.discord.utilities.mg_recycler.MGRecyclerDataPayload
    public int getType() {
        return this.type;
    }

    public abstract boolean hasSentInvite();

    public /* synthetic */ InviteSuggestionItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
