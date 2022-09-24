package RRR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightOrContextClick {
	
		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			/*
			 * Actions act=new Actions(driver); 
			 * Thread.sleep(2000); 
			 * WebElement contextclick=driver.findElement(By.cssSelector(".context-menu-one "));
			 * //here in CSS selector "."is very imp.in short terms
			 * act.contextClick(contextclick).perform(); 
			 * WebElement paste=driver.findElement(By.cssSelector(".context-menu-icon-paste")); 
			 * String coppaste=paste.getText(); 
			 * System.out.println(coppaste); 
			 * paste.click();
			 */
			Actions action=new Actions(driver);
			WebElement right=driver.findElement(By.cssSelector(".context-menu-one"));
			action.contextClick(right).perform();
	//Here we cannot able to inspect the copy/paste/cut...So for this just click on right click then will get the copy,
	//cut,paste etc options. Later place the cursor on select an element in the page to inspect later if u keep ur icon 
	//on copy/cut u can get the locators.  
			WebElement copy=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
			String copytext=copy.getText();
			System.out.println(copytext);
			copy.click();
		}

	}
