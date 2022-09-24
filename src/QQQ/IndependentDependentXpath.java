package QQQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentXpath {
	
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//p[.='Java']/../p[2]")).getText();
		//Here follow the steps of Tree Structure of Independent-Dependent Xpath
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
	}
}
