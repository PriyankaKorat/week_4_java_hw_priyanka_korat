package week_4_java_hw;

import java.util.Scanner;

/**
 *  Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        //declare scanner to get data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value to get fibonacci number");
        int number = scanner.nextInt();
        System.out.println("The fibonacci number is: ");
        fibonacciNum(number);
        //close scanner
        scanner.close();
    }
    public static void fibonacciNum(int num){
        int firstNum = 1;
        int secondNumber = 1;
        int number3;
        for (int i = 0; i < num; i++){
            System.out.print(firstNum +" , ");

            number3 = firstNum+secondNumber;
            firstNum = secondNumber;
            secondNumber = number3;
        }
    }
}
