for x in range(1, 16):
    stringToPrint = ""
    if (x % 3 == 0):
        stringToPrint = "Fizz"
    if (x % 5 == 0):
        stringToPrint += "Buzz"
    if (x % 3 != 0 and x % 5 != 0):
        stringToPrint = x
    print (stringToPrint)
