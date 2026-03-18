package Categories;
import ProductSearch.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");
        PageFactory.initElements(driver, ProductSearch.BaseClass.class);
        BaseClass.fish.click();
        Thread.sleep(2000);
        BaseClass.mainMenu.click();
        BaseClass.dogs.click();
        Thread.sleep(2000);
        BaseClass.mainMenu.click();
       BaseClass.cats.click();
        Thread.sleep(2000);
        BaseClass.mainMenu.click();
        BaseClass.reptiles.click();
        Thread.sleep(2000);
        BaseClass.mainMenu.click();

    }
}
