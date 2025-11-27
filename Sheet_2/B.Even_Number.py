N = int(input())
if N < 2:
    print(-1)
else:
    for i in range(2, N+1, 2):
        print(i)   