package setup;

import java.util.Arrays;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
 
public class ExtentListeners implements ITestListener {
     
    static Date d = new Date();
    static String fileName = "ExtentReport_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
 
    private static ExtentReports extent = ExtentManager.createInstance(System.getProperty("user.dir")+"\\reports\\"+fileName);
     
    public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
     
 
    public void onTestStart(ITestResult result) {
     
        ExtentTest test = extent.createTest(result.getTestClass().getName()+"     @TestCase : "+result.getMethod().getMethodName());
        testReport.set(test);
         
    }
 
    public void onTestSuccess(ITestResult result) {
         
        String methodName=result.getMethod().getMethodName();
        String logText="<b>"+"TEST CASE:- "+ methodName.toUpperCase()+ " - PASSED"+"</b>";      
        Markup markup = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
        testReport.get().pass(markup);
         
    }
 
    public void onTestFailure(ITestResult result) {
         
        String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
        testReport.get().fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
                + "</font>" + "</b >" + "</summary>" +excepionMessage.replaceAll(",", "<br>")+"</details>"+" \n");
         
        try {
 
            ExtentManager.captureScreenshot();
            testReport.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
                    MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName)
                            .build());
        } catch (Exception e) {
 
        }
         
        String failureLogg="TEST CASE FAILED";
        Markup markup = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
        testReport.get().log(Status.FAIL, markup);
 
    }
 
    public void onTestSkipped(ITestResult result) {
         
        String methodName=result.getMethod().getMethodName();
        String logText="<b>"+"TEST CASE:- "+ methodName.toUpperCase()+ " - SKIPPED"+"</b>";     
        Markup markup = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
        testReport.get().skip(markup);
 
    }
 
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
 
    }
 
    public void onStart(ITestContext context) {
    }
 
    public void onFinish(ITestContext context) {
 
        if (extent != null) {
 
            extent.flush();
        }
    }
}