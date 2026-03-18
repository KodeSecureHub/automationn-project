package Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

public class BaseClass {

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




