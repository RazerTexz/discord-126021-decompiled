package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import d0.z.d.Intrinsics3;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: androidx.core.graphics.ImageDecoderKt, reason: use source file name */
/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageDecoder {

    /* JADX INFO: renamed from: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1, reason: invalid class name */
    /* JADX INFO: compiled from: ImageDecoder.kt */
    public final class AnonymousClass1 implements android.graphics.ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ Function3<android.graphics.ImageDecoder, android.graphics.ImageDecoder.ImageInfo, android.graphics.ImageDecoder.Source, Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, Unit> function3) {
            this.$action = function3;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
            Intrinsics3.checkNotNullParameter(imageDecoder, "decoder");
            Intrinsics3.checkNotNullParameter(imageInfo, "info");
            Intrinsics3.checkNotNullParameter(source, "source");
            this.$action.invoke(imageDecoder, imageInfo, source);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1, reason: invalid class name */
    /* JADX INFO: compiled from: ImageDecoder.kt */
    public final class AnonymousClass1 implements android.graphics.ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ Function3<android.graphics.ImageDecoder, android.graphics.ImageDecoder.ImageInfo, android.graphics.ImageDecoder.Source, Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, Unit> function3) {
            this.$action = function3;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
            Intrinsics3.checkNotNullParameter(imageDecoder, "decoder");
            Intrinsics3.checkNotNullParameter(imageInfo, "info");
            Intrinsics3.checkNotNullParameter(source, "source");
            this.$action.invoke(imageDecoder, imageInfo, source);
        }
    }

    @RequiresApi(28)
    public static final Bitmap decodeBitmap(android.graphics.ImageDecoder.Source source, Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, Unit> function3) throws IOException {
        Intrinsics3.checkNotNullParameter(source, "<this>");
        Intrinsics3.checkNotNullParameter(function3, "action");
        Bitmap bitmapDecodeBitmap = android.graphics.ImageDecoder.decodeBitmap(source, new AnonymousClass1(function3));
        Intrinsics3.checkNotNullExpressionValue(bitmapDecodeBitmap, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Bitmap {\n    return ImageDecoder.decodeBitmap(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
        return bitmapDecodeBitmap;
    }

    @RequiresApi(28)
    public static final Drawable decodeDrawable(android.graphics.ImageDecoder.Source source, Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, Unit> function3) throws IOException {
        Intrinsics3.checkNotNullParameter(source, "<this>");
        Intrinsics3.checkNotNullParameter(function3, "action");
        Drawable drawableDecodeDrawable = android.graphics.ImageDecoder.decodeDrawable(source, new AnonymousClass1(function3));
        Intrinsics3.checkNotNullExpressionValue(drawableDecodeDrawable, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Drawable {\n    return ImageDecoder.decodeDrawable(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
        return drawableDecodeDrawable;
    }
}
