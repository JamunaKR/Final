package QQQ;

import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		c.close();
	}

}
