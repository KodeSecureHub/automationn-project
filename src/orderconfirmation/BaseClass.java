package orderconfirmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
  public static WebElement myOrders(WebDriver driver){return driver.findElement(By.linkText("My Orders"));}
}
