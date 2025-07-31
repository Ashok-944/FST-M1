import pandas as pd

# Read the Excel file
df = pd.read_excel('sample.xlsx')

# Print the number of rows and columns
print("Number of rows and columns:", df.shape)

# Print the data in the 'Email' column only
print("\nEmails column data:")
print(df['Email'])

# Sort the data based on 'FirstName' in ascending order and print
sorted_df = df.sort_values('FirstName')
print("\nData sorted by FirstName (ascending):")
print(sorted_df)
