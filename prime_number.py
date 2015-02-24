#---------------------------------------------------------------#
#                   Prime number checker                        #
#                                                               #
#                   Author: Minghui Kevin Liu                   #
#                   Date created: Oct 9 2013                    #
#---------------------------------------------------------------#

# Sorry I am too tired to write any comments. 
# I suppose you can understand a program this simple.

import math

num = input("Please enter an integer: ")
max_test_num = math.sqrt(num)
divisor = 2
PRIME = True

while PRIME == True and divisor <= max_test_num:
    if num%divisor == 0:
        PRIME = False
    divisor += 1

if PRIME==True:
    print num,"is a prime number."
else:
    print num,"is a composite number."