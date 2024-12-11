package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import keywords.Actions;
import org.openqa.selenium.WebElement;

public class TabsPage extends BasePage{

    @AndroidFindBy(accessibility = "1. Content By Id")
    public WebElement content_by_id;

    @AndroidFindBy(id = "android:id/tabs")
    public WebElement tabs_bar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TAB1']")
    public WebElement tab_one;

    @AndroidFindBy(id = "io.appium.android.apis:id/view1")
    public WebElement tab_one_view;

    @AndroidFindBy(accessibility = "3. Content By Intent")
    public WebElement content_by_intent;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='PHOTO LIST']")
    public WebElement photo_list;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@text=\"New photo\"]")
    public WebElement new_photo;

    @AndroidFindBy(className = "android.widget.ImageView")
    public WebElement image_view;

    public void clickNewPhotoByCoordinates() {
        Actions.clickByCoordinates(150, 625);
    }

}
