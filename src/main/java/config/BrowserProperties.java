package config;

import static java.lang.System.setProperty;

public class BrowserProperties {
    public static void setUpWebBrowser(String webBrowser) {
        setProperty("selenide.browser", webBrowser);
    }
}