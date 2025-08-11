package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartStep {

    public CartPage cartPage;

    public CartStep() {
        cartPage = new CartPage();
    }

    @Given("The user clicks on the cart button")
    public void theUserClicksOnTheCartButton() {
        cartPage.clickCart();
    }

    @When("The user increases the product quantity")
    public void theUserIncreasesTheProductQuantity() {
        cartPage.clickIncrease();
    }

    @And("The user decreases the product quantity")
    public void theUserDecreasesTheProductQuantity() {
        cartPage.clickDecrease();
    }

    @Then("The user clicks the remove button")
    public void theUserClicksTheRemoveButton() {
        cartPage.clickRemove();
    }

    @Then("The user clicks the logo")
    public void theUserClicksTheLogo() {
        cartPage.clickLogo();
    }
}
