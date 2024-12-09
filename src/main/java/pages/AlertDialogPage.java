package pages;

import enums.Digits;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static framework.InitDriver.getDriver;


public class AlertDialogPage extends BasePage{

    @AndroidFindBy(accessibility = "App")
    public WebElement app_button;

    @AndroidFindBy(accessibility = "Alert Dialogs")
    public WebElement alert_dialogue;

    @AndroidFindBy(accessibility = "OK Cancel dialog with a message")
    public WebElement ok_cancel_dialog_with_message;

    @AndroidFindBy(id = "android:id/alertTitle")
    public WebElement dialog_window_message;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement dialog_window_Ok_button;

    @AndroidFindBy(id = "android:id/button2")
    public WebElement dialog_window_cancel_button;

    @AndroidFindBy(id = "android:id/alertTitle")
    public WebElement alert_title;

    @AndroidFindBy(id = "android:id/alertTitle")
    public WebElement list_dialogue_title;

    @AndroidFindBy(accessibility = "List dialog")
    public WebElement list_dialogue_button;

    @AndroidFindBy(id = "android:id/message")
    public WebElement list_dialogue_message;


    final public String okCancelDialogWithMessageText =
            "Lorem ipsum dolor sit aie consectetur adipiscing\n" +
                    "Plloaso mako nuto siwuf cakso dodtos anr koop.";


    public void openDialogs() {
        app_button.click();
        alert_dialogue.click();
    }

    public void openOkCancelDialogWithMessage() {
        ok_cancel_dialog_with_message.click();
    }

    public void selectItem(int elementNumber) {
        String path = "//android.widget.TextView[@index='" + elementNumber + "']";
        getDriver().findElement(AppiumBy.xpath(path)).click();
    }

    public String getListDialogueMessage(int elementNumber) {
        return "You selected: " + elementNumber + " , Command " + Digits.values()[elementNumber + 1];
    }

}
