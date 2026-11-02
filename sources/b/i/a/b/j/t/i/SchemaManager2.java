package b.i.a.b.j.t.i;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* JADX INFO: renamed from: b.i.a.b.j.t.i.w, reason: use source file name */
/* JADX INFO: compiled from: SchemaManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SchemaManager2 implements SchemaManager5.a {
    public static final SchemaManager2 a = new SchemaManager2();

    @Override // b.i.a.b.j.t.i.SchemaManager5.a
    public void a(SQLiteDatabase sQLiteDatabase) {
        List<SchemaManager5.a> list = SchemaManager5.j;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
