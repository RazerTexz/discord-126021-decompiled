package lombok.core;

import java.util.List;
import java.util.Set;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

/* JADX INFO: loaded from: discord-126021.apk:lombok/core/AnnotationProcessor$ProcessorDescriptor.SCL.lombok */
abstract class AnnotationProcessor$ProcessorDescriptor {
    abstract String getName();

    abstract boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment);

    abstract boolean want(ProcessingEnvironment processingEnvironment, List<String> list);

    AnnotationProcessor$ProcessorDescriptor() {
    }
}
