package logout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import login.BaseClass;

public class TestClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/account/signonForm");

        BaseClass.userName(driver).clear();
        BaseClass.userName(driver).sendKeys("kodi");
        BaseClass.passWord(driver).clear();
        BaseClass.passWord(driver).sendKeys("1234");
        BaseClass.submit(driver).click();

        logout.BaseClass.dropDown(driver).click();
        logout.BaseClass.logout(driver).click();
    }
}