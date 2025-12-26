N=int(input())
a=0
b=1
for i in range(0,N):
    if i==0:
        print(a,end=" ")
    elif i==1:
        print(b,end=" ")
    else:
        c=a+b
        print(c,end=" ")
        a=b
        b=c