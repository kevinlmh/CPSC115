#-----------------------------------------------------------------------------------------------#
#       This is program  program that prompts a user to enter a low and a high value and        #
#       then to output all the even values between and including the low value and the          #
#       high value, a bar and then the final sum.  If the low value is greater than the         #
#       high value, or there are no even values in the specified interval, the program          #
#       outputs "There are no even values in this interval".                                    #
#                                                                                               #
#       Author: Minghui Kevin Liu                                                               #
#       Date Created: Oct 7 2013                                                                #
#-----------------------------------------------------------------------------------------------#

sum = 0

#  Ask  user to  input  low  and high  values  
low  =  input("Please enter  a  low  value: ")  
high  = input("Please enter a high value: ")

# A loop that print all the even numbers between low and high, inclusive
for index in range (low, high+1):       # high+1 so that high value is included
    if index%2 == 0:
        print index
        sum += index

# Print a bar and sum of all the even numbers
print "----"
print sum
