import java.awt.image.BufferedImage;
import java.util.Scanner;

/**
 *  @authors: Yuxuan Li & Daming Xing
 *  cpsc115 - final project
 *  Lab: Webnesday
 */


/**
 *  A class for playing simplified Blackjack card game.
 *  
 *  This class represents the Model in a Model-View-Controller (MVC)
 *  design. The Controller and the View are implemented in two different
 *  versions:
 *  1. The command-line version: The play() method, is the Controller and
 *  	the View for the command-line version. It scans user input using 
 *  	a Scanner object and displays the state of the game with simple strings.
 *  2. The GUI version: The IndianPokerGUI class is the Controller and View for
 *      the GUI version. It uses Buttons for user input and Labels for displaying
 *      the state of the game.
 *  
 *  The Model in the MVC architecture consists of the several private variables:
 *  	deck - a deck of cards
 *  	dealerHand - the dealer's hand, with its first card visible
 *  	playerHand - the player's hand, visible to the player
 *  	status - represents the state of the game
 */
public class BlackJack {
  
  /**
   * Constants to represent different actions.
   */
  public static final int HIT = 0;
  public static final int STAND = 1;
  public static final int AGAIN = 2;
  public static final int QUIT = 3;

  /**
   * Represents a deck of cards.
   */
  private Deck deck;
  
  /**
   * Represents the dealer's hand and the player's hand.
   * Each with a limit of holding 10 cards
   */
  private Hand dealerHand = new Hand(10), playerHand = new Hand(10);
  
  /**
   * Represents the first cards of the dealer's hand and the player's hand
   */
  private Card dealerTopCard, playerTopCard;
  
  /**
   * Represents the dealer's score and the player's score
   */
  private int dealerScore, playerScore;
  
  /**
   * Represents the state of the game
   */
  private String status;
  
  /**
   * Reference to the GUI that serves as both the Controller and View.
   */
  private BlackJackGUI gui;
  
  /**
   * Creates a command-line version of the game.
   */
  public BlackJack() {
	  deck = new Deck();
	  deck.populate(52);
	  init();
  }
  
  /**
   * Creates a GUI version of the game.
   * @param gui - the Controller and View for this Model.
   */
  public BlackJack(BlackJackGUI gui) {
	  this.gui = gui;
	  deck = new Deck();
	  deck.populate(52);
	  init();
  }

  /**
   * Sets the initial state of the game.
   * The game's state if represented by the status string and
   * the dealer's hand and the player's hand.
   */
  public void init() {
	deck.shuffle();
	dealerHand.add(deck.pop());
	dealerHand.add(deck.pop());
	dealerTopCard = showTopCard(dealerHand);
	playerHand.add(deck.pop());
	playerHand.add(deck.pop());
	status = "Blackjack game!";
  }
  
  /**
   * @return the back-of-card image of a deck;
   */
  public BufferedImage getDeckImage() {
	  return deck.toImage();
  }
  
  /**
   * Getters of the variables
   */
  public Deck getDeck() {
	  return deck;
  }
  public Hand getDealerHand() {
	  return dealerHand;
  }
  public Hand getPlayerHand() {
	  return playerHand;
  }
  public Card getDealerTopCard() {
	  return showTopCard(dealerHand);
  }
  public Card getPlayerTopCard() {
	  return showTopCard(playerHand);
  }
  public int getDealerScore() {
	  return blackjackScore(dealerHand);
  }
  public int getPlayerScore() {
	  return blackjackScore(playerHand);
  }
  
  public String getStatus() {
	  return status;
  }
  
  /**
   * A method to demonstrate the first card of a hand
   * @param hand, either dealer's hand or player's hand
   * @return the first card
   */
  public Card showTopCard(Hand hand){
	  return hand.toArray()[0];
  }
  
  /**
   * Returns a String representation of the game
   */
  public String toString() {
	  return "Blackjack card game. Dealer's topcard: " 
	  + dealerTopCard + "Player's topcard: " + playerTopCard;
  }
  
  /**
   * This method calculates the blackjack value of a given hand
   * Aces are counted as 11, Face cards counted as 10
   * All other cards are counted as their ranks
   * returns an int, the hand's value
   */
  public int blackjackScore(Hand hand){
  	Card[] cards = hand.toArray();
	int sum = 0;
	for (int i=0;i<cards.length;i++) {
		if (cards[i] != null){
	      int rank = cards[i].rank;
		  if (rank==1) sum +=11;
		  if (rank>10) sum +=10;
		  else sum +=rank;
		}
	}
	return sum;
  }
  
  /**
   * Public class for generating the result for blackjack game
   */
  public class BlackJackResult {
	  public String status;
	  public Hand dealerHand;
	  public Hand playerHand;
	  public int dealerScore;
	  public int playerScore;
	  
	  public BlackJackResult(String status, Hand dealerHand, Hand playerHand) {
		  this.status = status;
		  this.dealerHand = dealerHand;
		  this.playerHand = playerHand;
		  this.dealerScore = blackjackScore(dealerHand);
		  this.playerScore = blackjackScore(playerHand);
	  }
  }
  

  public BlackJackResult result(Hand dealerHand, Hand playerHand) {
	  int dealerScore = blackjackScore(dealerHand);
	  int playerScore = blackjackScore(playerHand);
	  int cmp = dealerScore - playerScore;
	  if (cmp==0) status = "Tie!";
	  else if (cmp>0) status = "You lose!";
	  else status = "You win!";	
	  BlackJackResult result = new BlackJackResult(status,dealerHand,playerHand);
	  return result;
  }

  public boolean bust(Hand dealerHand,Hand playerHand) {
	  int dealerScore = blackjackScore(dealerHand);
	  int playerScore = blackjackScore(playerHand);
	  if (playerScore > 21) {
		  status = "You busted!"; return true;
	  } else if (dealerScore > 21) {
		  status = "Dealer busted! You win!"; return true;
	  } else if ((playerScore > 21) && (dealerScore > 21)) {
		  status = "Both busted!"; return true;
	  }
	  else return false;
  }
  
  public boolean isBlackjack(Hand dealerHand, Hand playerHand) {
	  int dealerScore = blackjackScore(dealerHand);
	  int playerScore = blackjackScore(playerHand);
	  if (playerScore == 21) {
		  status = "You got Blackjack!"; return true;
	  } 
	  else if (dealerScore == 21) {
		  status = "Dealer got glackjack! You lose!"; return true;
	  }
	  else if (dealerScore == 21 && playerScore == 21) {
		  status = "Tie!"; return true;
	  }
	  else return false;
  }
  
  public Hand dealerPlay() {
	  while (blackjackScore(dealerHand)<17) dealerHand.add(deck.pop());
	  return dealerHand;
  }
  
  public void playerPlay() {
	  playerHand.add(deck.pop());
  }

  
  /**
   * Processes gui moves.
   * 
   * This method is called by the controller whenever the user clicks
   *  on a button in the GUI.
   * 
   * @param play - the type of move (HIT,STAND,AGAIN,QUIT)
   * @return a BlackJackResult object which can store a status string
   *  and a hand
   *  
   * The status string represents the state of the game.
   */
  public BlackJackResult guiMove(int play) {
	  if (isBlackjack(dealerHand,playerHand) ==true) return new BlackJackResult(status,dealerHand,playerHand);
	  if (play == QUIT) {
		  return null;
	  } else if (play == AGAIN) {
		  dealerHand = new Hand(10);
		  dealerHand.add(deck.pop());
		  dealerHand.add(deck.pop());
		  dealerTopCard = showTopCard(dealerHand);
		  playerHand = new Hand(10);
		  playerHand.add(deck.pop());
		  playerHand.add(deck.pop());
		  status = "Blackjack game!";
		  return new BlackJackResult(status,dealerHand,playerHand);
	  } else if (play == HIT) {
		  playerPlay();
		  return new BlackJackResult(status,dealerHand,playerHand);
	  } else if (play == STAND) {
		  dealerPlay();
		  if (bust(dealerHand,playerHand) || isBlackjack(dealerHand,playerHand) ==true) {
			  return new BlackJackResult(status,dealerHand,playerHand);
		  } else {
			  BlackJackResult result = result(dealerHand,playerHand);
			  return new BlackJackResult(result.status,dealerHand,playerHand);
		  }
	  } else {
		  System.out.println("Error: Illegal move from GUI, returning null.");
		  return null;
	  }
  }
  
  /**
   * The controller for the command-line version of the game.
   * Receives the user input and examines the dealer's hand and 
   * the player's hand.
   * If either busted or got a blackjack, end the round.
   * If not so, the player can either hit or stand.
   * The dealer start to hit the card only when the player stands.
   */
  public void play() {
	  Scanner scanner = new Scanner(System.in);
	  String prompt = "Your play, 0=hit, 1=stand, 3=quit: ";
	  int play = -1;
	  while (play != QUIT) {
		  if (isBlackjack(dealerHand,playerHand)==true) {
			  System.out.println(status);
			  System.out.println("Dealer's hand: "+dealerHand+"  Dealer's score: "+getDealerScore());
			  System.out.println("Your hand: "+playerHand+"  Your score: "+getPlayerScore());
		      System.out.print("Again? 2=again, 3=quit: ");
		      play = scanner.nextInt();
		  }
		  if (play == AGAIN) {
			  playerHand = new Hand(10);
			  dealerHand = new Hand(10);
			  dealerHand.add(deck.pop());
			  dealerHand.add(deck.pop());
			  dealerTopCard = showTopCard(dealerHand);
			  playerHand.add(deck.pop());
			  playerHand.add(deck.pop());
			  status = "Blackjack game!";
			  play = -1;
		  }
		  else {
			  System.out.println("Dealer's topcard: " + dealerTopCard);
			  System.out.println("Your Hand: " + playerHand);
			  System.out.print(prompt);
			  play = scanner.nextInt();
			  if (play != QUIT) {
				  while (play == HIT) {
					  playerPlay();
					  if (bust(dealerHand,playerHand) || isBlackjack(dealerHand,playerHand) ==true) {
						  System.out.println(status);
						  System.out.println("Dealer's hand: "+dealerHand+"  Dealer's score: "+getDealerScore());
						  System.out.println("Your hand: "+playerHand+"  Your score: "+getPlayerScore());
						  System.out.print("Again? 2=again, 3=quit: ");
						  play = scanner.nextInt();
					  } else {
						  System.out.println("Dealer's topcard: " + dealerTopCard);
						  System.out.println("Your hand: "+ playerHand);
						  System.out.print(prompt);
						  play = scanner.nextInt();
					  }
				  }
				  if (play == STAND) {
			          dealerHand = dealerPlay();
					  if (bust(dealerHand,playerHand) || isBlackjack(dealerHand,playerHand) ==true) {
						  System.out.println(status);
						  System.out.println("Dealer's hand: "+dealerHand+"  Dealer's score: "+getDealerScore());
						  System.out.println("Your hand: "+playerHand+"  Your score: "+getPlayerScore());
						  System.out.print("Again? 2=again, 3=quit: ");
						  play = scanner.nextInt();
					  } else {
						  BlackJackResult result = result(dealerHand,playerHand);
						  System.out.println(result.status);
						  System.out.println("Dealer's hand: "+dealerHand+"  Dealer's score: "+getDealerScore());
						  System.out.println("Your hand: "+playerHand+"  Your score: "+getPlayerScore());
						  System.out.print("Again? 2=again, 3=quit: ");
						  play = scanner.nextInt();
					  }
				  }
			  }
		  }
		  
	  }
  }
		  

  
  public static void main(String argv[]) {
	  BlackJack bj = new BlackJack();
	  bj.play();
	  System.out.println("Bye");
	}
}
