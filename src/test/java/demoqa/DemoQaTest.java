package demoqa;

import core.BaseSeleniumTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoQaTest extends BaseSeleniumTest {
    private MainPage mainPage;
    private ButtonsPage buttonsPage;

    @Test
    public void testMainGape() {
        mainPage = new MainPage().clickButtonWithElements();

    }
}