def check_first_last(num_list):
    return num_list[0] == num_list[-1]

user_input = input("Enter numbers separated by spaces: ")
num_list = [int(x) for x in user_input.split()]
print(check_first_last(num_list))
