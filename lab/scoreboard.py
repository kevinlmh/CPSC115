#---------------------------------------------------------------------------#
#																			#
#							Lab 9 E-ScoreBoard								#						
#																			#
#					Author: Hieu Nguyen & Minghui Kevin Liu					#
#					Date created: Oct 19 2013 Tue							#
#																			#
#---------------------------------------------------------------------------#

# Global variable
home_team_name = ""
visiting_team_name = ""
home_team_score = 0
visiting_team_score = 0

# This is a function that prints welcome message
def print_welcome():
	print "\n-------->>> E-ScoreBoard 1.0 <<<--------"
	print "Created by Hieu Nguyen & Minghui Kevin Liu\n"

# This is a function that ask user to input team names
# No argument
# No return value
def get_team_names():
	global home_team_name
	global visiting_team_name
	home_team_name = raw_input("Please enter the name of home team: ")
	visiting_team_name = raw_input("Please enter the name of visiting team: ")
	
# This is a function that keeps track of home team's score
# Argument: score
# No return value
def home_team_scored(score):
	global home_team_score
	home_team_score += score
	display_scores()

# This is a function that keeps track of visiting teams's core\
# Argument: score
# No return value
def visiting_team_scored(score):
	global visiting_team_score
	visiting_team_score += score
	display_scores()

# The funtion that starts the game
# No argument
# no return value
def play_game():
	option = get_option()
	while option != "q" and option != "Q":
		if option == "h" or option == "H":
			home_team_scored(input("How much did the home team score? "))
		elif option == "v" or option == "V":
			visiting_team_scored(input("How much did the visiting team score? "))
		option = get_option()
		
# This is a funtion that displays options and ask user to choose
# No argument
# Return value: user's seletion
def get_option():
	print "\nH - home team scored"
	print "V - visiting team scored"
	print "Q - quit program"
	return  raw_input("Please select an option: ")

# This is a function that displays scores
# No argument
# No return value
def display_scores():
	global home_team_name
	global visiting_team_name
	global home_team_score
	global visiting_team_score
	print "\nScore of",home_team_name,":\t",home_team_score
	print "Score of",visiting_team_name,":\t",visiting_team_score

# main
print_welcome()
get_team_names()
play_game()





