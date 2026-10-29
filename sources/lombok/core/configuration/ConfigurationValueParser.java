package lombok.core.configuration;

/* JADX INFO: loaded from: discord-126021.apk:lombok/core/configuration/ConfigurationValueParser.SCL.lombok */
interface ConfigurationValueParser {
    String description();

    String exampleValue();

    Object parse(String str);
}
