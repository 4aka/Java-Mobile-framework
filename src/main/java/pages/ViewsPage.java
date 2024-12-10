package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ViewsPage extends BasePage{

    @AndroidFindBy(className = "android.widget.LinearLayout")
    public WebElement linear_layout;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[@index='0']")
    public WebElement line_with_time;

}
