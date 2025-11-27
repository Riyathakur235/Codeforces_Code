N=int(input())
even = odd = positive = negative = 0

for i in range(N):
    num = int(input())
    
    # even / odd
    if num % 2 == 0:
        even += 1
    else:
        odd += 1
    
    # positive / negative
    if num > 0:
        positive += 1
    elif num < 0:
        negative += 1

print("Even:", even)
print("Odd:", odd)
print("Positive:", positive)
print("Negative:", negative)
