package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LoginTestClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/account/signonForm");
        LoginBaseClass.userName(driver).clear();
        LoginBaseClass.userName(driver).sendKeys("kodi");
        LoginBaseClass.passWord(driver).clear();
        LoginBaseClass.passWord(driver).sendKeys("1234");
        LoginBaseClass.submit(driver).click();
    }
}
