package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YourCartPage {

    @FindBy(how = How.ID , using = "checkout")
    public WebElement checkout_btn;

}
