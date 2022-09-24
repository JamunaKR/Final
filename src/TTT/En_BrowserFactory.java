/**
 * 
 */
package TTT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author RiChi
 *
 */
public class En_BrowserFactory {
static WebDriver driver;

public static WebDriver startBrowser(String browser, String url) {
	if(browser.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	else if (browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("IE")){
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.get(url);
	
	return driver;
}

}
