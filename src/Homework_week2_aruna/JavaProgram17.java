package Homework_week2_aruna;
/**  Write a Java program to convert a decimal number to binary number.
 *  Input Data:
 *  Input a Decimal Number : 5
 *  Expected Output Binary number is: 101
 */

import java.util.Scanner;

            public class JavaProgram17
             {
            public static void main(String[] args) {
                JavaProgram17 p = new JavaProgram17();
                p.method1();
            }
            public void method1(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a Decimal Number:=");
            int d = scanner.nextInt();
            System.out.println("Binary number is:=" + Integer.toBinaryString(d));

    }

    }



