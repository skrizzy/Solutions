import random

bridgeLength = 5
manPosition = 3
moveCount = 0

print ("|--o--|")
while True:
    rand = random.random()
    if (rand < 0.5):
        manPosition -= 1
    else:
        manPosition += 1

    toPrint = "|"
    for i in range(1, bridgeLength + 1):
        if (i == manPosition):
            toPrint += "o"
        else:
            toPrint += "-"

    toPrint += "|"

    print(toPrint)
    moveCount += 1

    if (manPosition == 0 or manPosition == 6):
        print("The man moved " + str(moveCount) + " times before falling off.")
        break
