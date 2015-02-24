/* 
 * Type2Salesman class, a subclass of Salesman class
 * Author: Eli and Kevin
 * Date created: Nov 19 2013
 */
public class Type2Salesman extends Salesman {
	/* instance variables: base pay and commission rate of type2 salesman */
	private double basePay;
	private double commissionRate;
	/* constructor method */
	public Type2Salesman(String name, double commissionRate, double basePay){
		super(name);
		this.commissionRate=commissionRate;
		this.basePay=basePay;
	}
	/* calculate and print payment of type2 salesman */
	public void calcPay(double salesOfWeek){
		System.out.println("\n--- Type2 Salesman ---");	
		printName();
		System.out.print("Base pay: ");
		System.out.println(basePay);
		System.out.print("Commission rate: ");
		System.out.println(commissionRate);
		System.out.print("Sales of week: ");
		System.out.printf("$%.2f\n",salesOfWeek);
		System.out.printf("Payment: $%.2f \n",salesOfWeek*commissionRate+basePay);
	}
}
