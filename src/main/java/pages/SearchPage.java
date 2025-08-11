package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    public SearchPage() {
        super();
    }

    @FindBy(xpath = "//*[@id=\"sfx-discovery-search-suggestions\"]//input")
    private WebElement searchBox;

    @FindBy(xpath = "//a[@class='fltr-item-wrppr' and .//div[text()='Büyük Beden Elbise']]")
    private WebElement dressType;

    @FindBy(xpath = "//*[@id=\"sticky-aggregations\"]/div/div[3]/div[2]/input")
    private WebElement brandSearch;

    @FindBy(xpath = "//*[@id=\"sticky-aggregations\"]/div/div[3]/div[3]/div/div/div[1]/div/a")
    private WebElement brandType;

    @FindBy(xpath = "//*[@id=\"sticky-aggregations\"]/div/div[4]/div[3]/div/div/div[7]/div/a")
    private WebElement size;

    public void clickSearchBox() {
        waitAndClick(searchBox);
        searchBox.sendKeys("elbise");
        searchBox.sendKeys(Keys.ENTER);
    }

    public void clickDressType() {
        dressType.click();
    }

    public void searchBrand() {
        waitAndClick(brandSearch);
        brandSearch.clear();
        brandSearch.sendKeys("LC");
    }

    public void selectBrand() {
        waitAndClick(brandType);
    }

    public void selectSize() {
        scrollToElement(size);
        waitAndClick(size);
    }
}
