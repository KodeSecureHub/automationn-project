package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

    public WebDriver driver;

    // Setup method (browser launch)
    public void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");
    }

    // Close browser
    public void closeBrowser() {
        driver.quit();
    }
}