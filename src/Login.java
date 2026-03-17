import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;public class Login {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jpetstore.aspectran.com/account/signonForm");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("kodi");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }
}
