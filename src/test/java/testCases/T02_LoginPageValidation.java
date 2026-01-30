package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BrowserEngine;
import utilities.TestData;

public class T02_LoginPageValidation {
	// Import Selenium Web Driver interface
	public static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() {
		// Open browser
		driver=BrowserEngine.browserConfig();
	}
	
	@Test
	public static void loginPageTest() {
		// Load the application under test
		driver.get(TestData.loginPageURL);
		
		// Login page title validation
		String loginPageTitleActual=driver.getTitle();
		Assert.assertEquals(loginPageTitleActual, TestData.loginPageTitle1Expected);
		
		// Identify the UID text and send the value
		driver.findElement(By.name("email")).sendKeys(TestData.loginUID);
		
		// Identify the password text box and send the value
		driver.findElement(By.name("password")).sendKeys(TestData.loginPW);
		
		// Identify submit button and click
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
		
		// After login title validation
		String afterLoginTitleActual=driver.getTitle();
		Assert.assertEquals(afterLoginTitleActual, TestData.afterLoginTitleExpectged);
	}
		
	@AfterMethod
	public static void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		// Close the browser
		driver.close();
	}

}
