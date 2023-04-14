package javaExam;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int birthDate = 4;

        System.out.print("Enter my birth Date: ");
        int friendsGuess = scanner.nextInt();

        while (count >= 0){
            if (friendsGuess == birthDate){
                System.out.println("Correct Guess");
                break;
            }
            else {
                System.out.println("Incorrect Guess");
            }

            System.out.print("Enter my birth Date: ");
            friendsGuess = scanner.nextInt();
            count++;
        }

    }
}
