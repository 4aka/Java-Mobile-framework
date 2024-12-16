package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static framework.InitDriver.getDriver;

public class DataWidgetsPage extends BasePage {

    @AndroidFindBy(accessibility = "1. Dialog")
    public WebElement dialogue_button;

    @AndroidFindBy(id = "io.appium.android.apis:id/pickTime")
    public WebElement pick_time;

    @AndroidFindBy(id = "android:id/hours")
    public WebElement hours;

    @AndroidFindBy(id = "android:id/minutes")
    public WebElement minutes;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement ok_button;

    @AndroidFindBy(accessibility = "2. Inline")
    public WebElement inline_button;

    @AndroidFindBy(id = "android:id/toggle_mode")
    public WebElement keyboard;

    @AndroidFindBy(id = "android:id/input_hour")
    public WebElement hours_text_field;

    @AndroidFindBy(id = "android:id/input_minute")
    public WebElement minutes_text_fields;


    public int getNewHoursValue(int hoursValue) {
        int newHour;

        if (hoursValue > 0 && hoursValue < 6) {
            newHour = 6 - hoursValue;
        } else {
            newHour = 12 - hoursValue;
        }
        return newHour;
    }

    public int getNewMinutesValue(int minutesValue) {
        int newMinute;

        if (minutesValue % 5 == 0) {
            newMinute = minutesValue + 5;
        } else {
            newMinute = 30;
        }
        return newMinute;
    }

    public void pickNewHours(int newHour) {
        WebElement newHoursValue = getDriver().findElement(AppiumBy.accessibilityId(String.valueOf(newHour)));
        newHoursValue.click();
    }

    public void pickNewMinutes(int newMinute) {
        WebElement newMinutesValue = getDriver().findElement(AppiumBy.accessibilityId(String.valueOf(newMinute)));
        newMinutesValue.click();
    }
}
