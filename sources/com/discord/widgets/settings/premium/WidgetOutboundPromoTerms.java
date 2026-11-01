package com.discord.widgets.settings.premium;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b.a.t.b.b.e;
import b.d.b.a.a;
import com.discord.R;
import com.discord.app.AppBottomSheet;
import com.discord.databinding.WidgetOutboundPromoTermsBinding;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.parser.Parser;
import com.discord.utilities.textprocessing.AstRenderer;
import com.discord.utilities.textprocessing.MessageParseState;
import com.discord.utilities.textprocessing.Rules;
import com.discord.utilities.textprocessing.node.UrlNode;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegate;
import com.discord.utilities.viewbinding.FragmentViewBindingDelegateKt;
import d0.z.d.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: WidgetOutboundPromoTerms.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetOutboundPromoTerms extends AppBottomSheet {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {a.d0(WidgetOutboundPromoTerms.class, "binding", "getBinding()Lcom/discord/databinding/WidgetOutboundPromoTermsBinding;", 0)};
    private static final String ARG_CONTENT = "ARG_CONTENT";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding;
    private final Parser<UrlNode.RenderContext, Node<UrlNode.RenderContext>, MessageParseState> parser;

    /* JADX INFO: renamed from: com.discord.widgets.settings.premium.WidgetOutboundPromoTerms$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetOutboundPromoTerms.kt */
    public final class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WidgetOutboundPromoTerms.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WidgetOutboundPromoTerms.kt */
    public final class Companion {
        private Companion() {
        }

        public final void show(String content, FragmentManager fragmentManager) {
            m.checkNotNullParameter(content, "content");
            m.checkNotNullParameter(fragmentManager, "fragmentManager");
            WidgetOutboundPromoTerms widgetOutboundPromoTerms = new WidgetOutboundPromoTerms();
            Bundle bundle = new Bundle();
            bundle.putString(WidgetOutboundPromoTerms.ARG_CONTENT, content);
            widgetOutboundPromoTerms.setArguments(bundle);
            widgetOutboundPromoTerms.show(fragmentManager, WidgetOutboundPromoTerms.class.getName());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WidgetOutboundPromoTerms() {
        super(false, 1, null);
        this.binding = FragmentViewBindingDelegateKt.viewBinding$default(this, WidgetOutboundPromoTerms$binding$2.INSTANCE, null, 2, null);
        Parser parser = new Parser(false, 1, null);
        Rules rules = Rules.INSTANCE;
        this.parser = parser.addRule(rules.createMaskedLinkRule()).addRule(rules.createUrlRule()).addRules(e.b(false, false, 3));
    }

    private final WidgetOutboundPromoTermsBinding getBinding() {
        return (WidgetOutboundPromoTermsBinding) this.binding.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    @Override // com.discord.app.AppBottomSheet
    public int getContentViewResId() {
        return R.layout.widget_outbound_promo_terms;
    }

    private final UrlNode.RenderContext getRenderContext() {
        return new WidgetOutboundPromoTerms$renderContext$1(this);
    }

    @Override // com.discord.app.AppBottomSheet, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        m.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().f2507b.setOnClickListener(new AnonymousClass1());
        String string = getArgumentsOrDefault().getString(ARG_CONTENT, "");
        Parser<UrlNode.RenderContext, Node<UrlNode.RenderContext>, MessageParseState> parser = this.parser;
        m.checkNotNullExpressionValue(string, "content");
        getBinding().c.setDraweeSpanStringBuilder(AstRenderer.render(Parser.parse$default(parser, string, MessageParseState.INSTANCE.getInitialState(), null, 4, null), getRenderContext()));
    }
}
