package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OverviewPage {
    @FindBy(how = How.ID , using = "finish")
    public WebElement finish_btn;

    @FindBy(how = How.XPATH, using = "//div[@class='summary_subtotal_label']")
    public WebElement item_total;

}
