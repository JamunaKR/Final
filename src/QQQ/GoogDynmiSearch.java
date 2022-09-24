package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogDynmiSearch {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Here eventhough we are opening the google browser, we have to again open it through the 
		//google link[i.e., https:// is manditory] while we do the testing in order to identify the webelement from the specified locators. 
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("Java");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li/descendant::div[@class='wM6W7d']"));
		System.out.println("Total no. of suggestions in searchbox::::======>>" +list.size());
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		if (list.get(i).getText().contains("javascript")) {
			list.get(i).click();
			break;
		}
	}
	}
}
