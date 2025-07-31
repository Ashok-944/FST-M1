import pandas as pd

# Read data from the CSV file into a DataFrame
df = pd.read_csv('users.csv')

# Print all values in the 'Usernames' column
print("Usernames column values:")
print(df['Usernames'])

# Print username and password of the second row (indexing starts at 0)
print("\nUsername and password of the second row:")
print(df.loc[1, ['Usernames', 'Passwords']])

# Sort data by the 'Usernames' column in ascending order and display
print("\nData sorted by Usernames in ascending order:")
print(df.sort_values('Usernames'))

# Sort data by the 'Passwords' column in descending order and display
print("\nData sorted by Passwords in descending order:")
print(df.sort_values('Passwords', ascending=False))
