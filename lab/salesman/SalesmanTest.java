/* 
 * SalesmanTest class, a class that tests all three Salesman classes
 * Author: Eli and Kevin
 * Date created: Nov 19 2013
 */
public class SalesmanTest{
	public static void main(String args[]) {
		/* create a type1 and type2 salesman */
		Type1Salesman s1 = new Type1Salesman("Brian McBrian", 0.2);
		Type2Salesman s2 = new Type2Salesman("Ted Doran", 0.1, 150);
		/* create a Report object */
		Report r1 = new Report();
		/*sets parameters for salesman one and two */
		r1.printReport(s1, "Hartford", 500);
		Report r2 = new Report();
		r2.printReport(s2, "New York", 600);				
	}
}
