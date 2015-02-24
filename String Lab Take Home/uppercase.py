#---------------------------------------------------------------------------#
#   This is program that change the content of file to uppercase letter     #
#   and out put it into a new file with extension ".out"                    #
#                                                                           #
#   Important: If run in terminal, please set PWD to the folder that        #
#              contains this script                                         #
#                                                                           #          
#   Author: Minghui Kevin Liu                                               #
#   Date created: Oct 13 2013                                               #
#---------------------------------------------------------------------------#

# Ask user for name of input file
in_file_location = raw_input("Please enter name of input text file: ")
# Open input file
in_file = open(in_file_location,'r')
# Create output file
out_file = open(in_file_location[:-3]+"out",'w')
# A for loop that changes each line in input file to uppercase 
# and writes into output file
for line in in_file:
    out_file.write( line.upper() )
# Close input file
in_file.close()