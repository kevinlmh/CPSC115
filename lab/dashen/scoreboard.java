/**
 * Class: scoreboard
 * 
 * CPSC 115 - Java Lab 1
 *
 * Date: Nov 5 2013
 * 
 * Author: Bingqing Li & Minghui Liu
 */

public class scoreboard {
	/* instance variables */
	private String name1, name2;
	private int score1, score2;

	/* Constructor method with parameters */
	public scoreboard (String team_name1, String team_name2){
		name1 = team_name1;
		score1 = 0;
		name2 = team_name2;
		score2 = 0;
		}

	/* Method: setName1() - set name of team 1
	 * parameter: String team_name
	 * return type: void
	 */
	public void setName1 (String team_name){
		name1 = team_name;
		}

	/* Method: setName2() - set name of team2
	 * parameter: String team_name
	 * return type: void
	 */
	public void setName2 (String team_name){
		name2 = team_name;
		}

	/* Method: increaseScore1() - increase score of team1
	 * parameter: int increment
	 * return type: void
	 */

	public void increaseScore1 (int increment){
		score1 = score1 + increment;
		}

	/* Method: increaseScore2() - increase score of team2
	 * parameter: int increment
	 * return type: void
	 */
	public void increaseScore2 (int increment){
		score2 = score2 + increment;
		}

	/* Method: displayScore1() - display the score of team1
	 * parameter: none
	 * return type: void
	 */
	public void displayScore1 (){
		System.out.println(name1 + ":" + score1);
		}

	/* Method: displayScore2() - display the score of team2
	 * parameter: none
	 * return type: void
	 */
	public void displayScore2 (){
		System.out.println(name2 + ":" + score2);
		}

	/* Method: game_over()
	 * parameter: none
	 * return type: int
	 */
	public void game_over (){
		if (score1>score2){
			System.out.println("The winner is " + name1);
			}
		else if (score1>score2){
			System.out.println("The winner is " + name2);
			}
		else if (score1==score2){
			System.out.println("The game is tied.");
		}
	}
}
