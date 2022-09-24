package SSS;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Date4_SpaceJet {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement ele=driver.findElement(By.xpath("//div[.='Departure Date']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		
		String monthYear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
		System.out.println(monthYear); //May 2022
		String month=monthYear.split(" ")[0].trim();
		String year=monthYear.split(" ")[1].trim();
		//String text=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
		
		while (!(month.equals("August") && year.equals("2022"))) {
			WebDriverWait wait1=new WebDriverWait(driver, 20);
wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(
"//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']")))).click();

			
			monthYear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
			System.out.println(monthYear);
			month=monthYear.split(" ")[0].trim();
			year=monthYear.split(" ")[1].trim();
			
		}
		driver.findElement(By.xpath("//div[.='15']")).click();
		/*while (true) {
			String text=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
			if(text.equals(month)) {
				break;
			}
			else {
				WebElement ele1=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']"));
				ele1.click();
			}
		}
		List<WebElement> all=driver.findElements(By.xpath("//*[@id=\\\"main-container\\\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/div/div[3]/div/div"));
		for (WebElement a : all) {
			String date_text=a.getText();
			System.out.println(date_text);
		}
			
		
	}*/

}
}
