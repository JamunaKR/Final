package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMulti2 {
	 	static WebDriver driver;
	 	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		String etitle=driver.getTitle();
		System.out.println("title Value :"+ etitle);
		
		//WebElement prod=driver.findElement(By.id("first"));
		//Select maiprod=new Select(driver.findElement(By.className("col-lg-3")));	//for By.id() it wont work
		
		//Approach 1:
		/*
		 * maiprod.selectByValue("Yahoo"); Thread.sleep(2000);
		 * maiprod.selectByVisibleText("Iphone");
		 */
		
		//approach 2: select opt from dropdown without using methods
		/*List<WebElement>list=maiprod.getOptions();
		for (WebElement opt : list) {
			if (opt.getText().equals("Google")) {
				opt.click();
				break;
			}*/
			
		//Approach 3:
		/*
		 * Select maiprod=new Select(driver.findElement(By.className("col-lg-3")));
		 * maiprod.selectByValue("Apple"); 
		 * Thread.sleep(1000); 
		 * Select maianim=new
		 * Select(driver.findElement(By.id("animals")));
		 * maianim.selectByVisibleText("Baby Cat");
		 */
			
		//Approach 4:
		WebElement pro1=driver.findElement(By.className("col-lg-3"));
		selectOptFromDropdown(pro1,"Apple");
		WebElement ani1=driver.findElement(By.id("animals"));
		selectOptFromDropdown(ani1, "big baby cat");
			
		}
	
	public static void selectOptFromDropdown(WebElement ele, String value) {
		Select sel=new Select(ele);
		List<WebElement>list=sel.getOptions();
		for (WebElement opt : list) {
			if (opt.getText().equals(value)) {
				opt.click();
				break;
			}
			
		}
	}
		
	}
