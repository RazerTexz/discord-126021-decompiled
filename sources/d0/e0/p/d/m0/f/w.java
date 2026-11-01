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
public final class w extends d0.e0.p.d.m0.i.g implements d0.e0.p.d.m0.i.o {
    public static final w j;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<v> requirement_;
    private final d0.e0.p.d.m0.i.c unknownFields;
    public static d0.e0.p.d.m0.i.p<w> k = new a();

    /* JADX INFO: compiled from: ProtoBuf.java */
    public final class a extends d0.e0.p.d.m0.i.b<w> {
        @Override // d0.e0.p.d.m0.i.p
        public /* bridge */ /* synthetic */ Object parsePartialFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws InvalidProtocolBufferException {
            return parsePartialFrom(dVar, eVar);
        }

        @Override // d0.e0.p.d.m0.i.p
        public w parsePartialFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws InvalidProtocolBufferException {
            return new w(dVar, eVar, null);
        }
    }

    /* JADX INFO: compiled from: ProtoBuf.java */
    public final class b extends d0.e0.p.d.m0.i.g.b<w, b> implements d0.e0.p.d.m0.i.o {
        public int k;
        public List<v> l = Collections.emptyList();

        @Override // d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n build() {
            return build();
        }

        public w buildPartial() {
            w wVar = new w(this, null);
            if ((this.k & 1) == 1) {
                this.l = Collections.unmodifiableList(this.l);
                this.k &= -2;
            }
            w.b(wVar, this.l);
            return wVar;
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
        public w build() {
            w wVarBuildPartial = buildPartial();
            if (wVarBuildPartial.isInitialized()) {
                return wVarBuildPartial;
            }
            throw new UninitializedMessageException(wVarBuildPartial);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.g.b clone() {
            return clone();
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.g.b mergeFrom(d0.e0.p.d.m0.i.g gVar) {
            return mergeFrom((w) gVar);
        }

        @Override // d0.e0.p.d.m0.i.g.b
        public b clone() {
            return new b().mergeFrom(buildPartial());
        }

        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public /* bridge */ /* synthetic */ d0.e0.p.d.m0.i.n.a mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws IOException {
            return mergeFrom(dVar, eVar);
        }

        public b mergeFrom(w wVar) {
            if (wVar == w.getDefaultInstance()) {
                return this;
            }
            if (!w.a(wVar).isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = w.a(wVar);
                    this.k &= -2;
                } else {
                    if ((this.k & 1) != 1) {
                        this.l = new ArrayList(this.l);
                        this.k |= 1;
                    }
                    this.l.addAll(w.a(wVar));
                }
            }
            setUnknownFields(getUnknownFields().concat(w.c(wVar)));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // d0.e0.p.d.m0.i.a.AbstractC0556a, d0.e0.p.d.m0.i.n.a
        public b mergeFrom(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar) throws Throwable {
            w wVar = null;
            try {
                try {
                    w partialFrom = w.k.parsePartialFrom(dVar, eVar);
                    if (partialFrom != null) {
                        mergeFrom(partialFrom);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    w wVar2 = (w) e.getUnfinishedMessage();
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        wVar = wVar2;
                        if (wVar != null) {
                            mergeFrom(wVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (wVar != null) {
                    mergeFrom(wVar);
                }
                throw th;
            }
        }
    }

    static {
        w wVar = new w();
        j = wVar;
        wVar.requirement_ = Collections.emptyList();
    }

    public w(d0.e0.p.d.m0.i.g.b bVar, d0.e0.p.d.m0.f.a aVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.getUnknownFields();
    }

    public static /* synthetic */ List a(w wVar) {
        return wVar.requirement_;
    }

    public static /* synthetic */ List b(w wVar, List list) {
        wVar.requirement_ = list;
        return list;
    }

    public static /* synthetic */ d0.e0.p.d.m0.i.c c(w wVar) {
        return wVar.unknownFields;
    }

    public static w getDefaultInstance() {
        return j;
    }

    public int getRequirementCount() {
        return this.requirement_.size();
    }

    public List<v> getRequirementList() {
        return this.requirement_;
    }

    @Override // d0.e0.p.d.m0.i.n
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.requirement_.get(i2));
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    public static b newBuilder(w wVar) {
        return newBuilder().mergeFrom(wVar);
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
        for (int i = 0; i < this.requirement_.size(); i++) {
            codedOutputStream.writeMessage(1, this.requirement_.get(i));
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

    public w() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.e0.p.d.m0.i.c.j;
    }

    public w(d0.e0.p.d.m0.i.d dVar, d0.e0.p.d.m0.i.e eVar, d0.e0.p.d.m0.f.a aVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.requirement_ = Collections.emptyList();
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
                                this.requirement_ = new ArrayList();
                                z3 |= true;
                            }
                            this.requirement_.add((v) dVar.readMessage(v.k, eVar));
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
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
            this.requirement_ = Collections.unmodifiableList(this.requirement_);
        }
        try {
            codedOutputStreamNewInstance.flush();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = bVarNewOutput.toByteString();
        }
    }
}
