package Homework_week2_aruna;
/**Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
 *Test Data:
 * Input first number: 125
 * Input second number: 24
 *Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

import java.util.Scanner;

public class JavaProgram18 {
    public static void main(String[] args) {
        JavaProgram18 obj = new JavaProgram18();
        obj.method1();
    }
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int number1 = sc.nextInt();
        System.out.println("Enter second number:");
        int number2 = sc.nextInt();
        System.out.println(number1+"+"+number2+"="+(number1+number2));
        System.out.println(number1+"-"+number2+"="+(number1-number2));
        System.out.println(number1+"*"+number2+"="+(number1*number2));
        System.out.println(number1+"/"+number2+"="+(number1/number2));
        System.out.println(number1+"mod"+number2+"="+(number1%number2));
    }
}
