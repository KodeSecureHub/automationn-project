package Logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
    public static WebElement logout(WebDriver driver) {
        return driver.findElement(By.linkText("Sign Out"));
    }
}