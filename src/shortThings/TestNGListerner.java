package shortThings;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//Note: Initially we wont find the TestNGListerner class Implementations, so for that ...>
//right click on the class name...>source...>Override/implement methods...>select the required methods...>click OK
public class TestNGListerner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started and the details are "+result.getName());
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase success Hurrayy and the details are "+result.getName());
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed and the details are "+result.getName());
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped and the details are "+result.getName());
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
	}

	@Override
	public int hashCode() {
		
		return super.hashCode();
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

}
