#Minghui Liu
#CPSC-115
#Dr.Spezialetti
#Program 1
#King Cole Laser Tag

price_adult = 7
price_children = 5
price_room = 100
price_pizza = 18
price_arena =250
price_soda = 2
slice_per_pizza = 16
food_discount = 0.9

rent_arena = raw_input("Do you want to rent the whole arena? (Y=Yes N=No) ")
if rent_arena == "Y" or rent_arena == "y":
    subtotal_game = price_arena
else:
    num_adult = input("Please enter the number of adults: ")
    num_children = input("Please enter the number of children: ")
    num_game = input("Please enter the number of games you want to play: ")
    subtotal_game = (price_adult*num_adult + price_children*num_children)*num_game
    if num_game>1:
        subtotal_game -= num_game
print "Total game cost: $%.2f"%subtotal_game
    
royal_feast = raw_input("Do you want a royal feast? (Y=Yes N=No) ")
if royal_feast == "Y" or royal_feast == "y":
    print "King Cole Laser Tag offers one size of pizza. Each pizza contains",slice_per_pizza,"slices."
    slice_per_child = input("Please enter the number of slices a child need: ")
    slice_per_adult = input("Please enter the number of slices an adult need: ")
    num_slice = num_children*slice_per_child + num_adult*slice_per_adult
    num_pizza = num_slice/slice_per_pizza
    if num_slice%slice_per_pizza != 0:
        num_pizza += 1
    print "You need at least",num_slice,"slices. So we suggest you order",num_pizza,"pizza."
    num_pizza = input("Please enter the number of pizza yo want to order: ")
    subtotal_food = price_room + price_pizza*num_pizza
    soda = raw_input("Do you want soda for everyone? (Y=Yes N=No) ")
    if soda == "Y" or soda == "y":
        subtotal_food += (num_adult + num_children) * price_soda
    print "Total food cost: $%.2f"%subtotal_food
    if subtotal_food>=150:
        subtotal_food *= food_discount
        print "We offer a 10% discount for orders exceed $150."
        print "Total food cost after discount: $",subtotal_food
else:
    subtotal_food = 0
    

total = subtotal_game + subtotal_food
print "The total cost is: $%.2f"%total
print "Thank you very much, please come again."
    

