A,B=map(int,input().split())
arr=list(map(int,input().split()))
i=0
while i<A:
    group=arr[i:i+B]
    print(min(group),end=' ')
    i+=B