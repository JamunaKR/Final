package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMulti {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/Flights");
		//WebElement chose1= driver.findElement(By.xpath("//div[@class='uitk-experimental-adaptive']"));
		//selectOptionFromDropDown(chose1,"1 traveler");
		//WebElement chose2= driver.findElement(By.xpath("//input[@id='adult-input-0']/following-sibling::button"));
		//chose2.click();
		
		//WebElement chose3=driver.findElement(By.xpath("//button[@aria-label='Preferred flight class Economy']"));
		//WebElement chose3=driver.findElement(By.className("uitk-link uitk-menu-trigger icon-right uitk-link-layout-default uitk-type-300"));
		WebElement chose3=driver.findElement(By.xpath("//*[@id='preferred-class-input-trigger']/svg")); 
		selectOptionFromDropDown(chose3,"Business class");
		
		//System.out.println("if the adults in traveller option is selected as 2 ?"+ chose2.isSelected());
	}
	
	public static void selectOptionFromDropDown(WebElement ele,String value) {
		Select sel = new Select(ele);
		List<WebElement>allopt=sel.getOptions();
		for (WebElement opt : allopt) {
			if (opt.getText().equals(value)) {
				opt.click();
				break;
				
			}
			
		}
	}

}
