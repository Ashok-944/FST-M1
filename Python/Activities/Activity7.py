user_input = input("Enter numbers separated by spaces: ")
num_list = [int(x) for x in user_input.split()]
total = sum(num_list)
print("Sum of the list is:", total)
