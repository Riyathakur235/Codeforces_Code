correct_password=1999
while True:
    password=int(input().strip())
    if password==correct_password:
        print("Correct")
        break
    else:
        print("Wrong")