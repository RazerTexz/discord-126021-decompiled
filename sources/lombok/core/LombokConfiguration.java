package lombok.core;

import java.net.URI;
import java.util.Collections;
import lombok.core.configuration.BubblingConfigurationResolver;
import lombok.core.configuration.ConfigurationFileToSource;
import lombok.core.configuration.ConfigurationKey;
import lombok.core.configuration.ConfigurationParser;
import lombok.core.configuration.ConfigurationProblemReporter;
import lombok.core.configuration.ConfigurationResolver;
import lombok.core.configuration.ConfigurationResolverFactory;
import lombok.core.configuration.FileSystemSourceCache;

/* JADX INFO: loaded from: discord-126021.apk:lombok/core/LombokConfiguration.SCL.lombok */
public class LombokConfiguration {
    private static ConfigurationResolverFactory configurationResolverFactory;
    private static final ConfigurationResolver NULL_RESOLVER = new AnonymousClass1();
    private static FileSystemSourceCache cache = new FileSystemSourceCache();

    /* JADX INFO: renamed from: lombok.core.LombokConfiguration$1, reason: invalid class name */
    /* JADX INFO: loaded from: discord-126021.apk:lombok/core/LombokConfiguration$1.SCL.lombok */
    class AnonymousClass1 implements ConfigurationResolver {
        AnonymousClass1() {
        }

        @Override // lombok.core.configuration.ConfigurationResolver
        public <T> T resolve(ConfigurationKey<T> configurationKey) {
            if (configurationKey.getType().isList()) {
                return (T) Collections.emptyList();
            }
            return null;
        }
    }

    static /* synthetic */ ConfigurationResolver access$0() {
        return NULL_RESOLVER;
    }

    static {
        if (System.getProperty("lombok.disableConfig") != null) {
            configurationResolverFactory = new AnonymousClass2();
        } else {
            configurationResolverFactory = createFileSystemBubblingResolverFactory();
        }
    }

    static /* synthetic */ FileSystemSourceCache access$1() {
        return cache;
    }

    /* JADX INFO: renamed from: lombok.core.LombokConfiguration$2, reason: invalid class name */
    /* JADX INFO: loaded from: discord-126021.apk:lombok/core/LombokConfiguration$2.SCL.lombok */
    class AnonymousClass2 implements ConfigurationResolverFactory {
        AnonymousClass2() {
        }

        @Override // lombok.core.configuration.ConfigurationResolverFactory
        public ConfigurationResolver createResolver(URI sourceLocation) {
            return LombokConfiguration.access$0();
        }
    }

    private LombokConfiguration() {
    }

    public static void overrideConfigurationResolverFactory(ConfigurationResolverFactory crf) {
        configurationResolverFactory = crf == null ? createFileSystemBubblingResolverFactory() : crf;
    }

    static <T> T read(ConfigurationKey<T> configurationKey, AST<?, ?, ?> ast) {
        return (T) read(configurationKey, ast.getAbsoluteFileLocation());
    }

    public static <T> T read(ConfigurationKey<T> configurationKey, URI uri) {
        return (T) configurationResolverFactory.createResolver(uri).resolve(configurationKey);
    }

    /* JADX INFO: renamed from: lombok.core.LombokConfiguration$3, reason: invalid class name */
    /* JADX INFO: loaded from: discord-126021.apk:lombok/core/LombokConfiguration$3.SCL.lombok */
    class AnonymousClass3 implements ConfigurationResolverFactory {
        private final /* synthetic */ ConfigurationFileToSource val$fileToSource;

        AnonymousClass3(ConfigurationFileToSource configurationFileToSource) {
            this.val$fileToSource = configurationFileToSource;
        }

        @Override // lombok.core.configuration.ConfigurationResolverFactory
        public ConfigurationResolver createResolver(URI sourceLocation) {
            return new BubblingConfigurationResolver(LombokConfiguration.access$1().forUri(sourceLocation), this.val$fileToSource);
        }
    }

    private static ConfigurationResolverFactory createFileSystemBubblingResolverFactory() {
        ConfigurationFileToSource fileToSource = cache.fileToSource(new ConfigurationParser(ConfigurationProblemReporter.CONSOLE));
        return new AnonymousClass3(fileToSource);
    }
}
