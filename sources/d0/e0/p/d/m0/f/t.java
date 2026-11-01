package d0.e0.p.d.m0.f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: compiled from: ProtoBuf.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends d0.e0.p.d.m0.i.g implements d0.e0.p.d.m0.i.o {
    private int bitField0_;
    private int firstNullable_;
    public static final t j;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<q> type_;
    private final d0.e0.p.d.m0.i.c unknownFields;
    public static d0.e0.p.d.m0.i.p<t> k = new a();

    /* JADX INFO: compiled from: ProtoBuf.java */
    public final class a extends d0.e0.p.d.m0.i.b<t> {
        @Override // d0.e0.p.d.m0.i.p
        public /* bridge */ /* synthetic */ Object parsePartialFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws InvalidProtocolBufferException {
            return parsePartialFrom(dVar, eVar);
        }

        @Override // d0.e0.p.d.m0.i.p
        public t parsePartialFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws InvalidProtocolBufferException {
            return new t(dVar, eVar, null);
        }
    }

    /* JADX INFO: compiled from: ProtoBuf.java */
    public final class b extends d0.e0.p.d.m0.i.g.b<t, b> implements d0.e0.p.d.m0.i.o {
        public int k;
        public List<q> l = Collections.emptyList();
        public int m = -1;

        @Override // d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n build() {
            return build();
        }

        public t buildPartial() {
            t tVar = new t(this, null);
            int i = this.k;
            if ((i & 1) == 1) {
                this.l = Collections.unmodifiableList(this.l);
                this.k &= -2;
            }
            t.b(tVar, this.l);
            int i2 = (i & 2) != 2 ? 0 : 1;
            t.c(tVar, this.m);
            t.d(tVar, i2);
            return tVar;
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

        public b setFirstNullable(int i) {
            this.k |= 2;
            this.m = i;
            return this;
        }

        @Override // d0.e0.p.d.m0.i.n.a
        public t build() {
            t tVarBuildPartial = buildPartial();
            if (tVarBuildPartial.isInitialized()) {
                return tVarBuildPartial;
            }
            throw new UninitializedMessageException(tVarBuildPartial);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.g.b clone() {
            return clone();
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.g.b mergeFrom(d0.e0.p.d.m0.i.g gVar) {
            return mergeFrom((t) gVar);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public b clone() {
            return new b().mergeFrom(buildPartial());
        }

        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n.a mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws IOException {
            return mergeFrom(dVar, eVar);
        }

        public b mergeFrom(t tVar) {
            if (tVar == t.getDefaultInstance()) {
                return this;
            }
            if (!t.a(tVar).isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = t.a(tVar);
                    this.k &= -2;
                } else {
                    if ((this.k & 1) != 1) {
                        this.l = new ArrayList(this.l);
                        this.k |= 1;
                    }
                    this.l.addAll(t.a(tVar));
                }
            }
            if (tVar.hasFirstNullable()) {
                setFirstNullable(tVar.getFirstNullable());
            }
            setUnknownFields(getUnknownFields().concat(t.e(tVar)));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public b mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws Throwable {
            t tVar = null;
            try {
                try {
                    t partialFrom = t.k.parsePartialFrom(dVar, eVar);
                    if (partialFrom != null) {
                        mergeFrom(partialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    t tVar2 = (t) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        tVar = tVar2;
                        if (tVar != null) {
                            mergeFrom(tVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (tVar != null) {
                    mergeFrom(tVar);
                }
                throw th;
            }
        }
    }

    static {
        t tVar = new t();
        j = tVar;
        tVar.type_ = Collections.emptyList();
        tVar.firstNullable_ = -1;
    }

    public t(d0.e0.p.d.m0.i.g.b bVar, d0.e0.p.d.m0.f.a aVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.getUnknownFields();
    }

    public static /* synthetic */ List a(t tVar) {
        return tVar.type_;
    }

    public static /* synthetic */ List b(t tVar, List list) {
        tVar.type_ = list;
        return list;
    }

    public static /* synthetic */ int c(t tVar, int i) {
        tVar.firstNullable_ = i;
        return i;
    }

    public static /* synthetic */ int d(t tVar, int i) {
        tVar.bitField0_ = i;
        return i;
    }

    public static /* synthetic */ d0.e0.p.d.m0.i.c e(t tVar) {
        return tVar.unknownFields;
    }

    public static t getDefaultInstance() {
        return j;
    }

    public int getFirstNullable() {
        return this.firstNullable_;
    }

    @Override // d0.e0.p.d.m0.i.n
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeInt32Size = 0;
        for (int i2 = 0; i2 < this.type_.size(); i2++) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(1, this.type_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.firstNullable_);
        }
        int size = this.unknownFields.size() + iComputeInt32Size;
        this.memoizedSerializedSize = size;
        return size;
    }

    public q getType(int i) {
        return this.type_.get(i);
    }

    public int getTypeCount() {
        return this.type_.size();
    }

    public List<q> getTypeList() {
        return this.type_;
    }

    public boolean hasFirstNullable() {
        return (this.bitField0_ & 1) == 1;
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
        for (int i = 0; i < getTypeCount(); i++) {
            if (!getType(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    public static b newBuilder(t tVar) {
        return newBuilder().mergeFrom(tVar);
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
        for (int i = 0; i < this.type_.size(); i++) {
            codedOutputStream.writeMessage(1, this.type_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.writeInt32(2, this.firstNullable_);
        }
        codedOutputStream.writeRawBytes(this.unknownFields);
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

    public t() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.e0.p.d.m0.i.c.j;
    }

    public t(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar, d0.e0.p.d.m0.f.a aVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.type_ = Collections.emptyList();
        this.firstNullable_ = -1;
        d0.e0.p.d.m0.i.c.b bVarNewOutput = d0.e0.p.d.m0.i.c.newOutput();
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bVarNewOutput, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                try {
                    try {
                        int tag = dVar.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if (!(z3 & true)) {
                                    this.type_ = new ArrayList();
                                    z3 |= true;
                                }
                                this.type_.add((q) dVar.readMessage(q.k, eVar));
                            } else if (tag != 16) {
                                if (!dVar.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                this.bitField0_ |= 1;
                                this.firstNullable_ = dVar.readInt32();
                            }
                        }
                        z2 = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (z3 & true) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = bVarNewOutput.toByteString();
                }
                throw th;
            }
        }
        if (z3 & true) {
            this.type_ = Collections.unmodifiableList(this.type_);
        }
        try {
            codedOutputStreamNewInstance.flush();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = bVarNewOutput.toByteString();
        }
    }
}
