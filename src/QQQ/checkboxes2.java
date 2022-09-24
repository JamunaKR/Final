package QQQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		WebElement bmwradiobutton=driver.findElement(By.id("bmwradio"));
		bmwradiobutton.click();
		Thread.sleep(2000);
		WebElement benzradiobutton=driver.findElement(By.id("benzradio"));
		benzradiobutton.click();
		Thread.sleep(2000);
		WebElement bmwcheckbox=driver.findElement(By.id("bmwcheck"));
		bmwcheckbox.click();
		WebElement benzcheckbox=driver.findElement(By.id("benzcheck"));
		benzcheckbox.click();
		
		System.out.println("if bmw radio button is selected ?"+bmwradiobutton.isSelected());
		//isSelected() works only when the specified radio button locator is present if the whole text with 
		//radio button is present then this method doesn't work preciously [Eg: if locator represents both radio_2 yrs and specified locator for radio button]
		System.out.println("if benz radio button is selected ?"+benzradiobutton.isSelected());
		System.out.println("if bmw checkbox is selected ?"+bmwcheckbox.isSelected());
		System.out.println("if benz checkbox is selected ?"+benzcheckbox.isSelected());
		
	}

}
