package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserEngine {
	
	public static WebDriver driver;
	
	public static WebDriver browserConfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mskad\\OneDrive\\IT\\~DevSecOpsAndPlatformEngineering\\Digitalpoint.tech\\GitrepoCode\\forumAutomation\\forumAutomation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome Browser opened.");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\mskad\\OneDrive\\IT\\~DevSecOpsAndPlatformEngineering\\Digitalpoint.tech\\GitrepoCode\\forumAutomation\\forumAutomation\\drivers\\geckodriver.exe");
		// driver = new FirefoxDriver();
		// System.out.println("Firefox Browser opened.");
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		return driver;
	}
}