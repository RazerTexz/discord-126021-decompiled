package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import b.i.a.c.v2.b;
import b.i.a.c.w2.s;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface DrmSession {

    public class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th, int i) {
            super(th);
            this.errorCode = i;
        }
    }

    void a(@Nullable s.a aVar);

    void b(@Nullable s.a aVar);

    UUID c();

    boolean d();

    boolean e(String str);

    @Nullable
    DrmSessionException f();

    @Nullable
    b g();

    int getState();
}
