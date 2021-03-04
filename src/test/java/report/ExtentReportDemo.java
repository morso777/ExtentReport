package report;

import java.io.IOException;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.MediaEntityBuilder;


public class ExtentReportDemo {
	
	@Test
		public void loginTest() throws IOException {
		System.out.println("Login to amazon");
		
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("./Reports/report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest logger=extent.createTest("LoginTest");
		logger.log(Status.INFO, "Login to amazon");
		logger.log(Status.PASS, "Title verified");
		extent.flush();
		
		ExtentTest test= extent.createTest("logoff Test");
		test.log(Status.FAIL, "Title verified");
		
        test.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
               
       test.addScreenCaptureFromPath("C:\\Users\\hiran.pena\\Documents\\Globant\\Integracion\\foto.jpg");
      // test.addScreenCaptureFromPath("screenshot.png");
		extent.flush();
		
			
	}
	}


