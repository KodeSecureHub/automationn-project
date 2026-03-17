package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class LoginBaseClass{
    public static WebElement userName(WebDriver driver)
    {
        return driver.findElement(By.id("username"));
    }
    public static WebElement passWord(WebDriver driver){
        return driver.findElement(By.id("password"));
    }
    public static WebElement submit(WebDriver driver){
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }


}