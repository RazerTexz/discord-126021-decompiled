package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p007b.p085c.p086a.p087a0.C1460d;
import p007b.p225i.p226a.p288f.p299e.p300h.p301j.C3292f1;
import p007b.p225i.p226a.p288f.p299e.p300h.p301j.C3297i;
import p007b.p225i.p226a.p288f.p299e.p300h.p301j.FragmentC3286d1;
import p007b.p225i.p226a.p288f.p299e.p300h.p301j.InterfaceC3299j;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: j */
    @RecentlyNonNull
    public final InterfaceC3299j f20511j;

    public LifecycleCallback(@RecentlyNonNull InterfaceC3299j interfaceC3299j) {
        this.f20511j = interfaceC3299j;
    }

    @Keep
    private static InterfaceC3299j getChimeraLifecycleFragmentImpl(C3297i c3297i) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @RecentlyNonNull
    /* JADX INFO: renamed from: c */
    public static InterfaceC3299j m9038c(@RecentlyNonNull Activity activity) {
        FragmentC3286d1 fragmentC3286d1;
        FragmentC3286d1 fragmentC3286d2;
        boolean zIsRemoving;
        InterfaceC3299j interfaceC3299j;
        C3292f1 c3292f1;
        C3292f1 c3292f2;
        boolean zIsRemoving2;
        C1460d.m595z(activity, "Activity must not be null");
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            WeakHashMap<FragmentActivity, WeakReference<C3292f1>> weakHashMap = C3292f1.f9372j;
            WeakReference<C3292f1> weakReference = weakHashMap.get(fragmentActivity);
            if (weakReference != null) {
                C3292f1 c3292f3 = weakReference.get();
                interfaceC3299j = c3292f3;
                if (c3292f3 == null) {
                    try {
                        c3292f1 = (C3292f1) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
                        if (c3292f1 != null) {
                            zIsRemoving2 = c3292f1.isRemoving();
                            c3292f2 = c3292f1;
                            if (zIsRemoving2) {
                                C3292f1 c3292f4 = new C3292f1();
                                fragmentActivity.getSupportFragmentManager().beginTransaction().add(c3292f4, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                                c3292f2 = c3292f4;
                            }
                        } else {
                            C3292f1 c3292f5 = new C3292f1();
                            fragmentActivity.getSupportFragmentManager().beginTransaction().add(c3292f5, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                            c3292f2 = c3292f5;
                        }
                        weakHashMap.put(fragmentActivity, new WeakReference<>(c3292f2));
                        interfaceC3299j = c3292f2;
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                    }
                }
            } else {
                c3292f1 = (C3292f1) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
                if (c3292f1 != null) {
                    zIsRemoving2 = c3292f1.isRemoving();
                    c3292f2 = c3292f1;
                    if (zIsRemoving2) {
                        C3292f1 c3292f6 = new C3292f1();
                        fragmentActivity.getSupportFragmentManager().beginTransaction().add(c3292f6, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                        c3292f2 = c3292f6;
                    }
                } else {
                    C3292f1 c3292f7 = new C3292f1();
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(c3292f7, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                    c3292f2 = c3292f7;
                }
                weakHashMap.put(fragmentActivity, new WeakReference<>(c3292f2));
                interfaceC3299j = c3292f2;
            }
        } else {
            WeakHashMap<Activity, WeakReference<FragmentC3286d1>> weakHashMap2 = FragmentC3286d1.f9363j;
            WeakReference<FragmentC3286d1> weakReference2 = weakHashMap2.get(activity);
            if (weakReference2 != null) {
                FragmentC3286d1 fragmentC3286d3 = weakReference2.get();
                interfaceC3299j = fragmentC3286d3;
                if (fragmentC3286d3 == null) {
                    try {
                        fragmentC3286d1 = (FragmentC3286d1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                        if (fragmentC3286d1 != null) {
                            zIsRemoving = fragmentC3286d1.isRemoving();
                            fragmentC3286d2 = fragmentC3286d1;
                            if (zIsRemoving) {
                                FragmentC3286d1 fragmentC3286d4 = new FragmentC3286d1();
                                activity.getFragmentManager().beginTransaction().add(fragmentC3286d4, "LifecycleFragmentImpl").commitAllowingStateLoss();
                                fragmentC3286d2 = fragmentC3286d4;
                            }
                        } else {
                            FragmentC3286d1 fragmentC3286d5 = new FragmentC3286d1();
                            activity.getFragmentManager().beginTransaction().add(fragmentC3286d5, "LifecycleFragmentImpl").commitAllowingStateLoss();
                            fragmentC3286d2 = fragmentC3286d5;
                        }
                        weakHashMap2.put(activity, new WeakReference<>(fragmentC3286d2));
                        interfaceC3299j = fragmentC3286d2;
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                    }
                }
            } else {
                fragmentC3286d1 = (FragmentC3286d1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (fragmentC3286d1 != null) {
                    zIsRemoving = fragmentC3286d1.isRemoving();
                    fragmentC3286d2 = fragmentC3286d1;
                    if (zIsRemoving) {
                        FragmentC3286d1 fragmentC3286d6 = new FragmentC3286d1();
                        activity.getFragmentManager().beginTransaction().add(fragmentC3286d6, "LifecycleFragmentImpl").commitAllowingStateLoss();
                        fragmentC3286d2 = fragmentC3286d6;
                    }
                } else {
                    FragmentC3286d1 fragmentC3286d7 = new FragmentC3286d1();
                    activity.getFragmentManager().beginTransaction().add(fragmentC3286d7, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    fragmentC3286d2 = fragmentC3286d7;
                }
                weakHashMap2.put(activity, new WeakReference<>(fragmentC3286d2));
                interfaceC3299j = fragmentC3286d2;
            }
        }
        return interfaceC3299j;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public void m9039a() {
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: b */
    public Activity m9040b() {
        return this.f20511j.mo4071e();
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public void mo4058g() {
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public void mo4059i() {
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public void mo4060j() {
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public void mo4063f() {
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void mo4115d(int i, int i2, @RecentlyNonNull Intent intent) {
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public void mo4116e(@Nullable Bundle bundle) {
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public void mo4117h(@RecentlyNonNull Bundle bundle) {
    }
}
