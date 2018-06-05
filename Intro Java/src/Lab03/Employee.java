package Lab03;

/*
 * LUIZ FILHO
 * Introduction to Java
 * LAB03
 * Description: 
 * 3.13 (Employee Class) 
 * Create a class called Employee that includes three instance OK 
 * variables—a first name (type String), a last name (type String) and a monthly salary (double). OK 
 * Provide a constructor that initializes the three instance variables. OK 
 * Provide a set and a get method for each instance variable. OK
 * If the monthly salary is not positive, do not set its value. ok
*/

public class Employee {

	private String _firstName;
	private String _lastName;
	private Double _monthlySalary;
	
	public Employee() {
		this._firstName = "";
		this._lastName = "";
		this._monthlySalary = 0.00;
		System.out.println("Employee constructor called");
	}

	public void SetFirstName(String firstName) {
		this._firstName = firstName;
	}
	
	public String GetFirstName() {
		return _firstName;
	}
	
	public void SetLastName(String lastName) {
		this._lastName = lastName;
	}
	
	public String GetLastName() {
		return _lastName;
	}
	
	public void SetMonthlySalary(Double monthlySalary) {
		if (monthlySalary > 0) {
			this._monthlySalary = monthlySalary;
		}
	}
	
	public Double GetMonthlySalary() {
		return _monthlySalary;
	}

}
