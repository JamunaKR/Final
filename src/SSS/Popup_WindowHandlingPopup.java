package SSS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_WindowHandlingPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("(//a[.='documentation'])[1]")).click();
		//copy the link address from the element (just right click on the element to be inspect) 
		Robot rb=new Robot();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_LEFT);
		
		Thread.sleep(2000);
		
		rb.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

}
