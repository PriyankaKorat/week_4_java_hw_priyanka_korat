package week_4_java_hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {
    // Declared main method
    public static void main(String[] args) {
        // Declared Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of number tou want to enter like 10:");
        int len = scanner.nextInt();

        // Called static method for Get user input of number
        getUserInputs(len);
        scanner.close();
    }

    public static void getUserInputs(int len) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[len];
        while (i < len) {
            System.out.println("Enter the number #" + (i + 1));
            if (!scanner.hasNextInt()) {
                System.out.println("Entered " + (i + 1) + " number is not valid");
                int newArr[] = Arrays.copyOf(number, i);
                findMaxMin(newArr);
                return;
            } else {
                number[i] = scanner.nextInt();
                i++;
            }
        }
        // Called static method directly
        findMaxMin(number);
    }

    // Find mix and min values from array
    public static void findMaxMin(int[] numArray) {
        System.out.println("Entered values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Maximum number from your given numbers : " + Arrays.stream(numArray).max());
        System.out.println("Minimum number from your given numbers : " + Arrays.stream(numArray).min());
    }

}

