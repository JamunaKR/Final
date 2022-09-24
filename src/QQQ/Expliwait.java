package QQQ;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expliwait {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//**** Why the implicit wait and explicit waits cannot be used in the same program...???
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com.au/");
		WebElement elect=driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(elect).perform();
		
		//IMP:: what is the default polling period of implicit and explicit waits ?? - 250 ms for a period of 10 seconds
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.elementToBeClickable(
		 * By.xpath("//a[.='Cameras']/../following-sibling::li[1]/a"))).click();
		 */
		
		//  -----------------------OR----------------------------------
		
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		WebElement element= wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//a[.='Cameras']/../following-sibling::li[1]/a")));
		element.click();
	}

}
