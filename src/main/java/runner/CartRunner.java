package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "C:/Users/EXIRIM'R_Computer's/IdeaProjects/TrendyolAuto/src/test/Feature/Cart.feature",
        glue = {"stepDefinitions", "config"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/CucumberTestReportPositive.json",
                "html:target/cucumber-reports/html/CucumberTestReportPositive.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        },
        monochrome = true,
        tags = "@Cart"
)

public class CartRunner {
}
