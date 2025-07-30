user_input = input("Enter numbers separated by spaces: ")
num_tuple = tuple(int(x) for x in user_input.split())
for num in num_tuple:
    if num % 5 == 0:
        print(num)
