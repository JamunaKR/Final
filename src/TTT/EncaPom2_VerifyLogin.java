/**
 * 
 */
package TTT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author RiChi
 *
 */
public class EncaPom2_VerifyLogin {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//1
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		EncaPom2_LoginPage en=new EncaPom2_LoginPage(driver);//2
		
		//This works only when we hav 2 or more locators
		//en.login("jamuakr1803@gmail.com", "Jam12345678");
		
		en.typeUsername("jamunakr1803@gmail.com");
		en.clickContinueBut();
		
		driver.close();
		
	}
	
}
