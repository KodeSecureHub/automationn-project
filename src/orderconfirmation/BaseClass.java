package orderconfirmation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseClass {
    @FindBy(linkText = "Fish")
    public static WebElement fish;
}
