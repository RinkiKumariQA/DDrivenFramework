package Module_4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AddListner extends Report implements ITestListener
{
	   ExtentSparkReporter createReport;
	   ExtentReports addTest;
	   ExtentTest addLog;
	   
	   @BeforeTest
	   void setup()
	   {
		   createReport =new ExtentSparkReporter("ReportFile.html");
		   addTest =new ExtentReports();
		   addTest.attachReporter(createReport);
		   
		   addTest.setSystemInfo("Operating System", "Window");
		   addTest.setSystemInfo("Browser", "Window");
		   addTest.setSystemInfo("Browser Version", "192.12.32.12");
		   addTest.setSystemInfo("UserName","Rinki");
		   
		   createReport.config().setDocumentTitle("Test Case Report");
		   createReport.config().setReportName("Report Day");
		   createReport.config().setTheme(Theme.STANDARD);
	   }
		   
   public void onStart(ITestContext Result)
   {
	  setup();
   }
   public void onTestStart(ITestResult Result)
   {
	   System.out.println("onTestStart");
   }
   public void onTestSuccess(ITestResult Result)
   {
	   addLog= addTest.createTest(Result.getName());
	   addLog.log(Status.PASS, MarkupHelper.createLabel("Pass testcase", ExtentColor.GREEN));
   }
   public void onTestFailure(ITestResult Result)
   
   {
	   try {
		screenShot();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   addLog=addTest.createTest(Result.getName());
	   addLog.log(Status.FAIL, MarkupHelper.createLabel("Fail testcase", ExtentColor.RED));
	   String path="C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\Screenshot\\j1.png";
	   
	   addLog.fail("screenshot"+addLog.addScreenCaptureFromPath(path));
	}
   
   public void onTestSkipped(ITestResult Result)
   {
	   addLog = addTest.createTest(Result.getName());
	   addLog.log(Status.SKIP, MarkupHelper.createLabel("Skipped testcase", ExtentColor.PURPLE));
   }
   public void onFinish(ITestContext Result)
   {
	   addTest.flush();
   }
}
