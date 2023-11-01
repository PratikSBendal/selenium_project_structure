package creditfair_website_test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import creditfair_website_config.WebsiteBrowswer;


public class WebsiteHelper {
	public static WebDriver driver;
	WebsiteBrowswer obj;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException {
		System.out.println(WebsiteBrowswer.getDriver());
		WebsiteHelper.driver = WebsiteBrowswer.getDriver();

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) 
		{
		}
		System.out.println("afterMethod");
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");

	}

	@AfterSuite
	public void afterSuite() {
//		driver.quit();
	}
}
