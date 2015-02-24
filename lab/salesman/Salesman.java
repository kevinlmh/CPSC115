/* 
 * super salesman class
 * Author: Eli and Kevin
 * Date created: Nov 19 2013
 */
public abstract class Salesman{
	/* instance variables */
	private String name;
	/* constructor for Salesman method */
	public Salesman(String name){
		this.name=name;
	}
	public void printName() {
		System.out.println("Name: "+name);
	}
	/* abstract method prints sales report through calcpay */
	public abstract void calcPay(double salesOfWeek);
}
