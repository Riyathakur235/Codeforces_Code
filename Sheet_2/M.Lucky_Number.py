def is_lucky(n):
    while n > 0:
        digit = n % 10
        if digit != 4 and digit != 7:
            return False
        n = n // 10
    return True

A, B = map(int, input().split())
lucky_numbers = []

for num in range(A, B + 1):
    if is_lucky(num):
        lucky_numbers.append(str(num))

if lucky_numbers:
    print(' '.join(lucky_numbers))
else:
    print(-1)