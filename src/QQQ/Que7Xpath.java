package QQQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que7Xpath {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//a[contains(. , 'Login')]")).click();
	
	WebElement txtLogin= driver.findElement(By.name("username"));
	WebElement txtPwd= driver.findElement(By.xpath("//input[@type='password' and @name='pwd']"));
	txtLogin.sendKeys("admin");
	txtPwd.sendKeys("manager");
	
	//Solution				NOT EXECUTING THIS PROGRAM....GETTING STALE ELEMENT EXCEPTION
	try {
		txtPwd.sendKeys("manager");
	}
	catch (StaleElementReferenceException e) {
		txtPwd= driver.findElement(By.xpath("//input[@type='password' and @name='pwd']"));	
		txtPwd.sendKeys("manager");
	}
	
	
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
}

