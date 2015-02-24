public class main{
	public static void main (String args[]){
		CookieCounter troop1, troop2;

		//Creating CookieCounter objects
		troop1 = new CookieCounter(1);
		troop2 = new CookieCounter(2);

		//Adding Sales
		troop1.countSale(0,100);//Testing validCookieNumber
		troop1.countSale(1,50);
		troop1.countSale(2,80);
		troop1.countSale(3,100);
		troop1.countSale(4,100);
		troop1.countSale(5,80);
		troop1.countSale(6,70);

		troop1.displayTroopSales(3);//Testing displayTroopSales for specific kind of cookies
		troop1.displayTroopSales();//Testing displayTroopSales without specifying type of cookies
		troop1.displayTroopBestseller();//Testing displayTroopBestseller method;should display 2 types

		//Adding Sales for troop2
		troop2.countSale(1,50);
		troop2.countSale(2,80);
		troop2.countSale(3,100);
		troop2.countSale(4,100);
		troop2.countSale(5,80);
		troop2.countSale(6,70);

		troop2.displayAllSales();//Testing displayAllSales for troop1 and troop2
		
		}
	}

