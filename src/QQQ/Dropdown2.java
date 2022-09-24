package QQQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		/*
		 * Select sel=new Select(day); sel.selectByValue("10");
		 * 
		 * Select sel1=new Select(month); sel1.selectByVisibleText("May");
		 * 
		 * Select sel2=new Select(year); sel2.selectByVisibleText("1993");
		 */
		  
		 //System.out.println(sel.isMultiple());
		 
		String dob = "10-May-1993";
		String dobArr[] = dob.split("-");
		
		//selectValueFromDropdown(ele, value);
		selectValueFromDropdown(day, dobArr[0]);
		selectValueFromDropdown(month, dobArr[1]);
		selectValueFromDropdown(year, dobArr[2]);
	}

	public static void selectValueFromDropdown(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
	}

}
