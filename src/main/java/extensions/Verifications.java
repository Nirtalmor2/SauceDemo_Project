package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.CommonOps;

import static org.testng.Assert.assertEquals;

public class Verifications extends  CommonOps{

    @Step("Verify Car Icon Counting")
    public static void verifyCartIcon(WebElement cart_icon, String expected) {
        assertEquals(cart_icon.getText(), expected);

    }
    @Step("Verify Full Purchase")
    public static void verifySuccess(WebElement txt_thankYou, String expected) {
        assertEquals(txt_thankYou.getText(), expected,"purchase failed!");

    }
    @Step("Verify prices are equal")
    public static void expectedEqualPrices(double actualPrice,double expectedPrice){
        softAssert.assertEquals(actualPrice, expectedPrice,"prices are not equal");

    }

    @Step ("Verify that the title is exist")
        public static void verifyTitleDisplayed (WebElement page_title){
        Assert.assertTrue(UIActions.isDisplayed(page_title));
        }


    @Step("Verify if error message are displayed")
    public  static void verifyMessageDisplayed(WebElement error_msg){
        softAssert.assertTrue(error_msg.isDisplayed());

    }


    @Step("Verify Expectations")
    public static void verifyExpectations(){
        softAssert.assertAll();
    }




}
