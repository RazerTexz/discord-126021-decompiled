package lombok.javac;

import com.sun.source.util.Trees;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.JCTree$JCAnnotation;
import com.sun.tools.javac.tree.JCTree$JCBlock;
import com.sun.tools.javac.tree.JCTree$JCClassDecl;
import com.sun.tools.javac.tree.JCTree$JCCompilationUnit;
import com.sun.tools.javac.tree.JCTree$JCMethodDecl;
import com.sun.tools.javac.tree.JCTree$JCVariableDecl;

/* JADX INFO: loaded from: discord-126021.apk:lombok/javac/JavacASTVisitor.SCL.lombok */
public interface JavacASTVisitor {
    void endVisitCompilationUnit(JavacNode javacNode, JCTree$JCCompilationUnit jCTree$JCCompilationUnit);

    void endVisitField(JavacNode javacNode, JCTree$JCVariableDecl jCTree$JCVariableDecl);

    void endVisitInitializer(JavacNode javacNode, JCTree$JCBlock jCTree$JCBlock);

    void endVisitLocal(JavacNode javacNode, JCTree$JCVariableDecl jCTree$JCVariableDecl);

    void endVisitMethod(JavacNode javacNode, JCTree$JCMethodDecl jCTree$JCMethodDecl);

    void endVisitMethodArgument(JavacNode javacNode, JCTree$JCVariableDecl jCTree$JCVariableDecl, JCTree$JCMethodDecl jCTree$JCMethodDecl);

    void endVisitStatement(JavacNode javacNode, JCTree jCTree);

    void endVisitType(JavacNode javacNode, JCTree$JCClassDecl jCTree$JCClassDecl);

    void endVisitTypeUse(JavacNode javacNode, JCTree jCTree);

    void setTrees(Trees trees);

    void visitAnnotationOnField(JCTree$JCVariableDecl jCTree$JCVariableDecl, JavacNode javacNode, JCTree$JCAnnotation jCTree$JCAnnotation);

    void visitAnnotationOnLocal(JCTree$JCVariableDecl jCTree$JCVariableDecl, JavacNode javacNode, JCTree$JCAnnotation jCTree$JCAnnotation);

    void visitAnnotationOnMethod(JCTree$JCMethodDecl jCTree$JCMethodDecl, JavacNode javacNode, JCTree$JCAnnotation jCTree$JCAnnotation);

    void visitAnnotationOnMethodArgument(JCTree$JCVariableDecl jCTree$JCVariableDecl, JCTree$JCMethodDecl jCTree$JCMethodDecl, JavacNode javacNode, JCTree$JCAnnotation jCTree$JCAnnotation);

    void visitAnnotationOnType(JCTree$JCClassDecl jCTree$JCClassDecl, JavacNode javacNode, JCTree$JCAnnotation jCTree$JCAnnotation);

    void visitAnnotationOnTypeUse(JCTree jCTree, JavacNode javacNode, JCTree$JCAnnotation jCTree$JCAnnotation);

    void visitCompilationUnit(JavacNode javacNode, JCTree$JCCompilationUnit jCTree$JCCompilationUnit);

    void visitField(JavacNode javacNode, JCTree$JCVariableDecl jCTree$JCVariableDecl);

    void visitInitializer(JavacNode javacNode, JCTree$JCBlock jCTree$JCBlock);

    void visitLocal(JavacNode javacNode, JCTree$JCVariableDecl jCTree$JCVariableDecl);

    void visitMethod(JavacNode javacNode, JCTree$JCMethodDecl jCTree$JCMethodDecl);

    void visitMethodArgument(JavacNode javacNode, JCTree$JCVariableDecl jCTree$JCVariableDecl, JCTree$JCMethodDecl jCTree$JCMethodDecl);

    void visitStatement(JavacNode javacNode, JCTree jCTree);

    void visitType(JavacNode javacNode, JCTree$JCClassDecl jCTree$JCClassDecl);

    void visitTypeUse(JavacNode javacNode, JCTree jCTree);
}
