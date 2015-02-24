/* 
 * Type1Salesman class, a subclass of Salesman class
 * Author: Eli and Kevin
 * Date created: Nov 19 2013
 */
public class Type1Salesman extends Salesman {
	/* instance variable: commission rate of type1 salesman*/
	private double commissionRate;
	public Type1Salesman(String name, double commissionRate){
		super(name);
		this.commissionRate=commissionRate;
	}
	/* calculate and print payment of type1 salesman */
	public void calcPay(double salesOfWeek){
		System.out.println("\n--- Type1 Salesman ---");	
		printName();
		System.out.print("Commission rate: ");
		System.out.println(commissionRate);
		System.out.print("Sales of week: ");
		System.out.printf("$%.2f\n",salesOfWeek);
		System.out.printf("Payment: $%.2f \n",salesOfWeek*commissionRate);
	}
}
