package com.discord.stores;

import com.discord.stores.updates.ObservationDeck;
import com.discord.utilities.analytics.AnalyticsTracker;
import com.discord.utilities.time.Clock;
import com.discord.utilities.time.ClockFactory;
import d0.z.d.m;
import d0.z.d.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Observable;

/* JADX INFO: compiled from: StoreExpressionSuggestions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StoreExpressionSuggestions extends StoreV2 {
    public static final long TRACKED_EXPRESSION_SUGGESTIONS_DISPLAYED_THROTTLE_WINDOW = 60000;
    private final Clock clock;
    private final Dispatcher dispatcher;
    private String lastSuggestionTrigger;
    private long lastTrackedExpressionSuggestionsDisplayed;
    private final ObservationDeck observationDeck;
    private boolean suggestionsEnabled;

    /* JADX INFO: renamed from: com.discord.stores.StoreExpressionSuggestions$observeSuggestionsEnabled$1, reason: invalid class name */
    /* JADX INFO: compiled from: StoreExpressionSuggestions.kt */
    public final class AnonymousClass1 extends o implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return StoreExpressionSuggestions.access$getSuggestionsEnabled$p(StoreExpressionSuggestions.this);
        }
    }

    /* JADX INFO: renamed from: com.discord.stores.StoreExpressionSuggestions$setExpressionSuggestionsEnabled$1, reason: invalid class name */
    /* JADX INFO: compiled from: StoreExpressionSuggestions.kt */
    public final class AnonymousClass1 extends o implements Function0<Unit> {
        public final /* synthetic */ boolean $enable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z2) {
            super(0);
            this.$enable = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StoreExpressionSuggestions.access$setSuggestionsEnabled$p(StoreExpressionSuggestions.this, this.$enable);
            StoreExpressionSuggestions.this.markChanged();
        }
    }

    public /* synthetic */ StoreExpressionSuggestions(ObservationDeck observationDeck, Dispatcher dispatcher, Clock clock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(observationDeck, dispatcher, (i & 4) != 0 ? ClockFactory.get() : clock);
    }

    public static final /* synthetic */ boolean access$getSuggestionsEnabled$p(StoreExpressionSuggestions storeExpressionSuggestions) {
        return storeExpressionSuggestions.suggestionsEnabled;
    }

    public static final /* synthetic */ void access$setSuggestionsEnabled$p(StoreExpressionSuggestions storeExpressionSuggestions, boolean z2) {
        storeExpressionSuggestions.suggestionsEnabled = z2;
    }

    public final String getLastSuggestionTrigger() {
        return this.lastSuggestionTrigger;
    }

    @StoreThread
    public final void handleChannelSelected() {
        this.suggestionsEnabled = true;
        markChanged();
    }

    public final Observable<Boolean> observeSuggestionsEnabled() {
        Observable<Boolean> observableR = ObservationDeck.connectRx$default(this.observationDeck, new ObservationDeck.UpdateSource[]{this}, false, null, null, new AnonymousClass1(), 14, null).r();
        m.checkNotNullExpressionValue(observableR, "observationDeck.connectR… }.distinctUntilChanged()");
        return observableR;
    }

    public final void setExpressionSuggestionsEnabled(boolean enable) {
        this.dispatcher.schedule(new AnonymousClass1(enable));
    }

    public final void trackExpressionSuggestionsDisplayed(String suggestionTrigger) {
        m.checkNotNullParameter(suggestionTrigger, "suggestionTrigger");
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        if (this.lastTrackedExpressionSuggestionsDisplayed + 60000 <= jCurrentTimeMillis) {
            this.lastTrackedExpressionSuggestionsDisplayed = jCurrentTimeMillis;
            AnalyticsTracker.INSTANCE.expressionSuggestionsDisplayed(suggestionTrigger);
            this.lastSuggestionTrigger = suggestionTrigger;
        }
    }

    public StoreExpressionSuggestions(ObservationDeck observationDeck, Dispatcher dispatcher, Clock clock) {
        m.checkNotNullParameter(observationDeck, "observationDeck");
        m.checkNotNullParameter(dispatcher, "dispatcher");
        m.checkNotNullParameter(clock, "clock");
        this.observationDeck = observationDeck;
        this.dispatcher = dispatcher;
        this.clock = clock;
        this.suggestionsEnabled = true;
        this.lastSuggestionTrigger = "";
    }
}
