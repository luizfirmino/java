package Lab03;
/*
 * * Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. 
 * Create two Employee objects and display each object’s yearly salary. 
 * Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 * */
public class EmployeeTest {

	public static void main(String[] args) {
		
		System.out.println("FIRST OBJECT");
		Employee e1 = new Employee();
		e1.SetFirstName("Luiz");
		e1.SetLastName("FILHO");
		e1.SetMonthlySalary(3500.00);
		Double yearlySalary = (e1.GetMonthlySalary() * 12);
		
		System.out.println("First Name: " + e1.GetFirstName());
		System.out.println("Last Name: " + e1.GetLastName());
		System.out.println("Yearly Salary: " + yearlySalary);
		
		System.out.println("");
		System.out.println("SECOND OBJECT");
		Employee e2 = new Employee();
		e2.SetFirstName("Davino");
		e2.SetLastName("Firmino");
		e2.SetMonthlySalary(7350.00);
		yearlySalary = (e2.GetMonthlySalary() * 12);
		
		System.out.println("First Name: " + e2.GetFirstName());
		System.out.println("Last Name: " + e2.GetLastName());
		System.out.println("Yearly Salary: " + yearlySalary);
		
		
		// 10% Raise
		e1.SetMonthlySalary((e1.GetMonthlySalary() + (e1.GetMonthlySalary() * 0.1)));
		e2.SetMonthlySalary((e2.GetMonthlySalary() + (e2.GetMonthlySalary() * 0.1)));

		System.out.println("");
		System.out.println("10% Raise");
		System.out.println(e1.GetFirstName() + " Yearly Salary: " + (e1.GetMonthlySalary() * 12));
		System.out.println(e2.GetFirstName() + " Yearly Salary: " + (e2.GetMonthlySalary() * 12));
		
		
	}

}
