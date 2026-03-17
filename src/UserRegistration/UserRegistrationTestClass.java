package UserRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class UserRegistrationTestClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");
        driver.findElement(By.linkText("Sign Up")).click();
        driver.findElement(By.name("username")).sendKeys("kodee");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.name("repeatedPassword")).sendKeys("1234");
        driver.findElement(By.name("firstName")).sendKeys("Kodeeswaran");
        driver.findElement(By.name("lastName")).sendKeys("A S");
        driver.findElement(By.name("email")).sendKeys("kodeeswaranofficial@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("1234567890");
        driver.findElement(By.name("address1")).sendKeys("Dubai kuruku sandhu");
        driver.findElement(By.name("address2")).sendKeys("Dubai kuruku sandhu");
        driver.findElement(By.name("city")).sendKeys("Dubai");
        driver.findElement(By.name("state")).sendKeys("Emirates");
        driver.findElement(By.name("zip")).sendKeys("00000");
        driver.findElement(By.name("country")).sendKeys("United Arab Emirates");
        driver.findElement(By.xpath("//*[@value='BIRDS']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("listOption")).click();
        driver.findElement(By.name("bannerOption")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }
}
