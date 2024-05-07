package week_4_java_hw;

import java.util.Scanner;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme_11_Even_Digit_Sum {
    public static void main(String[] args) {
        //declare scanner to get data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int resu = evenDigitSum(num);
        System.out.println("The sum of even number is : " + resu);
        //close scanner
        scanner.close();
    }

    public static int evenDigitSum(int num) {
        int sum = 0;
        int mainNum = num;
        while (mainNum > 0) {
            int last = mainNum % 10;
            if (last % 2 == 0) {
                sum = sum + last;
            }
            mainNum = mainNum / 10;
        }
        if (num >= 0) {
            return sum;

        } else {
            return -1;
        }
    }
}