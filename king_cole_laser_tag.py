#-----------------------------------------------------------------------------------#
#                               Program 1                                           #
#                               King Cole Laser Tag                                 #
#                               CPSC-115                                            #
#                               Dr.Spezialetti                                      #
#                                                                                   #
#       Author: Minghui Liu                                                         #
#       Purpose: To calculate cost of game and food for King Cole Laser Tag         #
#                because they cannot rely on their unenthusiastic employee.         #
#-----------------------------------------------------------------------------------#

# Define variables (I guarantee there is no literal value in this script LOL)
price_adult = 7         # Price for adults
price_children = 5      # Price for children
price_arena =250        # Price of renting the whole arena
price_room = 100        # Price for renting a room if customer want a Royal Feast
price_pizza = 18        # Price of one pizza
price_soda = 2          # Price of soda
slice_per_pizza = 16    # Number of slices in one pizza
food_discount = 0.1     # Discount if food order exceeds $150 (0.1 reprsents 10% off)
food_discount_min = 150 # Minimum cost of food order to get a discount(inclusive)
game_discount_min = 1   # Minimum number of games to get a discount(exclusice)

# Print a welcome message and a brief price list
print "********>>> Welcome To King Cole Laser Tag <<<********\n"
print "---Our Price Today:---"
print "~Paying by per person per game:"
print "     Adults: $%d"%price_adult,"per game"
print "     Children: $%d"%price_children,"per game"
print "~Play by renting the arena:"
print "     $%d"%price_arena,"per game"
print "~Room for royal feast: $%d"%price_room,"each room"
print "~Pizza: $%d"%price_pizza,"each pizza"
print "~Soda: unlimited $%d"%price_soda,"each person"
print "- - - - - - - - - - - -\n"
#----------------------------------->>> GAME <<<--------------------------------------#

# Ask for user input
num_adult = input("Please enter the number of adults: ")
num_children = input("Please enter the number of children: ")
num_game = input("Please enter the number of games you want to play: ")

# Calculate cost of paying per person per game
cost_per_person_game = (price_adult*num_adult + price_children*num_children)*num_game
# Give discount if play more than one game.
if num_game > game_discount_min:
    print "Your game cost was $%.2f"%float(cost_per_person_game)
    print "Since you play more than one games we offer you a discount."
    cost_per_person_game -= num_game*(num_adult+num_children)

# Calculate cost of renting arena
cost_rent_arena = price_arena*num_game

# Display costs of the two methods of play for user to compare
print "Cost of paying per person per game is: $%.2f" %cost_per_person_game
print "Cost of of renting the arena is: $%.2f" %cost_rent_arena

# Ask customers if they want to rent the arena
rent_arena = raw_input("Do you want to rent the whole arena? (Y=Yes N=No) ")
if rent_arena == "Y" or rent_arena == "y":
    total_game = cost_rent_arena
else:
    total_game = cost_per_person_game

# Output total game cost.
print "Total game cost: $%.2f"%total_game
print "\n"              # Print a blank line to make the output more readable.

#---------------------------------->>> FOOD <<<----------------------------------------#

# Ask customers if they want a Royal Feast. 
royal_feast = raw_input("Do you want a royal feast? (Y=Yes N=No) ")

# If yes, give them info about pizza.
if royal_feast == "Y" or royal_feast == "y":
    print "King Cole Laser Tag offers one size of pizza. Each pizza contains",slice_per_pizza,"slices."
    
    # Ask the number of slices that customers think adults and children will need.
    slice_per_child = input("Please enter the number of slices a child need: ")
    slice_per_adult = input("Please enter the number of slices an adult need: ")
    
    # Calculate and suggest the number of pizza they need.
    num_slice = num_children*slice_per_child + num_adult*slice_per_adult
    num_pizza = num_slice/slice_per_pizza
    if num_slice%slice_per_pizza != 0:
        num_pizza += 1
    print "You need at least",num_slice,"slices. So we suggest you order",num_pizza,"pizza."
    
    # Ask for the number of pizza they want to order.
    num_pizza = input("Please enter the number of pizza yo want to order: ")
    total_food = price_pizza*num_pizza
    
    # Ask if customers want to order soda for everyone.
    soda = raw_input("Do you want soda for everyone? (Y=Yes N=No) ")
    if soda == "Y" or soda == "y":
        total_food += (num_adult + num_children) * price_soda
    
    # Output total food cost. 
    print "Food cost: $%.2f"%total_food
    
    # If order exceeds $150, give a discount and output the total cost after discount.
    if total_food>=food_discount_min:
        total_food *= (1-food_discount)
        print "We offer a 10% discount for orders exceed $150."
        print "Food cost after discount: $%.2f"%total_food
    food_and_room = total_food + price_room
    print "Total cost of food plus room is: $%.2f"%food_and_room   
    
# If customers do not want Royal Feast, set food and room cost to zero.
else:
    food_and_room = 0
print "\n"          # Print a blank line to make the output more readable.
    
#-------------->>> Output total cost and a friendly thank-you message. <<<-------------#
total = total_game + food_and_room
print "The total cost is: $%.2f"%total
print "Thank you very much. Please come to King Cole Laser Tag again."
    

