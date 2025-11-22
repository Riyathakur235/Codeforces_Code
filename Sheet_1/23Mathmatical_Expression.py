A, S, B, _, C = input().split()
A = int(A)
B = int(B)
C = int(C)

if S == '+':
    result = A + B
elif S == '-':
    result = A - B
else:
    result = A * B
if result == C:
    print("Yes")
else:
    print(result)