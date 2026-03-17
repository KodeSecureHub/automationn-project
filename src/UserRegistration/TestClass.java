package UserRegistration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");
        BaseClass.signUp(driver).click();
        BaseClass.userName(driver).sendKeys("kodee");
       BaseClass.passWord(driver).sendKeys("1234");
        BaseClass.repeatedPassword(driver).sendKeys("1234");
       BaseClass.firstName(driver).sendKeys("Kodeeswaran");
        BaseClass.lastName(driver).sendKeys("A S");
        BaseClass.email(driver).sendKeys("kodeeswaranofficial@gmail.com");
        BaseClass.phone(driver).sendKeys("1234567890");
        BaseClass.address1(driver).sendKeys("Dubai kuruku sandhu");
        BaseClass.address2(driver).sendKeys("Dubai kuruku sandhu");
        BaseClass.city(driver).sendKeys("Dubai");
        BaseClass.state(driver).sendKeys("Emirates");
        BaseClass.zip(driver).sendKeys("00000");
        BaseClass.country(driver).sendKeys("United Arab Emirates");
        BaseClass.bird(driver).click();
        Thread.sleep(1000);
        BaseClass.listOption(driver).click();
        BaseClass.bannerOption(driver).click();
        Thread.sleep(1000);
        BaseClass.submit(driver).click();
    }
}
