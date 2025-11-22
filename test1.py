
#for i in range(2,101,2):
# print(i)
# sum of digits
#num=123
#total=0
#for digits in str(num):
 #   total+=int(digits)
#print("sum of digits:",total)    

#Reverse a string
#text="my name is riya"
#reversed=" "
#for ch in text:
 #   reversed=ch + reversed
#print("reversed",reversed)    

#Factorial
#n=7
#fact=1
#for i in range(1,n+1):
  #  fact=fact*i
#print("factorial",fact)    

#count voweel or consonents
# text="in this code we will count vowel or consonents"
# vowels="aeiouAEIOU"
# v_count =0
# c_count=0
# for ch in text:
#     if ch.isalpha():
#         if ch is vowels:
#             v_count+=1
#         else:
#             c_count+=1
# print("vowels",v_count ,"consonents",c_count)               

#table
# for i in range (1,12):
#     for j in range(1,11):
#         print(i,"*",j,"=",i*j)
# print()        

#largest number in a list
# number=[5,6,8,43,4]
# largest=number[0]
# for num in number:
#     if num>largest:
#         largest=num
# print("largest: ",largest)        

#prime no.check
# num=29
# is_prime=True
# for i in range(2,num):
#     if num%i==0:
#         is_prime=False
#         break
# print(num,"is prime?",is_prime)    

#check palindrom
# text="madam"
# is_palindrom=True
# for i in range(len(text)//2):
#     if text[i] != text[-(i+1)]:
#         is_palindrom=False
#         break
# if is_palindrom:
#     print(f"'{text}' is a palindrrom ") 
# else:
#     print(f"'{text} is not a palindrom")
  
#count the word in the sentence
# sentence="I am a good boy"
# count=0
# word=""
# for ch in sentence +" ":
#     if ch!=" ":
#       word+=ch
#     else:
#        if word!=" ":
#           count+=1
#           word=" "
# print(f"the sentence has{count} words")   
 
#Amstrong number
# num=153
# power=len(str(num))  
# total=0
# for digits in str(num):
#     total+= int(digits)**power
# print(num,"is amstrong?",total==num)         

#print triangle using number
# rows=6
# for i in range(1,rows+1):
#     for j in range(1,i+1):
#         print(j,end =" ")
#     print()    

# num=145
# total=0
# for d in range(1,str(num)):
#     digits =int(d)
#     fact=1
#     for i in range(1,digits+1):
#       fact*=i
#       total+=fact 
# if total == num:
#    print(f"{num} is a strong number")      
# else:
#    print(f"{num} is not a strong number")   


 #  check if squre of a number end by the number itself
 # suum of th digits powed with their position equals to that number
 #number is a spy number
 #first repeating no. in string
 
def last_digit(a,b):
  return (a,b,10)
N=int(input().split())
for i in range(N):
  a,b = map(int,input.split())
  print(last_digit(a,b))  