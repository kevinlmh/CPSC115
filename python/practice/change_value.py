def change_value(x,y):
	global numlist
	if x>len(numlist) or y>len(numlist):
		print "Index to large!"
	else:
		numlist[x] = numlist[y]
		
numlist = [1,1,1,1,2]
print numlist
change_value(0,4)
print numlist
