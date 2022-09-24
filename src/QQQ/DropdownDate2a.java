package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDate2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		//How will u select the value with the get opts..?
		Select sel=new Select(day);
		//sel.selectByVisibleText("18");
		
		System.out.println(sel.isMultiple());
		
		//how will u get the size of the total no. of values..?
		List<WebElement>list=sel.getOptions();
		System.out.println(list.size());
		
		//How will u print all the values from the console..?
		
		  for (int i = 0; i < list.size(); i++) {
			  
			  String listday=list.get(i).getText();
			  System.out.println(listday);
		  
		  if (listday.equals("10")) { 
			  list.get(i).click(); 
			  break; 
			  } 
		  }	
			}
	}
