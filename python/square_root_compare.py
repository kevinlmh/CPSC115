#-----------------------------------------------------------------------#
#		This is a program that calculates square roots of 				#
#		a list of integer numbers using two different methods,			#
#		my own function square_root(), and math.sqrt() and				#
#		compare their results by displaying the difference.				#
#		Author: Minghui Kevin Liu										#
#		Date Created: Oct 5 2013										#
#-----------------------------------------------------------------------#

import math
min=1
max=10

def square_root(a,x):
	while True:
		y = (x + a/x) / 2
		if abs(y - x) < 0.00000000001:
			break
		x = y
	return y 

for number in range(min,max):
	# Calculate an estimate to use in square_root function
	estimate = number / 2.0

	result_mine = square_root(number,estimate)
	resulr_math = math.sqrt(number)
	difference = abs(result_mine - result_math)

	# Display
	print number,"\t",result_mine,"\t",result_math,"\t",difference
