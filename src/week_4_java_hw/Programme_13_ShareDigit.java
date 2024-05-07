package week_4_java_hw;

import java.util.Scanner;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13_ShareDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int input1 = in.nextInt();
        System.out.println("Enter number 2:");
        int input2 = in.nextInt();
        System.out.println("Result: " + comon(input1, input2));

    }

    public static boolean comon(int num1, int num2) {
        if (num1 <= 10 || num2 >= 99) {
            return false;
        }

        // Extract the last digit of each number
        int x = num1 % 10;
        int y = num2 % 10;

        // Remove the last digit from both numbers
        num1 /= 10;
        num2 /= 10;
        // Check if there's a common digit by comparing the remaining digits
        return (num1 == num2 || num1 == y || x == num2 || x == y);
    }
}
