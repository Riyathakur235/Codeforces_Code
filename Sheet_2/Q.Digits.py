N=int(input().strip())
T=int(input())
for _ in range(T):
 while N>0:
   print(N%10,end=' ')
   N//=10
print()

            