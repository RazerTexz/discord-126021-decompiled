package lombok.launch;

import android.app.AlarmManager;
import com.discord.widgets.chat.input.ChatInputViewModel$ViewState$Loaded$PendingReplyState;
import java.lang.reflect.Method;
import org.eclipse.jdt.internal.compiler.ast.ASTNode;
import org.eclipse.jdt.internal.compiler.ast.MessageSend;
import org.eclipse.jdt.internal.compiler.lookup.BlockScope;
import org.eclipse.jdt.internal.compiler.lookup.MethodBinding;
import org.eclipse.jdt.internal.compiler.lookup.Scope;
import org.eclipse.jdt.internal.compiler.lookup.TypeBinding;
import org.eclipse.jdt.internal.compiler.problem.ProblemReporter;

/* JADX INFO: loaded from: discord-126021.apk:Class50/lombok/launch/PatchFixesHider$ExtensionMethod.SCL.lombok */
public final class PatchFixesHider$ExtensionMethod {
    private static final Method RESOLVE_TYPE = null;
    private static final Method ERROR_NO_METHOD_FOR = null;
    private static final Method INVALID_METHOD = null;
    private static final Method INVALID_METHOD2 = null;
    private static final Method NON_STATIC_ACCESS_TO_STATIC_METHOD = null;

    /* JADX WARN: Multi-variable type inference failed */
    public PatchFixesHider$ExtensionMethod() {
        super/*android.app.Activity*/.setResult(this, this);
        return;
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* JADX INFO: renamed from: <init>, reason: not valid java name */
    static void m269init(
    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:443)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:373)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$4(ClassGen.java:305)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('resolvedType' org.eclipse.jdt.internal.compiler.lookup.TypeBinding)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('methodCall' org.eclipse.jdt.internal.compiler.ast.MessageSend)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('scope' org.eclipse.jdt.internal.compiler.lookup.BlockScope)])
    , block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.PendingIntent, int, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, org.eclipse.jdt.internal.compiler.lookup.TypeBinding] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], long] */
    public static boolean component10() {
        TypeBinding resolvedType;
        MessageSend methodCall;
        BlockScope scope;
        ?? r0 = RESOLVE_TYPE;
        return (TypeBinding) AlarmManager.set(r0, new Object[]{resolvedType, methodCall, scope}, r0);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('problemReporter' org.eclipse.jdt.internal.compiler.problem.ProblemReporter)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('messageSend' org.eclipse.jdt.internal.compiler.ast.MessageSend)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('recType' org.eclipse.jdt.internal.compiler.lookup.TypeBinding)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0015: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('params' org.eclipse.jdt.internal.compiler.lookup.TypeBinding[])])
    , block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.PendingIntent, int, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], long] */
    public static int component11() {
        ProblemReporter problemReporter;
        MessageSend messageSend;
        TypeBinding recType;
        TypeBinding[] params;
        ?? r0 = ERROR_NO_METHOD_FOR;
        AlarmManager.set(r0, new Object[]{problemReporter, messageSend, recType, params}, r0);
        return;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('problemReporter' org.eclipse.jdt.internal.compiler.problem.ProblemReporter)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('messageSend' org.eclipse.jdt.internal.compiler.ast.MessageSend)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('method' org.eclipse.jdt.internal.compiler.lookup.MethodBinding)])
    , block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.PendingIntent, int, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], long] */
    public static boolean component12() {
        ProblemReporter problemReporter;
        MessageSend messageSend;
        MethodBinding method;
        ?? r0 = INVALID_METHOD;
        AlarmManager.set(r0, new Object[]{problemReporter, messageSend, method}, r0);
        return;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('problemReporter' org.eclipse.jdt.internal.compiler.problem.ProblemReporter)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('messageSend' org.eclipse.jdt.internal.compiler.ast.MessageSend)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('method' org.eclipse.jdt.internal.compiler.lookup.MethodBinding)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0015: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('scope' org.eclipse.jdt.internal.compiler.lookup.Scope)])
    , block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.PendingIntent, int, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], long] */
    public static ChatInputViewModel$ViewState$Loaded$PendingReplyState component13() {
        ProblemReporter problemReporter;
        MessageSend messageSend;
        MethodBinding method;
        Scope scope;
        ?? r0 = INVALID_METHOD2;
        AlarmManager.set(r0, new Object[]{problemReporter, messageSend, method, scope}, r0);
        return;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('problemReporter' org.eclipse.jdt.internal.compiler.problem.ProblemReporter)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000d: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('location' org.eclipse.jdt.internal.compiler.ast.ASTNode)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0011: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('method' org.eclipse.jdt.internal.compiler.lookup.MethodBinding)])
    , block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0015: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
      (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('messageSend' org.eclipse.jdt.internal.compiler.ast.MessageSend)])
    , block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.PendingIntent, int, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], long] */
    public static boolean component14() {
        ProblemReporter problemReporter;
        ASTNode location;
        MethodBinding method;
        MessageSend messageSend;
        ?? r0 = NON_STATIC_ACCESS_TO_STATIC_METHOD;
        AlarmManager.set(r0, new Object[]{problemReporter, location, method, messageSend}, r0);
        return;
    }
}
