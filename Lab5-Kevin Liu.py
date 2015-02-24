#Sewing sisters even-odd game
#By Asa and Nasri
#Maintained by Kevin Liu on Oct 1 2013
import random

#start values
min=0
max=5

print "\n"

#start the tournament by choosing the number of games
games_to_play=input("Enter an odd number of games that you want to play: ")
while games_to_play%2==0:
	games_to_play=input("Enter an odd number of games that you want to play: ")

games_to_win=games_to_play/2+1
player_wins_game=0
computer_wins_game=0
draws_game=0

player_even_total=0
player_odd_total=0
player_zero_total=0
computer_even_total=0
computer_odd_total=0
computer_zero_total=0

rounds_to_play=input("Enter an odd number of rounds that you would like to play each game:")
while rounds_to_play%2==0:
	rounds_to_play=input("Enter an odd number of rounds that you would like to play:")
print "\n"
current_game=1
while (player_wins_game<games_to_win) and (computer_wins_game<games_to_win) and (current_game<=games_to_play):
	print ">>>This is game ",current_game,"<<<"
	current_game += 1
	rounds_to_win=(rounds_to_play/2)+1
	player_wins=0
	computer_wins=0
	draws=0


	current_round=1
	num_even_user=0
	num_odd_user=0
	num_zero_user=0
	num_even_computer=0
	num_odd_computer=0
	num_zero_computer=0
	#repeat rounds
	while (player_wins<rounds_to_win) and (computer_wins<rounds_to_win) and (current_round<=rounds_to_play):
		print "\n"
		print "* This is round ",current_round,"*"
		current_round += 1
		player_fingers=input("How many fingers do you hold up?")
	

	
		while (player_fingers<min)or(player_fingers>max):
			player_fingers=input("How many fingers do you hold up?")

		if player_fingers%2==0 and player_fingers !=0:
			num_even_user += 1
		elif player_fingers%2==1:
			num_odd_user += 1
		else:
			num_zero_user += 1

		computer_fingers=random.randint(min,max)

			#count numbers of odd and even number of fingers computer hold up 
		if computer_fingers%2==0 and computer_fingers !=0:
			num_even_computer += 1
		elif computer_fingers%2==1:
			num_odd_computer += 1
		else:
			num_zero_computer += 1
	#find results for who wins, the player or the computer
		finger_sum=computer_fingers+player_fingers
		print "you threw:", player_fingers
		print "computer threw:", computer_fingers
		
		if finger_sum==0:
			print "Draw."
			draws+=1
		elif finger_sum%2==0 and finger_sum != 0:
			player_wins=player_wins+1
			print "You win this round."
		else:
			finger_sum%2==1
			computer_wins=computer_wins+1
			print"Computer wins this round."

			
		print "computer has won:", computer_wins, "rounds"
		print "player has won:", player_wins, "rounds"
		print "number of draws: ", draws
		
	if player_wins > computer_wins:
		print "You win the game"
		player_wins_game += 1
	elif computer_wins > player_wins:
		print "Computer wins the game."
		computer_wins_game += 1
	else:
		print "The game ends in a draw."
		draws_game += 1
	print "\n"
	print "Computer has won",computer_wins_game,"games."
	print "You have won",player_wins_game,"games."
	print "\n"
	print "In this game, you threw",num_even_user,"even numbers,",num_odd_user,"odd numbers and",num_zero_user,"zeros."
	print "The computer threw",num_even_computer,"even numbers,",num_odd_computer,"odd numbers and",num_zero_computer,"zeros."
	print "\n"
	player_even_total += num_even_user
	player_odd_total += num_odd_user
	player_zero_total += num_zero_user
	computer_even_total += num_even_computer
	computer_odd_total += num_odd_computer
	computer_zero_total += num_zero_computer
	
print "In this tournament, you threw totally",player_even_total,"even numbers,",player_odd_total,"odd numbers and",player_zero_total,"zeros."
print "Computer threw totally",computer_even_total,"even numbers,",computer_odd_total,"odd numbers and",computer_zero_total,"zeros."
print "\n"
print "You have won",player_wins_game,"games."
print "Computer has won",computer_wins_game,"games."
print "Number of games end in draw:",draws_game  
if player_wins_game > computer_wins_game:
	print "You win the tournament."
elif computer_wins_game > player_wins_game:
	print "Computer wins the tournament."
else:
	print "The tounnament ends in a draw."
	
	















	
