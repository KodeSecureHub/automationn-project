package addtocart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://jpetstore.aspectran.com/");
        driver.manage().window().maximize();

        PageFactory.initElements(driver,BaseClass.class);

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
        BaseClass.menu.click();

    }
}