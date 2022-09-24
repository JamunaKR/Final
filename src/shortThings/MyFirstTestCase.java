package shortThings;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Included TestNGListeners
	@Listeners(shortThings.TestNGListerner.class)

	public class MyFirstTestCase {
				WebDriver driver;

	@Test
	public void verifyGoogleTitle() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("The title is :" +driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void testMatch() {
		System.out.println("Test 2 dummy");
		Assert.assertTrue(false);
	}
}
