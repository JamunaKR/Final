package SSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_AuthenticatedPop {
//Here we have to provide the username & pwd whenever we open the url, so in order to avoid those we use this kind of popups
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Syntax:
		//https://the-internet.herokuapp.com/basic_auth......>  NORMAL URL
		//https://admin:admin@the-internet.herokuapp.com/basic_auth..........>  MODIFIED URL
		//https://username:pwd@URL......>  Standard Format
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
