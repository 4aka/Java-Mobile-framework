import org.testng.annotations.*;
import pages.RadioGroupPage;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.*;

public class RadioGroupTest extends BaseTest {

    RadioGroupPage page = new RadioGroupPage();

    @BeforeClass
    public void setup() {
        tab.openRadioGroup();
    }

    @Test
    public void isListOfRadioButtonsDisplayed() {
        assertTrue(page.menu.isDisplayed());
    }

    @Test
    public void selectRadioButton() {
        page.snackButton.click();

        assertThat(page.snackButton.getAttribute("checked"), is("true"));
    }

    @Test
    public void checkMessageAboutSelectedButton() {
        page.breakfastButton.click();

        String breakfastMessageText = page.choiceMessage.getText();

        page.dinnerButton.click();
        String dinnerMessageText = page.choiceMessage.getText();

        assertThat(breakfastMessageText, is(not(equalTo(dinnerMessageText))));
    }

    @Test
    public void clearSelectedButton() {
        String noButtonSelectedMessage = "You have selected: (none)";

        page.clearButton.click();

        String message = page.choiceMessage.getText();

        assertThat(message, equalTo(noButtonSelectedMessage));
    }

}
