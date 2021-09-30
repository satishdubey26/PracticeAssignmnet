package testCase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pages.HomePageOrangeHRM;
import com.pages.MyReview;

import Utility.Base;

public class pracs extends Base {
	
	@BeforeClass
	public void StartRepor() throws IOException {
//		ExtentHtmlReporter reports = new ExtentHtmlReporter("./Reports/MyReviewTest.html");
//		extend =new ExtentReports();
//		extend.attachReporter(reports);
		parameterization();
		intialze();
		//myreview=new MyReview();
		//homepageorangehrm=new HomePageOrangeHRM();
		
	}

	@Test(priority=1)
	public void MyReviewPage() throws IOException {
		System.out.println("hello");
	}
	
	@AfterClass
	public void EndReport() {
	
		//CloseReport();
		driver.quit();
	}

}
