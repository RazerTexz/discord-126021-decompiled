package b.a.q.m0.c;

import co.discord.media_engine.Connection;
import co.discord.media_engine.Stats;
import com.discord.utilities.logging.Logger;

/* JADX INFO: compiled from: MediaEngineConnectionLegacy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Connection.GetStatsCallback {
    public final /* synthetic */ e.f a;

    public f(e.f fVar) {
        this.a = fVar;
    }

    @Override // co.discord.media_engine.Connection.GetStatsCallback
    public void onStats(Stats stats) {
        d0.z.d.m.checkNotNullParameter(stats, "stats");
        this.a.$onStats.invoke(stats);
    }

    @Override // co.discord.media_engine.Connection.GetStatsCallback
    public void onStatsError(Throwable th) {
        Logger.e$default(e.this.l, "MediaEngineConnectionLegacy", "error collecting stats", th, null, 8, null);
    }
}
