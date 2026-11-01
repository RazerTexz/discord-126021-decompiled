package com.discord.widgets.search.suggestions;

import android.view.View;

/* JADX INFO: compiled from: WidgetSearchSuggestionsAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetSearchSuggestionsAdapter$HistoryHeaderViewHolder$onConfigure$1 implements View.OnClickListener {
    public final /* synthetic */ WidgetSearchSuggestionsAdapter.HistoryHeaderViewHolder this$0;

    public WidgetSearchSuggestionsAdapter$HistoryHeaderViewHolder$onConfigure$1(WidgetSearchSuggestionsAdapter.HistoryHeaderViewHolder historyHeaderViewHolder) {
        this.this$0 = historyHeaderViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WidgetSearchSuggestionsAdapter.HistoryHeaderViewHolder.access$getAdapter$p(this.this$0).getOnClearHistoryClicked().invoke();
    }
}
