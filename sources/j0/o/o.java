package j0.o;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: RxJavaPlugins.java */
/* JADX INFO: loaded from: classes3.dex */
public class o {
    public static final o a = new o();
    public final AtomicReference<j0.o.b> c = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0.o.b f3802b = new a();
    public final AtomicReference<m> d = new AtomicReference<>();
    public final AtomicReference<q> e = new AtomicReference<>();
    public final AtomicReference<j0.o.a> f = new AtomicReference<>();
    public final AtomicReference<p> g = new AtomicReference<>();

    /* JADX INFO: compiled from: RxJavaPlugins.java */
    public final class a extends j0.o.b {
    }

    /* JADX INFO: compiled from: RxJavaPlugins.java */
    public class b extends j0.o.a {
        public b(o oVar) {
        }
    }

    public j0.o.a a() {
        if (this.f.get() == null) {
            Object objD = d(j0.o.a.class, g());
            if (objD == null) {
                this.f.compareAndSet(null, new b(this));
            } else {
                this.f.compareAndSet(null, (j0.o.a) objD);
            }
        }
        return this.f.get();
    }

    public j0.o.b b() {
        if (this.c.get() == null) {
            Object objD = d(j0.o.b.class, g());
            if (objD == null) {
                this.c.compareAndSet(null, f3802b);
            } else {
                this.c.compareAndSet(null, (j0.o.b) objD);
            }
        }
        return this.c.get();
    }

    public m c() {
        if (this.d.get() == null) {
            Object objD = d(m.class, g());
            if (objD == null) {
                this.d.compareAndSet(null, n.a);
            } else {
                this.d.compareAndSet(null, (m) objD);
            }
        }
        return this.d.get();
    }

    public static Object d(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            try {
                for (Map.Entry entry : properties2.entrySet()) {
                    String string = entry.getKey().toString();
                    if (string.startsWith("rxjava.plugin.") && string.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                        String str = "rxjava.plugin." + string.substring(0, string.length() - 6).substring(14) + ".impl";
                        property = properties2.getProperty(str);
                        if (property != null) {
                            break;
                        }
                        throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e2) {
            throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e2);
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException(b.d.b.a.a.y(simpleName, " implementation class not found: ", property), e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(b.d.b.a.a.y(simpleName, " implementation not able to be accessed: ", property), e4);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(b.d.b.a.a.y(simpleName, " implementation not able to be instantiated: ", property), e5);
        }
    }

    public p e() {
        if (this.g.get() == null) {
            Object objD = d(p.class, g());
            if (objD == null) {
                this.g.compareAndSet(null, p.a);
            } else {
                this.g.compareAndSet(null, (p) objD);
            }
        }
        return this.g.get();
    }

    public q f() {
        if (this.e.get() == null) {
            Object objD = d(q.class, g());
            if (objD == null) {
                this.e.compareAndSet(null, r.a);
            } else {
                this.e.compareAndSet(null, (q) objD);
            }
        }
        return this.e.get();
    }

    public static Properties g() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }
}
