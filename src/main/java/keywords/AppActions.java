package keywords;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import static framework.InitDriver.getDriver;

public class AppActions {

    public static WebElement scrollToElement(String text) {
        return getDriver().findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                + "new UiSelector().textContains(\"" + text + "\"));"));
    }

    public static void clickByCoordinates(int x, int y) {
        implicitlyWait(2);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence sequence = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(150)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        getDriver().perform(Collections.singletonList(sequence));
    }

    public static void implicitlyWait(int seconds) {
        getDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static void longClick(WebElement e) {
        new org.openqa.selenium.interactions.Actions(getDriver()).clickAndHold(e).perform();
    }

    public static void hideKeyboard() {
        getDriver().hideKeyboard();
    }

    public static String getPageSource() {
        return getDriver().getPageSource();
    }

}
