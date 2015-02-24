#-----------------------------------------------------------#	
#			Sewing sisters even-odd game					#
#			By Asa and Nasri								#
#			Modified by Kevin Liu on Oct 1 2013				#
#-----------------------------------------------------------#

import random


min=0							#Min and max number of fingers
max=5
player_wins_game=0				#Counter for the number of games that player wins
computer_wins_game=0			#Counter for the number of games that computer wins
draws_game=0					#Counter for the number of games that end in a draw

#Counters for numbers of even, odd, and zeros player and computer threw in the tournament
player_even_total=0
player_odd_total=0
player_zero_total=0
computer_even_total=0
computer_odd_total=0
computer_zero_total=0

#Print a welcome message
print "\n"		#Print a blank line to make output look better
print "++++++++>>> Even Odd Number Tournament <<<++++++++"
print "\n"		#Print a blank line to make output look better

#Let user choose the number of games they want to play
games_to_play=input("Enter an odd number of games that you want to play: ")
while games_to_play%2==0:
	games_to_play=input("Enter an odd number of games that you want to play: ")
#Calculate number of games player/computer has to win to win the tournament
games_to_win=games_to_play/2+1	


#Ask for the number of rounds user want to play in each game
rounds_to_play=input("Enter an odd number of rounds that you would like to play in each game:")
while rounds_to_play%2==0:
	rounds_to_play=input("Enter an odd number of rounds that you would like to play:")
print "\n"		#Print a blank line to make output look better

#Game
current_game=1
while (player_wins_game<games_to_win) and (computer_wins_game<games_to_win) and (current_game<=games_to_play):
	#Display current game number
	print "---This is game ",current_game,"---"
	current_game += 1
	
	rounds_to_win=(rounds_to_play/2)+1	#Number of rounds player/computer has to win to win a game
	player_wins=0						#Counter for the number of rounds that player wins
	computer_wins=0						#Counter for the number of rounds that computer wins
	draws=0								#Counter for the number of rounds that end in a draw

	#Counters for numbers of evens, odds and zeros player and computer threw in current game
	current_round=1
	num_even_user=0
	num_odd_user=0
	num_zero_user=0
	num_even_computer=0
	num_odd_computer=0
	num_zero_computer=0
	
	
	#Round
	while (player_wins<rounds_to_win) and (computer_wins<rounds_to_win) and (current_round<=rounds_to_play):
		print "\n"		#Print a blank line to make output look better
		#Print number of current round
		print "* This is round ",current_round,"*"
		current_round += 1
		player_fingers=input("How many fingers do you hold up?")
	
		#Ask the player for the number of fingers he/she wants to hold up
		while (player_fingers<min)or(player_fingers>max):
			player_fingers=input("How many fingers do you hold up?")
		
		#Increse the counter accodring to what the user inputed
		if player_fingers%2==0 and player_fingers !=0:
			num_even_user += 1
		elif player_fingers%2==1:
			num_odd_user += 1
		else:
			num_zero_user += 1
		
		#Generate a random number of fingers
		computer_fingers=random.randint(min,max)

		#Increse the counter accodring to what the computer generated
		if computer_fingers%2==0 and computer_fingers !=0:
			num_even_computer += 1
		elif computer_fingers%2==1:
			num_odd_computer += 1
		else:
			num_zero_computer += 1
			
		#Print result of current round
		finger_sum=computer_fingers+player_fingers
		print "You threw:", player_fingers
		print "Computer threw:", computer_fingers	
		if finger_sum==0:
			print "This round ends in a draw."
			draws+=1
		elif finger_sum%2==0 and finger_sum != 0:
			player_wins=player_wins+1
			print "You win this round."
		else:
			finger_sum%2==1
			computer_wins=computer_wins+1
			print"Computer wins this round."

		#Print statistics	
		print "Computer has won:", computer_wins, "rounds"
		print "Player has won:", player_wins, "rounds"
		print "Number of rounds end in a draw: ", draws
	
	#Print result of current game	
	if player_wins > computer_wins:
		print "You win the game"
		player_wins_game += 1
	elif computer_wins > player_wins:
		print "Computer wins the game."
		computer_wins_game += 1
	else:
		print "The game ends in a draw."
		draws_game += 1
		
	print "\n"		#Print a blank line to make output look better
	
	#Print statitics of the tournament
	print "Computer has won",computer_wins_game,"games."
	print "You have won",player_wins_game,"games."
	print "\n"		#Print a blank line to make output look better
	print "In this game, you threw",num_even_user,"even numbers,",num_odd_user,"odd numbers and",num_zero_user,"zeros."
	print "The computer threw",num_even_computer,"even numbers,",num_odd_computer,"odd numbers and",num_zero_computer,"zeros."
	print "\n"		#Print a blank line to make output look better
	
	#Add the values of the counters in  current game to the counters of the tournament
	player_even_total += num_even_user
	player_odd_total += num_odd_user
	player_zero_total += num_zero_user
	computer_even_total += num_even_computer
	computer_odd_total += num_odd_computer
	computer_zero_total += num_zero_computer

#Print statistics of the tournament	
print "In this tournament, you threw totally",player_even_total,"even numbers,",player_odd_total,"odd numbers and",player_zero_total,"zeros."
print "Computer threw totally",computer_even_total,"even numbers,",computer_odd_total,"odd numbers and",computer_zero_total,"zeros."
print "\n"
print "You have won",player_wins_game,"games."
print "Computer has won",computer_wins_game,"games."
print "Number of games end in draw:",draws_game  

#Print result of the tournament	
if player_wins_game > computer_wins_game:
	print "You win the tournament."
elif computer_wins_game > player_wins_game:
	print "Computer wins the tournament."
else:
	print "The tounnament ends in a draw."
	
	















	
