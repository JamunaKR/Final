package QQQ;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the browser");
	String browser=sc.nextLine();
	WebDriver driver=null;
	
	if(browser.equals("ff")) {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium1\\Final\\geckodriver.exe");
		driver=new FirefoxDriver();	
	}
	
	else if (browser.equals("gc")) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	Thread.sleep(2000);
	driver.close();
	
	}

}
