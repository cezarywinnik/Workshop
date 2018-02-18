package config;

public class TestConfig {
    public static String CHROME_BROWSER = "Chrome";


    private static void setBrowser(String browser) {
        System.setProperty("selenide.browser", browser);
    }

    public static void setChrome() {
        setBrowser(CHROME_BROWSER);
    }
}
