package addtocart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseClass {
    @FindBy(linkText = "Fish")
    public static WebElement fish1;
    @FindBy(linkText = "FI-SW-02")
    public static WebElement product_id1;

    @FindBy(linkText = "Birds")
    public static WebElement bird1;
    @FindBy(linkText = "AV-CB-01")
    public static WebElement product_id2;


    @FindBy(linkText = "Dogs")
    public static WebElement dog1;
    @FindBy(linkText = "K9-BD-01")
    public static WebElement product_id3;

    @FindBy(linkText = "Cats")
    public static WebElement cat1;
    @FindBy(linkText = "FL-DLH-02")
    public static WebElement product_id4;

    @FindBy(linkText = "Reptiles")
    public static WebElement reptile1;
    @FindBy(linkText = "RP-SN-01")
    public static WebElement product_id5;
    @FindBy(linkText = "Add to Cart")
    public static WebElement cart;
    @FindBy(linkText = "Return to Main Menu")
    public static WebElement menu;


}