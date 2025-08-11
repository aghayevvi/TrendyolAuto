package stepDefinitions;

import io.cucumber.java.en.*;
import pages.AdToCartPage;

public class AdToCartStep {

    AdToCartPage adToCartPage = new AdToCartPage();

    @Given("The user scrolls down the page")
    public void theUserScrollsDownThePage() {
        adToCartPage.scrollDownPage();
    }

    @When("The user clicks on a product")
    public void theUserClicksOnAProduct() {
        adToCartPage.clickOnProduct();
    }

    @And("The user should be switched to the new tab")
    public void theUserShouldBeSwitchedToTheNewTab() {
        adToCartPage.switchToNewTab();
        adToCartPage.closeOldTab();
        
    }

    @And("The user selects size")
    public void theUserSelectsSizeS() {
        adToCartPage.selectSizeS();
    }

    @Then("The user clicks the Sepete Ekle button")
    public void theUserClicksTheSepeteEkleButton() {
        adToCartPage.clickAddToCart();
    }
}
