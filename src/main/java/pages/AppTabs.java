package pages;

import enums.ViewTabs;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static keywords.AppActions.*;

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

    @AndroidFindBy(accessibility = "Fragment")
    public WebElement fragment;

    @AndroidFindBy(accessibility = "Context Menu")
    public WebElement context_menu;

    @AndroidFindBy(accessibility = "Picker")
    public WebElement picker;

    @AndroidFindBy(accessibility = "Date Widgets")
    public WebElement date_widgets;

    @AndroidFindBy(accessibility = "Hide and Show")
    public WebElement hide_and_show;

    @AndroidFindBy(accessibility = "Menu")
    public WebElement app_menu;


    public void openApp() {
        app_button.click();
    }

    public void openDialogs() {
        openApp();
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

    public void openContextMenu() {
        openApp();
        fragment.click();
        context_menu.click();
    }

    public void openPicker() {
        openViews();
        scrollToElement(ViewTabs.PICKER.getTab());
        picker.click();
    }

    public void openDateWidget() {
        openViews();
        scrollToElement(ViewTabs.DATE_WIDGETS.getTab());
        date_widgets.click();
    }

    public void openHideAndShowTab() {
        openApp();
        fragment.click();
        hide_and_show.click();
    }

    public void openAppMenu() {
        openApp();
        app_menu.click();
    }
}
