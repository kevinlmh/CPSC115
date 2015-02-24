#---------------------------------------------------------------------------#
#		Eval_loop Function													#
#		Iteratively prompts the user, takes the resulting input and			#
#		evaluates it using eval, and prints the result.						#
#		It continues until the user enters 'done', and then returns 		#
#		the value of the last expression it evaluated.						#
#																			#
#		Author: Minghui Kevin Liu											#
# 		Date Created: Oct 12 2013											#
#---------------------------------------------------------------------------#

def eval_loop():
	string = raw_input("Please enter python statement:>>>")
	while string!="done":
		print eval(string)
		string = raw_input(">>>")
eval_loop()

