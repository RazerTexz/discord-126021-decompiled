package com.discord.utilities.textprocessing;

import b.a.t.b.c.NodeProcessor;
import com.discord.simpleast.core.node.Node;
import com.discord.utilities.textprocessing.node.Spoilerable;

/* JADX INFO: renamed from: com.discord.utilities.textprocessing.MessagePreprocessor$processSpoilerChildren$3$1, reason: use source file name */
/* JADX INFO: compiled from: MessagePreprocessor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MessagePreprocessor2 implements NodeProcessor {
    public static final MessagePreprocessor2 INSTANCE = new MessagePreprocessor2();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.a.t.b.c.NodeProcessor
    public final void processNode(Node<Object> node) {
        if (node instanceof Spoilerable) {
            ((Spoilerable) node).setRevealed(false);
        }
    }
}
