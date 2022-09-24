package RRR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
	//Mouse Movement Concept or Handling Dropdown Menus :
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Method 1:
		//driver.findElement(By.xpath("//a[contains(.,'Admin')]")).click();
		//driver.findElement(By.id("menu_admin_UserManagement")).click();
		//driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		//Method 2:
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Configuration")).click();
		driver.findElement(By.linkText("Custom Fields")).click();
		//here again if we perform the MoveToEle(), it wont perform the action so used this method.
	}

}
