package com.discord.utilities.captcha;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentManager;
import b.d.b.a.outline;
import b.i.a.f.e.k.k;
import b.i.a.f.e.k.s;
import b.i.a.f.e.k.v;
import b.i.a.f.h.o.i;
import b.i.a.f.h.o.j;
import b.i.a.f.h.o.l;
import b.i.a.f.n.c0;
import b.i.a.f.n.d;
import b.i.a.f.n.e;
import b.i.a.f.n.g;
import b.j.a.f.a;
import b.j.a.f.c;
import com.discord.R;
import com.discord.app.AppActivity;
import com.discord.stores.StoreStream;
import com.discord.widgets.notice.WidgetNoticeDialog;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.hcaptcha.sdk.HCaptcha$1;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaError;
import com.hcaptcha.sdk.HCaptchaException;
import com.hcaptcha.sdk.HCaptchaSize;
import com.hcaptcha.sdk.HCaptchaTheme;
import com.hcaptcha.sdk.HCaptchaTokenResponse;
import d0.z.d.Intrinsics3;
import d0.z.d.Lambda;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rx.Emitter;
import rx.Observable;
import rx.functions.Action1;

/* JADX INFO: compiled from: CaptchaHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CaptchaHelper {
    public static final String CAPTCHA_KEY = "captcha_key";
    private static final String FAILED_CAPTCHA_EXPIRED = "expired";
    private static final String FAILED_DEVICE_UNSUPPORTED = "unsupported_device";
    private static final String FAILED_MISSING_DEPS = "missing_dependencies";
    private static final String RECAPTCHA_SITE_KEY = "6Lff5jIUAAAAAImNXvYYPv2VW2En3Dexy4oX2o4s";
    private static String captchaRqtoken;
    private static String captchaToken;
    public static final CaptchaHelper INSTANCE = new CaptchaHelper();

    /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$ensurePlayServicesAvailable$1, reason: invalid class name */
    /* JADX INFO: compiled from: CaptchaHelper.kt */
    public final class AnonymousClass1<TResult> implements e<Void> {
        public final /* synthetic */ Function0 $onReady;

        public AnonymousClass1(Function0 function0) {
            this.$onReady = function0;
        }

        @Override // b.i.a.f.n.e
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
            onSuccess2(r1);
        }

        /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
        public final void onSuccess2(Void r1) {
            this.$onReady.invoke();
        }
    }

    /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$showCaptcha$1, reason: invalid class name */
    /* JADX INFO: compiled from: CaptchaHelper.kt */
    public final class AnonymousClass1<TResult> implements e<SafetyNetApi.RecaptchaTokenResponse> {
        public final /* synthetic */ Function1 $onSuccess;

        public AnonymousClass1(Function1 function1) {
            this.$onSuccess = function1;
        }

        @Override // b.i.a.f.n.e
        public /* bridge */ /* synthetic */ void onSuccess(SafetyNetApi.RecaptchaTokenResponse recaptchaTokenResponse) {
            onSuccess2(recaptchaTokenResponse);
        }

        /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
        public final void onSuccess2(SafetyNetApi.RecaptchaTokenResponse recaptchaTokenResponse) {
            Intrinsics3.checkNotNullExpressionValue(recaptchaTokenResponse, "it");
            String strC = ((SafetyNetApi.a) recaptchaTokenResponse.a).C();
            Intrinsics3.checkNotNullExpressionValue(strC, "userResponseToken");
            if (strC.length() == 0) {
                return;
            }
            this.$onSuccess.invoke("android:" + strC);
        }
    }

    /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$tryShowCaptcha$1, reason: invalid class name */
    /* JADX INFO: compiled from: CaptchaHelper.kt */
    public final class AnonymousClass1<T> implements Action1<Emitter<String>> {
        public final /* synthetic */ CaptchaRequest $captchaRequest;

        /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$tryShowCaptcha$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CaptchaHelper.kt */
        public final class AnonymousClass2 implements a {
            public final /* synthetic */ Emitter $emitter;
            public final /* synthetic */ Function1 $errorHandler;

            public AnonymousClass2(Emitter emitter, Function1 function1) {
                this.$emitter = emitter;
                this.$errorHandler = function1;
            }

            @Override // b.j.a.f.a
            public final void onFailure(HCaptchaException hCaptchaException) {
                Intrinsics3.checkNotNullExpressionValue(hCaptchaException, "hCaptchaException");
                if (hCaptchaException.a() == HCaptchaError.CHALLENGE_CLOSED) {
                    this.$emitter.onCompleted();
                    return;
                }
                String strName = hCaptchaException.a().name();
                Locale locale = Locale.ROOT;
                Intrinsics3.checkNotNullExpressionValue(locale, "Locale.ROOT");
                Objects.requireNonNull(strName, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = strName.toLowerCase(locale);
                Intrinsics3.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                this.$errorHandler.invoke(new Failure(R.string.captcha_failed, lowerCase));
            }
        }

        /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$tryShowCaptcha$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: CaptchaHelper.kt */
        public final class AnonymousClass3 extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Activity $activity;
            public final /* synthetic */ Emitter $emitter;
            public final /* synthetic */ Function1 $errorHandler;

            /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$tryShowCaptcha$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: CaptchaHelper.kt */
            public final class C02101 extends Lambda implements Function1<String, Unit> {
                public C02101() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    Intrinsics3.checkNotNullParameter(str, "token");
                    AnonymousClass3.this.$emitter.onNext(str);
                    AnonymousClass3.this.$emitter.onCompleted();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Activity activity, Emitter emitter, Function1 function1) {
                super(0);
                this.$activity = activity;
                this.$emitter = emitter;
                this.$errorHandler = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CaptchaHelper captchaHelper = CaptchaHelper.INSTANCE;
                Activity activity = this.$activity;
                b.i.a.f.e.h.a.g<l> gVar = b.i.a.f.k.a.a;
                SafetyNetClient safetyNetClient = new SafetyNetClient(activity);
                Intrinsics3.checkNotNullExpressionValue(safetyNetClient, "SafetyNet\n              …     .getClient(activity)");
                CaptchaHelper.access$showCaptcha(captchaHelper, safetyNetClient, new C02101(), this.$errorHandler);
            }
        }

        /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$tryShowCaptcha$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: CaptchaHelper.kt */
        public final class C02091<TResult> implements c<HCaptchaTokenResponse> {
            public final /* synthetic */ Emitter $emitter;

            public C02091(Emitter emitter) {
                this.$emitter = emitter;
            }

            @Override // b.j.a.f.c
            public /* bridge */ /* synthetic */ void onSuccess(HCaptchaTokenResponse hCaptchaTokenResponse) {
                onSuccess2(hCaptchaTokenResponse);
            }

            /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
            public final void onSuccess2(HCaptchaTokenResponse hCaptchaTokenResponse) {
                Emitter emitter = this.$emitter;
                Intrinsics3.checkNotNullExpressionValue(hCaptchaTokenResponse, "hCaptchaTokenResponse");
                emitter.onNext(hCaptchaTokenResponse.a);
                this.$emitter.onCompleted();
            }
        }

        public AnonymousClass1(CaptchaRequest captchaRequest) {
            this.$captchaRequest = captchaRequest;
        }

        @Override // rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Emitter<String> emitter) throws PackageManager.NameNotFoundException {
            call2(emitter);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final void call2(Emitter<String> emitter) throws PackageManager.NameNotFoundException {
            CaptchaHelper3 captchaHelper3 = new CaptchaHelper3(emitter);
            CaptchaRequest captchaRequest = this.$captchaRequest;
            if (!(captchaRequest instanceof CaptchaRequest.HCaptcha)) {
                if (captchaRequest instanceof CaptchaRequest.ReCaptcha) {
                    Activity activity = ((CaptchaRequest.ReCaptcha) captchaRequest).getActivity();
                    CaptchaHelper captchaHelper = CaptchaHelper.INSTANCE;
                    Object obj = GoogleApiAvailability.c;
                    GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.d;
                    Intrinsics3.checkNotNullExpressionValue(googleApiAvailability, "GoogleApiAvailability\n              .getInstance()");
                    CaptchaHelper.access$ensurePlayServicesAvailable(captchaHelper, googleApiAvailability, activity, new AnonymousClass3(activity, emitter, captchaHelper3), captchaHelper3);
                    return;
                }
                return;
            }
            Activity activity2 = ((CaptchaRequest.HCaptcha) captchaRequest).getActivity();
            HCaptchaConfig.a aVarBuilder = HCaptchaConfig.builder();
            String siteKey = ((CaptchaRequest.HCaptcha) this.$captchaRequest).getSiteKey();
            Objects.requireNonNull(aVarBuilder);
            Objects.requireNonNull(siteKey, "siteKey is marked non-null but is null");
            aVarBuilder.a = siteKey;
            aVarBuilder.n = StoreStream.INSTANCE.getUserSettingsSystem().getLocale();
            aVarBuilder.m = true;
            if (((CaptchaRequest.HCaptcha) this.$captchaRequest).getRqdata() != null) {
                aVarBuilder.f = ((CaptchaRequest.HCaptcha) this.$captchaRequest).getRqdata();
            }
            Boolean boolAccess$000 = aVarBuilder.c;
            if (!aVarBuilder.f3141b) {
                boolAccess$000 = HCaptchaConfig.access$000();
            }
            Boolean bool = boolAccess$000;
            Boolean boolAccess$100 = aVarBuilder.e;
            if (!aVarBuilder.d) {
                boolAccess$100 = HCaptchaConfig.access$100();
            }
            Boolean bool2 = boolAccess$100;
            String strAccess$200 = aVarBuilder.h;
            if (!aVarBuilder.g) {
                strAccess$200 = HCaptchaConfig.access$200();
            }
            String str = strAccess$200;
            String strAccess$300 = aVarBuilder.n;
            if (!aVarBuilder.m) {
                strAccess$300 = HCaptchaConfig.access$300();
            }
            String str2 = strAccess$300;
            HCaptchaSize hCaptchaSizeAccess$400 = aVarBuilder.p;
            if (!aVarBuilder.o) {
                hCaptchaSizeAccess$400 = HCaptchaConfig.access$400();
            }
            HCaptchaSize hCaptchaSize = hCaptchaSizeAccess$400;
            HCaptchaTheme hCaptchaThemeAccess$500 = aVarBuilder.r;
            if (!aVarBuilder.q) {
                hCaptchaThemeAccess$500 = HCaptchaConfig.access$500();
            }
            HCaptchaConfig hCaptchaConfig = new HCaptchaConfig(aVarBuilder.a, bool, bool2, aVarBuilder.f, str, aVarBuilder.i, aVarBuilder.j, aVarBuilder.k, aVarBuilder.l, str2, hCaptchaSize, hCaptchaThemeAccess$500);
            b.j.a.a aVar = new b.j.a.a(activity2);
            HCaptcha$1 hCaptcha$1 = new HCaptcha$1(aVar);
            String str3 = b.j.a.c.j;
            Bundle bundle = new Bundle();
            bundle.putSerializable("hCaptchaConfig", hCaptchaConfig);
            bundle.putParcelable("hCaptchaDialogListener", hCaptcha$1);
            b.j.a.c cVar = new b.j.a.c();
            cVar.setArguments(bundle);
            cVar.show(aVar.e, b.j.a.c.j);
            aVar.c.add(new C02091(emitter));
            aVar.a();
            aVar.d.add(new AnonymousClass2(emitter, captchaHelper3));
            aVar.a();
        }
    }

    /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$ensurePlayServicesAvailable$2, reason: invalid class name */
    /* JADX INFO: compiled from: CaptchaHelper.kt */
    public final class AnonymousClass2 implements d {
        public final /* synthetic */ Function1 $errorHandler;

        public AnonymousClass2(Function1 function1) {
            this.$errorHandler = function1;
        }

        @Override // b.i.a.f.n.d
        public final void onFailure(Exception exc) {
            this.$errorHandler.invoke(new Failure(R.string.captcha_failed_play_services, CaptchaHelper.FAILED_MISSING_DEPS));
        }
    }

    /* JADX INFO: renamed from: com.discord.utilities.captcha.CaptchaHelper$showCaptcha$2, reason: invalid class name */
    /* JADX INFO: compiled from: CaptchaHelper.kt */
    public final class AnonymousClass2 implements d {
        public final /* synthetic */ Function1 $errorHandler;

        public AnonymousClass2(Function1 function1) {
            this.$errorHandler = function1;
        }

        @Override // b.i.a.f.n.d
        public final void onFailure(Exception exc) {
            this.$errorHandler.invoke(new Failure(R.string.captcha_failed, CaptchaHelper.FAILED_CAPTCHA_EXPIRED));
        }
    }

    /* JADX INFO: compiled from: CaptchaHelper.kt */
    public final /* data */ class CaptchaPayload {
        private final String captchaKey;
        private final String captchaRqtoken;

        public CaptchaPayload(String str, String str2) {
            Intrinsics3.checkNotNullParameter(str, "captchaKey");
            this.captchaKey = str;
            this.captchaRqtoken = str2;
        }

        public static /* synthetic */ CaptchaPayload copy$default(CaptchaPayload captchaPayload, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = captchaPayload.captchaKey;
            }
            if ((i & 2) != 0) {
                str2 = captchaPayload.captchaRqtoken;
            }
            return captchaPayload.copy(str, str2);
        }

        public final CaptchaPayload copy(String captchaKey, String captchaRqtoken) {
            Intrinsics3.checkNotNullParameter(captchaKey, "captchaKey");
            return new CaptchaPayload(captchaKey, captchaRqtoken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CaptchaPayload)) {
                return false;
            }
            CaptchaPayload captchaPayload = (CaptchaPayload) other;
            return Intrinsics3.areEqual(this.captchaKey, captchaPayload.captchaKey) && Intrinsics3.areEqual(this.captchaRqtoken, captchaPayload.captchaRqtoken);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCaptchaKey() {
            return this.captchaKey;
        }

        public final String getCaptchaKey() {
            return this.captchaKey;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCaptchaRqtoken() {
            return this.captchaRqtoken;
        }

        public final String getCaptchaRqtoken() {
            return this.captchaRqtoken;
        }

        public int hashCode() {
            String str = this.captchaKey;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.captchaRqtoken;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbU = outline.U("CaptchaPayload(captchaKey=");
            sbU.append(this.captchaKey);
            sbU.append(", captchaRqtoken=");
            return outline.J(sbU, this.captchaRqtoken, ")");
        }

        public /* synthetic */ CaptchaPayload(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: CaptchaHelper.kt */
    public abstract class CaptchaRequest {

        /* JADX INFO: compiled from: CaptchaHelper.kt */
        public final /* data */ class HCaptcha extends CaptchaRequest {
            private final Activity activity;
            private final String rqdata;
            private final String siteKey;

            public /* synthetic */ HCaptcha(String str, Activity activity, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, activity, (i & 4) != 0 ? null : str2);
            }

            public static /* synthetic */ HCaptcha copy$default(HCaptcha hCaptcha, String str, Activity activity, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = hCaptcha.siteKey;
                }
                if ((i & 2) != 0) {
                    activity = hCaptcha.activity;
                }
                if ((i & 4) != 0) {
                    str2 = hCaptcha.rqdata;
                }
                return hCaptcha.copy(str, activity, str2);
            }

            public final HCaptcha copy(String siteKey, Activity activity, String rqdata) {
                Intrinsics3.checkNotNullParameter(siteKey, "siteKey");
                Intrinsics3.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                return new HCaptcha(siteKey, activity, rqdata);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HCaptcha)) {
                    return false;
                }
                HCaptcha hCaptcha = (HCaptcha) other;
                return Intrinsics3.areEqual(this.siteKey, hCaptcha.siteKey) && Intrinsics3.areEqual(this.activity, hCaptcha.activity) && Intrinsics3.areEqual(this.rqdata, hCaptcha.rqdata);
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Activity getActivity() {
                return this.activity;
            }

            public final Activity getActivity() {
                return this.activity;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getRqdata() {
                return this.rqdata;
            }

            public final String getRqdata() {
                return this.rqdata;
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getSiteKey() {
                return this.siteKey;
            }

            public final String getSiteKey() {
                return this.siteKey;
            }

            public int hashCode() {
                String str = this.siteKey;
                int iHashCode = (str != null ? str.hashCode() : 0) * 31;
                Activity activity = this.activity;
                int iHashCode2 = (iHashCode + (activity != null ? activity.hashCode() : 0)) * 31;
                String str2 = this.rqdata;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sbU = outline.U("HCaptcha(siteKey=");
                sbU.append(this.siteKey);
                sbU.append(", activity=");
                sbU.append(this.activity);
                sbU.append(", rqdata=");
                return outline.J(sbU, this.rqdata, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HCaptcha(String str, Activity activity, String str2) {
                super(null);
                Intrinsics3.checkNotNullParameter(str, "siteKey");
                Intrinsics3.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                this.siteKey = str;
                this.activity = activity;
                this.rqdata = str2;
            }
        }

        /* JADX INFO: compiled from: CaptchaHelper.kt */
        public final /* data */ class ReCaptcha extends CaptchaRequest {
            private final Activity activity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReCaptcha(Activity activity) {
                super(null);
                Intrinsics3.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                this.activity = activity;
            }

            public static /* synthetic */ ReCaptcha copy$default(ReCaptcha reCaptcha, Activity activity, int i, Object obj) {
                if ((i & 1) != 0) {
                    activity = reCaptcha.activity;
                }
                return reCaptcha.copy(activity);
            }

            public final ReCaptcha copy(Activity activity) {
                Intrinsics3.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                return new ReCaptcha(activity);
            }

            public boolean equals(Object other) {
                if (this != other) {
                    return (other instanceof ReCaptcha) && Intrinsics3.areEqual(this.activity, ((ReCaptcha) other).activity);
                }
                return true;
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Activity getActivity() {
                return this.activity;
            }

            public final Activity getActivity() {
                return this.activity;
            }

            public int hashCode() {
                Activity activity = this.activity;
                if (activity != null) {
                    return activity.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sbU = outline.U("ReCaptcha(activity=");
                sbU.append(this.activity);
                sbU.append(")");
                return sbU.toString();
            }
        }

        private CaptchaRequest() {
        }

        public /* synthetic */ CaptchaRequest(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: CaptchaHelper.kt */
    public final /* data */ class Failure extends Throwable {
        private final int errorStringId;
        private final String reasonCode;

        public Failure(int i, String str) {
            Intrinsics3.checkNotNullParameter(str, "reasonCode");
            this.errorStringId = i;
            this.reasonCode = str;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failure.errorStringId;
            }
            if ((i2 & 2) != 0) {
                str = failure.reasonCode;
            }
            return failure.copy(i, str);
        }

        public final Failure copy(int errorStringId, String reasonCode) {
            Intrinsics3.checkNotNullParameter(reasonCode, "reasonCode");
            return new Failure(errorStringId, reasonCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.errorStringId == failure.errorStringId && Intrinsics3.areEqual(this.reasonCode, failure.reasonCode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getErrorStringId() {
            return this.errorStringId;
        }

        public final int getErrorStringId() {
            return this.errorStringId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReasonCode() {
            return this.reasonCode;
        }

        public final String getReasonCode() {
            return this.reasonCode;
        }

        public int hashCode() {
            int i = this.errorStringId * 31;
            String str = this.reasonCode;
            return i + (str != null ? str.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        public String toString() {
            StringBuilder sbU = outline.U("Failure(errorStringId=");
            sbU.append(this.errorStringId);
            sbU.append(", reasonCode=");
            return outline.J(sbU, this.reasonCode, ")");
        }
    }

    private CaptchaHelper() {
    }

    public static final /* synthetic */ void access$ensurePlayServicesAvailable(CaptchaHelper captchaHelper, GoogleApiAvailability googleApiAvailability, Activity activity, Function0 function0, Function1 function1) throws PackageManager.NameNotFoundException {
        captchaHelper.ensurePlayServicesAvailable(googleApiAvailability, activity, function0, function1);
    }

    public static final /* synthetic */ void access$showCaptcha(CaptchaHelper captchaHelper, SafetyNetClient safetyNetClient, Function1 function1, Function1 function2) {
        captchaHelper.showCaptcha(safetyNetClient, function1, function2);
    }

    private final void ensurePlayServicesAvailable(GoogleApiAvailability googleApiAvailability, Activity activity, Function0<Unit> function0, Function1<? super Failure, Unit> function1) throws PackageManager.NameNotFoundException {
        int iC = googleApiAvailability.c(activity);
        if (iC == 0 || !googleApiAvailability.d(iC)) {
            if (iC == 0) {
                function0.invoke();
                return;
            } else {
                function1.invoke(new Failure(R.string.captcha_failed_unsupported, FAILED_DEVICE_UNSUPPORTED));
                return;
            }
        }
        Task<Void> taskE = googleApiAvailability.e(activity);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function0);
        c0 c0Var = (c0) taskE;
        Objects.requireNonNull(c0Var);
        Executor executor = g.a;
        c0Var.g(executor, anonymousClass1);
        c0Var.e(executor, new AnonymousClass2(function1));
        Intrinsics3.checkNotNullExpressionValue(c0Var, "makeGooglePlayServicesAv…ISSING_DEPS))\n          }");
    }

    public final String getCaptchaRqtoken() {
        return captchaRqtoken;
    }

    public final String getCaptchaToken() {
        return captchaToken;
    }

    public final void setCaptchaRqtoken(String str) {
        captchaRqtoken = str;
    }

    public final void setCaptchaToken(String str) {
        captchaToken = str;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void showCaptcha(SafetyNetClient safetyNetClient, Function1<? super String, Unit> function1, Function1<? super Failure, Unit> function2) {
        Objects.requireNonNull(safetyNetClient);
        SafetyNetApi safetyNetApi = b.i.a.f.k.a.d;
        b.i.a.f.e.h.c cVar = safetyNetClient.g;
        Objects.requireNonNull((i) safetyNetApi);
        if (TextUtils.isEmpty(RECAPTCHA_SITE_KEY)) {
            throw new IllegalArgumentException("Null or empty site key in verifyWithRecaptcha");
        }
        b.i.a.f.e.h.j.d dVarA = cVar.a(new j(cVar, RECAPTCHA_SITE_KEY));
        v vVar = new v(new SafetyNetApi.RecaptchaTokenResponse());
        k.b bVar = k.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        dVarA.c(new s(dVarA, taskCompletionSource, vVar, bVar));
        c0<TResult> c0Var = taskCompletionSource.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function1);
        Objects.requireNonNull(c0Var);
        Executor executor = g.a;
        c0Var.g(executor, anonymousClass1);
        c0Var.e(executor, new AnonymousClass2(function2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showCaptchaHelpDialog$default(CaptchaHelper captchaHelper, AppActivity appActivity, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        captchaHelper.showCaptchaHelpDialog(appActivity, function0);
    }

    public final void showCaptchaHelpDialog(AppActivity activity, Function0<Unit> onOpenBrowser) {
        FragmentManager supportFragmentManager;
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        WidgetNoticeDialog.Builder negativeButton$default = WidgetNoticeDialog.Builder.setNegativeButton$default(new WidgetNoticeDialog.Builder(activity).setTitle(R.string.captcha_problems).setMessage(R.string.captcha_problems_info).setPositiveButton(R.string.captcha_open_browser, new CaptchaHelper2(activity, onOpenBrowser)), R.string.cancel, (Function1) null, 2, (Object) null);
        Intrinsics3.checkNotNullExpressionValue(supportFragmentManager, "it");
        negativeButton$default.show(supportFragmentManager);
    }

    public final Observable<String> tryShowCaptcha(CaptchaRequest captchaRequest) {
        Intrinsics3.checkNotNullParameter(captchaRequest, "captchaRequest");
        Observable<String> observableO = Observable.o(new AnonymousClass1(captchaRequest), Emitter.BackpressureMode.BUFFER);
        Intrinsics3.checkNotNullExpressionValue(observableO, "Observable.create({ emit….BackpressureMode.BUFFER)");
        return observableO;
    }
}
