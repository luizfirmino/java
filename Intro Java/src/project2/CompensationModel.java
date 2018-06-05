package project2;

public class CompensationModel {

	public double earnings() {return 0;}
	
}

class CommissionCompensationModel extends CompensationModel {
	
	private double _grossSales;
	private double _commissionRate;
	
	// Gross Sales
    public void setGrossSales(double grossSales) {this._grossSales = grossSales; }
    public double getGrossSales() {return this._grossSales;}
    
    // Commission rate
    public void setComissionRate(double comissionRate) { this._commissionRate = comissionRate; }
    public double getComissionRate() {return this._commissionRate;}
	
	@Override
	public double earnings() {
		return this._grossSales * this._commissionRate;
	}
	
	//Constructor
	public CommissionCompensationModel() {
		this._grossSales = 0;
		this._commissionRate = 0;
        //System.out.print("CommissionCompensationModel Constructor \n"); //debug

	}
	
}


class BasePlusCommissionCompensationModel extends CompensationModel{
	
	private double _grossSales;
	private double _commissionRate;
	private double _baseSalary;
	
	// Gross Sales
    public void setGrossSales(double grossSales) {this._grossSales = grossSales; }
    public double getGrossSales() {return this._grossSales;}
    
    // Commission rate
    public void setComissionRate(double comissionRate) { this._commissionRate = comissionRate; }
    public double getComissionRate() {return this._commissionRate;}
	
    // Base Salary
    public void setBaseSalary(double baseSalary) {this._baseSalary = baseSalary; }
    public double getBaseSalary() {return this._baseSalary;}
    
	
	//Constructor
	public BasePlusCommissionCompensationModel() {
		this._grossSales = 0;
		this._commissionRate = 0;
		this._baseSalary = 0;
		//System.out.print("BasePlusCommissionCompensationModel Constructor \n"); //debug
	}
	
	@Override
	public double earnings() {
		//System.out.print("BasePlusCommissionCompensationModel Earnings \n"); //debug
		return this._baseSalary + (this._grossSales * this._commissionRate);
	}
	
}

