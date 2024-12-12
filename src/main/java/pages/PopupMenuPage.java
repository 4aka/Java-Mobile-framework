package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PopupMenuPage extends BasePage{

    @AndroidFindBy(accessibility = "Make a Popup!")
    public WebElement make_a_popup;

    @AndroidFindBy(className = "android.widget.ListView")
    public WebElement popup_list;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Search']")
    public WebElement search_option;

    @AndroidFindBy(className = "android.widget.Button")
    public WebElement make_a_popup_button;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Edit']")
    public WebElement edit_option;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Share']")
    public WebElement share_option;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public WebElement toast;


}
