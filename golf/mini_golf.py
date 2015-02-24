#-------------------------------------------------------------------------------#
#					The Sewing Sisters Swing Away Program                       #
#                                                                               #
#					Author: Minghui Kevin Liu                                   #
#					Date created: Oct 20 2013 Sun                               #
#                                                                               #
#   Usage: 1.Write par values in txt files                                      #
#          2.Run script in Dr. Python                                           #
#           or cd to where this script is in terminal and then run:             #
#           python mini_golf.py                                                 #
#-------------------------------------------------------------------------------#

# A function that add sign to an interget and return it as string
def sign(int):
	if int >0:
		return "+"+str(int)
	else:
		return str(int)

# Printing usage
print "------>>> The Sewing Sisters Swing Away Program <<<------"
print "\t\tAuthor: Minghui Kevin Liu"

# Initializing values
max_strokes = 6

# Asking sewing sisters to choose a golf course
print "Putt Putt Paradise has three courses:"
print "1. Hawaiian Heaven"
print "2. Bora Bora"
print "3. Tahitian Dreams"
golf_course = input("Which golf course do you want to play? ")
while golf_course > 3:
	golf_course = input("Please enter an interger between 1 and 3: ")

# Opening and reading pars from corresponding text file
if golf_course == 1:
	course_name = "Hawaiian Heaven"
	input_file = open("Hawaiian Heaven.txt",'r')
elif golf_course == 2:
	course_name = "Bora Bora"
	input_file = open("Bora Bora.txt",'r')
elif golf_course == 3:
	course_name = "Tahitian Dreams"
	input_file == open("Tahitian Dreams.txt",'r')

# Prompting user to enter names of player 1 and 2 and store them in variables
name_player1 = raw_input("\nName of player 1: ")
name_player2 = raw_input("Name of player 2: ")
print

# Creating score card file for each player
score_card_player1 = open(name_player1 + "Scorecard.txt",'w')
score_card_player2 = open(name_player2 + "Scorecard.txt",'w')

# Creating accumulators for total shots of players
total_shots_player1 =0
total_shots_player2 = 0

# Creating accumulators for overall par of players
overall_par_player1 = 0
overall_par_player2 = 0

# Creating accumulator for total par of the course
total_par_of_course = 0
# Creating an index that represents line number
index = 0
# A for loop that goes through every line in input file
for line in input_file:
	#print "[DEBUG] line:",line
	# Reading and storing the first line, which is number of holes in this course
	if index == 0:
		num_holes_in_course = int(line)
		#print "[DEBUG] num_holes_in_course:",num_holes_in_course
	# Reading the rest of the lines, which are pars of holes
	else:
		par = int(line)
		#print "[DEBUG] par:",par
		total_par_of_course += par
					
					
					# --- Player 1 --- #
		
		# Asking user to input score of player1
		hole_score_player1 = input(name_player1+"'s score of hole "+str(index)+": ")
		
		# Check if input is bigger that max_strokes
		if hole_score_player1 > max_strokes:
			hole_score_player1 = max_strokes
			print "Score cannot exceed",max_strokes,"\nAutomatically set to",max_strokes
		
		# Add hole score to total shots
		total_shots_player1 += hole_score_player1
		
		# Calculate par on hole for player 1
		par_on_hole_player1 = hole_score_player1 - par
		
		# Display player1's score relative to the par
		print "\t\t\tPar of hole: ", sign(par_on_hole_player1)
		
		# Add par on hole to overall par
		overall_par_player1 += par_on_hole_player1
		
		# Write into player1's score card
		score_card_player1.write("Hole:"+str(index)+"\tPar:"+str(par)+"\tScore:"+str(hole_score_player1)+"\t\tPar on Hole:"+sign(par_on_hole_player1)+"\n")
					
					
					# --- Player 2 --- #
		
		# Asking user to input score of player1
		hole_score_player2 = input(name_player2+"'s score of hole "+str(index)+": ")
		
		# Check if input is bigger that max_strokes
		if hole_score_player2 > max_strokes:
			hole_score_player1 = max_strokes
			print "Score cannot exceed",max_strokes,"\nAutomatically set to",max_strokes
		
		# Add hole score to total shots
		total_shots_player2 += hole_score_player2
		
		# Calculate par on hole for player 2
		par_on_hole_player2 = hole_score_player2 - par
		
		# Display player2's score relative to the par
		print "\t\t\tPar of hole: ", sign(par_on_hole_player2)
		
		# Add par on hole to overall par
		overall_par_player2 += par_on_hole_player2
		
		# Write into player2's score card
		score_card_player2.write("Hole:"+str(index)+"\tPar:"+str(par)+"\tScore:"+str(hole_score_player2)+"\t\tPar on Hole:"+sign(par_on_hole_player2)+"\n")
		
		
		
		
		# Half way thourgh the game. Printing player names, total number of shots
		# and current overall par
		if index == num_holes_in_course/2  or (num_holes_in_course == 2 and index == 1):
			print "\nHalf time! Take a break and see how players did so far:"
			print name_player1,"\tTotal shots:",total_shots_player1,"\tCurrent overall par:",overall_par_player1
			print name_player2,"\tTotal shots:",total_shots_player2,"\tCurrent overall par:",overall_par_player2,"\n"
	
	# Increment index/line number
	index += 1

# Game is over. Printing information again and indication of who won the game
print "\nGame is over! Score board:"
print name_player1,"\tTotal shots:",total_shots_player1,"\tOverall par:",overall_par_player1
print name_player2,"\tTotal shots:",total_shots_player2,"\tOverall par:",overall_par_player2,"\n"

if total_shots_player1 < total_shots_player2:
	print name_player1,"wins the game !!! Congratulations!!! ^_^\n"
elif total_shots_player1 > total_shots_player2:
	print name_player1,"wins the game !!! Congratulations!!! ^_^\n"
else:
	print "The game ended in a draw. +_+\n"

# Writing in PuttyPuttyHistory file
history_file = open("PuttyPuttyHistory.txt","a")
history_file.write(course_name+"\t\t"+"Par:"+str(total_par_of_course)+"\t"+name_player1+":"+str(total_shots_player1)+","+sign(overall_par_player1)+"\t"+name_player2+":"+str(total_shots_player2)+","+sign(overall_par_player2)+"\n")

# Close all files
input_file.close()
score_card_player1.close()
score_card_player2.close()
history_file.close()



