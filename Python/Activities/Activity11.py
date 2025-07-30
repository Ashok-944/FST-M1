fruits = {
    "apple": 100,
    "banana": 40,
    "orange": 80,
    "grapes": 120,
    "mango": 90
}

fruit = input("Enter the fruit you are looking for: ").lower()
if fruit in fruits:
    print(f"{fruit.capitalize()} is available at Rs.{fruits[fruit]}/kg")
else:
    print(f"Sorry, {fruit} is not available.")
