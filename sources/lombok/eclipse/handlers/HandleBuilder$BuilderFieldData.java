package lombok.eclipse.handlers;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder$ObtainVia;
import lombok.eclipse.EclipseNode;
import org.eclipse.jdt.internal.compiler.ast.Annotation;
import org.eclipse.jdt.internal.compiler.ast.TypeReference;

/* JADX INFO: loaded from: discord-126021.apk:lombok/eclipse/handlers/HandleBuilder$BuilderFieldData.SCL.lombok */
class HandleBuilder$BuilderFieldData {
    Annotation[] annotations;
    char[] builderFieldName;
    char[] name;
    char[] nameOfDefaultProvider;
    char[] nameOfSetFlag;
    Builder$ObtainVia obtainVia;
    EclipseNode obtainViaNode;
    EclipseNode originalFieldNode;
    char[] rawName;
    EclipseSingularsRecipes$SingularData singularData;
    TypeReference type;
    List<EclipseNode> createdFields = new ArrayList();

    HandleBuilder$BuilderFieldData() {
    }
}
