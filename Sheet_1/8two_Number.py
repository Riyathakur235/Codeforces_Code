import math
A, B = map(int,input().split())
division = A / B
floor_val = math.floor(division)
ceil_val = math.ceil(division)
round_val = math.floor(division+0.5)
print(f"floor {A} / {B} = {floor_val}")
print(f"ceil {A} / {B} = {ceil_val}")
print(f"round {A} / {B} = {round_val}")