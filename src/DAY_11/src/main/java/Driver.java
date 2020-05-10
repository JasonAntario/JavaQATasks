import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class Driver {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public WebDriver getWebDriver() {
        if (webDriver == null)
            webDriver.set(new ChromeDriver()); //переделать через enum в chrome driver/firefox driver... (в презентации)
        return webDriver.get();
    }

}
