/**
 * A class that tests CookieCounter class
 * @author Kevin Liu
 * created on Dec 9 2013
 */
public class CookieTest {
    
    public static void main(String args[]) {
        CookieCounter cc = new CookieCounter(1234);
        
        cc.countSale(1,   6);
        cc.countSale(2,      3);
        cc.countSale(3,   5);
        cc.countSale(4,       6);
        cc.countSale(5,      4);
        cc.countSale(6,   5);
        cc.countSale(7, 2);
        
        cc.displayTroopSales();
        
        cc.displayTroopSales(1);
        
        cc.displayTroopBestseller();
        
        cc.displayAllSales();
    }
}
