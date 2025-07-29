import random

while True:
    user = input("Enter your choice (rock, paper, scissors): ").lower()
    choices = ["rock", "paper", "scissors"]
    computer = random.choice(choices)
    print(f"Computer chose: {computer}")

    if user == computer:
        print("It's a tie!")
    elif (user == "rock" and computer == "scissors") or \
         (user == "paper" and computer == "rock") or \
         (user == "scissors" and computer == "paper"):
        print("You win!")
    elif user in choices:
        print("You lose!")
    else:
        print("Invalid choice. Try again.")
        continue

    play_again = input("Do you want to play another round? (Yes/No): ").lower()
    if play_again != "yes":
        print("Thanks for playing!")
        break
