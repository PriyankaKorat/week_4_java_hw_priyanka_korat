package week_4_java_hw;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */

public class Programme_6_Triangle {
    //declare main method
    public static void main(String[] args) {
        //declare scanner class to get data from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int number = scan.nextInt();
        displayTriangle(number);
        //close scanner class
        scan.close();

    }
    public static void displayTriangle(int number){
        for (int i = 0; i<= number; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
