package com.discord.widgets.channels;

import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.widget.TextView;
import com.discord.models.member.GuildMember;
import com.discord.utilities.dimen.DimenUtils;
import com.discord.views.PileView;
import d0.g0.StringsJVM;
import d0.t._Collections;
import d0.z.d.Intrinsics3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserAkaView$configure$$inlined$doOnPreDraw$1 implements Runnable {
    public final /* synthetic */ List $guildMembers$inlined;
    public final /* synthetic */ View $this_doOnPreDraw;
    public final /* synthetic */ UserAkaView this$0;

    public UserAkaView$configure$$inlined$doOnPreDraw$1(View view, UserAkaView userAkaView, List list) {
        this.$this_doOnPreDraw = view;
        this.this$0 = userAkaView;
        this.$guildMembers$inlined = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Number numberValueOf;
        List list = this.$guildMembers$inlined;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String nick = ((GuildMember) it.next()).getNick();
            if (nick != null) {
                arrayList.add(nick);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!StringsJVM.isBlank((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (this.this$0.getPileItems().isEmpty()) {
            TextView textView = UserAkaView.access$getBinding$p(this.this$0).e;
            Intrinsics3.checkNotNullExpressionValue(textView, "binding.spaceForMeasuring");
            numberValueOf = Float.valueOf(textView.getMeasuredWidth());
        } else {
            numberValueOf = Integer.valueOf(DimenUtils.dpToPixels(8));
        }
        TextView textView2 = UserAkaView.access$getBinding$p(this.this$0).f2162b;
        Intrinsics3.checkNotNullExpressionValue(textView2, "binding.akaText");
        float measuredWidth = textView2.getMeasuredWidth();
        PileView pileView = UserAkaView.access$getBinding$p(this.this$0).c;
        Intrinsics3.checkNotNullExpressionValue(pileView, "binding.avatarsPileView");
        float fFloatValue = numberValueOf.floatValue() + measuredWidth + pileView.getMeasuredWidth();
        SpannableString spannableString = new SpannableString(_Collections.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62, null));
        spannableString.setSpan(new LeadingMarginSpan.Standard((int) fFloatValue, 0), 0, spannableString.length(), 33);
        TextView textView3 = UserAkaView.access$getBinding$p(this.this$0).d;
        Intrinsics3.checkNotNullExpressionValue(textView3, "binding.nicknames");
        textView3.setText(spannableString);
        TextView textView4 = UserAkaView.access$getBinding$p(this.this$0).d;
        Intrinsics3.checkNotNullExpressionValue(textView4, "binding.nicknames");
        textView4.setVisibility(arrayList2.isEmpty() ^ true ? 0 : 8);
    }
}
