package SSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Date {

	public static void main(String[] args) throws InterruptedException {
		String month="June 2022";
		String day="17";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		
		driver.findElement(By.xpath("//*[@id='checkin']")).click();
		Thread.sleep(2000);
		
		while (true) {
			
			String text=driver.findElement(By.xpath("//*[@id='fadein']/div[3]/div[1]/table")).getText();
			
			if(text.equals(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//table[@class=' table-condensed']//tr//th[@class='next']//i[@class='icon mdi mdi-long-arrow-right']")).click();
			}
		}
		
		driver.findElement(By.xpath("//*[@id='fadein']/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]")).click();
		
	}

}
