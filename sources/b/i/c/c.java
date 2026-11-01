package b.i.c;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import b.i.a.f.e.k.j;
import b.i.c.l.k;
import b.i.c.l.p;
import b.i.c.l.q;
import b.i.c.l.r;
import com.discord.models.domain.ModelAuditLogEntry;
import com.google.android.material.badge.BadgeDrawable;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: FirebaseApp.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    public final Context d;
    public final String e;
    public final i f;
    public final k g;
    public final r<b.i.c.v.a> j;
    public static final Object a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f1653b = new d(null);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public static final Map<String, c> c = new ArrayMap();
    public final AtomicBoolean i = new AtomicBoolean();
    public final List<b> k = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b.i.c.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FirebaseApp.java */
    @TargetApi(14)
    public class C0135c implements b.i.a.f.e.h.j.c.a {
        public static AtomicReference<C0135c> a = new AtomicReference<>();

        @Override // b.i.a.f.e.h.j.c.a
        public void a(boolean z2) {
            Object obj = c.a;
            synchronized (c.a) {
                for (c cVar : new ArrayList(c.c.values())) {
                    if (cVar.h.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator<b> it = cVar.k.iterator();
                        while (it.hasNext()) {
                            it.next().a(z2);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: FirebaseApp.java */
    public interface b {
        void a(boolean z2);
    }

    /* JADX INFO: compiled from: FirebaseApp.java */
    public class d implements Executor {
        public static final Handler j = new Handler(Looper.getMainLooper());

        public d(a aVar) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            j.post(runnable);
        }
    }

    /* JADX INFO: compiled from: FirebaseApp.java */
    @TargetApi(24)
    public class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f1654b;
        public static AtomicReference<e> a = new AtomicReference<>();

        public e(Context context) {
            this.f1654b = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object obj = c.a;
            synchronized (c.a) {
                Iterator<c> it = c.c.values().iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
            }
            this.f1654b.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2 A[SYNTHETIC] */
    public c(Context context, String str, i iVar) {
        Bundle bundle;
        List<String> listEmptyList;
        ArrayList arrayList;
        Class<?> cls;
        new CopyOnWriteArrayList();
        this.d = context;
        b.c.a.a0.d.w(str);
        this.e = str;
        Objects.requireNonNull(iVar, "null reference");
        this.f = iVar;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
                if (bundle == null) {
                    Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    listEmptyList = Collections.emptyList();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : bundle.keySet()) {
                        if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                            arrayList2.add(str2.substring(31));
                        }
                    }
                    listEmptyList = arrayList2;
                }
                arrayList = new ArrayList();
                for (String str3 : listEmptyList) {
                    try {
                        cls = Class.forName(str3);
                        if (b.i.c.l.g.class.isAssignableFrom(cls)) {
                            arrayList.add((b.i.c.l.g) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        } else {
                            Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str3, "com.google.firebase.components.ComponentRegistrar"));
                        }
                    } catch (ClassNotFoundException e2) {
                        Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str3), e2);
                    } catch (IllegalAccessException e3) {
                        Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str3), e3);
                    } catch (InstantiationException e4) {
                        Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str3), e4);
                    } catch (NoSuchMethodException e5) {
                        Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str3), e5);
                    } catch (InvocationTargetException e6) {
                        Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str3), e6);
                    }
                }
                arrayList.add(new FirebaseCommonRegistrar());
                this.g = new k(f1653b, arrayList, b.i.c.l.d.c(context, Context.class, new Class[0]), b.i.c.l.d.c(this, c.class, new Class[0]), b.i.c.l.d.c(iVar, i.class, new Class[0]));
                this.j = new r<>(new b.i.c.b(this, context));
            }
            Log.w("ComponentDiscovery", "Context has no PackageManager.");
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        bundle = null;
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList();
            while (r4.hasNext()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2))) {
                }
            }
            listEmptyList = arrayList3;
        }
        arrayList = new ArrayList();
        while (r13.hasNext()) {
            cls = Class.forName(str3);
            if (b.i.c.l.g.class.isAssignableFrom(cls)) {
                Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str3, "com.google.firebase.components.ComponentRegistrar"));
            } else {
                arrayList.add((b.i.c.l.g) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
        }
        arrayList.add(new FirebaseCommonRegistrar());
        this.g = new k(f1653b, arrayList, b.i.c.l.d.c(context, Context.class, new Class[0]), b.i.c.l.d.c(this, c.class, new Class[0]), b.i.c.l.d.c(iVar, i.class, new Class[0]));
        this.j = new r<>(new b.i.c.b(this, context));
    }

    public final void a() {
        b.c.a.a0.d.G(!this.i.get(), "FirebaseApp was deleted");
    }

    @NonNull
    public static c b() {
        c cVar;
        synchronized (a) {
            cVar = c.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + b.i.a.f.e.o.g.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.e.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        a();
        byte[] bytes2 = this.f.f1655b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        Queue<b.i.c.q.a<?>> queue;
        Set<Map.Entry<b.i.c.q.b<Object>, Executor>> setEmptySet;
        if (!UserManagerCompat.isUserUnlocked(this.d)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.e);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.d;
            if (e.a.get() == null) {
                e eVar = new e(context);
                if (e.a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.e);
        Log.i("FirebaseApp", sb2.toString());
        k kVar = this.g;
        boolean zH = h();
        for (Map.Entry<b.i.c.l.d<?>, r<?>> entry : kVar.f1665b.entrySet()) {
            b.i.c.l.d<?> key = entry.getKey();
            r<?> value = entry.getValue();
            int i = key.c;
            if (!(i == 1)) {
                if (!(i == 2) || !zH) {
                }
            }
            value.get();
        }
        q qVar = kVar.e;
        synchronized (qVar) {
            queue = qVar.f1669b;
            if (queue != null) {
                qVar.f1669b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (b.i.c.q.a<?> aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (qVar) {
                    Queue<b.i.c.q.a<?>> queue2 = qVar.f1669b;
                    if (queue2 != null) {
                        queue2.add(aVar);
                    } else {
                        synchronized (qVar) {
                            ConcurrentHashMap<b.i.c.q.b<Object>, Executor> concurrentHashMap = qVar.a.get(null);
                            setEmptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
                        }
                        for (Map.Entry<b.i.c.q.b<Object>, Executor> entry2 : setEmptySet) {
                            entry2.getValue().execute(new p(entry2, aVar));
                        }
                    }
                }
            }
        }
    }

    @Nullable
    public static c e(@NonNull Context context) {
        synchronized (a) {
            if (c.containsKey("[DEFAULT]")) {
                return b();
            }
            i iVarA = i.a(context);
            if (iVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return f(context, iVarA);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        String str = this.e;
        c cVar = (c) obj;
        cVar.a();
        return str.equals(cVar.e);
    }

    @NonNull
    public static c f(@NonNull Context context, @NonNull i iVar) {
        c cVar;
        AtomicReference<C0135c> atomicReference = C0135c.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (C0135c.a.get() == null) {
                C0135c c0135c = new C0135c();
                if (C0135c.a.compareAndSet(null, c0135c)) {
                    b.i.a.f.e.h.j.c.a(application);
                    b.i.a.f.e.h.j.c cVar2 = b.i.a.f.e.h.j.c.j;
                    Objects.requireNonNull(cVar2);
                    synchronized (cVar2) {
                        cVar2.m.add(c0135c);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map<String, c> map = c;
            b.c.a.a0.d.G(!map.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            b.c.a.a0.d.z(context, "Application context cannot be null.");
            cVar = new c(context, "[DEFAULT]", iVar);
            map.put("[DEFAULT]", cVar);
        }
        cVar.d();
        return cVar;
    }

    public boolean g() {
        boolean z2;
        a();
        b.i.c.v.a aVar = this.j.get();
        synchronized (aVar) {
            z2 = aVar.d;
        }
        return z2;
    }

    @VisibleForTesting
    public boolean h() {
        a();
        return "[DEFAULT]".equals(this.e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        j jVar = new j(this);
        jVar.a(ModelAuditLogEntry.CHANGE_KEY_NAME, this.e);
        jVar.a("options", this.f);
        return jVar.toString();
    }
}
