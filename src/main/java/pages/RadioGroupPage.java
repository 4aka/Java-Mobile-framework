package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class RadioGroupPage extends BasePage{

    @AndroidFindBy(id = "io.appium.android.apis:id/menu")
    public WebElement menu;

    @AndroidFindBy(id = "io.appium.android.apis:id/snack")
    public WebElement snackButton;

    @AndroidFindBy(id = "io.appium.android.apis:id/breakfast")
    public WebElement breakfastButton;

    @AndroidFindBy(id = "io.appium.android.apis:id/choice")
    public WebElement choiceMessage;

    @AndroidFindBy(id = "io.appium.android.apis:id/dinner")
    public WebElement dinnerButton;

    @AndroidFindBy(id = "io.appium.android.apis:id/clear")
    public WebElement clearButton;

}
