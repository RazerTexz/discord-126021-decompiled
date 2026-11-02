package b.i.c.m.d.o;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: b.i.c.m.d.o.a, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsReportPersistence.java */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CrashlyticsReportPersistence implements FilenameFilter {
    public final String a;

    public CrashlyticsReportPersistence(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        String str2 = this.a;
        Charset charset = CrashlyticsReportPersistence7.a;
        return str.startsWith(str2);
    }
}
