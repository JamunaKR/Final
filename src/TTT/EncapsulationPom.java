package TTT;

import org.openqa.selenium.support.PageFactory;

public class EncapsulationPom {
	//How to  implement Encapsulation?
	
//Private data variables : So that these var cannot be accessed directly from outside the class
	//1)Declaration:
	private int ssn;
	private String empName;
	private int empAge;
	
	//2)Initialization:
	public void setSsn(int ssn) {
		this.ssn = ssn;	//Here assigning the local variable value to class variable.
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
//Getters and Setters methods : to get and set the values of the fields.
	//3)Utilization:
	//In order to get these methods(getters and setters)...>Right click on this page...>Source...>Generate Getters & Setters
	public int getSsn() {
		return ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}
	
	
	public static void main(String[] args) {
		EncapsulationPom en=new EncapsulationPom();
		en.setEmpName("James Bond");
		en.setEmpAge(28);
		en.setSsn(123456);
		
		System.out.println("The Employee Name is:" +en.getEmpName());
		System.out.println("The Employee Age is:" +en.getEmpAge());
		System.out.println("The Employee Ssn is:" +en.getSsn());
	}

}
