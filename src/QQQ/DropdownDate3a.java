package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDate3a {

	//Without using the select class how will u get the values in the dropdown..?
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//driver.set(new ChromeDriver());
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
		
	//without using select class( getoptions() is not used here) so, for getting all the values we go with findelements 
	List<WebElement> monthall=driver.findElements(By.xpath("//select[@id='month']//option"));
	System.out.println(monthall.size());
	
	for (int i = 0; i < monthall.size(); i++) {
		String listall=monthall.get(i).getText();
		System.out.println(listall);
		
			 if(listall.equals("Jun")) { 
				 monthall.get(i).click();
				 break;
				  }	 
		}
	}

}
