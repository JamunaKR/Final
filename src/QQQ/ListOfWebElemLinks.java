package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebElemLinks {
	
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		//or
		//List<WebElement> Links=driver.findElements(By.xpath("//a"));
		 
		//to get the size of the links 
		int count =Links.size();
		System.out.println("The no. of Links are :" + count);
		 
		 //to get the Links text 
		for (WebElement all:Links) { 
			String text=all.getText();
			System.out.println(text);
		  }
		 
	}

}
