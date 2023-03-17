package demoqa;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import readProperties.ConfigWebApplication;
import readProperties.ConfigurationManager;

public class MainPage extends BaseSeleniumPage {

    @FindBy(className = "avatar mx-auto white")
    private WebElement avatar;

    @FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]")
    private WebElement app;
    public MainPage() {
//        driver.get(ConfigWebApplication.MainPage);
        driver.get(ConfigurationManager.configuration().MainURL());
        PageFactory.initElements(driver, this);
    }

    public MainPage clickButtonWithElements() {
        app.click();
//        ;
        return this;
    }


}
