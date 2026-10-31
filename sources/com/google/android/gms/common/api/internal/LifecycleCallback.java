package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.FragmentActivity;
import b.c.a.a0.d;
import b.i.a.f.e.h.j.d1;
import b.i.a.f.e.h.j.f1;
import b.i.a.f.e.h.j.i;
import b.i.a.f.e.h.j.j;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public class LifecycleCallback {

    @RecentlyNonNull
    public final j j;

    public LifecycleCallback(@RecentlyNonNull j jVar) {
        this.j = jVar;
    }

    @MainThread
    public void a() {
    }

    @RecentlyNonNull
    public Activity b() {
        return this.j.e();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @RecentlyNonNull
    public static j c(@RecentlyNonNull Activity activity) {
        d1 d1Var;
        d1 d1Var2;
        boolean zIsRemoving;
        j jVar;
        f1 f1Var;
        f1 f1Var2;
        boolean zIsRemoving2;
        d.z(activity, "Activity must not be null");
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            WeakHashMap<FragmentActivity, WeakReference<f1>> weakHashMap = f1.j;
            WeakReference<f1> weakReference = weakHashMap.get(fragmentActivity);
            if (weakReference != null) {
                f1 f1Var3 = weakReference.get();
                jVar = f1Var3;
                if (f1Var3 == null) {
                    try {
                        f1Var = (f1) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
                        if (f1Var != null) {
                            zIsRemoving2 = f1Var.isRemoving();
                            f1Var2 = f1Var;
                            if (zIsRemoving2) {
                                f1 f1Var4 = new f1();
                                fragmentActivity.getSupportFragmentManager().beginTransaction().add(f1Var4, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                                f1Var2 = f1Var4;
                            }
                        } else {
                            f1 f1Var5 = new f1();
                            fragmentActivity.getSupportFragmentManager().beginTransaction().add(f1Var5, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                            f1Var2 = f1Var5;
                        }
                        weakHashMap.put(fragmentActivity, new WeakReference<>(f1Var2));
                        jVar = f1Var2;
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                    }
                }
            } else {
                f1Var = (f1) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
                if (f1Var != null) {
                    zIsRemoving2 = f1Var.isRemoving();
                    f1Var2 = f1Var;
                    if (zIsRemoving2) {
                        f1 f1Var6 = new f1();
                        fragmentActivity.getSupportFragmentManager().beginTransaction().add(f1Var6, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                        f1Var2 = f1Var6;
                    }
                } else {
                    f1 f1Var7 = new f1();
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(f1Var7, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                    f1Var2 = f1Var7;
                }
                weakHashMap.put(fragmentActivity, new WeakReference<>(f1Var2));
                jVar = f1Var2;
            }
        } else {
            WeakHashMap<Activity, WeakReference<d1>> weakHashMap2 = d1.j;
            WeakReference<d1> weakReference2 = weakHashMap2.get(activity);
            if (weakReference2 != null) {
                d1 d1Var3 = weakReference2.get();
                jVar = d1Var3;
                if (d1Var3 == null) {
                    try {
                        d1Var = (d1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                        if (d1Var != null) {
                            zIsRemoving = d1Var.isRemoving();
                            d1Var2 = d1Var;
                            if (zIsRemoving) {
                                d1 d1Var4 = new d1();
                                activity.getFragmentManager().beginTransaction().add(d1Var4, "LifecycleFragmentImpl").commitAllowingStateLoss();
                                d1Var2 = d1Var4;
                            }
                        } else {
                            d1 d1Var5 = new d1();
                            activity.getFragmentManager().beginTransaction().add(d1Var5, "LifecycleFragmentImpl").commitAllowingStateLoss();
                            d1Var2 = d1Var5;
                        }
                        weakHashMap2.put(activity, new WeakReference<>(d1Var2));
                        jVar = d1Var2;
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                    }
                }
            } else {
                d1Var = (d1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (d1Var != null) {
                    zIsRemoving = d1Var.isRemoving();
                    d1Var2 = d1Var;
                    if (zIsRemoving) {
                        d1 d1Var6 = new d1();
                        activity.getFragmentManager().beginTransaction().add(d1Var6, "LifecycleFragmentImpl").commitAllowingStateLoss();
                        d1Var2 = d1Var6;
                    }
                } else {
                    d1 d1Var7 = new d1();
                    activity.getFragmentManager().beginTransaction().add(d1Var7, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    d1Var2 = d1Var7;
                }
                weakHashMap2.put(activity, new WeakReference<>(d1Var2));
                jVar = d1Var2;
            }
        }
        return jVar;
    }

    @MainThread
    public void d(int i, int i2, @RecentlyNonNull Intent intent) {
    }

    @MainThread
    public void e(@Nullable Bundle bundle) {
    }

    @MainThread
    public void f() {
    }

    @MainThread
    public void g() {
    }

    @Keep
    private static j getChimeraLifecycleFragmentImpl(i iVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @MainThread
    public void h(@RecentlyNonNull Bundle bundle) {
    }

    @MainThread
    public void i() {
    }

    @MainThread
    public void j() {
    }
}
