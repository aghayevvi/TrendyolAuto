package stepDefinitions;

import com.aventstack.extentreports.Status;
import config.ExtentManager;
import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep {

    private static final Logger log = LoggerFactory.getLogger(LoginStep.class);
    public LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage();
    }


    @Given("User opens the site")
    public void userOpensTheSite() {
        String firstPage = "https://www.trendyol.com//";
        loginPage.driver.get(firstPage);
        loginPage.driver.manage().window().maximize();
    }

    @When("the user clicks the Login button")
    public void theUserClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("User includes {string} and {string}")
    public void userIncludesAnd(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @Then("The user clicks the button.")
    public void theUserClicksTheButton() {
        loginPage.clickSubmitButton();
    }
}
