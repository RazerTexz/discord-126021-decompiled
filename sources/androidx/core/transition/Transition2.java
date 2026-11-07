package androidx.core.transition;

import android.transition.Transition;
import androidx.annotation.RequiresApi;
import d0.z.d.Intrinsics3;
import d0.z.d.Lambda;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.core.transition.TransitionKt, reason: use source file name */
/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Transition2 {

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    public final class AnonymousClass1 extends Lambda implements Function1<Transition, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            invoke2(transition);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
            Intrinsics3.checkNotNullParameter(transition, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$2, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    public final class AnonymousClass2 extends Lambda implements Function1<Transition, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            invoke2(transition);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
            Intrinsics3.checkNotNullParameter(transition, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$3, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    public final class AnonymousClass3 extends Lambda implements Function1<Transition, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            invoke2(transition);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
            Intrinsics3.checkNotNullParameter(transition, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$4, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    public final class AnonymousClass4 extends Lambda implements Function1<Transition, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            invoke2(transition);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
            Intrinsics3.checkNotNullParameter(transition, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$5, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    public final class AnonymousClass5 extends Lambda implements Function1<Transition, Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Transition transition) {
            invoke2(transition);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition transition) {
            Intrinsics3.checkNotNullParameter(transition, "it");
        }
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function2 = AnonymousClass2.INSTANCE;
        }
        Function1 function6 = function2;
        if ((i & 4) != 0) {
            function3 = AnonymousClass3.INSTANCE;
        }
        Function1 function7 = function3;
        if ((i & 8) != 0) {
            function4 = AnonymousClass4.INSTANCE;
        }
        if ((i & 16) != 0) {
            function5 = AnonymousClass5.INSTANCE;
        }
        Intrinsics3.checkNotNullParameter(transition, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "onEnd");
        Intrinsics3.checkNotNullParameter(function6, "onStart");
        Intrinsics3.checkNotNullParameter(function7, "onCancel");
        Intrinsics3.checkNotNullParameter(function4, "onResume");
        Intrinsics3.checkNotNullParameter(function5, "onPause");
        Transition3 transition3 = new Transition3(function1, function4, function5, function7, function6);
        transition.addListener(transition3);
        return transition3;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener addListener(Transition transition, Function1<? super Transition, Unit> function1, Function1<? super Transition, Unit> function2, Function1<? super Transition, Unit> function3, Function1<? super Transition, Unit> function4, Function1<? super Transition, Unit> function5) {
        Intrinsics3.checkNotNullParameter(transition, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "onEnd");
        Intrinsics3.checkNotNullParameter(function2, "onStart");
        Intrinsics3.checkNotNullParameter(function3, "onCancel");
        Intrinsics3.checkNotNullParameter(function4, "onResume");
        Intrinsics3.checkNotNullParameter(function5, "onPause");
        Transition3 transition3 = new Transition3(function1, function4, function5, function3, function2);
        transition.addListener(transition3);
        return transition3;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnCancel(Transition transition, Function1<? super Transition, Unit> function1) {
        Intrinsics3.checkNotNullParameter(transition, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "action");
        Transition4 transition4 = new Transition4(function1);
        transition.addListener(transition4);
        return transition4;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnEnd(Transition transition, Function1<? super Transition, Unit> function1) {
        Intrinsics3.checkNotNullParameter(transition, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "action");
        Transition5 transition5 = new Transition5(function1);
        transition.addListener(transition5);
        return transition5;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnPause(Transition transition, Function1<? super Transition, Unit> function1) {
        Intrinsics3.checkNotNullParameter(transition, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "action");
        Transition6 transition6 = new Transition6(function1);
        transition.addListener(transition6);
        return transition6;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnResume(Transition transition, Function1<? super Transition, Unit> function1) {
        Intrinsics3.checkNotNullParameter(transition, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "action");
        Transition7 transition7 = new Transition7(function1);
        transition.addListener(transition7);
        return transition7;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnStart(Transition transition, Function1<? super Transition, Unit> function1) {
        Intrinsics3.checkNotNullParameter(transition, "<this>");
        Intrinsics3.checkNotNullParameter(function1, "action");
        Transition8 transition8 = new Transition8(function1);
        transition.addListener(transition8);
        return transition8;
    }
}
