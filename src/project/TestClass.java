package project;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass extends BaseClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");

        // ================== SIGN UP ==================
        BaseClass.signUp(driver).click();

        BaseClass.userName(driver).sendKeys("kodee123");
        BaseClass.passWord(driver).sendKeys("1234");
        BaseClass.repeatedPassword(driver).sendKeys("1234");

        BaseClass.firstName(driver).sendKeys("Kodeeswaran");
        BaseClass.lastName(driver).sendKeys("A S");
        BaseClass.email(driver).sendKeys("test@mail.com");
        BaseClass.phone(driver).sendKeys("1234567890");

        BaseClass.address1(driver).sendKeys("Address1");
        BaseClass.address2(driver).sendKeys("Address2");
        BaseClass.city(driver).sendKeys("City");
        BaseClass.state(driver).sendKeys("State");

        BaseClass.zip(driver).sendKeys("00000");
        BaseClass.country(driver).sendKeys("India");

        BaseClass.bird(driver).click();
        Thread.sleep(1000);

        BaseClass.listOption(driver).click();
        BaseClass.bannerOption(driver).click();

        Thread.sleep(1000);
        BaseClass.submit(driver).click();

        Thread.sleep(3000);

        // ================== LOGIN ==================
        BaseClass.signIn(driver).click();
        BaseClass.userName(driver).clear();
        BaseClass.userName(driver).sendKeys("kodee123");
        BaseClass.passWord(driver).clear();
        BaseClass.passWord(driver).sendKeys("1234");
        BaseClass.submit(driver).click();

        Thread.sleep(3000);

        // ================== PRODUCT SEARCH ==================
        PageFactory.initElements(driver, BaseClass.class);

        BaseClass.searchBar.sendKeys("fish");
        BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        BaseClass.mainMenu.click();

        BaseClass.searchBar.sendKeys("dogs");
        BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        BaseClass.mainMenu.click();

        // ================== ADD TO CART ==================
        BaseClass.fish(driver).click();
        BaseClass.fishItem(driver).click();
        BaseClass.cart(driver).click();

        Thread.sleep(3000);

        // ================== UPDATE CART ==================
        WebElement quantity = driver.findElement(By.name("EST-1")); // correct locator
        quantity.clear();
        quantity.sendKeys("2");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement updateBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click();", updateBtn);

        Thread.sleep(3000);

        // ================== CHECKOUT ==================
        WebElement checkout = driver.findElement(By.linkText("Proceed to Checkout"));
        js.executeScript("arguments[0].scrollIntoView(true);", checkout);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", checkout);

        Thread.sleep(2000);

        // ================== CONTINUE ==================
        WebElement Continue = driver.findElement(By.xpath("//*[text()='Continue']"));
        js.executeScript("arguments[0].scrollIntoView(true)", Continue);
        js.executeScript("arguments[0].click()", Continue);

        Thread.sleep(2000);

        // ================== CONFIRM ==================
        WebElement Confirm = driver.findElement(By.xpath("//*[text()='Confirm']"));
        js.executeScript("arguments[0].scrollIntoView(true)", Confirm);
        js.executeScript("arguments[0].click()", Confirm);

        Thread.sleep(2000);

        // ================== ORDER ==================
        BaseClass.myOrders(driver).click();

        Thread.sleep(2000);

        // ================== LOGOUT ==================
        BaseClass.dropDown(driver).click();
        BaseClass.logout(driver).click();

        Thread.sleep(3000);
        driver.quit();
    }


}