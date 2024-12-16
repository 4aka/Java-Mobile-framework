package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static framework.InitDriver.getDriver;

public class AppMenuPage extends BasePage{

    @AndroidFindBy(accessibility = "Inflate from XML")
    public WebElement inflate_from_xml_button;

    @AndroidFindBy(id = "android:id/text1")
    public WebElement text_1;

    @AndroidFindBy(accessibility = "More options")
    public WebElement more_options;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Happy']")
    public WebElement happy_option;

    @AndroidFindBy(xpath = "io.appium.android.apis:id/spinner")
    public WebElement spinner;


    public WebElement textViewListValue(int idx) {
        return getDriver().findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@index='" + idx + "']"));
    }

    public WebElement layoutListValue(int idx) {
        return getDriver().findElement(AppiumBy.xpath("//android.widget.LinearLayout[@index='" + idx + "']"));
    }
}
