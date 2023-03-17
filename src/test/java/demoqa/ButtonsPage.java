package demoqa;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigWebApplication;

public class ButtonsPage extends BaseSeleniumPage {
    @FindBy(xpath = "//*[@id='rightClickBtn']")
    private WebElement rightClickBtnXpath;

    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClickBtnId;

    @FindBy(id = "Kazir")
    private WebElement KazirBtnId;

    @FindBy(id = "item-8")
    private WebElement item8BtnId;

    public ButtonsPage() {
        driver.get(ConfigWebApplication.ButtonsPage);
//        driver.get("https://demoqa.com/buttons");
//        driver.get("https://demoqa.com/buttons");
        PageFactory.initElements(driver, this);
    }

    public ButtonsPage clickButton() {
        doubleClickBtnId.click();
        return this;
    }
}
