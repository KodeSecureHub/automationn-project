package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TestClass extends BaseClass {

    public static void main(String[] args) throws InterruptedException {

        TestClass obj = new TestClass();
        obj.setup();

        // ================== SIGN UP ==================
        userregistration.BaseClass.signUp(obj.driver).click();

        userregistration.BaseClass.userName(obj.driver).sendKeys("kodee123");
        userregistration.BaseClass.passWord(obj.driver).sendKeys("1234");
        userregistration.BaseClass.repeatedPassword(obj.driver).sendKeys("1234");

        userregistration.BaseClass.firstName(obj.driver).sendKeys("Kodeeswaran");
        userregistration.BaseClass.lastName(obj.driver).sendKeys("A S");
        userregistration.BaseClass.email(obj.driver).sendKeys("test@mail.com");
        userregistration.BaseClass.phone(obj.driver).sendKeys("1234567890");

        userregistration.BaseClass.address1(obj.driver).sendKeys("Address1");
        userregistration.BaseClass.address2(obj.driver).sendKeys("Address2");
        userregistration.BaseClass.city(obj.driver).sendKeys("City");
        userregistration.BaseClass.state(obj.driver).sendKeys("State");

        userregistration.BaseClass.zip(obj.driver).sendKeys("00000");
        userregistration.BaseClass.country(obj.driver).sendKeys("India");

        userregistration.BaseClass.bird(obj.driver).click();
        Thread.sleep(1000);

        userregistration.BaseClass.listOption(obj.driver).click();
        userregistration.BaseClass.bannerOption(obj.driver).click();

        Thread.sleep(1000);
        userregistration.BaseClass.submit(obj.driver).click();

        Thread.sleep(3000);

        // ================== LOGIN ==================
        login.BaseClass.signIn(obj.driver).click();
        login.BaseClass.userName(obj.driver).clear();
        login.BaseClass.userName(obj.driver).sendKeys("kodee123");
        login.BaseClass.passWord(obj.driver).clear();
        login.BaseClass.passWord(obj.driver).sendKeys("1234");
        login.BaseClass.submit(obj.driver).click();

        Thread.sleep(3000);

        // ================== PRODUCT SEARCH ==================
        PageFactory.initElements(obj.driver, productsearch.BaseClass.class);

        productsearch.BaseClass.searchBar.sendKeys("fish");
        productsearch.BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        productsearch.BaseClass.mainMenu.click();

        productsearch.BaseClass.searchBar.sendKeys("dogs");
        productsearch.BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        productsearch.BaseClass.mainMenu.click();

        // ================== ADD TO CART ==================
        checkoutprocess.BaseClass.fish(obj.driver).click();
        checkoutprocess.BaseClass.fishItem(obj.driver).click();
        checkoutprocess.BaseClass.cart(obj.driver).click();

        Thread.sleep(3000);

        // ================== UPDATE CART ==================
        WebElement quantity = obj.driver.findElement(By.name("EST-1")); // correct locator
        quantity.clear();
        quantity.sendKeys("2");

        JavascriptExecutor js = (JavascriptExecutor) obj.driver;

        WebElement updateBtn = obj.driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click();", updateBtn);

        Thread.sleep(3000);

        // ================== CHECKOUT ==================
        WebElement checkout = obj.driver.findElement(By.linkText("Proceed to Checkout"));
        js.executeScript("arguments[0].scrollIntoView(true);", checkout);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", checkout);

        Thread.sleep(2000);

        // ================== CONTINUE ==================
        WebElement Continue = obj.driver.findElement(By.xpath("//*[text()='Continue']"));
        js.executeScript("arguments[0].scrollIntoView(true)", Continue);
        js.executeScript("arguments[0].click()", Continue);

        Thread.sleep(2000);

        // ================== CONFIRM ==================
        WebElement Confirm = obj.driver.findElement(By.xpath("//*[text()='Confirm']"));
        js.executeScript("arguments[0].scrollIntoView(true)", Confirm);
        js.executeScript("arguments[0].click()", Confirm);

        Thread.sleep(2000);

        // ================== ORDER ==================
        orderconfirmation.BaseClass.myOrders(obj.driver).click();

        Thread.sleep(2000);

        // ================== LOGOUT ==================
        logout.BaseClass.dropDown(obj.driver).click();
        logout.BaseClass.logout(obj.driver).click();

        obj.closeBrowser();
    }
}