/**
 * Employee class
 * @author Kevin Liu & Yeran Xu
 * Nov 12 2013
 */
public class Employee {
	private String name;
	private String SSnum;
	private double cumulativePay;
	
	/* Constructor */
	public Employee(String name, String SSnum) {
		this.name = name;
		this.SSnum = SSnum;
		cumulativePay = 0;
	}
	
	/* set employee name */
	public void setName(String name) {
		this.name = name;
	}
	
	/* return employee name */
	public String getName() {
		return name;
	}
	
	/* set social security number */
	public void setSSnum(String SSnum) {
		this.SSnum = SSnum;
	}
	
	/* retrun social security number */
	public String getSSnum() {
		return SSnum;
	}
	
	/* return cumulative pay */
	public double getCumulativePay() {
		return cumulativePay;
	}
	
	/* accumulate pay */
	public void updateCumulativePay(double pay) {
		cumulativePay += pay;
	}
} // end of Employee
