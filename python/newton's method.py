#---------------------------------------------------------------#
#		This is a program that calculates and returens the		#
#		square root of a number using newton's method.			#
#		Author: Minghui Kevin Liu								#
#		Date Created: Oct 5 2013								#
#---------------------------------------------------------------#

# Function that calculates square root of a number using 
# newtoin's methond
# Parameters:	a 		the number whose square root you want to calculate
#				x		the estimate of the square root
# Return:		y		square root of 'a'
				
def square_root(a,x):
	while True:
		y = (x + a/x) / 2
		if abs(y - x) < 0.00000000001:
			break
		x = y
	return y 
# Ask for user input
number = input("Please enter a number: ")
# Calculate an estimate to use in square_root function
estimate = number / 2.0
result = square_root(number, estimate)
print result


