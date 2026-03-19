package orderconfirmation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");

        login.BaseClass.signIn(driver).click();
        login.BaseClass.userName(driver).clear();
        login.BaseClass.userName(driver).sendKeys("kodi");
        login.BaseClass.passWord(driver).clear();
        login.BaseClass.passWord(driver).sendKeys("1234");
        login.BaseClass.submit(driver).click();

        checkoutprocess.BaseClass.fish(driver).click();
        checkoutprocess.BaseClass.fishItem(driver).click();
        addtocart.BaseClass.cart1(driver).click();
        checkoutprocess.BaseClass.proceedToCheckout(driver).click();

        JavascriptExecutor je =  (JavascriptExecutor) driver;
        WebElement Continue = driver.findElement(By.xpath("//*[text()='Continue']"));
        je.executeScript("arguments[0].scrollIntoView(true)",Continue);
        je.executeScript("arguments[0].click()",Continue);

        WebElement Confirm = driver.findElement(By.xpath("//*[text()='Confirm']"));
        je.executeScript("arguments[0].scrollIntoView(true)",Confirm);
        je.executeScript("arguments[0].click()",Confirm);

        BaseClass.myOrders(driver).click();
    }
}
