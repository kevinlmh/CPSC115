def remove_items(list):
	for i in range(1,len(list)/2+1):
		del list[i]
	return list
	
num_list = [1,3,5,7,9]
print remove_items(num_list)

