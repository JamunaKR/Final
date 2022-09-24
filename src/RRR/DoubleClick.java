package RRR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Usually deal with frames
public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://api.jquery.com/dblclick/");
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//span[.='Double click the block']//preceding-sibling::div"))).perform();
		
		/* OR
		 * WebElement dbclick=driver.findElement(By.xpath("//span[text()='Double click the block']/preceding-sibling::div"));
		 * Thread.sleep(2000); 
		 * Actions act=new Actions(driver);
		 * act.doubleClick(dbclick).perform();
		 */
		
	}

}
