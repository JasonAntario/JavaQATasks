import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BookingTest {

    public static void main(String[] args) {
        String date = null;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
        element.sendKeys("Paris");
        element = driver.findElement(By.xpath("//*[contains(@class, \"xp__input-group xp__date-time\")]"));
        element.click();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date threeDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date sevenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datePlusThreeDays = dateFormat.format(threeDays);
        String datePlusSevenDays = dateFormat.format(sevenDays);
        System.out.println(datePlusSevenDays + " " + datePlusThreeDays);

        element = driver.findElement(By.xpath(String.format("//*[contains(@data-date, \"%s\")]", datePlusThreeDays)));
        element.click();
        element = driver.findElement(By.xpath(String.format("//*[contains(@data-date, \"%s\")]", datePlusSevenDays)));
        element.click();

        element = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]"));
        element.click();

        element = driver.findElement(By.xpath("//*[contains(@class,\"field-adult\")]//input"));
        String adultCount = element.getAttribute("value");
        System.out.println(adultCount);
        element = driver.findElement(By.xpath("//*[contains(@aria-label,\"Increase number of Adults\")]/span"));
        for (int i = 0; i < (4 - Integer.parseInt(adultCount)); i++) {
            element.click();
        }

        element = driver.findElement(By.xpath("//*[contains(@class,\"field-rooms\")]//input"));
        String roomCount = element.getAttribute("value");
        System.out.println(roomCount);
        element = driver.findElement(By.xpath("//*[contains(@aria-label,\"Increase number of Rooms\")]/span"));
        for (int i = 0; i < (2 - Integer.parseInt(roomCount)); i++) {
            element.click();
        }
        element = driver.findElement(By.xpath("//*[contains(@type, \"submit\")]"));
        element.click();
        element = driver.findElement(By.xpath("//*[@id=\"filter_price\"]//a[5]"));
        element.click();
        element = driver.findElement(By.xpath("//*[contains(@class, \"sort_price\")]/a"));
        element.click();


    }
}
