package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;

    private DriverManager() {
    }


    public static WebDriver getChromeDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            //  options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
