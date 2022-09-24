package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goog {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("testing");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li/descendant::div[@class='wM6W7d']"));
		
		System.out.println("total no.of suggestions in searchbox" + list.size());
		
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("testing interview questions")) {
				list.get(i).click();
				break;
			}
		}
		
		
	}

}
