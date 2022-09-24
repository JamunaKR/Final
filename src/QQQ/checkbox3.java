package QQQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath("//li[@role='presentation']//a[contains(.,'Flights')]")).click();
		WebElement rndtrip=driver.findElement(By.xpath("//li[@role='presentation']//span[text()='Roundtrip']"));
		rndtrip.click();
		Thread.sleep(2000);
		WebElement oneway=driver.findElement(By.xpath("//li[@role='presentation']//span[text()='One-way']"));
		oneway.click();
		Thread.sleep(2000);
		WebElement multicity=driver.findElement(By.xpath("//li[@role='presentation']//span[text()='Multi-city']"));
		multicity.click();
		
		System.out.println("if the round trip is selected ?"+rndtrip.isSelected());
		System.out.println("if the one-way is selected ?"+oneway.isSelected());
		System.out.println("if the multi-city is selected ?"+multicity.isSelected());
	}

}
