package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YourInformationPage {
    @FindBy(how = How.ID, using = "first-name")
    public WebElement txt_firstName;
    @FindBy(how = How.ID, using = "last-name")
    public WebElement txt_lastName;
    @FindBy(how = How.ID, using = "postal-code")
    public WebElement txt_postalCode;
    @FindBy(how = How.ID, using = "continue")
    public WebElement continue_btn;




    @FindBy(how = How.XPATH, using = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]")
    public WebElement error_msg;

}
