        #################################
        #  Lab 2 Sep 10th 2013 Tue      #
        #  CPSC-115 Prof.Spezialetti    #
        #  Group member: Kevin L.       #
        #                Hongyi D.      #
        #################################
        
#Assume that each male can eat 6 wings and each female can eat 4 wings.Each wing costs 50 cents.
amt_male = 6
amt_female =4 
price =0.50

#Ask for numbers of males and females and display recommneded number of wings
male = input("Please enter the number of Males:        ")
female = input("Please enter the number of Females:    ")
rec_num = male*amt_male+female*amt_female  
print "Recommended number of wings:          ",rec_num

#Ask for actual number of wings ordered and display cost.
actual_num = input("Please enter that number of wings:       ")
cost = actual_num*price
print "Total cost:                                                $%.2f"%cost
