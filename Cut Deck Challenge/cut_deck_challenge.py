#------------------------------------------------------------------------------#
#           Cut Deck Challenge                                                 #
#                                                                              #
#           Author: Kevin Liu                                                  #
#           Date created: Nov 6 2013                                           #
#------------------------------------------------------------------------------#


# global variable deck, which holds a deck of cards
deck = []

#
# Play_game() - this function contains the basic driving logic to play the
# game and display the results by invoking the functions described.
#
def Play_game():
	Print_header()
	Read_deck()
	print "\nPlayer 1"
	player1_cut_value = Get_cut_value()
	player1_card = Get_card(player1_cut_value)
	
	print "\nPlayer 2"
	player2_cut_value = Get_cut_value()
	player2_card = Get_card(player2_cut_value)

	compare_value = Compare_cards(player1_card,player2_card)
	
	player1_card_name = Get_card_name(player1_card)
	player2_card_name = Get_card_name(player2_card)
	
	Display_outcome(player1_card_name,player2_card_name,compare_value)
	
#
# Print_header() - prints name of program, author and rule
# 
def Print_header():
	print "\n------------>>> Cut Deck Challenge <<<------------"
	print "                              Written by Kevin Liu"
	print "Hello, cowboys! Want to solve your conflict without\nusing guns? simply choose a deck of card and cut it.\nThe player whose card has higher value wins!\n"
#
# Get_file_name() - this function takes no parameters and will return a String
# containing a file name entered by the user. This function will insure that 
# the name returned ends in .txt.
#
def Get_file_name():
	filename = raw_input("Enter the name of a txt file that contains a deck of cards: ")
	while filename[-4:] != ".txt":
		filename = raw_input("No, you have to enter the name of a *txt* file: ")
	return filename
	
#	
# Read_deck() - takes no parameters and will read the contents of a file
# specified by the user (as provided by Get_file_name()) into a global variable 
# deck, which simulates a deck of cards. The first card in the file will end up 
# as the top card of the deck and the last card in the file should be on the 
# bottom of the deck.
#
def Read_deck():
	global deck
	input_file = open(Get_file_name(),"r")
	for line in input_file:
		deck.append(line.rstrip())

#
# Get_cut_value() - takes no parameters and will prompt the user to enter the 
# value by which to cut the deck and will return this value. This method insures 
# that value returned is a number between 1-52.  
#
def Get_cut_value():
	cut_value = input("Where do you want to cut the deck? > ")
	while cut_value not in range(1,53):
		cut_value = input("A deck has 52 cards, boy. Now enter something between 1 and 52. > ")
	return cut_value
	
#
# Get_card() - this function accepts one integer parameter representing the 
# position in the deck where the cut will occur and will return a String that 
# represents the card that was cut. For instance, if it is passed the value 2, 
# it will return the value of the second card in the deck variable.
#
def Get_card(position):
	return deck[position-1]

#
# Get_card_value() - this function accepts one String parameter, representing a 
# card and will return an integer representing its value (1-10, 11 for J, 12 for 
# Q, 13 for K, and 14 for Ace).
#
def Get_card_value(card):
	if card[1] == 'J':
		value = 11
	elif card[1] == 'Q':
		value = 12
	elif card[1] == 'K':
		value = 13
	elif card[1] == 'A':
		value = 14
	else:
		value = int(card[1])
	return value

#
# Get_card_name() - this function accepts one parameter which is a String 
# representing a card (in the format specified in the input file). It will 
# return a string which is a full description of the card in the form :  
#
#					Value_characters of suit_description
# 
# where the suit description is the word for the suit.  For instance, if the 
# function is passed "SQ" it should return the string "Q of Spades" or "D10" 
# should return "10 of Diamonds"
#
def Get_card_name(card):
	if card[0] == 'H':
		suit = "Hearts"
	elif card[0] == 'C':
		suit = "Clubs"
	elif card[0] == 'S':
		suit = "Spades"
	elif card[0] == 'D':
		suit = "Dismonds"
	return card[1] + " of " + suit

#
# Compare_cards() - accepts two Strings, which are in the form of the card 
# representation in the input file. The first parameter is the card of the first 
# player and the second parameter is the card of the second player. It will 
# return an integer as follows:  a 1 if the first player's card is higher, a 2 
# if the second player's card is higher and a zero if they are tied.
#
def Compare_cards(p1_card, p2_card):
	if Get_card_value(p1_card) > Get_card_value(p2_card):
		return 1
	elif Get_card_value(p1_card) < Get_card_value(p2_card):
		return 2
	else:
		return 0

#
# Display_outcome() - accepts three parameters, the card name (in the form value 
# Value_characters of suit_description as provided by Get_card_name) of the 
# first player's, the card name of the second player's card and the numeric 
# value (as provided by Compare_cards) indicating the outcome of the comparison 
# of the two cards.  This function returns no values, but outputs each player's 
# card and the outcome of the match.
#
def Display_outcome(p1_card_name, p2_card_name, compare_result):
	if compare_result == 1:
		outcome = "Player 1 wins! ^_^"
	elif compare_result == 2:
		outcome = "Player 2 wins! ^_^"
	elif compare_result == 0:
		outcome = "The game ends in a draw. *_*"
	print "\nPlayer 1's card\t\t" + "Player 2's card" 
	print p1_card_name + "\t\t" + p2_card_name + "\n"
	print outcome

# Starting the game
Play_game()


