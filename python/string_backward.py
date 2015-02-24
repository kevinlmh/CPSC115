#-----------------------------------------------------------#
#	This is a program that displays a string backwards.		#
#	Author: Minghui Kevin Liu								#
#	Date Created: Oct 5 2013								#
#-----------------------------------------------------------#

string = raw_input("Please enter a string that you want to display backward: ")

index = 1
# This is the while version

#	while index <= len(string):
#		letter = string[len(string)-index]
#		print letter,
#		index += 1

# This is the for version
for index in range(1,len(string)+1):
	letter = string[len(string)-index]
	print letter,	# ',' suppresses a new line


# This version prints the letter normally
#for char in string:
#	print char,

