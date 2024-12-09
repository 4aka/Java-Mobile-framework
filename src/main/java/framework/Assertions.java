package framework;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Assertions {

    public static boolean isElementDisplayedSoft(WebElement element) {
        boolean result = true;

        try {
            element.isDisplayed();
        } catch (NoSuchElementException ignored) {
            result = false;
        }
        return result;
    }
}
