package Logout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import Login.BaseClass;
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement logoutBtn = Logout.BaseClass.logout(driver);
        js.executeScript("arguments[0].scrollIntoView(true);", logoutBtn);
        js.executeScript("arguments[0].click();", logoutBtn);
        System.out.println("Logout Successful");
    }
}