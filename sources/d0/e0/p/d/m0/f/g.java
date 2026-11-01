package d0.e0.p.d.m0.f;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: compiled from: ProtoBuf.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends d0.e0.p.d.m0.i.g.d<g> implements d0.e0.p.d.m0.i.o {
    private int bitField0_;
    public static final g j;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final d0.e0.p.d.m0.i.c unknownFields;
    public static d0.e0.p.d.m0.i.p<g> k = new a();

    /* JADX INFO: compiled from: ProtoBuf.java */
    public final class a extends d0.e0.p.d.m0.i.b<g> {
        @Override // d0.e0.p.d.m0.i.p
        public /* bridge */ /* synthetic */ Object parsePartialFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws InvalidProtocolBufferException {
            return parsePartialFrom(dVar, eVar);
        }

        @Override // d0.e0.p.d.m0.i.p
        public g parsePartialFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws InvalidProtocolBufferException {
            return new g(dVar, eVar, null);
        }
    }

    /* JADX INFO: compiled from: ProtoBuf.java */
    public final class b extends d0.e0.p.d.m0.i.g.c<g, b> implements d0.e0.p.d.m0.i.o {
        public int m;
        public int n;

        @Override // d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n build() {
            return build();
        }

        public g buildPartial() {
            g gVar = new g(this, null);
            int i = (this.m & 1) != 1 ? 0 : 1;
            g.h(gVar, this.n);
            g.i(gVar, i);
            return gVar;
        }

        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.a.AbstractC0556a mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws IOException {
            return mergeFrom(dVar, eVar);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo88clone() throws CloneNotSupportedException {
            return clone();
        }

        public b setName(int i) {
            this.m |= 1;
            this.n = i;
            return this;
        }

        @Override // d0.e0.p.d.m0.i.n.a
        public g build() {
            g gVarBuildPartial = buildPartial();
            if (gVarBuildPartial.isInitialized()) {
                return gVarBuildPartial;
            }
            throw new UninitializedMessageException(gVarBuildPartial);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.g.b clone() {
            return clone();
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.g.b mergeFrom(d0.e0.p.d.m0.i.g gVar) {
            return mergeFrom((g) gVar);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public b clone() {
            return new b().mergeFrom(buildPartial());
        }

        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n.a mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws IOException {
            return mergeFrom(dVar, eVar);
        }

        public b mergeFrom(g gVar) {
            if (gVar == g.getDefaultInstance()) {
                return this;
            }
            if (gVar.hasName()) {
                setName(gVar.getName());
            }
            b(gVar);
            setUnknownFields(getUnknownFields().concat(g.j(gVar)));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public b mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws Throwable {
            g gVar = null;
            try {
                try {
                    g partialFrom = g.k.parsePartialFrom(dVar, eVar);
                    if (partialFrom != null) {
                        mergeFrom(partialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    g gVar2 = (g) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        gVar = gVar2;
                        if (gVar != null) {
                            mergeFrom(gVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (gVar != null) {
                    mergeFrom(gVar);
                }
                throw th;
            }
        }
    }

    static {
        g gVar = new g();
        j = gVar;
        gVar.name_ = 0;
    }

    public g(d0.e0.p.d.m0.i.g.c cVar, d0.e0.p.d.m0.f.a aVar) {
        super(cVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.getUnknownFields();
    }

    public static g getDefaultInstance() {
        return j;
    }

    @Override // d0.e0.p.d.m0.i.o
    public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public int getName() {
        return this.name_;
    }

    @Override // d0.e0.p.d.m0.i.n
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int size = this.unknownFields.size() + c() + ((this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeInt32Size(1, this.name_) : 0);
        this.memoizedSerializedSize = size;
        return size;
    }

    public static /* synthetic */ int h(g gVar, int i) {
        gVar.name_ = i;
        return i;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) == 1;
    }

    public static /* synthetic */ int i(g gVar, int i) {
        gVar.bitField0_ = i;
        return i;
    }

    @Override // d0.e0.p.d.m0.i.o
    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (b()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    public static /* synthetic */ d0.e0.p.d.m0.i.c j(g gVar) {
        return gVar.unknownFields;
    }

    public static b newBuilder(g gVar) {
        return newBuilder().mergeFrom(gVar);
    }

    @Override // d0.e0.p.d.m0.i.n
    public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n.a newBuilderForType() {
        return newBuilderForType();
    }

    @Override // d0.e0.p.d.m0.i.n
    public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n.a toBuilder() {
        return toBuilder();
    }

    @Override // d0.e0.p.d.m0.i.n
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        d0.e0.p.d.m0.i.g.d<MessageType>.a aVarE = e();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.writeInt32(1, this.name_);
        }
        aVarE.writeUntil(200, codedOutputStream);
        codedOutputStream.writeRawBytes(this.unknownFields);
    }

    @Override // d0.e0.p.d.m0.i.o
    public g getDefaultInstanceForType() {
        return j;
    }

    public static b newBuilder() {
        return new b();
    }

    @Override // d0.e0.p.d.m0.i.n
    public b newBuilderForType() {
        return newBuilder();
    }

    @Override // d0.e0.p.d.m0.i.n
    public b toBuilder() {
        return newBuilder(this);
    }

    public g() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.e0.p.d.m0.i.c.j;
    }

    public g(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar, d0.e0.p.d.m0.f.a aVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z2 = false;
        this.name_ = 0;
        d0.e0.p.d.m0.i.c.b bVarNewOutput = d0.e0.p.d.m0.i.c.newOutput();
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bVarNewOutput, 1);
        while (!z2) {
            try {
                try {
                    int tag = dVar.readTag();
                    if (tag != 0) {
                        if (tag != 8) {
                            if (!f(dVar, codedOutputStreamNewInstance, eVar, tag)) {
                            }
                        } else {
                            this.bitField0_ |= 1;
                            this.name_ = dVar.readInt32();
                        }
                    }
                    z2 = true;
                } catch (Throwable th) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = bVarNewOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = bVarNewOutput.toByteString();
                    d();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            }
        }
        try {
            codedOutputStreamNewInstance.flush();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = bVarNewOutput.toByteString();
            throw th3;
        }
        this.unknownFields = bVarNewOutput.toByteString();
        d();
    }
}
