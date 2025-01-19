def persistence(n):
    digits = str(n).split()[0]
    mul = 0 
    count = 0
    while int(digits) > 9:
        count+=1
        for i in range(len(digits)-1):
            mul = int(digits[i]) * int(digits[i+1])
        digits = str(mul).split()[0]
    return count

print(persistence(25))
