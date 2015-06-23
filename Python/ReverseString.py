original = raw_input("Please enter a string to be reversed: ")
reversed = ""
for x in range(0, len(original)):
    reversed += original[len(original) - 1 - x]
print(reversed)
