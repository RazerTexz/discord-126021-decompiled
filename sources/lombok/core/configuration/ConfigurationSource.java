package lombok.core.configuration;

import java.util.List;

/* JADX INFO: loaded from: discord-126021.apk:lombok/core/configuration/ConfigurationSource.SCL.lombok */
public interface ConfigurationSource {
    List<ConfigurationFile> imports();

    ConfigurationSource$Result resolve(ConfigurationKey<?> configurationKey);
}
