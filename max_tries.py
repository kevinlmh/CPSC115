#-------------------------------------------------------------------------------------------#
#		This is a program that ask user to input a number between 1 and 10. If they			#
#		enter a number out of that range, this program prints an error statement and 		#
#		prompts them again to enter a number in the correct range.  However, they get 		#
#		no more than 5 tries. If they have not entered a correct number after 5 tries, 		#
#		a final error message is output and the program terminates. If they do enter a 		#
#		correct number, this program simply outputs that number.							#
#																							#
#		Author: Minghui Kevin Liu															#
#		Date Created: Oct 7 2013															#
#-------------------------------------------------------------------------------------------#

# define range
min = 1
max = 10
counter = 0
max_tries = 5

# while loop that repeats max_tires times
while counter < max_tries+1:
    # Prompt user to enter a number between 'min' and 'max'
    print "Please enter a number between",min,"and",max,": ",
    num = input()
    # Check in num is in range. If not display an error message
    if num >= min and num <= max:
        break
    else:
        # Display number of tries left(max_tries-counter)
        print "Invalid Input! You have",max_tries-counter,"tries left." 
    counter += 1
# Print final error message and terminate the program    
print "Sorry. You entered invalid input for",max_tries,"times. Program terminated."