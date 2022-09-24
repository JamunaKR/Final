package QQQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement seldrp=driver.findElement(By.xpath("//select[@id='carselect']"));
		
		//This Select class can be used only when we have the select tag in the finding locator
		Select dropdown=new Select(seldrp);
		
		//dropdown.selectByVisibleText("Benz");
		//dropdown.selectByValue("honda");
		//dropdown.selectByIndex(1); //here index value is not displayed while inspecting the element, but just counted from index 0.
		
		//selecting options from dropdown without using methods
		
		List<WebElement>alldrop=dropdown.getOptions();
		//here we cannot get the options as its in list box as we have to get it by using any of the loops to get options.
		
		for(WebElement opt:alldrop) {
			if(opt.getText().equals("Honda")) {
				opt.click();
				System.out.println("if the honda is selected : "+ opt.isSelected());	
				break;
			}
		}
		
		//To check wheather the list box is multiselected or not
		if (dropdown.isMultiple()) {
			System.out.println("Multi-selected");	
		}
		else {
			System.out.println("not multi-selected");
		}
	}

}
