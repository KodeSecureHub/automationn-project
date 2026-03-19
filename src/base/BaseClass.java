package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
    public WebDriver driver;

    public void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");
    }

    public void closeBrowser() {
        driver.quit();
    }
}