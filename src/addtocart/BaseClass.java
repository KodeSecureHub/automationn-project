package addtocart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseClass {
    public static WebElement fish1(WebDriver driver){
        return driver.findElement(By.linkText("Fish"));
    }
    public static WebElement productId1(WebDriver driver){
        return driver.findElement(By.linkText("FI-SW-02"));
    }
    public static WebElement cart1(WebDriver driver){
        return driver.findElement(By.linkText("Add to Cart"));
    }
    public static WebElement menu1(WebDriver driver){
        return driver.findElement(By.linkText("Return to Main Menu"));
    }

    public static WebElement bird1(WebDriver driver){
        return driver.findElement(By.linkText("Birds"));
    }
    public static WebElement product_id2(WebDriver driver){
        return driver.findElement(By.linkText("AV-CB-01"));
    }
    public static WebElement cart2(WebDriver driver){
        return driver.findElement(By.linkText("Add to Cart"));
    }
    public static WebElement menu2(WebDriver driver){
        return driver.findElement(By.linkText("Return to Main Menu"));
    }

    public static  WebElement dog1(WebDriver driver){
        return driver.findElement(By.linkText("Dogs"));
    }
    public static WebElement product_id3(WebDriver driver){
        return driver.findElement(By.linkText("K9-BD-01"));
    }
    public static WebElement cart3(WebDriver driver){
        return driver.findElement(By.linkText("Add to Cart"));
    }
    public static WebElement menu3(WebDriver driver){
        return driver.findElement(By.linkText("Return to Main Menu"));
    }

    @FindBy(linkText = "Cats")
    public static WebElement cat1;
    @FindBy(linkText = "FL-DLH-02")
    public static WebElement product_id4;
    @FindBy(linkText = "Add to Cart")
    public static  WebElement cart4;
    @FindBy(linkText = "Return to Main Menu")
    public static WebElement menu4;

    @FindBy(linkText = "Reptiles")
    public static WebElement reptile1;
    @FindBy(linkText = "RP-SN-01")
    public static WebElement product_id5;
    @FindBy(linkText = "Add to Cart")
    public static WebElement cart5;
    @FindBy(linkText = "Return to Main Menu")
    public static WebElement menu5;

}