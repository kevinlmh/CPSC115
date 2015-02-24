#--------------------------------------------------------------------------------------#
#       
#
#   Author: Minghui Kevin Liu
#   Date Created: Oct 7 2013
#--------------------------------------------------------------------------------------#

# Ask for user input
num = input("Please enter an integer: ")

# Algorithm that check if num is a prime number
PRIME = True
if num!=0:
    if num == 1:
        PRIME=True
    elif num%2 == 0 and num != 2:          # Check if num can be divided by 2
        PRIME=False
    elif num%3 == 0 and num != 3:
        PRIME=False
    elif num%5 == 0 and num != 5:
        PRIME=False
    elif num%7 == 0 and num != 7:
        PRIME=False
    else:
        PRIME == True
        
    if PRIME == True:
        print num,"is a prime number."
    else:
        print num,"is a composite number."
else:
    print "0 is neither a prime number nor a composite number."
