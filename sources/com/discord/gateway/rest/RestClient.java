package com.discord.gateway.rest;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.discord.models.domain.ModelGateway;
import com.discord.restapi.RequiredHeadersInterceptor;
import com.discord.restapi.RestAPIBuilder;
import com.discord.restapi.utils.RetryWithDelay;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import d0.t.n;
import d0.z.d.c0;
import d0.z.d.m;
import j0.k.b;
import j0.p.a;
import java.util.List;
import java.util.Objects;
import okhttp3.Interceptor;
import rx.Observable;

/* JADX INFO: compiled from: RestClient.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RestClient {
    private static RestApi restApi;
    public static final RestClient INSTANCE = new RestClient();

    /* JADX INFO: renamed from: com.discord.gateway.rest.RestClient$getGateway$1, reason: invalid class name */
    /* JADX INFO: compiled from: RestClient.kt */
    public final class AnonymousClass1<T, R> implements b<ModelGateway, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // j0.k.b
        public /* bridge */ /* synthetic */ String call(ModelGateway modelGateway) {
            return call2(modelGateway);
        }

        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public final String call2(ModelGateway modelGateway) {
            m.checkNotNullExpressionValue(modelGateway, "it");
            return modelGateway.getUrl();
        }
    }

    private RestClient() {
    }

    public final Observable<String> getGateway() {
        RetryWithDelay retryWithDelay = RetryWithDelay.INSTANCE;
        RestApi restApi2 = restApi;
        if (restApi2 == null) {
            m.throwUninitializedPropertyAccessException("restApi");
        }
        Observable<ModelGateway> observableX = restApi2.getGateway().X(a.c());
        m.checkNotNullExpressionValue(observableX, "restApi\n          .getGa…scribeOn(Schedulers.io())");
        Observable<String> observableG = RetryWithDelay.restRetry$default(retryWithDelay, observableX, 0L, null, null, 7, null).G(AnonymousClass1.INSTANCE);
        m.checkNotNullExpressionValue(observableG, "restApi\n          .getGa…          .map { it.url }");
        return observableG;
    }

    public final void init(RestConfig restConfig, Context context) {
        m.checkNotNullParameter(restConfig, "restConfig");
        m.checkNotNullParameter(context, "context");
        String baseUrl = restConfig.getBaseUrl();
        RequiredHeadersInterceptor.HeadersProvider headersProvider = restConfig.getHeadersProvider();
        List<Interceptor> listComponent3 = restConfig.component3();
        RequiredHeadersInterceptor requiredHeadersInterceptor = new RequiredHeadersInterceptor(headersProvider);
        PersistentCookieJar persistentCookieJar = new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(context));
        c0 c0Var = new c0(2);
        c0Var.add(requiredHeadersInterceptor);
        Object[] array = listComponent3.toArray(new Interceptor[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        c0Var.addSpread(array);
        restApi = (RestApi) RestAPIBuilder.build$default(new RestAPIBuilder(baseUrl, persistentCookieJar), RestApi.class, false, 0L, n.listOf(c0Var.toArray(new Interceptor[c0Var.size()])), null, false, null, 118, null);
    }
}
