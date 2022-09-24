package QQQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterfaceMethods {
	
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\chromedriver.exe");	
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//button[.='Accept All Cookies']")).click();
		driver.findElement(By.name("email")).sendKeys("jamunakr1803@gmail.com");
		driver.findElement(By.name("email")).clear();
		System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
		

	}

}
