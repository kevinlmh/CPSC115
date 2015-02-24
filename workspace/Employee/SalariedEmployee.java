/**
 * Salaried Employee class
 * @author Kevin Liu & Yeran Xu
 * Nov 12 2013
 *
 */
public class SalariedEmployee extends Employee {
	
	private double salary;
	
	/* Constructor */
	public SalariedEmployee(String name, String SSnum, double salary) {
		super(name, SSnum);
		this.salary = salary;
	}
	
	/* set salaried employee weekly salary */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/* return salaried employee weekly salary */
	public double getSalary() {
		return salary;
	}
	
	/* invoked every time the employee is paid */
	public double getPay() {
		updateCumulativePay(salary);	//add pay to cumulative pay
		return salary;
	}
} // end of SalariedEmployee
