package UserRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
     public static WebElement signUp(WebDriver driver){
         return driver.findElement(By.linkText("Sign Up"));
     }
     public static WebElement userName(WebDriver driver){
         return driver.findElement(By.name("username"));
     }
    public static WebElement passWord(WebDriver driver){
        return driver.findElement(By.name("password"));
    }
    public static WebElement repeatedPassword(WebDriver driver){
        return driver.findElement(By.name("repeatedPassword"));
    }
    public static WebElement firstName(WebDriver driver){
        return driver.findElement(By.name("firstName"));
    }
    public static WebElement lastName(WebDriver driver){
        return driver.findElement(By.name("lastName"));
    }
    public static WebElement email(WebDriver driver){
        return driver.findElement(By.name("email"));
    }
    public static WebElement phone(WebDriver driver){
        return driver.findElement(By.name("phone"));
    }
    public static WebElement address1(WebDriver driver){
        return driver.findElement(By.name("address1"));
    }
    public static WebElement address2(WebDriver driver){
        return driver.findElement(By.name("address2"));
    }
    public static WebElement city(WebDriver driver){
        return driver.findElement(By.name("city"));
    }
    public static WebElement state(WebDriver driver){
        return driver.findElement(By.name("state"));
    }
    public static WebElement zip(WebDriver driver){
        return driver.findElement(By.name("zip"));
    }
    public static WebElement country(WebDriver driver){
        return driver.findElement(By.name("country"));
    }
    public static WebElement bird(WebDriver driver){
        return driver.findElement(By.xpath("//*[@value='BIRDS']"));
    }
    public static WebElement listOption(WebDriver driver){
        return driver.findElement(By.name("listOption"));
    }
    public static WebElement bannerOption(WebDriver driver){
        return driver.findElement(By.name("bannerOption"));
    }
    public static WebElement submit(WebDriver driver){
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }
}
