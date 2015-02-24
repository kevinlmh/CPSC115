def cut_ends(s,num):
	if len(s) <= num*2:
		print "Error"
	else:
		return s[num:-num]

list = "IloveComputerScience"
print cut_ends(list,5)
