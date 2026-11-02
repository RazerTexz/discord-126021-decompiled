package com.discord.utilities.search.suggestion;

import j0.k.Func1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.discord.utilities.search.suggestion.SearchSuggestionEngine$sam$rx_functions_Func1$0, reason: use source file name */
/* JADX INFO: compiled from: SearchSuggestionEngine.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchSuggestionEngine2 implements Func1 {
    private final /* synthetic */ Function1 function;

    public SearchSuggestionEngine2(Function1 function1) {
        this.function = function1;
    }

    @Override // j0.k.Func1
    public final /* synthetic */ Object call(Object obj) {
        return this.function.invoke(obj);
    }
}
