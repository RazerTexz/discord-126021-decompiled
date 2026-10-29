package androidx.view;

import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class ServiceLifecycleDispatcher {
    private ServiceLifecycleDispatcher$DispatchRunnable mLastDispatchRunnable;
    private final LifecycleRegistry mRegistry;
    private final Handler mHandler = new Handler();

    public ServiceLifecycleDispatcher(@NonNull LifecycleOwner lifecycleOwner) {
        this.mRegistry = new LifecycleRegistry(lifecycleOwner);
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.mRegistry;
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle$Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle$Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle$Event.ON_STOP);
        postDispatchRunnable(Lifecycle$Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle$Event.ON_START);
    }

    private void postDispatchRunnable(Lifecycle$Event lifecycle$Event) {
        ServiceLifecycleDispatcher$DispatchRunnable serviceLifecycleDispatcher$DispatchRunnable = this.mLastDispatchRunnable;
        if (serviceLifecycleDispatcher$DispatchRunnable != null) {
            serviceLifecycleDispatcher$DispatchRunnable.run();
        }
        ServiceLifecycleDispatcher$DispatchRunnable serviceLifecycleDispatcher$DispatchRunnable2 = new ServiceLifecycleDispatcher$DispatchRunnable(this.mRegistry, lifecycle$Event);
        this.mLastDispatchRunnable = serviceLifecycleDispatcher$DispatchRunnable2;
        this.mHandler.postAtFrontOfQueue(serviceLifecycleDispatcher$DispatchRunnable2);
    }
}
