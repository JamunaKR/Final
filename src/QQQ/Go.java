package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Go {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java");
		List<WebElement> all=driver.findElements(By.xpath("//ul[@jsname='erkvQe']//ul[@jsname='bw4e9b']"));
		//List<WebElement> all=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li//descendant::div[@class='wM6W7d']"));
		
		int count=all.size();
		System.out.println("The no. of suggestions are : "+count);
		
		for (int i = 0; i < all.size(); i++) {
			String alltext=all.get(i).getText();
			System.out.println(alltext);
			
			//even the details is important eg: if i give "Javascript" other than dispalying as "javascript" 
			//we cannot able to get the output
			if (all.get(i).getText().contains("javascript")) { 
				all.get(i).click();
				break;
			}
		}
	}

}
