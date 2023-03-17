package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

//import static readProperties.ConfigurationManager.configuration;
import static readProperties.ConfigWebApplication.IsHeadless;
import static readProperties.ConfigWebApplication.readConfig;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }

    private ChromeOptions getOptions() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
//        options.setHeadless(readConfig().getBoolean(IsHeadless));;
        return options;
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
