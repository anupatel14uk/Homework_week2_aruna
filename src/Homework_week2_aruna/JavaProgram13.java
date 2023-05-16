package Homework_week2_aruna;
/**Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class JavaProgram13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1=scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2= scanner.nextInt();
        System.out.print("Enter the third  number: ");
        int number3= scanner.nextInt();
        float sum =(number1+number2+number3);
        System.out.print("The average value is result=" + sum /3);
    }
}
