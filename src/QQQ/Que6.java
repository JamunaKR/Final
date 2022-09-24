package QQQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.cssSelector("a[class='content tasks']")).click();//[here some elements wont work with any of 
		//the identified locators then we should run for 2 or more times with the same locators and check the locators of the
		//updated is exactly the same identified locators of the previous one becz it may vary from 1 browser page to another)
		
		//driver.findElement(By.xpath("//div[text()='Android calibration']/ancestor::tr/child::td[1]/child::div")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[contains(.,'Calls')]/parent::div/child::div[contains(.,'Sales')]/ancestor::tr/child::td/child::div[@class='checkbox inactive']")).click();
		driver.findElement(By.xpath("//div[contains(.,'Calls')]/parent::div/child::div[contains(.,'Sales')]")).click();
		//driver.findElement(By.cssSelector("a[class='content users']")).click();
	}

}
