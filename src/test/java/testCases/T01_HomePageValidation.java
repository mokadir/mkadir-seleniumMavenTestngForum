package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BrowserEngine;
import utilities.TestData;

public class T01_HomePageValidation {
	// Import Selenium Web Driver interface
	public static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() {
		// Open browser
		driver=BrowserEngine.browserConfig();
	}
	
	@Test
	public static void homePageTest() {
		// Load the application under test
		driver.get(TestData.homePageURL);
		// Home page title validation
		String homePageTitleActual=driver.getTitle();
		Assert.assertEquals(homePageTitleActual, TestData.homePageTitleExpected);
	}
	
	@AfterMethod
	public static void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		// Close the browser
		driver.close();
	}
}