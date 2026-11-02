package androidx.core.content;

import android.annotation.SuppressLint;
import d0.z.d.Intrinsics3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.core.content.SharedPreferencesKt, reason: use source file name */
/* JADX INFO: compiled from: SharedPreferences.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferences {
    public static /* synthetic */ void edit$default(android.content.SharedPreferences sharedPreferences, boolean z2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = false;
        }
        Intrinsics3.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "action");
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics3.checkNotNullExpressionValue(editorEdit, "editor");
        function1.invoke(editorEdit);
        if (z2) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static final void edit(android.content.SharedPreferences sharedPreferences, boolean z2, Function1<? super android.content.SharedPreferences.Editor, Unit> function1) {
        Intrinsics3.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "action");
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics3.checkNotNullExpressionValue(editorEdit, "editor");
        function1.invoke(editorEdit);
        if (z2) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
