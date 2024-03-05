package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {
    @Step("Login")
    public static void login(String user, String pass) {
        UIActions.updateTextHuman(sauceDemologin.txt_username, user);
        UIActions.updateTextHuman(sauceDemologin.txt_password, pass);
        UIActions.click(sauceDemologin.btn_login);

    }

    @Step("UsersTest")
    public static void usersTest(String user, String pass) {
        UIActions.updateTextHuman(sauceDemologin.txt_username, user);
        UIActions.updateTextHuman(sauceDemologin.txt_password, pass);
        UIActions.click(sauceDemologin.btn_login);
        String titleMessage = UIActions.getText(sauceDemoMain.page_title);
        System.out.println("The title of the page is :" + titleMessage);



        }
    @Step("Reset WebSite")
    public static void navigateToLoginPage () {
        driver.get(CommonOps.getData("URL"));
    }


    @Step("Add Items Only")
    public static void addItems(int numberOfItems) {
        for (int i = 0; i < numberOfItems; i++) {
            sauceDemoMain.itemsButtons.get(i).click();
        }
    }

    @Step("Navigate to car")
    public static void clickOnCart() {
        UIActions.click(sauceDemoMain.cart_icon);
    }

    @Step("Navigate to checkout")
    public static void moveToCheckOut() {
        UIActions.click(sauceDemoYourCartPage.checkout_btn);
    }

    @Step("Fill Information")
    public static void fillInformation(String firstName, String lastName, String postalCode) {
        UIActions.updateText(sauceDemoYourInformation.txt_firstName, firstName);
        UIActions.updateText(sauceDemoYourInformation.txt_lastName, lastName);
        UIActions.updateText(sauceDemoYourInformation.txt_postalCode, postalCode);
        UIActions.click(sauceDemoYourInformation.continue_btn);

    }

    @Step("check first field validations ")
    public static void firstNameValidation() {
        UIActions.click(sauceDemoYourInformation.continue_btn);
        String errorMSG = UIActions.getText(sauceDemoYourInformation.error_msg);
        System.out.println("The Error of the First Name field is :" + errorMSG);

    }

    @Step("check second field validations ")
    public static void lastNameValidation() {
        UIActions.updateText(sauceDemoYourInformation.txt_firstName, "test - firsName");
        UIActions.click(sauceDemoYourInformation.continue_btn);
        String errorMSG = UIActions.getText(sauceDemoYourInformation.error_msg);
        System.out.println("The Error of the Last Name field is :" + errorMSG);

    }

    @Step("check Third field validations ")
    public static void ZipCodeValidation() {
        UIActions.updateText(sauceDemoYourInformation.txt_lastName, "test - lastName");
        UIActions.click(sauceDemoYourInformation.continue_btn);
        String errorMSG = UIActions.getText(sauceDemoYourInformation.error_msg);
        System.out.println("The Error of the Zip/Postal Code field is :" + errorMSG);

    }

    @Step("fill zip code field")
    public static void fillZipCode() {
        UIActions.updateText(sauceDemoYourInformation.txt_postalCode, "test - zipCode");
        UIActions.click(sauceDemoYourInformation.continue_btn);

    }


    @Step("Submit Purchase:")
    public static void submitPurchase() {
        UIActions.click(sauceDemoOverviewPage.finish_btn);

    }


    @Step("Sum Prices")
    public static double getItemsSum() {
        List<String> items = UIActions.getElementsText(sauceDemoMain.itemsPrices);
        double total = 0;
        for (String item : items) {
            total += Double.parseDouble(item.replace("$", ""));

        }
        return total;

    }

    @Step("Item Total")
    public static double getItemTotal() {
        String itemTotal = UIActions.getText(sauceDemoOverviewPage.item_total).replace("$", "");
        double numberTotal = Double.parseDouble(itemTotal.replace("Item total: ", ""));
        return numberTotal;

    }

    @Step("Go back to LoginPage")
    public static void goBackToLoginPage(){
        UIActions.navigateToUrl("https://www.saucedemo.com");
    }


}