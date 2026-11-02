package d0.e0.p.d.m0.k;

import d0.e0.p.d.m0.c.CallableDescriptor;
import d0.e0.p.d.m0.c.CallableMemberDescriptor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d0.e0.p.d.m0.k.n, reason: use source file name */
/* JADX INFO: compiled from: OverridingUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class OverridingUtil4 implements Function1<CallableMemberDescriptor, CallableDescriptor> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CallableDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return invoke2(callableMemberDescriptor);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public CallableDescriptor invoke2(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor;
    }
}
