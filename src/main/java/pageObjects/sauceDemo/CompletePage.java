package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CompletePage {

    @FindBy(how = How.XPATH , using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/h2[1]")
    public WebElement txt_thankYou;

}
