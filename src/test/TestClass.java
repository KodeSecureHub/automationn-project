package test;

import base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestClass extends BaseClass {

    public static void main(String[] args) throws InterruptedException {

        TestClass obj = new TestClass();
        obj.setup();

        // USER REGISTRATION
        userregistration.BaseClass.signUp(obj.driver).click();
        userregistration.BaseClass.userName(obj.driver).sendKeys("kodee");
        userregistration.BaseClass.passWord(obj.driver).sendKeys("1234");
        userregistration.BaseClass.repeatedPassword(obj.driver).sendKeys("1234");

        userregistration.BaseClass.firstName(obj.driver).sendKeys("Kodeeswaran");
        userregistration.BaseClass.lastName(obj.driver).sendKeys("A S");
        userregistration.BaseClass.email(obj.driver).sendKeys("kodeeswaranofficial@gmail.com");
        userregistration.BaseClass.phone(obj.driver).sendKeys("1234567890");

        userregistration.BaseClass.address1(obj.driver).sendKeys("Dubai kuruku sandhu");
        userregistration.BaseClass.address2(obj.driver).sendKeys("Dubai kuruku sandhu");
        userregistration.BaseClass.city(obj.driver).sendKeys("Dubai");
        userregistration.BaseClass.state(obj.driver).sendKeys("Emirates");

        userregistration.BaseClass.zip(obj.driver).sendKeys("00000");
        userregistration.BaseClass.country(obj.driver).sendKeys("United Arab Emirates");

        userregistration.BaseClass.bird(obj.driver).click();
        Thread.sleep(1000);

        userregistration.BaseClass.listOption(obj.driver).click();
        userregistration.BaseClass.bannerOption(obj.driver).click();
        Thread.sleep(1000);

        userregistration.BaseClass.submit(obj.driver).click();

        // LOGIN
        login.BaseClass.signIn(obj.driver).click();
        login.BaseClass.userName(obj.driver).clear();
        login.BaseClass.userName(obj.driver).sendKeys("kodi");
        login.BaseClass.passWord(obj.driver).clear();
        login.BaseClass.passWord(obj.driver).sendKeys("1234");
        login.BaseClass.submit(obj.driver).click();

        // PRODUCT SEARCH
        PageFactory.initElements(obj.driver, productsearch.BaseClass.class);

        productsearch.BaseClass.searchBar.sendKeys("fish");
        productsearch.BaseClass.searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        productsearch.BaseClass.mainMenu.click();

        // CATEGORIES
        PageFactory.initElements(obj.driver, categories.BaseClass.class);

        categories.BaseClass.fish.click();
        Thread.sleep(2000);
        categories.BaseClass.mainMenu.click();

        // ADD TO CART
        PageFactory.initElements(obj.driver, addtocart.BaseClass.class);

        addtocart.BaseClass.fish1.click();
        addtocart.BaseClass.product_id1.click();
        addtocart.BaseClass.cart.click();

        // UPDATE CART
        PageFactory.initElements(obj.driver, updatecart.BaseClass.class);

        updatecart.BaseClass.update1.clear();
        updatecart.BaseClass.update1.sendKeys("2");

        updatecart.BaseClass.updateClick.click();

        // CHECKOUT (FIXED FLOW)
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) obj.driver;

        WebElement checkout = checkoutprocess.BaseClass.proceedToCheckout(obj.driver);
        js.executeScript("arguments[0].scrollIntoView(true);", checkout);
        js.executeScript("arguments[0].click();", checkout);

        // CONTINUE
        WebElement Continue = obj.driver.findElement(By.xpath("//*[text()='Continue']"));
        js.executeScript("arguments[0].scrollIntoView(true)", Continue);
        js.executeScript("arguments[0].click()", Continue);

        // CONFIRM
        WebElement Confirm = obj.driver.findElement(By.xpath("//*[text()='Confirm']"));
        js.executeScript("arguments[0].scrollIntoView(true)", Confirm);
        js.executeScript("arguments[0].click()", Confirm);

        // ORDER CONFIRMATION
        orderconfirmation.BaseClass.myOrders(obj.driver).click();

        // LOGOUT
        logout.BaseClass.dropDown(obj.driver).click();
        logout.BaseClass.logout(obj.driver).click();

        obj.closeBrowser();
    }
}