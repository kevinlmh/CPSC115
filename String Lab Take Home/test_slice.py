#-------------------------------------------------------------------#
#   This program test string slicing.                               #
#   It tries diffent value for start and end to see how they work.  #
#                                                                   #
#   Author: Minghui Kevin Liu                                       #
#   Date created: Oct 13 2013                                       #
#-------------------------------------------------------------------#
letters = "abcdefgh"
#Start equals to end
print "Start equals to end:",letters[3:3] 
#Start is greater than end
print "Start is greater than end:",letters[4:3]
#End is longer than string
print "End is longer than string:",letters[:9]