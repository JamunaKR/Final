 package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDate3aGeneric {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
		
		String month_xpath="//select[@id='month']//option";
		String year_xpath="//select[@id='year']//option";
		String day_xpath="//select[@id='day']//option";
		
		selectDropdown(month_xpath,"Feb");
		selectDropdown(year_xpath,"1980");
		selectDropdown(day_xpath,"9");
	}
		//But without using select class 
		public static void selectDropdown(String xpathvalue, String value) {
			
			List<WebElement> all=driver.findElements(By.xpath(xpathvalue));
			System.out.println(all.size());
			
			for (int i = 0; i < all.size(); i++) {
				String listall=all.get(i).getText();
				System.out.println(listall);
				
				  if(listall.equals(value)) { 
					  all.get(i).click();
					  break;
					  }	 
			}
			
		}
	}

