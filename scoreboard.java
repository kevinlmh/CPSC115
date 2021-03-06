/**
 * Class: scoreboard
 * 
 * CPSC 115 - Java Lab 1
 *
 * Date: Nov 5 2013
 * 
 * Author: Minghui Liu
 */

public class scoreboard {
	private String team1_name;
	private String team2_name;
	private int team1_score;
	private int team2_score;

	/* Constructor method without parameters */
	public void scorebvoard(){
		team1_name = "Team1";
		team1_score = 0;
		team2_name = "Team2";
		team2_score = 0;
	}
	/* Constructor with parameters */
	/*public void team(String t1_name, int t1_score, String t2_name, int t2_score){
		//
	}*/
	
	/* Method: setName1() - set name of team 1
	 * parameter: p_name
	 * return type: void
	 */
	public void setName1(String p_name){
		team1_name = p_name;
	}
	
	/* Method: setName2() - set name of team2
	 * parameter: p_name
	 * return type: void
	 */
	public void setName2(String p_name){
		team2_name = p_name;
	}
	
	/* Method: setScore1() - set score of team1
	 * parameter: p_score
	 * return type: void
	 */
	public void setScore1(int p_score){
		team1_score = p_score;
	}
	
	/* Method: setScore2() - set score of team2
	 * parameter: p_score
	 * return type: void
	 */
	public void setScore2(int p_score){
		team2_score = p_score;
	}
	
	/* Method: getName1() - get the name of a team1
	 * parameter: none
	 * return type: String
	 */
	public String getName1(){
		return team1_name;
	}
	
	/* Method: getName2() - get the name of team2
	 * parameter: none
	 * return type: String
	 */
	public String getName2(){
		return team2_name;
	}
	
	/* Method: getScore1() - get the score of team1
	 * parameter: none
	 * return type: int
	 */
	public int getScore1(){
		return team1_score;
	}
	
	/* Method: getScore1() - get the score of team2
	 * parameter: none
	 * return type: int
	 */
	public int getScore2(){
		return team2_score;
	}
	
	/* Method: printWinner() - print the winner of game
	 * parameter: none
	 * return type: void
	 */
	public void printWinner(){
		if (team1_score > team2_score){
			System.out.println("Winner: " + team1_name);
		}else if (team2_score > team1_score){
			System.out.println("Winner: " + team2_name);
		}else {
			System.out.println("The game ends in a draw.");
		}
	}

}
