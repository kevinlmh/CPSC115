#-------------------------------------------------------#
#	This is a program that estimates the value of pi	#
#	Author: Minghui Kevin Liu							#
#	Date created: Oct 12 2013							#
#-------------------------------------------------------#

# >>> Note: This script does not work! <<<

import math

print math.factorial(0)
def estimate_pi():
	stop_limit = 1e-15
	coefficient=2*math.sqrt(2)/9801
	k=0
	sum = 0
	term = ( math.factorial(4*k)*(1103+26390*k) )/( math.factorial(k)**4 * 396**4*k )	
	while term>=stop_limit:
		term = ( math.factorial(4*k)*(1103+26390*k) )/( math.factorial(k)**4 * 396**4*k )
		print term
		sum = sum + term
		k = k+1
	print sum
	one_over_pi = coefficient*sum
	pi = 1.0/one_over_pi
	return pi
	
print estimate_pi()

