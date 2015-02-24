#-------------------------------------------------------------------#
#		This is a program that use len function to return the		#
#		next to last letter of a string.							#
#																	#
#			Author: Minghui Kevin Liu								#
#			Date created: Oct 13 2013								#
#-------------------------------------------------------------------#

#Ask for user-input
string = raw_input("Plese enter a string: ")
#Return next to last letter of given string
print string[len(string)-2]