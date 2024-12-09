package framework;

public class Config {

    public static int timeout = Integer.parseInt(PropertyLoader.getProperty("timeout"));

    public static String appiumURL = PropertyLoader.getProperty("appium.url");
    public static String appiumAutomationName = PropertyLoader.getProperty("appium.automationName");
    public static String androidDeviceName = PropertyLoader.getProperty("android.deviceName");
    public static String androidUdid = PropertyLoader.getProperty("android.udid");
    public static String androidPlatformName = PropertyLoader.getProperty("android.platformName");
    public static String androidPlatformVersion = PropertyLoader.getProperty("android.platformVersion");
    public static String androidAvd = PropertyLoader.getProperty("android.avd");
    public static String appName = PropertyLoader.getProperty("app.name");

}

