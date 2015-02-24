    #############################
    #   Yeran Xu & Minghui Liu  #
    #   CPSC-115 Lab            #
    #   Coin Flip Game          #
    #   Prof. Spezialetti       #
    #   Sep. 17 2013            #
    #############################

import random

#Generate random value
cmp_value=random.randint(0,1)

#Ask user to input heads or tails
heads_tails = raw_input("Heads or Tails? ")

#Convert user input to 0 or 1
if heads_tails == "heads":
    usr_value = 0
elif heads_tails == "tails":
    usr_value = 1
else:
    usr_value = 2
    print "Sorry, please try again with 'heads' or 'tails'."

#Continue if user input heads or tails
if usr_value == 0 or usr_value == 1:
    #Output computer generated value
    if cmp_value == 0:
        print "It is heads."
    else:
        print "It is tails."
        
    #Output result of the game
    if usr_value == cmp_value:
        print "Congratulations! You win!"
    else:
        print "Sorry. You lose."