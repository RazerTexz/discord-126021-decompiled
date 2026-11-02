package com.discord.widgets.guilds.invite;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import d0.z.d.Intrinsics3;
import java.util.Objects;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetGuildInviteShareSheet$configureNormalUI$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ WidgetGuildInviteShareSheet this$0;

    public WidgetGuildInviteShareSheet$configureNormalUI$$inlined$doOnLayout$1(WidgetGuildInviteShareSheet widgetGuildInviteShareSheet) {
        this.this$0 = widgetGuildInviteShareSheet;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        Intrinsics3.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Resources resources = this.this$0.getResources();
        Intrinsics3.checkNotNullExpressionValue(resources, "resources");
        layoutParams2.height = (int) (((double) resources.getDisplayMetrics().heightPixels) * 0.9d);
        view.setLayoutParams(layoutParams2);
        WidgetGuildInviteShareSheet.access$getBinding$p(this.this$0).m.requestLayout();
    }
}
