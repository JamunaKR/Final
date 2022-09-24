package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebElementsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
					
					//1. get the total count of links present on webpage...?
					//2. get the text of each link present on the page....?
		
			
		//all the links are represented by <a> html tag.
		List<WebElement> LinkList=driver.findElements(By.tagName("a"));
		
		System.out.println(LinkList.size());
		
		for(int i=0; i<LinkList.size(); i++) {
			String Links=LinkList.get(i).getText();
			System.out.println(Links);
		}
	}

}
