public class CookieCounter{
	private int troopNum;//required variable
	private static final int typeMin = 1, typeMax = 6;//range of valid cookie types
	private static final String [] cookieType = {"Thin Mints", "Shortbread", "Peanut Butter", "Macaroons", "Lemon Drop", "Snickerdoodles"};//Array containing names of cookies
	private int [] sale = {0, 0, 0, 0, 0, 0};//Array saving sales information
	private static int [] totalSale = {0, 0, 0, 0, 0, 0};//Array saving sales information for all troops


	//Constructor method
	public CookieCounter(int tNumber){
		troopNum = tNumber;
		}//end of method

	//method used to check validity of type number entered
	private boolean validCookieNumber(int typeNum){
		//when entering a valid number
		if ((typeNum >= typeMin) && (typeNum <= typeMax)){
			return true;
			}
		//when entering an invalid number
		else {
			return false;
			}
		}//end of method

	
	//Method to count the sales for a specific type of cookies
	public void countSale(int typeNum, int saleAmt){
		//Checking validity of cookie type number
		if (validCookieNumber(typeNum) == true){
			sale[typeNum-1] = sale[typeNum-1] + saleAmt;//counting sales
			totalSale[typeNum-1] = totalSale[typeNum-1] + saleAmt;//counting total sales
			}
		else {
			System.out.println("Invalid Cookie Type Number: " + typeNum + " is not between " + typeMin + " to " + typeMax + " inclusive.");//error message
			System.out.println("\n");//new line for readability
			}
		}//end of method


	//Method to dislay sales for all cookies by a specific troop
	public void displayTroopSales(){
		System.out.println(">>>Sales for Troop" + troopNum + "<<<");//printing troop number
		for (int i=0; i<=sale.length-1; i++){
			System.out.println("Sales for " + cookieType[i] + " : " + sale[i] + " boxes");
			}
			System.out.println("\n");//new line for readability
		}//end of method

	//Method to dislay sales for one type of cookies by a specific troop
	public void displayTroopSales(int typeNum){
		//Checking validity of cookie type number
		if (validCookieNumber(typeNum) == true){
			System.out.println(">>>Sales for Troop" + troopNum + "<<<");//printing troop number
			System.out.println("Sales for " + cookieType[typeNum-1] + " : " + sale[typeNum-1] + " boxes");
			System.out.println("\n");//new line for readability
			}
		else {
			System.out.println("Invalid Cookie Type Number: " + typeNum + " is not between " + typeMin + " to " + typeMax + " inclusive.");//error message
			System.out.println("\n");//new line for readability
			}
		}//end of method

	//Method to dislay sales for all cookies by all troops combined
	public void displayAllSales(){
			System.out.println(">>>Total sales for all troops<<<");
			for (int i=0; i<=sale.length-1; i++){
			System.out.println("Sales for " + cookieType[i] + " : " + totalSale[i] + " boxes");
			}
			System.out.println("\n");//new line for readability
		}//end of method

	//Method to display the bestseller(s) for a specific troop
	public void displayTroopBestseller(){
		System.out.println(">>>Bestsellers for Troop" + troopNum + "<<<");//printing troop number

		//checking highest sale amount
		int highestSale = 0;
		for (int i=0; i<sale.length; i++){
			if (highestSale < sale[i]){
				highestSale = sale[i];
				}
			}//checking completed
		
		//Outputting bestsellers
		for (int i=0; i<sale.length; i++){
			if (sale[i]==highestSale){
				System.out.println(cookieType[i]);
				}
			}//Output completed

		System.out.println("\n");//new line for readability
		}//end of method

	}//end of class definition
