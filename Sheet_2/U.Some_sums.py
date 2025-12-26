N,A,B=map(int,input().split())
total=0
for i in range(1,N+1):
    digit_sum=sum(map(int,str(i)))
    if A<=digit_sum<=B:
        total+=i
print(total)        
