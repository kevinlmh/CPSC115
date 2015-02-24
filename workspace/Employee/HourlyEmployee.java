/**
 * Hourly Employee class
 * @author Kevin Liu & Yeran Xu
 * Nov 12 2013
 */
public class HourlyEmployee extends Employee {
	
	private double hourly_wage;
	
	/* Constructor */
	public HourlyEmployee (String name, String SSnum, double hourly_wage) {
		super(name, SSnum);
		this.hourly_wage = hourly_wage;
	}
	
	/* set hourly employee hourly wage */
	public void setHourlyWage(double hourly_wage) {
		this.hourly_wage = hourly_wage;
	}
	
	/* return hourly employee hourly wage */
	public double getHourlyWage() {
		return hourly_wage;
	}
	
	/* 
	 * invoked every time the employee is paid 
	 * parameter: hours worked 
	 */
	public double getPay(double hours) {
		double pay = hours * hourly_wage;
		updateCumulativePay(pay);
		return pay;
	}
} //end of HourlyEmployee
