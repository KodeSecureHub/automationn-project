package categories;
import productsearch.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");

        PageFactory.initElements(driver, productsearch.BaseClass.class);

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
