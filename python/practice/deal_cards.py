def deal_cards(deck):
	p1_pile = []
	p2_pile = []
	print len(deck)
	for i in range(len(deck)):
		print i
		if i%2 == 0:
			p1_pile.append(deck[i])
		elif i%2 == 1:
			p2_pile.append(deck[i])
	deck = []
	print "Player1: "
	print p1_pile
	print "Player2: "
	print p2_pile
	print "Deck: "
	print deck

deck = ['H2', 'H3', 'H4', 'H5', 'H6', 'H7', 'H8', 'H9', 'H10', 'HJ', 'HQ', 'HK', 'HA', 'D2', 'D3', 'D4', 'D5', 'D6', 'D7', 'D8', 'D9', 'D10', 'DJ', 'DQ', 'DK', 'DA', 'S2', 'S3', 'S4', 'S5', 'S6', 'S7', 'S8', 'S9', 'S10', 'SJ', 'SQ', 'SK', 'SA', 'C2', 'C3', 'C4', 'C5', 'C6', 'C7', 'C8', 'C9', 'C10', 'CJ', 'CQ', 'CK', 'CA']
deal_cards(deck)
