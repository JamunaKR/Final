package QQQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// 1) How to enter and clear text from Input box..?
// 2) How to capture Text from InputBox..?
// 3) What is the difference between getText() and getAttribute('value')..?

public class getTextVsGetAttributevalue {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement em=driver.findElement(By.xpath("//input[@type='email']"));
		//em.clear();
		//em.sendKeys("jamuna18@gmail.com");    //.......................................(1)
		
		// 2) Capturing text from InputBox
		System.out.println("Results from getAttribute(): "+em.getAttribute("value"));
		System.out.println("Results from getText(): "+em.getText());
		
		
		//Login Button
		WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Results from getAttribute() :"+log.getAttribute("type"));
		System.out.println("Results from getAttribute() :"+log.getAttribute("class"));
		
		System.out.println("Results from getText() :"+log.getText());
		
		//
		System.out.println(driver.findElement(By.xpath("//div[@class='topic-block-title']/h2")).getText());
		
	}

}
