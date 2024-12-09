package framework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.MalformedURLException;
import java.net.URL;

public class InitDriver {

    private static AndroidDriver driver;
    public static String projectDir = System.getProperty("user.dir") + "\\";
    private static AppiumDriverLocalService service;

    private static void setupDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName(Config.androidDeviceName)
                .setPlatformName(Config.androidPlatformName)
                .setAutomationName(Config.appiumAutomationName)
                .setUdid(Config.androidUdid)
                .setAvd(Config.androidAvd)
                .setApp(projectDir + Config.appName);

        driver = new AndroidDriver(new URL(Config.appiumURL), options);
    }

    public static AndroidDriver getDriver() {

        if (driver == null) {
            try {
                setupDriver();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver;
    }

    public static void startAppium(){
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service: " + service_url + " is running!");
    }

    public static void stopAppium(){
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service: " + service_url + " is stopped!");
        service.stop();
    }

}
