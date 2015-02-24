/**
 * Class: display
 * 
 * CPSC 115 - Java Lab 1
 *
 * Date: Nov 5 2013
 * 
 * Author: Bingqing Li & Minghui Liu
 */

public class display{
	public static void main (String args[]){
		/* creating scoreboard */
		scoreboard scoreboard1, scoreboard2, scoreboard3;
		scoreboard1 = new scoreboard("Trinity", "Uconn");
		scoreboard1.increaseScore1(3);
		scoreboard1.increaseScore1(3);
		scoreboard1.increaseScore1(3);
		scoreboard1.increaseScore2(2);
		scoreboard1.increaseScore2(2);
		scoreboard1.increaseScore2(2);
		scoreboard1.displayScore1();
		scoreboard1.displayScore2();
		scoreboard1.game_over();

		/* creating scoreboard2 */
		scoreboard2 = new scoreboard("Trinity", "Wesleyan");
		scoreboard2.increaseScore1(5);
		scoreboard2.increaseScore2(7);
		scoreboard2.displayScore1();
		scoreboard2.displayScore2();
		scoreboard2.game_over();

		/* creating scoreboard3 */
		scoreboard3 = new scoreboard("Uconn", "Wesleyan");
		scoreboard3.increaseScore1(7);
		scoreboard3.increaseScore2(7);
		scoreboard3.displayScore1();
		scoreboard3.displayScore2();
		scoreboard3.game_over();
	}
}

