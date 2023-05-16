package Homework_week2_aruna;
/**Write a Java program to compute the specified expressions and print the output.
 *Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */

import java.util.Scanner;

public class JavaProgram12 {
    public static void main(String[] args) {

        JavaProgram12 javaProgram12 = new JavaProgram12();
        javaProgram12.method1();

    }
    public void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        double a = scanner.nextDouble();
        System.out.println("Enter number");
        double b = scanner.nextDouble();
        System.out.println("Enter number");
        double c = scanner.nextDouble();
        System.out.println("Enter number");
        double d = scanner.nextDouble();
        System.out.println("Enter number");
        double e = scanner.nextDouble();
        System.out.println("Enter number");
        double f = scanner.nextDouble();
        double result=((a * b - c * d) / (e - f));
        System.out.println("compute the specified expressions Result ="+result);
    }
}
