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

    @Given("The user on the search box on the homepage")
    public void clickSearchBox() {
        searchPage.clickSearchBox();
    }

    @And("The user on the Büyük Beden Elbise category on the results page")
    public void clickCategory() {
        searchPage.clickDressType();
    }

    @And("The user LC into the brand filter search box")
    public void searchBrand() {
        searchPage.searchBrand();
    }

    @And("The user the LC Waikiki brand")
    public void selectBrand() {
        searchPage.selectBrand();
    }

    @Then("The user the XS size filter")
    public void selectSize() {
        searchPage.selectSize();
    }
}
