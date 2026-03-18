package ProductSearch;
import org.bouncycastle.jcajce.provider.symmetric.ARC4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");
        PageFactory.initElements(driver, BaseClass.class);
        BaseClass.searchBar.sendKeys("fish");
        BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        BaseClass.mainMenu.click();
        BaseClass.searchBar.sendKeys("dogs");
        BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        BaseClass.mainMenu.click();
        BaseClass.searchBar.sendKeys("cats");
        BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        BaseClass.mainMenu.click();
        BaseClass.searchBar.sendKeys("reptiles");
        BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        BaseClass.mainMenu.click();

    }
}
