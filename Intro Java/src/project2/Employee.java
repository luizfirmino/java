package project2;
import project2.CompensationModel;

public class Employee {
		
		private final String _firstName;
	    private final String _lastName;
	    private final String _socialSecurityNumber;
	    private final CompensationModel _model;
	    
	    public String getFirstName() {return _firstName;}
	    public String getLastName() {return _lastName;}
	    public String getSocialSecurityNumber() {return _socialSecurityNumber;}
      
		// Constructor
		public Employee (String firstName, String lastName, String socialSecurityNumber, CompensationModel model) {
			this._firstName = firstName;
	        this._lastName = lastName;
	        this._socialSecurityNumber = socialSecurityNumber;
	        this._model = model;
			//System.out.print("Employee Constructor \n"); // debug
		}
	
		// return earnings
	    public double earnings() {
	    	return this._model.earnings();
	    }
	    
	    public String toString() {
	        return "employee: " +  getFirstName() + " " + getLastName() + "\n"
	        		+ "social security number: " + getSocialSecurityNumber() + "\n"
	        		+ "Earnings: " + earnings();
	    }        
        
}
