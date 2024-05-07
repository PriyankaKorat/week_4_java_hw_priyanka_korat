package week_4_java_hw;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 *  While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */
public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the diamond: ");
        int length = scanner.nextInt();
        printDiamond(length);
        scanner.close();  ///Close scanner
    }

    public static void printDiamond(int length) {
        int n = length;
        int spaces = n - 1;
        int stars = 1;
        int row = 1;

        // Upper half of the diamond
        while (row <= n) {
            int spaceCount = spaces;
            int starCount = stars;

            // Print spaces
            while (spaceCount > 0) {
                System.out.print(" ");
                spaceCount--;
            }

            // Print stars
            while (starCount > 0) {
                System.out.print("*");
                starCount--;
            }

            System.out.println();
            spaces--;
            stars += 2;
            row++;
        }
     //Lower half of the diamond
                spaces = 1;
        stars = n * 2 - 3;
        row = 1;
        while (row <= n - 1) {
            int spaceCount = spaces;
            int starCount = stars;

            // Print spaces
            while (spaceCount > 0) {
                System.out.print(" ");
                spaceCount--;
            }

            // Print stars
            while (starCount > 0) {
                System.out.print("*");
                starCount--;
            }

            System.out.println();
            spaces++;
            stars -= 2;
            row++;
        }
    }
}