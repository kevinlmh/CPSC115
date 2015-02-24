#-----------------------------------------------#
#       CPSC-115                                #
#       Grade Entering Lab                      #
#       Dr. Spezialetti                         #
#       Oct 8 2013                              #
#                                               #
#       Author: Bingqing Li & Minghui Liu       #
#-----------------------------------------------#

# Initialize values
sum = 0
total = 0
highscore = 0
num_students = 0

# Print welcome message
print "\n-------->>> Grade Maintainer 1.0 <<<--------"
print "    Created by: Bingqing Li & Minghui Liu"
print "  Report bugs to minghui.liu@trincoll.edu\n"

# Extract name from file
name_file_location=raw_input("Please enter the location of the name file: ")
namelist = open(name_file_location,'r')

# Ask user to enter name of the test
output_file_name = raw_input("Please enter the name of your test: ")

# Create a file with speciafied name
output_file = open(output_file_name+".txt",'w')

# Ask user to enter the number of questions
num_questions = input("Please enter the number of questions: ")

# Ask the user to input the test score by question for each student
for line in namelist:
    print "Please enter scores for this student: ",line,
    num_students = num_students + 1
    output_file.write(line+" ")
    
    # Ask the user to input score for each question
    for index in range(1,num_questions+1):
        score = input("Question "+str(index)+" >")
        sum = sum + score
        output_file.write(str(score)+',')
    output_file.write("Total:"+str(sum)+'\n')
    
    # Recording total score for calculating average
    total = total + sum
    
    # Determine highscore
    if sum>highscore:
        highscore=sum
    sum = 0
    print

# Calculate average and output highscore
average=float(total)/num_students
print "The average score of the test is %.1f"%average
print "The highest score of the test is",highscore







