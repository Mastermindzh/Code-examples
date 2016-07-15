def isEven(number):
    return number % 2 == 0

def sumEvenFibonnaci(upperLimit):
    answer,firstNumber,secondnumber = 0,0,1
    while firstNumber < upperLimit:
        nextFibbonaci = firstNumber+secondnumber
        firstNumber = secondnumber
        secondnumber = nextFibbonaci
        if isEven(nextFibbonaci):
            answer += nextFibbonaci
    return answer

print(sumEvenFibonnaci(4000000))
