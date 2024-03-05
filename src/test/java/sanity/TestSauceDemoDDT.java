package sanity;

import extensions.Verifications;
import jdk.jfr.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

public class TestSauceDemoDDT extends CommonOps {

    @BeforeMethod
    public static void reset() {
        WebFlows.goBackToLoginPage();
    }

    @Test(description = "Test01 - Verify Validity check for users", dataProvider = "data-provider-users", dataProviderClass = utilities.ManageDDT.class)
    @Description("This test checks whether all six users pass, Using DDT")
    public void test01_VerifyUsers(String user, String password) {
        WebFlows.usersTest(user, password);
        Verifications.verifyTitleDisplayed(sauceDemoMain.page_title);
    }
}
