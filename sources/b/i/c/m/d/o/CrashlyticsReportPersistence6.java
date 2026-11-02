package b.i.c.m.d.o;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: b.i.c.m.d.o.f, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsReportPersistence.java */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CrashlyticsReportPersistence6 implements FilenameFilter {
    public static final CrashlyticsReportPersistence6 a = new CrashlyticsReportPersistence6();

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Charset charset = CrashlyticsReportPersistence7.a;
        return str.startsWith("event");
    }
}
