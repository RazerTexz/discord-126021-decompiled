package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo$Scope;

/* JADX INFO: loaded from: classes.dex */
public abstract class InputMergerFactory {
    @Nullable
    public abstract InputMerger createInputMerger(@NonNull String str);

    @Nullable
    @RestrictTo({RestrictTo$Scope.LIBRARY_GROUP})
    public final InputMerger createInputMergerWithDefaultFallback(@NonNull String str) {
        InputMerger inputMergerCreateInputMerger = createInputMerger(str);
        return inputMergerCreateInputMerger == null ? InputMerger.fromClassName(str) : inputMergerCreateInputMerger;
    }

    @NonNull
    @RestrictTo({RestrictTo$Scope.LIBRARY_GROUP})
    public static InputMergerFactory getDefaultInputMergerFactory() {
        return new InputMergerFactory$1();
    }
}
