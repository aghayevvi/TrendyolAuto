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
    public void theUserClicksOnTheCartButton() throws InterruptedException {
        cartPage.clickCart();
    }

    @When("The user increases the product quantity")
    public void theUserIncreasesTheProductQuantity() throws InterruptedException {
        cartPage.clickIncrease();
    }

    @And("The user decreases the product quantity")
    public void theUserDecreasesTheProductQuantity() throws InterruptedException {
        cartPage.clickDecrease();
    }

    @Then("The user clicks the remove button")
    public void theUserClicksTheRemoveButton() throws InterruptedException {
        cartPage.clickRemove();
    }
}
