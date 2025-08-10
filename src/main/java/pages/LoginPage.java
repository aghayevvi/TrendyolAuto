package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage() {
        super();
    }

    @FindBy(xpath = "//p[text()='Giriş Yap']")
    private WebElement loginButton;

    @FindBy(id = "login-email")
    private WebElement emailInput;

    @FindBy(id = "login-password-input")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'submit') and span[text()='Daxil ol']]")
    private WebElement submitButton;

    public void clickLoginButton() {
        waitAndClick(loginButton);
    }

    public void enterEmail(String email) {
        waitAndClick(emailInput);
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
        passwordInput.sendKeys(password);
    }

    public void clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();;
    }

}
