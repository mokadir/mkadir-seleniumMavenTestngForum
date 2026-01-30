package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BrowserEngine;
import utilities.TestData;

public class T03_RegistrationPageValidation {
	// Import Selenium Web Driver interface
	public static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() {
		// Open browser
		driver=BrowserEngine.browserConfig();
	}
	
	@Test
	public static void registrationPageTest() {
		// Load the application under test
		driver.get(TestData.registrationPageURL);
		driver.findElement(By.name("language")).click();
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/select/option[2]")).click();
		driver.findElement(By.name("titles")).click();
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div[1]/select/option[2]")).click();
		driver.findElement(By.name("fname")).sendKeys(TestData.regPageFName);
		driver.findElement(By.name("lname")).sendKeys(TestData.regPageLName);
		driver.findElement(By.name("email")).sendKeys(TestData.regPageEmail);
		driver.findElement(By.name("password")).sendKeys(TestData.regPagePW);
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[4]/div/label[2]/input")).click();
		driver.findElement(By.name("phone")).sendKeys(TestData.regPagePhone);
		driver.findElement(By.name("course")).click();
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[5]/select/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[6]/input")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/input")).click();
	}
	
	@AfterMethod
	public static void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		// Close the browser
		driver.close();
	}

}
