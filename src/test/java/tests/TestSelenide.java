package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginBySelenide;
import static com.codeborne.selenide.Selenide.open;
import utils.ConfigProperties;

public class TestSelenide {
    public static LoginBySelenide loginBySelenide = new LoginBySelenide();

    @Test
    public void test(){
        Configuration.browser = ConfigProperties.getTestProperty("useBrowser");
        open(ConfigProperties.getTestProperty("jiraURL"));
        loginBySelenide.loginField(ConfigProperties.getTestProperty("LoginWebinar5"));
        loginBySelenide.passwordField(ConfigProperties.getTestProperty("PasswordWebinar5"));
        loginBySelenide.loginButton();
    }

    @AfterTest
    public void printProperties(){
        System.out.println("Browser:" + ConfigProperties.getTestProperty("useBrowser"));
        System.out.println("URL:" + ConfigProperties.getTestProperty("jiraURLr"));
        System.out.println("Login:" + ConfigProperties.getTestProperty("LoginWebinar5"));
        System.out.println("Password:" + ConfigProperties.getTestProperty("PasswordWebinar5"));
    }
}
