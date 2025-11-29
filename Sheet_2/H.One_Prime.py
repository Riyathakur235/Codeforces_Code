X = int(input())
if X <= 1:
    print("NO")
elif X <= 3:
    print("YES")
elif X % 2 == 0 or X % 3 == 0:
    print("NO")
else:
    i = 5
    while i * i <= X:
        if X % i == 0 or X % (i + 2) == 0:
            print("NO")
            break
        i += 6
    else:
        print("YES")
    