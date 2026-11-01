package b.a.o;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.os.ConfigurationCompat;
import d0.z.d.m;
import d0.z.d.o;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: LocaleProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f251b = null;
    public static Function1<? super Context, Locale> a = C0038a.j;

    /* JADX INFO: renamed from: b.a.o.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocaleProvider.kt */
    public final class C0038a extends o implements Function1<Context, Locale> {
        public static final C0038a j = new C0038a();

        public C0038a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Locale invoke(Context context) {
            Context context2 = context;
            m.checkParameterIsNotNull(context2, "context");
            Resources resources = context2.getResources();
            m.checkExpressionValueIsNotNull(resources, "context.resources");
            Locale locale = ConfigurationCompat.getLocales(resources.getConfiguration()).get(0);
            m.checkExpressionValueIsNotNull(locale, "ConfigurationCompat.getL…sources.configuration)[0]");
            return locale;
        }
    }
}
