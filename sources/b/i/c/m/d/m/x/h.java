package b.i.c.m.d.m.x;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import b.i.c.m.d.m.i;
import b.i.c.m.d.m.j;
import b.i.c.m.d.m.k;
import b.i.c.m.d.m.l;
import b.i.c.m.d.m.n;
import b.i.c.m.d.m.o;
import b.i.c.m.d.m.q;
import b.i.c.m.d.m.r;
import b.i.c.m.d.m.s;
import b.i.c.m.d.m.t;
import b.i.c.m.d.m.u;
import b.i.c.m.d.m.v;
import b.i.c.m.d.m.w;
import com.discord.models.domain.ModelAuditLogEntry;
import com.discord.utilities.analytics.ChatInputComponentTypes;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: CrashlyticsReportJsonTransform.java */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    public static final b.i.c.p.a a;

    /* JADX INFO: compiled from: CrashlyticsReportJsonTransform.java */
    public interface a<T> {
        T a(@NonNull JsonReader jsonReader) throws IOException;
    }

    static {
        b.i.c.p.h.e eVar = new b.i.c.p.h.e();
        ((b.i.c.m.d.m.a) b.i.c.m.d.m.a.a).a(eVar);
        eVar.e = true;
        a = new b.i.c.p.h.d(eVar);
    }

    @NonNull
    public static <T> w<T> a(@NonNull JsonReader jsonReader, @NonNull a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return new w<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0182  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:212:0x032a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [b.i.c.m.d.m.v$d$d$a$b] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [b.i.c.m.d.m.w] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [b.i.c.m.d.m.s$a] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.Object, java.lang.String] */
    @NonNull
    public static v.d.AbstractC0143d b(@NonNull JsonReader jsonReader) throws IOException {
        String strW;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        jsonReader.beginObject();
        Long lValueOf = null;
        ?? ValueOf = 0;
        String str = null;
        k kVar = null;
        v.d.AbstractC0143d.b bVarA = null;
        s sVar = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                strW = lValueOf == null ? " timestamp" : "";
                if (str == null) {
                    strW = b.d.b.a.a.w(strW, " type");
                }
                if (kVar == null) {
                    strW = b.d.b.a.a.w(strW, " app");
                }
                if (bVarA == null) {
                    strW = b.d.b.a.a.w(strW, " device");
                }
                if (strW.isEmpty()) {
                    return new j(lValueOf.longValue(), str, kVar, bVarA, sVar, null);
                }
                throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", strW));
            }
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    b2 = 0;
                    break;
                case "app":
                    b2 = 1;
                    break;
                case "log":
                    b2 = 2;
                    break;
                case "type":
                    b2 = 3;
                    break;
                case "timestamp":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                r.b bVar = new r.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.hashCode();
                    switch (strNextName2) {
                        case "batteryLevel":
                            b3 = 0;
                            break;
                        case "batteryVelocity":
                            b3 = 1;
                            break;
                        case "orientation":
                            b3 = 2;
                            break;
                        case "diskUsed":
                            b3 = 3;
                            break;
                        case "ramUsed":
                            b3 = 4;
                            break;
                        case "proximityOn":
                            b3 = 5;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    if (b3 == 0) {
                        bVar.a = Double.valueOf(jsonReader.nextDouble());
                    } else if (b3 == 1) {
                        bVar.f1734b = Integer.valueOf(jsonReader.nextInt());
                    } else if (b3 == 2) {
                        bVar.d = Integer.valueOf(jsonReader.nextInt());
                    } else if (b3 == 3) {
                        bVar.f = Long.valueOf(jsonReader.nextLong());
                    } else if (b3 == 4) {
                        bVar.e = Long.valueOf(jsonReader.nextLong());
                    } else if (b3 != 5) {
                        jsonReader.skipValue();
                    } else {
                        bVar.c = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                }
                jsonReader.endObject();
                bVarA = bVar.a();
            } else if (b2 == 1) {
                jsonReader.beginObject();
                ?? lVar = ValueOf;
                ?? A = lVar;
                ?? ValueOf2 = A;
                while (true) {
                    char c = 3;
                    if (!jsonReader.hasNext()) {
                        jsonReader.endObject();
                        strW = lVar == 0 ? " execution" : "";
                        if (ValueOf == 0) {
                            strW = b.d.b.a.a.w(strW, " uiOrientation");
                        }
                        if (!strW.isEmpty()) {
                            throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", strW));
                        }
                        kVar = new k(lVar, A, ValueOf2, ValueOf.intValue(), null);
                        break;
                    }
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.hashCode();
                    switch (strNextName3) {
                        case "background":
                            b4 = 0;
                            break;
                        case "execution":
                            b4 = 1;
                            break;
                        case "customAttributes":
                            b4 = 2;
                            break;
                        case "uiOrientation":
                            b4 = 3;
                            break;
                        default:
                            b4 = -1;
                            break;
                    }
                    if (b4 == 0) {
                        ValueOf2 = Boolean.valueOf(jsonReader.nextBoolean());
                    } else if (b4 == 1) {
                        jsonReader.beginObject();
                        v.d.AbstractC0143d.a.b.AbstractC0146b abstractC0146bC = null;
                        o oVar = null;
                        w wVarA = null;
                        w wVarA2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName4 = jsonReader.nextName();
                            strNextName4.hashCode();
                            switch (strNextName4) {
                                case "threads":
                                    b5 = 0;
                                    break;
                                case "signal":
                                    b5 = 1;
                                    break;
                                case "binaries":
                                    b5 = 2;
                                    break;
                                case "exception":
                                    b5 = 3;
                                    break;
                                default:
                                    b5 = -1;
                                    break;
                            }
                            if (b5 == 0) {
                                wVarA2 = a(jsonReader, d.a);
                            } else if (b5 == 1) {
                                jsonReader.beginObject();
                                Long lValueOf2 = null;
                                String str2 = null;
                                String str3 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.hashCode();
                                    int iHashCode = strNextName5.hashCode();
                                    if (iHashCode != -1147692044) {
                                        if (iHashCode != 3059181) {
                                            if (iHashCode == 3373707 && strNextName5.equals(ModelAuditLogEntry.CHANGE_KEY_NAME)) {
                                                b6 = 2;
                                            } else {
                                                b6 = -1;
                                            }
                                        } else if (strNextName5.equals(ModelAuditLogEntry.CHANGE_KEY_CODE)) {
                                            b6 = 1;
                                        } else {
                                            b6 = -1;
                                        }
                                    } else if (strNextName5.equals("address")) {
                                        b6 = 0;
                                    } else {
                                        b6 = -1;
                                    }
                                    if (b6 == 0) {
                                        lValueOf2 = Long.valueOf(jsonReader.nextLong());
                                    } else if (b6 == 1) {
                                        String strNextString = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString, "Null code");
                                        str3 = strNextString;
                                    } else if (b6 != 2) {
                                        jsonReader.skipValue();
                                    } else {
                                        String strNextString2 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString2, "Null name");
                                        str2 = strNextString2;
                                    }
                                }
                                jsonReader.endObject();
                                String strW2 = str2 == null ? " name" : "";
                                if (str3 == null) {
                                    strW2 = b.d.b.a.a.w(strW2, " code");
                                }
                                if (lValueOf2 == null) {
                                    strW2 = b.d.b.a.a.w(strW2, " address");
                                }
                                if (!strW2.isEmpty()) {
                                    throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", strW2));
                                }
                                oVar = new o(str2, str3, lValueOf2.longValue(), null);
                            } else if (b5 == 2) {
                                wVarA = a(jsonReader, e.a);
                            } else if (b5 != c) {
                                jsonReader.skipValue();
                            } else {
                                abstractC0146bC = c(jsonReader);
                            }
                            c = 3;
                        }
                        jsonReader.endObject();
                        String strW3 = wVarA2 == null ? " threads" : "";
                        if (abstractC0146bC == null) {
                            strW3 = b.d.b.a.a.w(strW3, " exception");
                        }
                        if (oVar == null) {
                            strW3 = b.d.b.a.a.w(strW3, " signal");
                        }
                        if (wVarA == null) {
                            strW3 = b.d.b.a.a.w(strW3, " binaries");
                        }
                        if (!strW3.isEmpty()) {
                            throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", strW3));
                        }
                        lVar = new l(wVarA2, abstractC0146bC, oVar, wVarA, null);
                    } else if (b4 == 2) {
                        A = a(jsonReader, c.a);
                    } else if (b4 != 3) {
                        jsonReader.skipValue();
                    } else {
                        ValueOf = Integer.valueOf(jsonReader.nextInt());
                    }
                }
            } else if (b2 == 2) {
                jsonReader.beginObject();
                ?? NextString = ValueOf;
                while (jsonReader.hasNext()) {
                    String strNextName6 = jsonReader.nextName();
                    strNextName6.hashCode();
                    if (strNextName6.equals("content")) {
                        NextString = jsonReader.nextString();
                        Objects.requireNonNull(NextString, "Null content");
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                strW = NextString == 0 ? " content" : "";
                if (!strW.isEmpty()) {
                    throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", strW));
                }
                sVar = new s(NextString, ValueOf);
            } else if (b2 == 3) {
                String strNextString3 = jsonReader.nextString();
                Objects.requireNonNull(strNextString3, "Null type");
                str = strNextString3;
            } else if (b2 != 4) {
                jsonReader.skipValue();
            } else {
                lValueOf = Long.valueOf(jsonReader.nextLong());
            }
            ValueOf = 0;
        }
    }

    @NonNull
    public static v.d.AbstractC0143d.a.b.AbstractC0146b c(@NonNull JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String strNextString = null;
        String strNextString2 = null;
        w wVarA = null;
        v.d.AbstractC0143d.a.b.AbstractC0146b abstractC0146bC = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    wVarA = a(jsonReader, f.a);
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null type");
                    break;
                case "causedBy":
                    abstractC0146bC = c(jsonReader);
                    break;
                case "overflowCount":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strW = strNextString == null ? " type" : "";
        if (wVarA == null) {
            strW = b.d.b.a.a.w(strW, " frames");
        }
        if (numValueOf == null) {
            strW = b.d.b.a.a.w(strW, " overflowCount");
        }
        if (strW.isEmpty()) {
            return new n(strNextString, strNextString2, wVarA, abstractC0146bC, numValueOf.intValue(), null);
        }
        throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", strW));
    }

    @NonNull
    public static v.d.AbstractC0143d.a.b.AbstractC0147d.AbstractC0148a d(@NonNull JsonReader jsonReader) throws IOException {
        q.b bVar = new q.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    bVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null symbol");
                    bVar.f1732b = strNextString;
                    break;
                case "pc":
                    bVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    bVar.c = jsonReader.nextString();
                    break;
                case "importance":
                    bVar.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:149:0x021a A[PHI: r17
      0x021a: PHI (r17v18 java.lang.String) = 
      (r17v10 java.lang.String)
      (r17v11 java.lang.String)
      (r17v12 java.lang.String)
      (r17v13 java.lang.String)
      (r17v14 java.lang.String)
      (r17v16 java.lang.String)
      (r17v19 java.lang.String)
     binds: [B:146:0x0215, B:142:0x020a, B:138:0x01fd, B:414:?, B:413:?, B:412:?, B:123:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:202:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:273:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:94:0x012b  */
    @NonNull
    public static v e(@NonNull JsonReader jsonReader) throws IOException {
        byte b2;
        String str;
        byte b3;
        String str2;
        byte b4;
        Charset charset = v.a;
        b.i.c.m.d.m.b.C0141b c0141b = new b.i.c.m.d.m.b.C0141b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    b2 = 0;
                    break;
                case "sdkVersion":
                    b2 = 1;
                    break;
                case "buildVersion":
                    b2 = 2;
                    break;
                case "gmpAppId":
                    b2 = 3;
                    break;
                case "installationUuid":
                    b2 = 4;
                    break;
                case "platform":
                    b2 = 5;
                    break;
                case "displayVersion":
                    b2 = 6;
                    break;
                case "session":
                    b2 = 7;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            String str3 = "";
            switch (b2) {
                case 0:
                    jsonReader.beginObject();
                    String strNextString = null;
                    w wVarA = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals(ChatInputComponentTypes.FILES)) {
                            wVarA = a(jsonReader, b.a);
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str4 = wVarA == null ? " files" : "";
                    if (!str4.isEmpty()) {
                        throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", str4));
                    }
                    c0141b.h = new b.i.c.m.d.m.d(wVarA, strNextString, null);
                    break;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString2, "Null sdkVersion");
                    c0141b.a = strNextString2;
                    break;
                case 2:
                    String strNextString3 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString3, "Null buildVersion");
                    c0141b.e = strNextString3;
                    break;
                case 3:
                    String strNextString4 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString4, "Null gmpAppId");
                    c0141b.f1714b = strNextString4;
                    break;
                case 4:
                    String strNextString5 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString5, "Null installationUuid");
                    c0141b.d = strNextString5;
                    break;
                case 5:
                    c0141b.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 6:
                    String strNextString6 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString6, "Null displayVersion");
                    c0141b.f = strNextString6;
                    break;
                case 7:
                    b.i.c.m.d.m.f.b bVar = new b.i.c.m.d.m.f.b();
                    bVar.b(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.hashCode();
                        switch (strNextName3) {
                            case "startedAt":
                                str = str3;
                                bVar.c = Long.valueOf(jsonReader.nextLong());
                                str3 = str;
                                break;
                            case "identifier":
                                str = str3;
                                bVar.f1719b = new String(Base64.decode(jsonReader.nextString(), 2), v.a);
                                str3 = str;
                                break;
                            case "endedAt":
                                str = str3;
                                bVar.d = Long.valueOf(jsonReader.nextLong());
                                str3 = str;
                                break;
                            case "device":
                                str = str3;
                                i.b bVar2 = new i.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.hashCode();
                                    switch (strNextName4) {
                                        case "simulator":
                                            bVar2.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString7, "Null manufacturer");
                                            bVar2.h = strNextString7;
                                            break;
                                        case "ram":
                                            bVar2.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            bVar2.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            bVar2.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            bVar2.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString8, "Null model");
                                            bVar2.f1722b = strNextString8;
                                            break;
                                        case "state":
                                            bVar2.g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString9, "Null modelClass");
                                            bVar2.i = strNextString9;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar.i = bVar2.a();
                                str3 = str;
                                break;
                            case "events":
                                str = str3;
                                bVar.j = a(jsonReader, b.i.c.m.d.m.x.a.a);
                                str3 = str;
                                break;
                            case "os":
                                str = str3;
                                jsonReader.beginObject();
                                Boolean boolValueOf = null;
                                Integer numValueOf = null;
                                String str5 = null;
                                String str6 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.hashCode();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            b3 = 0;
                                            break;
                                        case "jailbroken":
                                            b3 = 1;
                                            break;
                                        case "version":
                                            b3 = 2;
                                            break;
                                        case "platform":
                                            b3 = 3;
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    if (b3 == 0) {
                                        String strNextString10 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString10, "Null buildVersion");
                                        str6 = strNextString10;
                                    } else if (b3 == 1) {
                                        boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                    } else if (b3 == 2) {
                                        String strNextString11 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString11, "Null version");
                                        str5 = strNextString11;
                                    } else if (b3 != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        numValueOf = Integer.valueOf(jsonReader.nextInt());
                                    }
                                }
                                jsonReader.endObject();
                                String strW = numValueOf == null ? " platform" : str;
                                if (str5 == null) {
                                    strW = b.d.b.a.a.w(strW, " version");
                                }
                                if (str6 == null) {
                                    strW = b.d.b.a.a.w(strW, " buildVersion");
                                }
                                if (boolValueOf == null) {
                                    strW = b.d.b.a.a.w(strW, " jailbroken");
                                }
                                if (!strW.isEmpty()) {
                                    throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", strW));
                                }
                                bVar.h = new t(numValueOf.intValue(), str5, str6, boolValueOf.booleanValue(), null);
                                str3 = str;
                                break;
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String str7 = null;
                                String str8 = null;
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.hashCode();
                                    switch (strNextName6.hashCode()) {
                                        case -1618432855:
                                            str2 = str3;
                                            if (!strNextName6.equals("identifier")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 0;
                                            }
                                            break;
                                        case -519438642:
                                            str2 = str3;
                                            if (!strNextName6.equals("developmentPlatform")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 1;
                                            }
                                            break;
                                        case 213652010:
                                            str2 = str3;
                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 2;
                                            }
                                            break;
                                        case 351608024:
                                            if (!strNextName6.equals("version")) {
                                                str2 = str3;
                                                b4 = -1;
                                            } else {
                                                b4 = 3;
                                                str2 = str3;
                                            }
                                            break;
                                        case 719853845:
                                            if (!strNextName6.equals("installationUuid")) {
                                                str2 = str3;
                                                b4 = -1;
                                            } else {
                                                b4 = 4;
                                                str2 = str3;
                                            }
                                            break;
                                        case 1975623094:
                                            if (!strNextName6.equals("displayVersion")) {
                                                str2 = str3;
                                                b4 = -1;
                                            } else {
                                                b4 = 5;
                                                str2 = str3;
                                            }
                                            break;
                                        default:
                                            str2 = str3;
                                            b4 = -1;
                                            break;
                                    }
                                    if (b4 == 0) {
                                        String strNextString16 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString16, "Null identifier");
                                        str7 = strNextString16;
                                    } else if (b4 == 1) {
                                        strNextString14 = jsonReader.nextString();
                                    } else if (b4 == 2) {
                                        strNextString15 = jsonReader.nextString();
                                    } else if (b4 == 3) {
                                        String strNextString17 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString17, "Null version");
                                        str8 = strNextString17;
                                    } else if (b4 == 4) {
                                        strNextString13 = jsonReader.nextString();
                                    } else if (b4 != 5) {
                                        jsonReader.skipValue();
                                    } else {
                                        strNextString12 = jsonReader.nextString();
                                    }
                                    str3 = str2;
                                }
                                str = str3;
                                jsonReader.endObject();
                                String strW2 = str7 == null ? " identifier" : str;
                                if (str8 == null) {
                                    strW2 = b.d.b.a.a.w(strW2, " version");
                                }
                                if (!strW2.isEmpty()) {
                                    throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", strW2));
                                }
                                bVar.f = new b.i.c.m.d.m.g(str7, str8, strNextString12, null, strNextString13, strNextString14, strNextString15, null);
                                str3 = str;
                                break;
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    strNextName7.hashCode();
                                    if (strNextName7.equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString18, "Null identifier");
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str9 = strNextString18 == null ? " identifier" : str3;
                                if (!str9.isEmpty()) {
                                    throw new IllegalStateException(b.d.b.a.a.w("Missing required properties:", str9));
                                }
                                bVar.g = new u(strNextString18, null);
                                str = str3;
                                str3 = str;
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                Objects.requireNonNull(strNextString19, "Null generator");
                                bVar.a = strNextString19;
                                str = str3;
                                str3 = str;
                                break;
                            case "crashed":
                                bVar.b(jsonReader.nextBoolean());
                                str = str3;
                                str3 = str;
                                break;
                            case "generatorType":
                                bVar.k = Integer.valueOf(jsonReader.nextInt());
                                str = str3;
                                str3 = str;
                                break;
                            default:
                                str = str3;
                                jsonReader.skipValue();
                                str3 = str;
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0141b.g = bVar.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0141b.a();
    }

    @NonNull
    public v f(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                v vVarE = e(jsonReader);
                jsonReader.close();
                return vVarE;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @NonNull
    public String g(@NonNull v vVar) {
        return ((b.i.c.p.h.d) a).a(vVar);
    }
}
