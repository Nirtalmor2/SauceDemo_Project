package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener {

        public void onStart(ITestContext execution) {
            System.out.println("---------------------- Starting Execution ------------------");
        }

        public void onFinish(ITestContext execution) {
            System.out.println("---------------------- Ending Execution ------------------");
        }

        public void onTestStart(ITestResult test) {
            System.out.println("---------------------- Test: " + test.getName() + " Started ------------------");
        }

        public void onTestSuccess(ITestResult test) {
            System.out.println("---------------------- Test: " + test.getName() + " Passed ------------------");

            //=====================Stop Recording =========================
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            //=====================Delete Recorded File======================
            File file = new File ("./test-recordings/" + test.getName() + ".avi");
            if ((file.delete()))
                System.out.println("File Deleted Successfully");
            else
                System.out.println("Failed To Delete File");
        }

        public void onTestFailure(ITestResult test) {
            System.out.println("---------------------- Test " + test.getName() + " Failed ------------------");
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            saveScreenshot();
        }

        public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
            // TODO Auto-generated method stub
        }

        public void onTestSkipped(ITestResult test) {
            // TODO Auto-generated method stub
        }

    @Attachment(value = "Page Screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

    }
    }





