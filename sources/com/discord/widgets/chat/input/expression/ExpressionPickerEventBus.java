package com.discord.widgets.chat.input.expression;

import d0.g;
import d0.z.d.m;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;
import rx.subjects.PublishSubject;

/* JADX INFO: compiled from: ExpressionPickerEventBus.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExpressionPickerEventBus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy INSTANCE$delegate = g.lazy(ExpressionPickerEventBus$Companion$INSTANCE$2.INSTANCE);
    private final PublishSubject<ExpressionPickerEvent> expressionPickerEventSubject = PublishSubject.k0();

    /* JADX INFO: compiled from: ExpressionPickerEventBus.kt */
    public final class Companion {
        private Companion() {
        }

        public final ExpressionPickerEventBus getINSTANCE() {
            Lazy lazyAccess$getINSTANCE$cp = ExpressionPickerEventBus.access$getINSTANCE$cp();
            Companion companion = ExpressionPickerEventBus.INSTANCE;
            return (ExpressionPickerEventBus) lazyAccess$getINSTANCE$cp.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ Lazy access$getINSTANCE$cp() {
        return INSTANCE$delegate;
    }

    public final void emitEvent(ExpressionPickerEvent expressionPickerEvent) {
        m.checkNotNullParameter(expressionPickerEvent, "expressionPickerEvent");
        this.expressionPickerEventSubject.k.onNext(expressionPickerEvent);
    }

    public final Observable<ExpressionPickerEvent> observeExpressionPickerEvents() {
        PublishSubject<ExpressionPickerEvent> publishSubject = this.expressionPickerEventSubject;
        m.checkNotNullExpressionValue(publishSubject, "expressionPickerEventSubject");
        return publishSubject;
    }
}
