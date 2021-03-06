#-------------------------------------------------------#	
#	CPSC-115-20 Lab                               	    #	
#	Even Odd Number Game                          	    #
#	Author: Minghui Liu & Yaoqi Guo               	    #
#	Rules: Play multiple rounds with the computer.	    #
#       In each round, both computer and user pick    	#
#		a number, if the sum is odd,          	        #
#		computer wins a round; if the         	        #
#		sum is even, you win a round.         	        #
#       The first one to win enough                   	#
#       rounds win the game.                          	#
#-------------------------------------------------------#

import random
round=1
computer_wins=0
user_wins=0
finger_min=1
finger_max=5

#Ask user for number of rounds they want to play
num_rounds=input("Please enter the number of rounds you want to play: ")
while num_rounds%2 != 1:
    num_rounds=input("Invalid Input. Please enter an odd number: ")
    
# Calculate how many rounds one has to win to win the whole game
win_requirement=num_rounds/2+1

# Expain the rule to player
print "-------->>> Even Odd Number Game <<<--------\n"
print "Both computer and you pick a number, if the sum is odd,"
print "computer wins a round; if the sum is even, you win a round."
print "The first one to win 2 out of 3 rounds win the game.\n"

# A loop for 3 rounds
while round<=num_rounds:
    print "This is Round ",round
    
    # Generate a random interger and ask user input
    user_num=input("Please pick a number between 1 and 5: ")

    # Validity check
    while user_num<finger_min or user_num>finger_max or user_num%1!=0:
        user_num=input("Invalid input. Please pick a number between 1 and 5: ")
    
    computer_num = random.randint(1,5)
    # Calculate sum and ramainder
    sum=user_num+computer_num
    remainder=sum%2

    # print computer's and user's numbers and sum
    print "Your number is: ",user_num
    print "Computer's number is: ",computer_num
    print "The sum is: ",sum

    # Print result of each round
    if remainder==0:
        user_wins+=1
        print "The result is even. Congratualtions! You win this round! "
    else:
        computer_wins+=1
        print "The result is odd. Sorry, you lose this round."
        
    # Print numbers of wins  
    print "You have won",user_wins,"rounds; the computer has won",computer_wins,"rounds.\n"    
    
    # Print final result
    if user_wins==win_requirement:
        print "Congratulations! You have won ",win_requirement,"rounds. You win the game!"
        round=num_rounds+1      #jump out of loop
    if computer_wins==win_requirement:
        print "Sorry. The computer has won ",win_requirement,"rounds. You lose the game!"
        round=num_rounds+1      #jump out of loop2
    round+=1

