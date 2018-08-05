package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginBySelenide {

    public void loginField(String login){ $("#login-form-username").shouldBe(visible).setValue(login); }

    public void passwordField (String password){ $("#login-form-password").shouldBe(visible).setValue(password);}

    public void loginButton(){$("#login-form-submit").click();}
}
