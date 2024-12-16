import com.github.javafaker.Faker;
import keywords.AppActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppTabs;
import pages.DataWidgetsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DateWidgetsTest extends BaseTest {

    private AppTabs tab;
    private DataWidgetsPage page;
    Faker faker = new Faker();

    @BeforeMethod
    public void setup() {
        tab = new AppTabs();
        page = new DataWidgetsPage();

        tab.openDateWidget();
    }


    @Test(priority = 1)
    public void setNewTimeDialog () {
        page.dialogue_button.click();
        page.pick_time.click();

        int hoursValue = Integer.parseInt(page.hours.getText());
        int newHour = page.getNewHoursValue(hoursValue);
        page.pickNewHours(newHour);

        int minutesValue = Integer.parseInt(page.minutes.getText());
        int newMinute = page.getNewMinutesValue(minutesValue);
        page.pickNewMinutes(newMinute);

        assertThat(page.hours.getText(), equalTo(String.valueOf(newHour)));
        assertThat(page.minutes.getText(), equalTo(String.valueOf(newMinute)));
    }

    @Test(priority = 2)
    public void setNewTimeInline() {
        page.inline_button.click();
        page.keyboard.click();

        page.hours_text_field.click();
        int randomHour = faker.number().numberBetween(0, 12);
        page.hours_text_field.sendKeys(String.valueOf(randomHour));

        page.minutes_text_fields.click();
        int randomMinute = faker.number().numberBetween(0, 60);
        page.minutes_text_fields.sendKeys(String.valueOf(randomMinute));

        AppActions.hideKeyboard();

        assertThat(page.hours_text_field.getText(), equalTo(String.valueOf(randomHour)));
        assertThat(page.minutes_text_fields.getText(), equalTo(String.valueOf(randomMinute)));
    }

}
