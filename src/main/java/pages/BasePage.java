package pages;

import config.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BasePage {
    public WebDriver driver;
    public JavascriptExecutor js;
    public WebDriverWait wait;  // burada class-level wait tanımlandı

    public BasePage() {
        this.driver = DriverManager.getChromeDriver();
        this.js = (JavascriptExecutor) driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));  // sadece bir kez oluşturuluyor
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        PageFactory.initElements(driver, this);
    }

    public void fillFieldAndEnter(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
        element.sendKeys(Keys.RETURN);
    }

    public void waitAndClick(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (RuntimeException e) {
            System.out.println("Element not found: " + e.getMessage());
        }
    }


    public void scrollToElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));  // class-level wait kullanılıyor
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
        } catch (Exception e) {
            throw e;
        }
    }

    public void switchToNewTab() {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(windowHandles);
        if (windows.size() > 1) {
            driver.switchTo().window(windows.get(1));
        } else {
            throw new RuntimeException("New tab not found!");
        }
    }

    public void switchToOriginalTab() {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(windowHandles);
        driver.switchTo().window(windows.get(0));
    }

    public void closeOldTab() {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(windowHandles);

        if (windowList.size() > 1) {
            driver.switchTo().window(windowList.get(0));
            driver.close();
            driver.switchTo().window(windowList.get(1));
        } else {
            throw new RuntimeException("New tab not found!");
        }
    }

    public void waitForAjaxToComplete() {
        wait.until(driver -> ((JavascriptExecutor) driver)
                .executeScript("return jQuery.active == 0").equals(true));
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void goBack() {
        driver.navigate().back();
    }
}
