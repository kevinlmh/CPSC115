#---------------------------------------------------------------------------#
#       This program prompts the user to enter an integer and print         #
#       out every number that evenly divides that integer.                  #
#                                                                           #
#       Author: Minghui Kevin Liu                                           #
#       Date Created: Oct 7 2013                                            #
#---------------------------------------------------------------------------#

divider = 2
# Ask user to input an integer
int = input("Please enter an integer: ")
# A while loop 
while True:
    # If integer is even, divide integer by two
    if int%2 == 0:
        int /= divider
        print int
    # If interger is odd, jump out of loop
    else:
        break
