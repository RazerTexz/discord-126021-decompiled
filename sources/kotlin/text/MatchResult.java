package kotlin.text;

import d0.g0.f;
import d0.z.d.m;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: MatchResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface MatchResult {

    /* JADX INFO: compiled from: MatchResult.kt */
    public final class a {
        public static b getDestructured(MatchResult matchResult) {
            return new b(matchResult);
        }
    }

    /* JADX INFO: compiled from: MatchResult.kt */
    public final class b {
        public final MatchResult a;

        public b(MatchResult matchResult) {
            m.checkNotNullParameter(matchResult, "match");
            this.a = matchResult;
        }

        public final MatchResult getMatch() {
            return this.a;
        }
    }

    b getDestructured();

    List<String> getGroupValues();

    f getGroups();

    IntRange getRange();

    String getValue();

    MatchResult next();
}
