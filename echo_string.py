#---------------------------------------------------------------------------------------#
#		This is a python program that first prompts the user to enter a numeric 		#
#		"echo factor", which must be a positive number.  The user is then prompted		#
#		to enter a string.  The string will then the output to the screen the number	#
#		of times indicated by the echo factor. The user will continue to be prompted    #
#       for an echo factor and a string and the specified output will be displayed      #
#       until they enter a negative number for the echo factor, at which point the      #
#       program outputs "Thank you" and terminate.								        #
#																						#
#		Author: Minghui Kevin Liu														#
#		Date Created: Oct 7 2013														#
#---------------------------------------------------------------------------------------#

# A while loop that terminates when user input a negative number
while True:
    # Ask user for echo factor and string
    echo_factor = input("Please enter echo factor: ")
    if echo_factor < 0:
        break
    string = raw_input("Please enter a string: ")

    # print string the number of times that equals to echo_factor
    for index in range(0,echo_factor):
        print string
    