package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class MainPage {

    // =====================================================  Add/Remove Buttons =====================================

    @FindBy(xpath = "//div[@class='pricebar']/button")

    public List<WebElement> itemsButtons;


    // =====================================================  Prices  =====================================

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElement> itemsPrices;



    // =====================================================  Cart Icon Button =====================================
    @FindBy (how = How.XPATH , using = "//span[@class='shopping_cart_badge']")
    public WebElement cart_icon;

    // =====================================================  Page Title =====================================

    @FindBy (how = How.XPATH , using = "//span[@class='title']")
    public WebElement page_title;















}
