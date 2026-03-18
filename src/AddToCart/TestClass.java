package AddToCart;
import org.bouncycastle.jcajce.provider.symmetric.ARC4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://jpetstore.aspectran.com/");
        driver.manage().window().maximize();

        BaseClass.fish1(driver).click();
        BaseClass.productId1(driver).click();
        BaseClass.cart1(driver).click();
        BaseClass.menu1(driver).click();

        BaseClass.bird1(driver).click();
        BaseClass.product_id2(driver).click();
        BaseClass.cart2(driver).click();
        BaseClass.menu2(driver).click();

        BaseClass.dog1(driver).click();
        BaseClass.product_id3(driver).click();
        BaseClass.cart3(driver).click();
        BaseClass.menu3(driver).click();

        PageFactory.initElements(driver,BaseClass.class);
        BaseClass.cat1.click();
        BaseClass.product_id4.click();
        BaseClass.cart4.click();
        BaseClass.menu4.click();

        BaseClass.reptile1.click();
        BaseClass.product_id5.click();
        BaseClass.cart4.click();
        BaseClass.menu5.click();
    }
}