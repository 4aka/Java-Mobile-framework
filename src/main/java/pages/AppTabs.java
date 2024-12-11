package pages;

import enums.ViewTabs;
import io.appium.java_client.pagefactory.AndroidFindBy;
import keywords.Actions;
import org.openqa.selenium.WebElement;

import static keywords.Actions.*;

public class AppTabs extends BasePage{

    @AndroidFindBy(accessibility = "App")
    public WebElement app_button;

    @AndroidFindBy(accessibility = "Alert Dialogs")
    public WebElement alert_dialogue;

    @AndroidFindBy(accessibility = "Views")
    public WebElement views;

    @AndroidFindBy(accessibility = "Tabs")
    public WebElement tabs;

    public void openDialogs() {
        app_button.click();
        alert_dialogue.click();
    }

    public void openViews() {
        views.click();
    }

    public void openTabs() {
        scrollToElement(ViewTabs.TABS.getTab());
        tabs.click();
    }
}
