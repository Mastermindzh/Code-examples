# Author: Rick van Lieshout

# will return whether number is divisible by 3 and 5
def isDivisible(number):
    return (number % 3 == 0) or (number % 5 == 0)

# general function to check divisor (solution 2)
def isDivisibleGeneral(number,divisor):
    return number % divisor == 0

# solution 1, specialized function
total = 0
count = 0

for number in range(1,1000):
    if isDivisible(number):
        total+=number

print(total)

# solution 2, using general function
total = 0

for number in range(1,1000):
    if isDivisibleGeneral(number,3) or isDivisibleGeneral(number,5):
        total+=number

print(total)

# Solution 3 Sikko's way

#define a function to add a number to a list if it doesn not exist yet
def addToArray(array, number):
    if number not in array:
        array.append(number)

x = 0
numbers = []

while x < 1000:
    addToArray(numbers,x)
    x+=3

x=0

while x < 1000:
    addToArray(numbers, x)
    x+=5

print(sum(numbers))
