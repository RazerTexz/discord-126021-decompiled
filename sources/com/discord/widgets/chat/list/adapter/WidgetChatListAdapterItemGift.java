jadx.core.utils.exceptions.JadxRuntimeException: Failed to generate code for class: com.discord.widgets.chat.list.adapter.WidgetChatListAdapterItemGift
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:133)
	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code generation error
	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:55)
	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
	at jadx.core.ProcessClass.process(ProcessClass.java:89)
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
	... 3 more
Caused by: java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
	at jadx.core.dex.nodes.ClassNode.searchField(ClassNode.java:547)
	at jadx.core.dex.nodes.RootNode.resolveField(RootNode.java:653)
	at jadx.core.codegen.InsnGen.makeStaticFieldAccess(InsnGen.java:234)
	at jadx.core.codegen.AnnotationGen.encodeValue(AnnotationGen.java:194)
	at jadx.core.codegen.AnnotationGen.encodeValue(AnnotationGen.java:207)
	at jadx.core.codegen.AnnotationGen.formatAnnotation(AnnotationGen.java:101)
	at jadx.core.codegen.AnnotationGen.add(AnnotationGen.java:75)
	at jadx.core.codegen.AnnotationGen.addForClass(AnnotationGen.java:40)
	at jadx.core.codegen.ClassGen.addClassDeclaration(ClassGen.java:183)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:162)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:107)
	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
	... 7 more

