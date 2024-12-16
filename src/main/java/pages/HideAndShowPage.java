package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HideAndShowPage extends BasePage{

    @AndroidFindBy(id = "io.appium.android.apis:id/frag1hide")
    public WebElement button_1;

    @AndroidFindBy(id = "io.appium.android.apis:id/frag2hide")
    public WebElement hide_button_2;

    @AndroidFindBy(id = "io.appium.android.apis:id/fragment1")
    public WebElement textArea1;

    @AndroidFindBy(id = "io.appium.android.apis:id/fragment2")
    public WebElement textArea2;

}
