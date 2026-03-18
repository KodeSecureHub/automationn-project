package Productsearch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseClass {
   @FindBy(xpath="//*[@type='search']")
    public static WebElement searchBar;
   @FindBy(linkText = "Return to Main Menu")
    public static WebElement mainMenu;
   @FindBy(linkText = "Fish")
    public static WebElement fish;
    @FindBy(linkText = "Dogs")
    public static WebElement dogs;
    @FindBy(linkText = "Cats")
    public static WebElement cats;
    @FindBy(linkText = "Reptiles")
    public static WebElement reptiles;
}
