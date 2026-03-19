package checkoutprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
    public static WebElement fish(WebDriver driver){return driver.findElement(By.linkText("Fish"));}
    public static WebElement fishItem(WebDriver driver){return driver.findElement(By.linkText("FI-SW-01"));}
    public static WebElement proceedToCheckout(WebDriver driver){return driver.findElement(By.linkText("Proceed to Checkout"));}
}
