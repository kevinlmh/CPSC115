#-------------------------------------------------------------------------------#
#   This is a program that prompts user to input a file name, with extension,   #
#   and outputs whether this file is a Pyhton file.                             #
#                                                                               #
#   Author: Minghui Kevin Liu                                                   #
#   Date created: Oct 13 2013                                                   #
#-------------------------------------------------------------------------------#

#Ask user to input name of a file
filename = raw_input("Please enter a filename: ")
#Determine if this file ends in ".py" extension
if filename[-3:] == ".py":
    print "This file is a Python file."
else:
    print "This file is not a Python file."