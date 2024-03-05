package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy (how = How.NAME , using = "user-name")
    public WebElement txt_username;

    @FindBy (how = How.NAME , using = "password")
    public WebElement txt_password;

    @FindBy (how = How.NAME , using = "login-button")
    public WebElement btn_login;

}
