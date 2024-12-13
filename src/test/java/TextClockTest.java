import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppTabs;
import pages.ViewsPage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static framework.InitDriver.getDriver;
import static keywords.Waiters.waitUntilVisible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertTrue;

public class TextClockTest extends BaseTest{

    private AppTabs tab;
    private ViewsPage page;

    @BeforeMethod
    public void setup() {
        tab = new AppTabs();
        page = new ViewsPage();

        tab.openViews();
        page.openTextClock();
    }

    @Test
    public void textClockScreenIsDisplayed() {
        waitUntilVisible(page.linear_layout);

        assertTrue(page.linear_layout.isDisplayed());
    }

    @Test
    public void checkTheCurrentTimeWithoutSeconds() {
        // TODO use date time formatter
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("a");
        String text = date.format(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);

        // 2:12 PM
        // 2024-12-10T14:12:25+02:00
        assertThat(getDriver().getDeviceTime(), containsString(page.line_with_time.getText()));
    }

}
