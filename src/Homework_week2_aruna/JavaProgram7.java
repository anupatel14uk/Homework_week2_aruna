package Homework_week2_aruna;

/**  Write a program to insert any temperature value in degree Fahrenheit and
 * Write a program to insert any temperature value in degree Fahrenheit and
 */

import java.util.Scanner;

public class JavaProgram7 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter temperature value in degree fahrenheit : ");
        float fahrenheit= sc.nextFloat();
        float celsius=((fahrenheit-32)*5)/9;
        System.out.println("Temperature in Celsius is:="+celsius);
    }
}
