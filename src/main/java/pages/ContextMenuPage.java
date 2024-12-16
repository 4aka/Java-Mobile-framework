package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ContextMenuPage extends BasePage{

    @AndroidFindBy(accessibility = "Long press me")
    public WebElement long_press_button;

    @AndroidFindBy(accessibility = "Fragment populating a context menu; long press the button to see.")
    public WebElement screen_title;

    @AndroidFindBy(className = "android.widget.ListView")
    public WebElement list_view;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Menu A\"]")
    public WebElement menu_a_option;

}
