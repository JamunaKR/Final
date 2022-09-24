package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Bootstrap is nothing instead of "select tag" we can have button tag or any other tag for the dropdown
public class BootstrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.5/components/dropdowns/");
		
		driver.findElement(By.id("dropdownMenuLink")).click();
		List<WebElement>list=driver.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuLink']//a"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Something else here")) {
				list.get(i).click();
				break;
			}
		}

	}

}
