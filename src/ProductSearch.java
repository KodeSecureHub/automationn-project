import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ProductSearch {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/");
        driver.findElement(By.name("keyword")).sendKeys("Fish");
    }
}
