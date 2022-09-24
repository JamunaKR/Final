package QQQ;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Que1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium1\\Final\\geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		Thread.sleep(1000);
		f.close();

	}

}
