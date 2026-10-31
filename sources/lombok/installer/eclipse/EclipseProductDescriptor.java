package lombok.installer.eclipse;

import java.net.URL;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: discord-126021.apk:lombok/installer/eclipse/EclipseProductDescriptor.SCL.lombok */
public interface EclipseProductDescriptor {
    String getDirectoryName();

    List<String> getExecutableNames();

    URL getIdeIcon();

    String getIniFileName();

    Pattern getLocationSelectors();

    String getMacAppName();

    String getProductName();

    List<String> getSourceDirsOnMac();

    List<String> getSourceDirsOnUnix();

    List<String> getSourceDirsOnWindows();

    String getUnixAppName();

    String getWindowsExecutableName();
}
