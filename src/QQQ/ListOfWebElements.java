package QQQ;

import java.util.ArrayList;
import java.util.List;

public class ListOfWebElements {
	
	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\Final\\driver\\chromedriver.exe");		
	}

	public static void main(String[] args) {
		
	List<String> al=new ArrayList<>();
	
	//To add the data
	al.add("java");
	al.add("manual");
	al.add("sql");
	al.add("selenium");
	
	//to get the size of data
	int count=al.size();
	System.out.println(count);
	
	//to get the text of the data
	for (String a:al) {
		System.out.println(a);
	}
	}

}
