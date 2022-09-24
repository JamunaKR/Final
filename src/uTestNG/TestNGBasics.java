/**
 * 
 */
package uTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author RiChi
 *
 */
public class TestNGBasics {
	
	WebDriver driver;
	
	@BeforeMethod
	public void validateLoginTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/");	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	
	@Test(priority=1)
	public void verifyPageTitleTest() {
		String title=driver.getTitle();
		System.out.println("The title of the page is:" +title);
						/*if(title.equals("aaa")) {		Not an good code writing	
						}
						else {	
						}*/ 				//Instead
		//Title will get from the ...>right click on the page...>click View Page source...>will get the etitle
		//Will give result as PASSED: verifyPageTitleTest
		Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
		//Assert should import it from the TestNG and not from JUnit package 	
	}
	
	@Test(priority=2)
	public void verifyFreeCRMLogoTest() {
		boolean flag=driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).isDisplayed();
		Assert.assertTrue(flag);	//Will give result as PASSED: verifyFreeCRMLogoTest
	}
	
	@AfterMethod
	public void tearDown() { //burnDown() {
		driver.quit();
	}
}
	


