package Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Categories {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");
        driver.findElement(By.linkText("Fish")).click();
        driver.findElement(By.linkText("FI-SW-01")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
        driver.findElement(By.linkText("Proceed to Checkout")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("kodi");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        driver.findElement(By.xpath("//*[@value='American Express']")).click();
        driver.findElement(By.name("creditCard")).clear();
        driver.findElement(By.name("creditCard")).sendKeys("111111111111111");
        driver.findElement(By.name("expiryDate")).clear();
        driver.findElement(By.name("expiryDate")).sendKeys("09/2030");
        JavascriptExecutor je =  (JavascriptExecutor) driver;
        WebElement Continue = driver.findElement(By.xpath("//*[text()='Continue']"));
        je.executeScript("arguments[0].scrollIntoView(true)",Continue);
        je.executeScript("arguments[0].click()",Continue);
        WebElement Confirm = driver.findElement(By.xpath("//*[text()='Confirm']"));
        je.executeScript("arguments[0].scrollIntoView(true)",Confirm);
        je.executeScript("arguments[0].click()",Confirm);
    }
}
