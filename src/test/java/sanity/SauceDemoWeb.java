package sanity;


import extensions.Verifications;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;


@Listeners(utilities.Listeners.class)
public class SauceDemoWeb extends CommonOps {


    @Test(description = "Test02 - Verify Cart Icon Number")
    @Description("This test checks the correctness of the digits of the cart icon")
    public void test02_VerifyCartIconNumber() {

        WebFlows.login(getData("Username"), getData("Password"));
        WebFlows.addItems(6);
        Verifications.verifyCartIcon(sauceDemoMain.cart_icon, "6");
    }

    @Test(description = "Test03 - Verify Fields validations")
    @Description("Check that all three fields are mandatory")
    public void test03verifyValidations() {

        WebFlows.clickOnCart();
        WebFlows.moveToCheckOut();
        WebFlows.firstNameValidation();
        Verifications.verifyMessageDisplayed(sauceDemoYourInformation.error_msg);
        WebFlows.lastNameValidation();
        Verifications.verifyMessageDisplayed(sauceDemoYourInformation.error_msg);
        WebFlows.ZipCodeValidation();
        Verifications.verifyMessageDisplayed(sauceDemoYourInformation.error_msg);
        Verifications.verifyExpectations();
    }


    @Test(description = "Test04 - Verify Purchase")
    @Description("This test checks the sum of the items is equal to expected total and also verify purchase complete ")
    public void test04VerifyTotal() {

        WebFlows.fillZipCode();
        double itemsSum = WebFlows.getItemsSum();
        System.out.println("Sum of Prices is: " + itemsSum);
        WebFlows.clickOnCart();
        WebFlows.moveToCheckOut();
        WebFlows.fillInformation(getData("FirstName"), getData("LastName"), getData("PostalCode"));
        double actualItemTotal = WebFlows.getItemTotal();
        Verifications.expectedEqualPrices(itemsSum, actualItemTotal);
        WebFlows.submitPurchase();
        Verifications.verifySuccess(sauceDemoCompletePage.txt_thankYou, "Thank you for your order!");
        Verifications.verifyExpectations();
    }

}




