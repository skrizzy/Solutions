# A likely Camper Solution to Fizzbuzz.  There are more efficient solutions.

for i in range(1, 101, 1):
    if i % 3 == 0 and i % 5 != 0:
        print("Fizz")
    if i % 3 != 0 and i % 5 == 0:
        print("Buzz")
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    else:
        print(i)

