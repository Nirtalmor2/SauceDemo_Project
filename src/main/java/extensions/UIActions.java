package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("Click On Element")
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Update Text Element")
    public static void updateText(WebElement elem, String text) {
        wait.until((ExpectedConditions.visibilityOf(elem)));
        elem.sendKeys(text);
    }

    @Step("Update Text Element As Human")
    public static void updateTextHuman(WebElement elem, String text){
        wait.until((ExpectedConditions.visibilityOf(elem)));
        for (char ch : text.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(25, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch + "");
        }

    }

    @Step("Check if element is displayed")
    public static boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    @Step("Go to url")
    public static void navigateToUrl(String url){
        driver.navigate().to(url);
    }


    @Step("Get Text")
    public static String getText(WebElement elem) {
        return elem.getText();

    }

    @Step("Get Elements Text")
    public static List<String> getElementsText(List<WebElement> elements) {
        List<String> items = new ArrayList<>();
        for (WebElement elem : elements) {
            items.add(elem.getText());
        }
        return items;
    }

//    public static void updateDropDown(WebElement elem, String text) {
//        wait.until((ExpectedConditions.visibilityOf(elem)));
//        Select dropDown = new Select(elem);
//        dropDown.selectByVisibleText(text);
//    }


}
