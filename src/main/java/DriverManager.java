import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverManager {
    public static WebDriver createDriver(){
        ChromeDriver driver = new ChromeDriver();
        return driver;
    }

}
