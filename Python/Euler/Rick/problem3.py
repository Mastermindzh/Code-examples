import datetime




def findLargestPrimeFactor(number, counter=2):
    factors = []
    while counter * counter < number:
        while number % counter == 0:
            factors.append(counter)
            number = number / counter
        counter += 1
    factors.append(number)
    return factors

print(str(findLargestPrimeFactor(600851475143)))