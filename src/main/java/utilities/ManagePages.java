package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base{

    public  static  void initSauceDemo(){
        sauceDemologin = PageFactory.initElements(driver, pageObjects.sauceDemo.LoginPage.class);
        sauceDemoMain = PageFactory.initElements(driver, pageObjects.sauceDemo.MainPage.class);
        sauceDemoYourInformation = PageFactory.initElements(driver, pageObjects.sauceDemo.YourInformationPage.class);
        sauceDemoYourCartPage = PageFactory.initElements(driver, pageObjects.sauceDemo.YourCartPage.class);
        sauceDemoOverviewPage = PageFactory.initElements(driver, pageObjects.sauceDemo.OverviewPage.class);
        sauceDemoCompletePage = PageFactory.initElements(driver, pageObjects.sauceDemo.CompletePage.class);


    }


}
