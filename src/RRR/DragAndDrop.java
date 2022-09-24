package RRR;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Usually deal with frames
public class DragAndDrop {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);//Switch to frame it its present
		
		Actions action=new Actions(driver);
		
		  action.clickAndHold(driver.findElement(By.id("draggable"))).
		  moveToElement(driver.findElement(By.id("droppable"))). release().perform();
		 
		
		//OR	Using dragAndDrop method
		/*
		 * WebElement src=driver.findElement(By.id("draggable")); 
		 * WebElement tar=driver.findElement(By.id("droppable")); 
		 * action.dragAndDrop(src,tar).perform();
		 */
		
		//OR 	Using robot class also we can perform this 
		/*
		 * Robot rob=new Robot(); driver.get("");
		 * rob.mousePress(InputEvent.BUTTON3_MASK);
		 * rob.mousePress(InputEvent.BUTTON3_MASK);
		 */
	}

}
