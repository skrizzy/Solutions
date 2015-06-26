def calculatePricePerDozen(numEggs):
        if (numEggs < 48):
            return 0.5
        elif (numEggs >= 48 and numEggs < 72):
            return 0.45
        elif (numEggs >= 72 and numEggs < 132):
            return 0.4
        else:
            return 0.35
choice = raw_input("Please enter 'c' for a calculator or 't' for a table: ")
if (choice[0:1].lower() == "c"):
    numEggs = input("Please enter the number of eggs: ")
    pricePerDozen = calculatePricePerDozen(numEggs)
    print ("Your cost is $" + str(pricePerDozen) + " per dozen or $" + str(pricePerDozen / 12) + " per egg.")
    print ("Your total bill comes to $" + str(pricePerDozen * numEggs / 12))
elif (choice[0:1].lower() == "t"):
    for numEggs in range(1, 121):
        print (str(numEggs) + " " + str(calculatePricePerDozen(numEggs) * numEggs / 12))
else:
    print("I'm sorry, that's not an option.")
