/**
 * 
 */
package uTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author RiChi
 *
 */
public class TestNGBasics2 {

	WebDriver driver;
	
	@BeforeMethod
	public void verifyLoginTest() {
		//webDriverManager.chromedriver.setup();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		verifyLoginLinkTest("jamunakr1803@gmail.com","Jamsri18");
		
	}
	@Test
	public void clickOnContactsTest() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//span[text()='Contacts']"));
		ele.click();
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//a[.='Prakash Joshi']/..//preceding-sibling::td//div/input[@name='id']"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(5000);
		//checkbox.click(); We are getting ElementClickInterceptedException so we used Javascript Executor
	}
	
	public void verifyLoginLinkTest(String emailID, String pwd) {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys(emailID);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	
	@AfterMethod
	public void tearDrown() {
		driver.quit();
	}
	
	
}
