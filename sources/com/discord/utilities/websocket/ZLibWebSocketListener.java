package com.discord.utilities.websocket;

import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.discord.models.domain.ModelAuditLogEntry;
import d0.y.b;
import d0.y.i;
import d0.z.d.m;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
import okhttp3.Response;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* JADX INFO: compiled from: ZLibWebSocketListener.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ZLibWebSocketListener extends WebSocketListener {
    private final Inflater inflater;
    private final Listener listener;
    private final Inflater loggingInflater;

    /* JADX INFO: compiled from: ZLibWebSocketListener.kt */
    public abstract class Listener extends WebSocketListener {
        private final RawMessageHandler rawMessageHandler;

        public RawMessageHandler getRawMessageHandler() {
            return this.rawMessageHandler;
        }

        public abstract void onInflateError(Exception e);

        public abstract void onInflatedMessage(okhttp3.WebSocket webSocket, InputStreamReader reader, int compressedByteLength);

        @Override // okhttp3.WebSocketListener
        public final void onMessage(okhttp3.WebSocket webSocket, ByteString bytes) {
            m.checkNotNullParameter(webSocket, "webSocket");
            m.checkNotNullParameter(bytes, "bytes");
            throw new UnsupportedOperationException();
        }

        @Override // okhttp3.WebSocketListener
        public final void onMessage(okhttp3.WebSocket webSocket, String text) {
            m.checkNotNullParameter(webSocket, "webSocket");
            m.checkNotNullParameter(text, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: ZLibWebSocketListener.kt */
    public final class ZLibByteStream extends ByteArrayOutputStream {
        private static final int INFLATE_BUFFER_SIZE = 4096;
        private static final int INITIAL_BUFFER_SIZE_MULTIPLIER = 2;
        private static final CharsetDecoder UTF8_DECODER = Charset.forName(Constants.ENCODING).newDecoder();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ZLibByteStream(ByteString byteString, Inflater inflater) throws IOException {
            super(byteString.j() * 2);
            m.checkNotNullParameter(byteString, "bytes");
            m.checkNotNullParameter(inflater, "inflater");
            InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(this, inflater, 4096);
            byteString.r(inflaterOutputStream);
            inflaterOutputStream.flush();
        }

        public final InputStreamReader toReader() {
            return new InputStreamReader(new ByteArrayInputStream(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count), UTF8_DECODER);
        }
    }

    public ZLibWebSocketListener(Listener listener) {
        m.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.loggingInflater = new Inflater();
        this.inflater = new Inflater();
    }

    public final Listener getListener() {
        return this.listener;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(okhttp3.WebSocket webSocket, int code, String reason) {
        m.checkNotNullParameter(webSocket, "webSocket");
        m.checkNotNullParameter(reason, ModelAuditLogEntry.CHANGE_KEY_REASON);
        resetInflaters();
        this.listener.onClosed(webSocket, code, reason);
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(okhttp3.WebSocket webSocket, int code, String reason) {
        m.checkNotNullParameter(webSocket, "webSocket");
        m.checkNotNullParameter(reason, ModelAuditLogEntry.CHANGE_KEY_REASON);
        resetInflaters();
        this.listener.onClosing(webSocket, code, reason);
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(okhttp3.WebSocket webSocket, Throwable t, Response response) {
        m.checkNotNullParameter(webSocket, "webSocket");
        m.checkNotNullParameter(t, "t");
        resetInflaters();
        this.listener.onFailure(webSocket, t, response);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(okhttp3.WebSocket webSocket, String text) {
        m.checkNotNullParameter(webSocket, "webSocket");
        m.checkNotNullParameter(text, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        this.listener.onMessage(webSocket, text);
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(okhttp3.WebSocket webSocket, Response response) {
        m.checkNotNullParameter(webSocket, "webSocket");
        m.checkNotNullParameter(response, "response");
        resetInflaters();
        this.listener.onOpen(webSocket, response);
    }

    private final void resetInflaters() {
        this.inflater.reset();
        this.loggingInflater.reset();
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(okhttp3.WebSocket webSocket, ByteString bytes) throws IllegalAccessException, IOException, InvocationTargetException {
        m.checkNotNullParameter(webSocket, "webSocket");
        m.checkNotNullParameter(bytes, "bytes");
        if (this.listener.getRawMessageHandler() != null) {
            try {
                InputStreamReader reader = new ZLibByteStream(bytes, this.loggingInflater).toReader();
                try {
                    String text = i.readText(reader);
                    RawMessageHandler rawMessageHandler = this.listener.getRawMessageHandler();
                    m.checkNotNull(rawMessageHandler);
                    rawMessageHandler.onRawMessage(text);
                    b.closeFinally(reader, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.closeFinally(reader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                RawMessageHandler rawMessageHandler2 = this.listener.getRawMessageHandler();
                m.checkNotNull(rawMessageHandler2);
                rawMessageHandler2.onRawMessageInflateFailed(th3);
            }
        }
        try {
            InputStreamReader reader2 = new ZLibByteStream(bytes, this.inflater).toReader();
            try {
                this.listener.onInflatedMessage(webSocket, reader2, bytes.j());
                b.closeFinally(reader2, null);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    b.closeFinally(reader2, th4);
                    throw th5;
                }
            }
        } catch (Exception e) {
            this.listener.onInflateError(e);
        }
    }
}
