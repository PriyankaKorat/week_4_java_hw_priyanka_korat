package week_4_java_hw;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_PrintVowelConsonant {
    public static void main(String[] args) {
        // Declared Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabets between a to z or A to Z:");
        //String str = scanner.nextLine();
        Character charVal = scanner.next().charAt(0);
        scanner.close();
        if (Character.isAlphabetic(charVal) && charVal > 1) {
            // called static method with switch statement
            findVowelOrConsonantSwitch(charVal);
        } else {
            System.out.println("Please enter valid input as alphabet between A to Z or a to z.");
        }

    }

    public static void findVowelOrConsonantSwitch(Character ch) {
        int i = 0;
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'I', 'A', 'E', 'O', 'U':
                i++;
        }

        if (i == 1) {
            System.out.println("Entered character " + ch + "' Input letter is Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Entered character " + ch + " is a Consonant.");
        } else {
            System.out.println("Entered character '" + ch + "' is a not valid.");
        }
    }

}
