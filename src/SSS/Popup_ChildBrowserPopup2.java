package SSS;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup_ChildBrowserPopup2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[.='Register now']")).click();
		Set<String> windHandles=driver.getWindowHandles();
		System.out.println(windHandles);
		
		Iterator<String> it=windHandles.iterator();
		String ParentWin=it.next();
		String ChildWin=it.next();
		System.out.println("Parent:"+ParentWin);
		System.out.println("Child:"+ChildWin);
		
		driver.switchTo().window(ChildWin);
		System.out.println("get the child win title:" +driver.getTitle());
		driver.findElement(By.id("name")).sendKeys("jamuna");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9538501082");
		Thread.sleep(2000);
		
		//driver.close();
		
		driver.switchTo().window(ParentWin);
		driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("Automation Testing");
		System.out.println("get Parent win title:" +driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
