
# def find_xy(N):
#     for X in range(N):
#         for Y in range(N):
#             if (X**2 + Y**2) % N == 0:
#                 return X, Y
#     return None

# N = int(input().strip())
# result = find_xy(N)
# if result:
#     print(result[0], result[1])
# else:
#     print("No solutions")

# read N (can be huge)
_ = input().strip()
# trivial valid solution for any N:
print("0 0")