
public class Employee {
	private String name; //To hold the name of employee
	private String mobileNumber; //To hold the mobileNumber of employee
	
	Employee(String name, String mobileNumber){ //Constructor
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
	public String getName() { //To get the name of employee
		return name;
	}
	
	public String mobileNumber() { //To get the mobile number of employee
		return mobileNumber;
	}
}
