import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    //доделать

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("погода минск");

        // element.submit();
        element.findElement(By.xpath("//style/following-sibling::center/input[@value=\"Пошук Google\"]"));
        // element = driver.findElement(By.xpath(""));
        element.click();
        ///driver.navigate().back();
        //driver.navigate().refresh();

    }
}
