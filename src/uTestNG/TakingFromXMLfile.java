/**
 * 
 */
package uTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author RiChi
 *
 * We cannot able to run this file, its only possible to run this is to run the testNG.xml file....OR else we get error if we directly run this file
 * becz we have to fetch datas from testNG.xml file.
 * so, in order to run this program...>Goto testNG.xml...>Rightclick...>Run as TestNG suite
 */
public class TakingFromXMLfile {
	WebDriver driver;
							//***Working for browser and url but not for fname,lname,emailid****//
	
	@BeforeMethod
	@Parameters({ "browser", "url"})
	public void setupTest(String browser, String url )  {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium1\\Final\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		WebElement ele=driver.findElement(By.xpath("//a[.='Start Free Trial']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	@Test
	@Parameters({ "fname", "lname", "email" })
	public void verifyLoginTest(String fname, String lname, String email) throws InterruptedException {
		
		WebElement element=driver.findElement(By.xpath("(//div[@class='input-outlined start-trial__form-input input-outlined--blur'])[1]"));
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		//element.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]", element, fname);
		//js.executeScript("document.getElementById('First Name').value=fname;");
		//js.executeScript("arguments[0].value='---fname---';", element);
		//element.click();
		//element.sendKeys(fname);
		driver.findElement(By.xpath("(//div[@class='input-outlined start-trial__form-input input-outlined--blur'])[2]")).sendKeys(lname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("confirm-button")).click();
		Thread.sleep(2000);
	}
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/

}
