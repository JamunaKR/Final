package QQQ;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Selenium1\\\\Final\\\\chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//1) Select specific checkbox
		//driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		
		//2) Select all the checkboxes
		List<WebElement>chosbox= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("The no. of checkboxes are :"+chosbox.size());
		
		/*
		 * for (int i=0;i<chosbox.size();i++) { 
		 * chosbox.get(i).click();
		 * } 
		 * 					OR
		 */
		
		/*
		 * for(WebElement chbox:chosbox) { 
		 * chbox.click(); 
		 * }
		 */
		  
		  //3) Select multiple checkboxes (monday and friday)
		
			/*
			 * for (WebElement chbox:chosbox) { 
			 * String checkboxname=chbox.getAttribute("id");
			 * if(checkboxname.equals("monday")||checkboxname.equals("friday")) {
			 * chbox.click();
			 *  } 
			 *  }
			 */
		
		//4) select last 2 checkboxes (saturday and sunday)
		//Total no. of checkboxes - no. of checkboxes wants to select=starting index 
		//7-2=5
		/*
		 * int totalcheckboxes=chosbox.size(); 
		 * for(int i=totalcheckboxes-2;i<totalcheckboxes;i++) { 
		 * chosbox.get(i).click(); 
		 * }
		 */
		
		//5) select first 2 checkboxes (monday and tuesday)
		/*int totalcheckboxes=chosbox.size();
		for (int i=0;i<totalcheckboxes;i++)
		{
			if(i<2) {
			chosbox.get(i).click();
		}*/		 
	}
	}
