package com.discord.stores;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.discord.models.domain.ModelPayload;
import com.discord.models.phone.PhoneCountryCode;
import com.discord.utilities.persister.Persister;
import com.google.gson.Gson;
import d0.t.k;
import d0.y.b;
import d0.z.d.m;
import d0.z.d.o;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: StorePhone.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StorePhone extends StoreV2 {
    private List<PhoneCountryCode> countryCodes;
    private PhoneCountryCode defaultCountryCode;
    private final Dispatcher dispatcher;
    private PhoneCountryCode selectedCountryCode;
    private final Persister<PhoneCountryCode> selectedCountryCodeCache;

    /* JADX INFO: renamed from: com.discord.stores.StorePhone$updateDefaultCountryCode$1, reason: invalid class name */
    /* JADX INFO: compiled from: StorePhone.kt */
    public final class AnonymousClass1 extends o implements Function0<Unit> {
        public final /* synthetic */ String $alpha2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$alpha2 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Object next;
            Iterator<T> it = StorePhone.this.getCountryCodes().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!m.areEqual(((PhoneCountryCode) next).getAlpha2(), this.$alpha2));
            PhoneCountryCode phoneCountryCode = (PhoneCountryCode) next;
            if (phoneCountryCode != null) {
                StorePhone.access$setDefaultCountryCode$p(StorePhone.this, phoneCountryCode);
                StorePhone.this.markChanged();
            }
        }
    }

    /* JADX INFO: renamed from: com.discord.stores.StorePhone$updateSelectedCountryCode$1, reason: invalid class name */
    /* JADX INFO: compiled from: StorePhone.kt */
    public final class AnonymousClass1 extends o implements Function0<Unit> {
        public final /* synthetic */ PhoneCountryCode $newSelectedCountryCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PhoneCountryCode phoneCountryCode) {
            super(0);
            this.$newSelectedCountryCode = phoneCountryCode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StorePhone.access$setSelectedCountryCode$p(StorePhone.this, this.$newSelectedCountryCode);
            StorePhone.this.markChanged();
        }
    }

    public StorePhone(Dispatcher dispatcher) {
        m.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        PhoneCountryCode.Companion companion = PhoneCountryCode.INSTANCE;
        this.defaultCountryCode = companion.getDEFAULT_COUNTRY_CODE();
        this.selectedCountryCode = companion.getMISSING_COUNTRY_CODE();
        this.selectedCountryCodeCache = new Persister<>("CACHE_KEY_PHONE_COUNTRY_CODE_V2", this.selectedCountryCode);
    }

    public static final /* synthetic */ List access$getCountryCodes$p(StorePhone storePhone) {
        List<PhoneCountryCode> list = storePhone.countryCodes;
        if (list == null) {
            m.throwUninitializedPropertyAccessException("countryCodes");
        }
        return list;
    }

    public static final /* synthetic */ PhoneCountryCode access$getDefaultCountryCode$p(StorePhone storePhone) {
        return storePhone.defaultCountryCode;
    }

    public static final /* synthetic */ PhoneCountryCode access$getSelectedCountryCode$p(StorePhone storePhone) {
        return storePhone.selectedCountryCode;
    }

    public static final /* synthetic */ void access$setCountryCodes$p(StorePhone storePhone, List list) {
        storePhone.countryCodes = list;
    }

    public static final /* synthetic */ void access$setDefaultCountryCode$p(StorePhone storePhone, PhoneCountryCode phoneCountryCode) {
        storePhone.defaultCountryCode = phoneCountryCode;
    }

    public static final /* synthetic */ void access$setSelectedCountryCode$p(StorePhone storePhone, PhoneCountryCode phoneCountryCode) {
        storePhone.selectedCountryCode = phoneCountryCode;
    }

    public final PhoneCountryCode getCountryCode() {
        return m.areEqual(this.selectedCountryCode, PhoneCountryCode.INSTANCE.getMISSING_COUNTRY_CODE()) ? this.defaultCountryCode : this.selectedCountryCode;
    }

    public final List<PhoneCountryCode> getCountryCodes() {
        List<PhoneCountryCode> list = this.countryCodes;
        if (list == null) {
            m.throwUninitializedPropertyAccessException("countryCodes");
        }
        return list;
    }

    @StoreThread
    public final void handleConnectionOpen(ModelPayload payload) {
        m.checkNotNullParameter(payload, "payload");
        String countryCode = payload.getCountryCode();
        if (countryCode != null) {
            updateDefaultCountryCode(countryCode);
        }
    }

    @Override // com.discord.stores.Store
    public void init(Context context) {
        m.checkNotNullParameter(context, "context");
        super.init(context);
        this.countryCodes = loadCountryCodesFromDisk(context);
        this.selectedCountryCode = this.selectedCountryCodeCache.get();
        markChanged();
    }

    private final List<PhoneCountryCode> loadCountryCodesFromDisk(Context context) throws IllegalAccessException, IOException, InvocationTargetException {
        InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open("data/countries.json"), Constants.ENCODING);
        try {
            Object objE = new Gson().e(inputStreamReader, PhoneCountryCode[].class);
            m.checkNotNullExpressionValue(objE, "Gson().fromJson(it, Arra…CountryCode>::class.java)");
            List<PhoneCountryCode> list = k.toList((Object[]) objE);
            b.closeFinally(inputStreamReader, null);
            return list;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.closeFinally(inputStreamReader, th);
                throw th2;
            }
        }
    }

    @Override // com.discord.stores.StoreV2
    @StoreThread
    public void snapshotData() {
        super.snapshotData();
        Persister.set$default(this.selectedCountryCodeCache, this.selectedCountryCode, false, 2, null);
    }

    public final void updateDefaultCountryCode(String alpha2) {
        m.checkNotNullParameter(alpha2, "alpha2");
        this.dispatcher.schedule(new AnonymousClass1(alpha2));
    }

    public final void updateSelectedCountryCode(PhoneCountryCode newSelectedCountryCode) {
        m.checkNotNullParameter(newSelectedCountryCode, "newSelectedCountryCode");
        this.dispatcher.schedule(new AnonymousClass1(newSelectedCountryCode));
    }
}
