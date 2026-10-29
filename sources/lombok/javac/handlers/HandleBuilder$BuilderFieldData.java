package lombok.javac.handlers;

import com.sun.tools.javac.tree.JCTree$JCAnnotation;
import com.sun.tools.javac.tree.JCTree$JCExpression;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import java.util.ArrayList;
import lombok.Builder$ObtainVia;
import lombok.javac.JavacNode;

/* JADX INFO: loaded from: discord-126021.apk:lombok/javac/handlers/HandleBuilder$BuilderFieldData.SCL.lombok */
class HandleBuilder$BuilderFieldData {
    List<JCTree$JCAnnotation> annotations;
    Name builderFieldName;
    Name name;
    Name nameOfDefaultProvider;
    Name nameOfSetFlag;
    Builder$ObtainVia obtainVia;
    JavacNode obtainViaNode;
    JavacNode originalFieldNode;
    Name rawName;
    JavacSingularsRecipes$SingularData singularData;
    JCTree$JCExpression type;
    java.util.List<JavacNode> createdFields = new ArrayList();

    HandleBuilder$BuilderFieldData() {
    }
}
