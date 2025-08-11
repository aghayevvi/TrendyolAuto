package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    public CartPage() {
    }

    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div/div/div[2]/div[2]")
    private WebElement cart;

    @FindBy(xpath = "//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/div[1]/div/div/div/button[2]")
    private WebElement increase;

    @FindBy(xpath = "//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/div[1]/div/div/div/button[1]")
    private WebElement decrease;

    @FindBy(xpath = "//*[@id=\"pb-container\"]/div/div[2]/div[2]/div/div[4]/button")
    private WebElement remove;

    @FindBy(id = "logo")
    private WebElement logo;


    public void clickCart() {
        waitAndClick(cart);
    }

    public void clickIncrease() {
        waitAndClick(increase);
    }

    public void clickDecrease() {
        waitAndClick(decrease);
    }

    public void clickRemove() {
        waitAndClick(remove);
    }

    public void clickLogo() {
        waitAndClick(logo);
    }
}
