def ends_with(word_list, letter):
	if len(letter) != 1:
		print "letter longer than one character!"
	else:
		for word in word_list:
			if word[-1] == letter:
				print word

wordlist = ["hehe","wocao","nani","fanzao","zuosi"]
ends_with(wordlist, "i")
#ends_with(wordlist, "o")
