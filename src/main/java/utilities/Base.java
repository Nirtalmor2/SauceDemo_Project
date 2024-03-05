package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pageObjects.sauceDemo.CompletePage;
import pageObjects.sauceDemo.OverviewPage;
import pageObjects.sauceDemo.YourCartPage;

public class Base {
      protected static WebDriver driver;
      protected static WebDriverWait wait;
      protected static Actions action;
      protected static SoftAssert softAssert;





      protected  static  pageObjects.sauceDemo.LoginPage sauceDemologin;
      protected  static  pageObjects.sauceDemo.MainPage sauceDemoMain;
      protected  static  pageObjects.sauceDemo.YourInformationPage sauceDemoYourInformation;
      protected  static YourCartPage sauceDemoYourCartPage;
      protected  static OverviewPage sauceDemoOverviewPage;
      protected  static CompletePage sauceDemoCompletePage;



}
