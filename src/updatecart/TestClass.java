package updatecart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://jpetstore.aspectran.com/");
        driver.manage().window().maximize();

        PageFactory.initElements(driver, addtocart.BaseClass.class);

        BaseClass.fish1.click();
        BaseClass.product_id1.click();
        BaseClass.cart.click();
        BaseClass.menu.click();

        BaseClass.bird1.click();
        BaseClass.product_id2.click();
        BaseClass.cart.click();
        BaseClass.menu.click();

        BaseClass.dog1.click();
        BaseClass.product_id3.click();
        BaseClass.cart.click();
        BaseClass.menu.click();


        BaseClass.cat1.click();
        BaseClass.product_id4.click();
        BaseClass.cart.click();
        BaseClass.menu.click();

        BaseClass.reptile1.click();
        BaseClass.product_id5.click();
        BaseClass.cart.click();

        BaseClass.update1.clear();
        BaseClass.update1.sendKeys("2");
        BaseClass.update2.clear();
        BaseClass.update2.sendKeys("3");
        BaseClass.update3.clear();
        BaseClass.update3.sendKeys("2");
        BaseClass.update4.clear();
        BaseClass.update4.sendKeys("4");
        BaseClass.update5.clear();
        BaseClass.update5.sendKeys("3");

        BaseClass.updateClick.clear();

    }
}
