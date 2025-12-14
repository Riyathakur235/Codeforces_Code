N = int(input().strip())
original_N=N
reversed_N=0
while N>0:
    digit=N%10
    reversed_N=reversed_N*10+digit
    N=N//10
print(reversed_N)
if original_N==reversed_N:
    print("YES")
else:
    print("NO")        
    