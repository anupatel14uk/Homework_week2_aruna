package Homework_week2_aruna;
/** Write a Java program to add two binary numbers.
 *Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

import java.util.Scanner;

public class JavaProgram16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary number=");
        String binaryNumber1 = scanner.nextLine();
        int normalNumber1 = Integer.parseInt(binaryNumber1,2);
        System.out.println(normalNumber1);
        System.out.println("Enter second binary number=");
        String binaryNumber2 = scanner.nextLine();
        int normalNumber2 = Integer.parseInt(binaryNumber2,2);
        System.out.println(normalNumber2);
        int sum = normalNumber1 + normalNumber2;
        System.out.println("number1:=" + binaryNumber1 + ",number2:=" + binaryNumber2 + ", Sum of two binary numbers=" + Integer.toBinaryString(sum));
    }
}
