package SSS;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup_ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/au/");
		
		/*WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("b-more")))).click();
		driver.findElement(By.id("bm-facebook")).click();
		Thread.sleep(2000);*/
		
		
		WebElement button=driver.findElement(By.xpath("(//div[@class='btn-container  '])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String parentWinId=it.next();
		System.out.println("Parent win id:"+parentWinId);
		
		String childWinId=it.next();
		System.out.println("child win id:"+childWinId);
		
		driver.switchTo().window(childWinId);
		Thread.sleep(2000);
		System.out.println("Get the title of the child page :"+ driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWinId);
		Thread.sleep(2000);
		System.out.println("Get the title of the Parent page :" +driver.getTitle());	

	}

}
