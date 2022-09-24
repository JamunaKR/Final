/**
 * 
 */
package shortThings;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

/**
 * @author RiChi
 *
 */
public class TestRunnerForFailedTC {

	/**
	 * @param args
	 * Method 1:We can execute manually by testNG.xml file >> right click >> testNG suite >>will get design and src files>>
	 * go to src file, give the failed test cases and run but its not possible for 100 testcases. 
	 * so we have to adopt Method 2.
	 * 
	 *For Method 1:After exceution refresh the project >> now goto test-output folder >> will be mentioning automatically 
	 *the test application suite >> under that we get the testng-failed.xml file >>click on that program and run.
	 * 
	 */
	
	//Method 2: create a generic script to run the failed test cases, so that we can inherit to our test classes.
	public static void main(String[] args) {
		TestNG runner=new TestNG(); //Should import the predefined package from TestNG(should not create by us)
		List<String> list=new ArrayList<String>();
		list.add("F:\\Selenium1\\Final\\test-output\\Actitime App Test Automation Suite\\testng-failed.xml");
		//list.add(" "); we can add n numbers)
		runner.setTestSuites(list);
		runner.run();
	}

}
