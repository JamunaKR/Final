package SSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		
		//String month="August 2022";
		String day="17";
		
		driver.findElement(By.xpath("//*[@id='d1-btn']")).click();
		Thread.sleep(2000);
		
		//String text=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
		//System.out.println(text);
		while(true) {
			String text=driver.findElement(By.xpath("//*[@id='wizard-hotel-pwa-v2-1']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]")).getText();
			//System.out.println(text);
			if(text.equals("August 2022")) {
				break;
			}
		else {
				driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]")).click();
			}
		}
		

	}

}
