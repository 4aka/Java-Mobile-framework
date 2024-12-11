package pages;

import enums.ViewTabs;
import io.appium.java_client.pagefactory.AndroidFindBy;
import keywords.Actions;
import org.openqa.selenium.WebElement;

import static enums.ViewTabs.*;
import static keywords.Actions.*;

public class ViewsPage extends BasePage{

    @AndroidFindBy(className = "android.widget.LinearLayout")
    public WebElement linear_layout;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[@index='0']")
    public WebElement line_with_time;

    public void openTextClock() {
        WebElement textClock = scrollToElement(TEXT_CLOCK.getTab());
        textClock.click();
    }
}
