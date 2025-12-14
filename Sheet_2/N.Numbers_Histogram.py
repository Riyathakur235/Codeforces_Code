S=input().strip()
N=int(input().strip())
nums = list(map(int, input().strip().split()))
for i in nums:
    print(S*i)
