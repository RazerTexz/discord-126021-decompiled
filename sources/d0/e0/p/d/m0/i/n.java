package d0.e0.p.d.m0.i;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;

/* JADX INFO: compiled from: MessageLite.java */
/* JADX INFO: loaded from: classes3.dex */
public interface n extends o {

    /* JADX INFO: compiled from: MessageLite.java */
    public interface a extends Cloneable, o {
        n build();

        a mergeFrom(d dVar, e eVar) throws IOException;
    }

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
