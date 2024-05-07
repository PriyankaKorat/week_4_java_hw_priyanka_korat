package week_4_java_hw;

import java.util.Scanner;

/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */
public class Programme_4_DigitSumChallenge {
    public static void main(String[] args) {
        // Declared Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to calculate the sum of each digit");
        int number = scanner.nextInt();
        checkNumber(number);
    }

    // Check the number is single digit or negative
    public static void checkNumber(int number) {
        if (number > 0 && number < 10) { // single digit
            System.out.println("Your entered number and sum of that number are same " + number);
        } else if (number >= 10) {
            //System.out.println("input");
            sumDigits(number);
        } else {
            System.out.println("Please enter valid input");
        }
    }

    // Declared method for the sum of digit
    public static void sumDigits(int number) {
        //n % 10 to extract the least-significant digit.
        // *  Use n = n / 10 to discard the least-significant digit.

        if (number < 10) {
            System.out.println("-1");
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            //extract the least significant digit
            int digit = number % 10;
            sum = sum + digit;
            //drop least significant digit
            number = number / 10;
        }
        System.out.println(sum);

    }
}
