package keywords;

import framework.Config;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static framework.InitDriver.getDriver;

@Log4j2
public class Waiters {

    public static boolean waitUntilVisible(WebElement element) {
        try {
            new FluentWait<>(getDriver())
                    .withTimeout(Duration.ofSeconds(Config.timeout))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public static WebElement waitUntilVisibleElement(WebElement element) {
        try {
            new FluentWait<>(getDriver())
                    .withTimeout(Duration.ofSeconds(Config.timeout))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            return element;
        }
        return element;
    }

    public static boolean waitUntilVisible(WebElement element, int timeout) {

        try {
            new FluentWait<>(getDriver())
                    .withTimeout(Duration.ofSeconds(timeout))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public static boolean waitUntilClickable(WebElement element) {

        try {
            new FluentWait<>(getDriver())
                    .withTimeout(Duration.ofSeconds(Config.timeout))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

}
