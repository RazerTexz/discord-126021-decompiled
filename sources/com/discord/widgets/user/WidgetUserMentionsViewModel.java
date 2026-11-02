package com.discord.widgets.user;

import b.a.d.AppViewModel;
import kotlin.Unit;

/* JADX INFO: compiled from: WidgetUserMentionsViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WidgetUserMentionsViewModel extends AppViewModel<Unit> {
    private WidgetUserMentions.Model model;

    public WidgetUserMentionsViewModel() {
        super(null, 1, null);
    }

    /* JADX INFO: renamed from: getModel$app_productionGoogleRelease, reason: from getter */
    public final WidgetUserMentions.Model getModel() {
        return this.model;
    }

    public final void setModel$app_productionGoogleRelease(WidgetUserMentions.Model model) {
        this.model = model;
    }
}
