package com.discord.widgets.servers.community;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import j0.k.Func1;

/* JADX INFO: compiled from: ObservableExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetServerSettingsCommunityFirstStep$onViewBoundOrOnResume$$inlined$filterIs$1<T, R> implements Func1<Object, Boolean> {
    public static final WidgetServerSettingsCommunityFirstStep$onViewBoundOrOnResume$$inlined$filterIs$1 INSTANCE = new WidgetServerSettingsCommunityFirstStep$onViewBoundOrOnResume$$inlined$filterIs$1();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j0.k.Func1
    public final Boolean call(Object obj) {
        return Boolean.valueOf(obj instanceof WidgetServerSettingsEnableCommunityViewModel.ViewState.Loaded);
    }

    @Override // j0.k.Func1
    public /* bridge */ /* synthetic */ Boolean call(Object obj) {
        return call(obj);
    }
}
