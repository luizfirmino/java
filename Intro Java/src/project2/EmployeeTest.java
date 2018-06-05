package project2;
import project2.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		CommissionCompensationModel compensantionModel = new CommissionCompensationModel();		
		compensantionModel.setComissionRate(2.5);
		compensantionModel.setGrossSales(2750.00);
		Employee emp1 = new Employee ("Bob", "Blue", "511-90-0000", compensantionModel);
		System.out.print(emp1.toString() + "\n");
		
		BasePlusCommissionCompensationModel plusCompensationModel = new BasePlusCommissionCompensationModel();
		plusCompensationModel.setGrossSales(20.000);
		plusCompensationModel.setBaseSalary(87.500);
		plusCompensationModel.setComissionRate(4.7);
		Employee emp2 = new Employee ("Marry", "Smith", "879-14-0000", plusCompensationModel);	
		System.out.print(emp2.toString() + "\n");
		
	}

}
