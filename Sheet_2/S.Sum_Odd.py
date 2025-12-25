T=int(input())
for i in range(T):
    m,n=map(int,input().split())
    start=min(m,n)+1
    end=max(m,n)
    sum=0
    for num in range(start,end):
      if num%2==1:
          sum+=num
    print(sum)