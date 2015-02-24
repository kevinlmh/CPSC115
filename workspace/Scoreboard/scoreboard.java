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
	private team home_team = new team;
	private team visit_team = new team;
	
	public void updateHomeTeamScore(int increment){
		home_team.setScore(home_team.getScore()+increment)
	}
	public void updateVisitTeamScore(int increment){
		visit_team.setScore(visit_team.getScore()+increment)
	}
	public void printWinner(){
		if (home_team.getScore() > visit_team.getScore()){
			System.out.println("Winner: "+home_team.getName());
		}else if (visit_team.getScore() > home_team.getScore()){
			System.out.println("Winner: "+visit_team.getName());
		}else {
			System.out.println("The game ends in a draw.");
		}
	}
}
