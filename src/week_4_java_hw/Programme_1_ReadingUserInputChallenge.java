package week_4_java_hw;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */
public class Programme_1_ReadingUserInputChallenge {
    //create instance method
    public void sumNum() {
        //create scanner to get data from user
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;


        while (count < 10) {
            int num = count + 1;
            System.out.println("Enter number #" + num + " :");

            if (scanner.hasNextInt()) {
                int numb = scanner.nextInt();
                sum += numb;
                count++;
            } else {

                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of 10 number is :" + sum);
        //close scanner
        scanner.close();
    }

    public static void main(String[] args) {
        //create object of class to access instance method into main method
        Programme_1_ReadingUserInputChallenge obj = new Programme_1_ReadingUserInputChallenge();
        obj.sumNum();

    }

}
