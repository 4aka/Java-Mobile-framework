package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PickerPage extends BasePage{


    @AndroidFindBy(className = "android.widget.NumberPicker")
    public WebElement number_picker;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='测试']")
    public WebElement picker_option;

    @AndroidFindBy(id = "android:id/numberpicker_input")
    public WebElement picker_input;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='テスト']")
    public WebElement picker_option_name;

    @AndroidFindBy(id = "io.appium.android.apis:id/textView1")
    public WebElement message_value;

}
