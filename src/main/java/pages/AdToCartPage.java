package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdToCartPage extends BasePage {

    public AdToCartPage() {
        super();
    }

    @FindBy(xpath = "//*[@id=\"search-app\"]/div/div/div/div[2]/div[4]/div[1]/div/div[1]/a")
    private WebElement firstProduct;

    @FindBy(xpath = "//*[@id=\"envoy\"]/div/section/div/div/div[2]/button")
    private WebElement sizeSButton;

    @FindBy(xpath = "//*[@id=\"envoy\"]/div/div/div/button")
    private WebElement addToCartButton;

    public void scrollDownPage() {
        scrollToElement(firstProduct);
    }

    public void clickOnProduct() {
        waitAndClick(firstProduct);
    }

    public void switchToNewTab() {
        super.switchToNewTab();
    }

    public void selectSizeS() {
        waitAndClick(sizeSButton);
    }

    public void clickAddToCart() {
        waitAndClick(addToCartButton);
    }
}
