package b.a.m.a;

import com.discord.models.domain.Model;
import com.discord.models.domain.ModelSession;

/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Model.JsonReader.ItemFactory {
    public final /* synthetic */ Model.JsonReader a;

    public /* synthetic */ m(Model.JsonReader jsonReader) {
        this.a = jsonReader;
    }

    @Override // com.discord.models.domain.Model.JsonReader.ItemFactory
    public final Object get() {
        return (ModelSession) this.a.parse(new ModelSession());
    }
}
