package keywords;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

import static framework.InitDriver.getDriver;

public class Actions {

    public static WebElement scrollToElement(String text) {
        return getDriver().findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                + "new UiSelector().textContains(\"" + text + "\"));"));
    }
}
