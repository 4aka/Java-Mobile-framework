package pages;

import enums.ViewTabs;
import io.appium.java_client.pagefactory.AndroidFindBy;
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

    @AndroidFindBy(accessibility = "Radio Group")
    public WebElement radio_group;

    @AndroidFindBy(accessibility = "Popup Menu")
    public WebElement popup_menu;


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

    public void openRadioGroup() {
        openViews();
        scrollToElement(ViewTabs.RADIO_GROUP.getTab());
        radio_group.click();
    }

    public void openPopupMenu() {
        openViews();
        scrollToElement(ViewTabs.POPUP_MENU.getTab());
        popup_menu.click();
    }
}
