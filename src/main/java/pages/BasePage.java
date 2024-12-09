package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static framework.InitDriver.getDriver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

}
