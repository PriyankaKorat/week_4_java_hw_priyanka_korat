package week_4_java_hw;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Programme_8_RightAngleTriangle {
    public static void main(String[] args) {
        //declare scanner class to get data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any special character");
        Character charVal = scanner.next().charAt(0);
        System.out.println("Please enter the length of rows you want to show in triangle:  ");
        int rowsLenght = scanner.nextInt();
        PrintRightAngle(charVal, rowsLenght);
        //close scanner
        scanner.close();
    }

    public static void PrintRightAngle(Character symbol, int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}