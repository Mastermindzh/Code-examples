def isPalindrome(number):
    ispalindrome = True
    list = intToList(number)

    #if list is not an even number it can't be a palindrome
    if len(list) % 2 != 0:
        ispalindrome = False

    for x in range(0,int(len(list)/2)):
        if(ispalindrome):
            ispalindrome = (list[x] == list[len(list)-(x+1)])
    return ispalindrome

def intToList(number):
    digits = []
    number = str(number)
    for digit in number:
        digits.append(int(digit))

    return digits

#largest_palindrome
largest_palindrome = 0

#For loop to generate multiples
for i in range(1000,100,-1):
    for j in range(1000,100,-1):
        number = i*j
        if number > largest_palindrome and isPalindrome(number):
            largest_palindrome = number

print(largest_palindrome)