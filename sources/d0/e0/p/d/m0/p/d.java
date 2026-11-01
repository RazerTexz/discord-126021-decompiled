package d0.e0.p.d.m0.p;

import d0.z.d.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: functions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final Function1<Object, Boolean> a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Function3<Object, Object, Object, Unit> f3562b;

    /* JADX INFO: renamed from: d0.e0.p.d.m0.p.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: functions.kt */
    public final class C0590d extends o implements Function2<Object, Object, Unit> {
        public static final C0590d j = new C0590d();

        public C0590d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            invoke2(obj, obj2);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj, Object obj2) {
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public final class a extends o implements Function1 {
        public static final a j = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public final class b extends o implements Function1<Object, Boolean> {
        public static final b j = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(invoke2(obj));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2(Object obj) {
            return true;
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public final class c extends o implements Function1<Object, Unit> {
        public static final c j = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public final class e extends o implements Function3<Object, Object, Object, Unit> {
        public static final e j = new e();

        public e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3) {
            invoke2(obj, obj2, obj3);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj, Object obj2, Object obj3) {
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public final class f extends o implements Function1<Object, Object> {
        public static final f j = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    static {
        f fVar = f.j;
        a = b.j;
        a aVar = a.j;
        c cVar = c.j;
        C0590d c0590d = C0590d.j;
        f3562b = e.j;
    }

    public static final <T> Function1<T, Boolean> alwaysTrue() {
        return (Function1<T, Boolean>) a;
    }

    public static final Function3<Object, Object, Object, Unit> getDO_NOTHING_3() {
        return f3562b;
    }
}
