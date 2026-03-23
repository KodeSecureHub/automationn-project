package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseClass {
    public static WebElement signUp(WebDriver driver){return driver.findElement(By.linkText("Sign Up"));}
    public static WebElement userName(WebDriver driver){
        return driver.findElement(By.name("username"));
    }
    public static WebElement passWord(WebDriver driver){
        return driver.findElement(By.name("password"));
    }
    public static WebElement repeatedPassword(WebDriver driver){return driver.findElement(By.name("repeatedPassword"));}
    public static WebElement firstName(WebDriver driver){
        return driver.findElement(By.name("firstName"));
    }
    public static WebElement lastName(WebDriver driver){
        return driver.findElement(By.name("lastName"));
    }
    public static WebElement email(WebDriver driver){
        return driver.findElement(By.name("email"));
    }
    public static WebElement phone(WebDriver driver){
        return driver.findElement(By.name("phone"));
    }
    public static WebElement address1(WebDriver driver){
        return driver.findElement(By.name("address1"));
    }
    public static WebElement address2(WebDriver driver){
        return driver.findElement(By.name("address2"));
    }
    public static WebElement city(WebDriver driver){
        return driver.findElement(By.name("city"));
    }
    public static WebElement state(WebDriver driver){
        return driver.findElement(By.name("state"));
    }
    public static WebElement zip(WebDriver driver){
        return driver.findElement(By.name("zip"));
    }
    public static WebElement country(WebDriver driver){
        return driver.findElement(By.name("country"));
    }
    public static WebElement bird(WebDriver driver){
        return driver.findElement(By.xpath("//*[@value='BIRDS']"));
    }
    public static WebElement listOption(WebDriver driver){
        return driver.findElement(By.name("listOption"));
    }
    public static WebElement bannerOption(WebDriver driver){
        return driver.findElement(By.name("bannerOption"));
    }
    public static WebElement submit(WebDriver driver){
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }

    public static WebElement signIn(WebDriver driver){return driver.findElement(By.linkText("Sign In"));}

    @FindBy(xpath="//*[@type='search']")
    public static WebElement searchBar;

    @FindBy(linkText = "Return to Main Menu")
    public static WebElement mainMenu;

    @FindBy(linkText = "Fish")
    public static WebElement fish;

    @FindBy(linkText = "Dogs")
    public static WebElement dogs;

    @FindBy(linkText = "Cats")
    public static WebElement cats;

    @FindBy(linkText = "Reptiles")
    public static WebElement reptiles;

    @FindBy(linkText = "Fish")
    public static WebElement fish1;
    @FindBy(linkText = "FI-SW-02")
    public static WebElement product_id1;

    @FindBy(linkText = "Birds")
    public static WebElement bird1;
    @FindBy(linkText = "AV-CB-01")
    public static WebElement product_id2;


    @FindBy(linkText = "Dogs")
    public static WebElement dog1;
    @FindBy(linkText = "K9-BD-01")
    public static WebElement product_id3;

    @FindBy(linkText = "Cats")
    public static WebElement cat1;
    @FindBy(linkText = "FL-DLH-02")
    public static WebElement product_id4;

    @FindBy(linkText = "Reptiles")
    public static WebElement reptile1;
    @FindBy(linkText = "RP-SN-01")
    public static WebElement product_id5;
    @FindBy(linkText = "Add to Cart")
    public static WebElement cart;
    @FindBy(linkText = "Return to Main Menu")
    public static WebElement menu;

    @FindBy(linkText = "EST-3")
    public static WebElement update1;
    @FindBy(linkText = "EST-18")
    public static WebElement update2;
    @FindBy(linkText = "EST-6")
    public static WebElement update3;
    @FindBy(linkText = "EST-16")
    public static WebElement update4;
    @FindBy(linkText = "EST-11")
    public static WebElement update5;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement updateClick;


    public static WebElement fish(WebDriver driver){return driver.findElement(By.linkText("Fish"));}
    public static WebElement fishItem(WebDriver driver){return driver.findElement(By.linkText("FI-SW-01"));}

    public static WebElement cart(WebDriver driver) {return driver.findElement(By.linkText("Add to Cart"));}

    public static WebElement myOrders(WebDriver driver){return driver.findElement(By.linkText("My Orders"));}

    public static WebElement dropDown(WebDriver driver){
        return driver.findElement(By.id("dropdownMenuButton"));
    }
    public static WebElement logout(WebDriver driver) {
        return driver.findElement(By.linkText("Sign Out"));
    }
}


