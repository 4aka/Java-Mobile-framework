package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AppTabs extends BasePage{

    @AndroidFindBy(accessibility = "App")
    public WebElement app_button;

    @AndroidFindBy(accessibility = "Alert Dialogs")
    public WebElement alert_dialogue;

    @AndroidFindBy(accessibility = "Views")
    public WebElement views;

    public void openDialogs() {
        app_button.click();
        alert_dialogue.click();
    }

    public void openViews() {
        views.click();
    }
}
