package week_4_java_hw;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNum {
    public static void main(String[] args) {
        //declare scanner to get data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        armstrongNum(num);
        //close scanner
        scanner.close();
    }

    public static void armstrongNum(int num) {

        int reminder, mainNum = 0;
        int result = 0;
        mainNum = num;

        while (mainNum != 0) {
            reminder = mainNum % 10;
            result += Math.pow(reminder, 3);
            mainNum /= 10;

        }
        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
