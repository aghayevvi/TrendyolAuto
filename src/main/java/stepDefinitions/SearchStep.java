package stepDefinitions;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SearchPage;

public class SearchStep {

    private static final Logger log = LoggerFactory.getLogger(SearchStep.class);
    public SearchPage searchPage;

    public SearchStep() {
        searchPage = new SearchPage();
    }

    @Given("I click on the search box on the homepage")
    public void clickSearchBox() throws InterruptedException {
        searchPage.clickSearchBox();
    }

    @And("I click on the Büyük Beden Elbise category on the results page")
    public void clickCategory() throws InterruptedException {
        searchPage.clickDressType();
    }

    @And("I type LC into the brand filter search box")
    public void searchBrand() throws InterruptedException {
        searchPage.searchBrand();
    }

    @And("I select the LC Waikiki brand")
    public void selectBrand() throws InterruptedException {
        searchPage.selectBrand();
    }

    @Then("I select the XS size filter")
    public void selectSize() throws InterruptedException {
        searchPage.selectSize();
    }
}
