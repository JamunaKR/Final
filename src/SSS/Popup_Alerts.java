package SSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1) Alert window with OK button:
		
		//driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		//driver.switchTo().alert().accept();
		
		//2) Alert window with both OK and CANCEL button:
		
		//driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//3)Alert window with INPUT box, Capture text from alert:
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		String gettext=driver.switchTo().alert().getText();
		System.out.println(gettext);
		driver.switchTo().alert().sendKeys("Jamuna");
		Thread.sleep(2000);
		//driver.switchTo().alert().accept(); //in result, if we click OK then, the result will be as it is in the textbox 
		//else if we click CANCEL then the result will be null eventhough we provided some texts.
		driver.switchTo().alert().dismiss();
		
	}

}
