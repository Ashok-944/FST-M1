list1 = [10, 21, 23, 45, 76, 88]
list2 = [13, 22, 48, 91, 100, 105]

result = [num for num in list1 if num % 2 != 0] + [num for num in list2 if num % 2 == 0]
print(result)
