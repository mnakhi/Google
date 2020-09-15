package signin;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {
    @FindBy(xpath = "//a[contains(@href,\"accounts.google.com\")]")
    WebElement signInBtn;
    @FindBy(id="identifierId")
    WebElement emailFld;
    @FindBy(id="identifierNext")
    WebElement nextBtn;
    @FindBy(css = "input[name='password']")
    WebElement passwordFld;
    public void userSignIn(String email, String password){
        signInBtn.click();
        emailFld.clear();
        emailFld.sendKeys(email);
        nextBtn.click();
        passwordFld.sendKeys(password);
        nextBtn.click();
    }
}
