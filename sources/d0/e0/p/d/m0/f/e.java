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
public final class e extends d0.e0.p.d.m0.i.g implements d0.e0.p.d.m0.i.o {
    private List<f> effect_;
    public static final e j;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final d0.e0.p.d.m0.i.c unknownFields;
    public static d0.e0.p.d.m0.i.p<e> k = new a();

    /* JADX INFO: compiled from: ProtoBuf.java */
    public final class a extends d0.e0.p.d.m0.i.b<e> {
        @Override // d0.e0.p.d.m0.i.p
        public /* bridge */ /* synthetic */ Object parsePartialFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws InvalidProtocolBufferException {
            return parsePartialFrom(dVar, eVar);
        }

        @Override // d0.e0.p.d.m0.i.p
        public e parsePartialFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws InvalidProtocolBufferException {
            return new e(dVar, eVar, null);
        }
    }

    /* JADX INFO: compiled from: ProtoBuf.java */
    public final class b extends d0.e0.p.d.m0.i.g.b<e, b> implements d0.e0.p.d.m0.i.o {
        public int k;
        public List<f> l = Collections.emptyList();

        @Override // d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n build() {
            return build();
        }

        public e buildPartial() {
            e eVar = new e(this, null);
            if ((this.k & 1) == 1) {
                this.l = Collections.unmodifiableList(this.l);
                this.k &= -2;
            }
            e.b(eVar, this.l);
            return eVar;
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

        @Override // d0.e0.p.d.m0.i.n.a
        public e build() {
            e eVarBuildPartial = buildPartial();
            if (eVarBuildPartial.isInitialized()) {
                return eVarBuildPartial;
            }
            throw new UninitializedMessageException(eVarBuildPartial);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.g.b clone() {
            return clone();
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.g.b mergeFrom(d0.e0.p.d.m0.i.g gVar) {
            return mergeFrom((e) gVar);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public b clone() {
            return new b().mergeFrom(buildPartial());
        }

        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n.a mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws IOException {
            return mergeFrom(dVar, eVar);
        }

        public b mergeFrom(e eVar) {
            if (eVar == e.getDefaultInstance()) {
                return this;
            }
            if (!e.a(eVar).isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = e.a(eVar);
                    this.k &= -2;
                } else {
                    if ((this.k & 1) != 1) {
                        this.l = new ArrayList(this.l);
                        this.k |= 1;
                    }
                    this.l.addAll(e.a(eVar));
                }
            }
            setUnknownFields(getUnknownFields().concat(e.c(eVar)));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public b mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws Throwable {
            e eVar2 = null;
            try {
                try {
                    e partialFrom = e.k.parsePartialFrom(dVar, eVar);
                    if (partialFrom != null) {
                        mergeFrom(partialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    e eVar3 = (e) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        eVar2 = eVar3;
                        if (eVar2 != null) {
                            mergeFrom(eVar2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (eVar2 != null) {
                    mergeFrom(eVar2);
                }
                throw th;
            }
        }
    }

    static {
        e eVar = new e();
        j = eVar;
        eVar.effect_ = Collections.emptyList();
    }

    public e(d0.e0.p.d.m0.i.g.b bVar, d0.e0.p.d.m0.f.a aVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.getUnknownFields();
    }

    public static /* synthetic */ List a(e eVar) {
        return eVar.effect_;
    }

    public static /* synthetic */ List b(e eVar, List list) {
        eVar.effect_ = list;
        return list;
    }

    public static /* synthetic */ d0.e0.p.d.m0.i.c c(e eVar) {
        return eVar.unknownFields;
    }

    public static e getDefaultInstance() {
        return j;
    }

    public f getEffect(int i) {
        return this.effect_.get(i);
    }

    public int getEffectCount() {
        return this.effect_.size();
    }

    @Override // d0.e0.p.d.m0.i.n
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.effect_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.effect_.get(i2));
        }
        int size = this.unknownFields.size() + iComputeMessageSize;
        this.memoizedSerializedSize = size;
        return size;
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
        for (int i = 0; i < getEffectCount(); i++) {
            if (!getEffect(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    public static b newBuilder(e eVar) {
        return newBuilder().mergeFrom(eVar);
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
        for (int i = 0; i < this.effect_.size(); i++) {
            codedOutputStream.writeMessage(1, this.effect_.get(i));
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

    public e() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.e0.p.d.m0.i.c.j;
    }

    public e(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar, d0.e0.p.d.m0.f.a aVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.effect_ = Collections.emptyList();
        d0.e0.p.d.m0.i.c.b bVarNewOutput = d0.e0.p.d.m0.i.c.newOutput();
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bVarNewOutput, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                try {
                    int tag = dVar.readTag();
                    if (tag != 0) {
                        if (tag != 10) {
                            if (!dVar.skipField(tag, codedOutputStreamNewInstance)) {
                            }
                        } else {
                            if (!(z3 & true)) {
                                this.effect_ = new ArrayList();
                                z3 |= true;
                            }
                            this.effect_.add((f) dVar.readMessage(f.k, eVar));
                        }
                    }
                    z2 = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (z3 & true) {
                    this.effect_ = Collections.unmodifiableList(this.effect_);
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
            this.effect_ = Collections.unmodifiableList(this.effect_);
        }
        try {
            codedOutputStreamNewInstance.flush();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = bVarNewOutput.toByteString();
        }
    }
}
