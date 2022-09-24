package SSS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.media.sound.Toolkit;

public class Popup_FileUpload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//a[@title='Click to upload your resume']")).click();
		
		//Using sendkeys: This sendkeys() is possible only, when we inspect element and if contains the type='File' 
		//then we can handle by using this method or else we have use by Robot class. 
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("F:\\JAMUNA updated Resume.pdf");
		
		//-------------------------OR---------------------------
		
		//2) By performin click action
		//driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		//we will get exception becz, sometimes click() also not works, so we have to go with JavaScript Exceutor
		
		//3) Using Robot class methods
		WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);//click action on button
		
		//1) Copy the path 
		//2) CRTL+V (Paste)  
		//3) Enter....these 3 actions has to perform in Robot class
		Robot rb=new Robot();
		rb.delay(2000);
	
		//put path to file in a clipboard
		StringSelection ss=new StringSelection("F:\\JAMUNA updated Resume.pdf");
		java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CRTL+v
		rb.keyPress(KeyEvent.VK_CONTROL);//Press Crtl key
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
