/* 
 * Report class, a class that print a report of a salesman
 * Author: Eli and Kevin
 * Date created: Nov 19 2013
 */
public class Report {
//function to output Salesman report
	public void printReport(Salesman s, String location, double salesOfWeek) {
		//calls calcpay method of s to pass print stuff
		s.calcPay(salesOfWeek);
		System.out.println("Location: "+location);
	}
}
