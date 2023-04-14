
friendsGuess = int(input("Enter my birth Date: "))
count = 0
birthDate = 4
while (count >= 0):
    if (friendsGuess == birthDate):
        print("Correct Guess")
        break

    else:
        print("Incorrect Guess")
    friendsGuess = int(input("Enter my birth Date: "))
    count += 1
