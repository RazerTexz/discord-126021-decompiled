package lombok.eclipse;

import org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration;
import org.eclipse.jdt.internal.compiler.ast.Annotation;
import org.eclipse.jdt.internal.compiler.ast.Argument;
import org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration;
import org.eclipse.jdt.internal.compiler.ast.FieldDeclaration;
import org.eclipse.jdt.internal.compiler.ast.Initializer;
import org.eclipse.jdt.internal.compiler.ast.LocalDeclaration;
import org.eclipse.jdt.internal.compiler.ast.Statement;
import org.eclipse.jdt.internal.compiler.ast.TypeDeclaration;
import org.eclipse.jdt.internal.compiler.ast.TypeReference;

/* JADX INFO: loaded from: discord-126021.apk:lombok/eclipse/EclipseASTVisitor.SCL.lombok */
public interface EclipseASTVisitor {
    void endVisitCompilationUnit(EclipseNode eclipseNode, CompilationUnitDeclaration compilationUnitDeclaration);

    void endVisitField(EclipseNode eclipseNode, FieldDeclaration fieldDeclaration);

    void endVisitInitializer(EclipseNode eclipseNode, Initializer initializer);

    void endVisitLocal(EclipseNode eclipseNode, LocalDeclaration localDeclaration);

    void endVisitMethod(EclipseNode eclipseNode, AbstractMethodDeclaration abstractMethodDeclaration);

    void endVisitMethodArgument(EclipseNode eclipseNode, Argument argument, AbstractMethodDeclaration abstractMethodDeclaration);

    void endVisitStatement(EclipseNode eclipseNode, Statement statement);

    void endVisitType(EclipseNode eclipseNode, TypeDeclaration typeDeclaration);

    void endVisitTypeUse(EclipseNode eclipseNode, TypeReference typeReference);

    boolean isDeferUntilPostDiet();

    void visitAnnotationOnField(FieldDeclaration fieldDeclaration, EclipseNode eclipseNode, Annotation annotation);

    void visitAnnotationOnLocal(LocalDeclaration localDeclaration, EclipseNode eclipseNode, Annotation annotation);

    void visitAnnotationOnMethod(AbstractMethodDeclaration abstractMethodDeclaration, EclipseNode eclipseNode, Annotation annotation);

    void visitAnnotationOnMethodArgument(Argument argument, AbstractMethodDeclaration abstractMethodDeclaration, EclipseNode eclipseNode, Annotation annotation);

    void visitAnnotationOnType(TypeDeclaration typeDeclaration, EclipseNode eclipseNode, Annotation annotation);

    void visitAnnotationOnTypeUse(TypeReference typeReference, EclipseNode eclipseNode, Annotation annotation);

    void visitCompilationUnit(EclipseNode eclipseNode, CompilationUnitDeclaration compilationUnitDeclaration);

    void visitField(EclipseNode eclipseNode, FieldDeclaration fieldDeclaration);

    void visitInitializer(EclipseNode eclipseNode, Initializer initializer);

    void visitLocal(EclipseNode eclipseNode, LocalDeclaration localDeclaration);

    void visitMethod(EclipseNode eclipseNode, AbstractMethodDeclaration abstractMethodDeclaration);

    void visitMethodArgument(EclipseNode eclipseNode, Argument argument, AbstractMethodDeclaration abstractMethodDeclaration);

    void visitStatement(EclipseNode eclipseNode, Statement statement);

    void visitType(EclipseNode eclipseNode, TypeDeclaration typeDeclaration);

    void visitTypeUse(EclipseNode eclipseNode, TypeReference typeReference);
}
