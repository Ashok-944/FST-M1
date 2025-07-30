def sum(num_list):
    print(sum(num_list))

user_input = input("Enter numbers separated by spaces: ")
numbers = [int(x) for x in user_input.split()]
sum(numbers)
