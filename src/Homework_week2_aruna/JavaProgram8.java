package Homework_week2_aruna;

import java.util.Scanner;

/**Write a program to calculate the area of a triangle.
 */

public class JavaProgram8 {
    public static void main(String[] args) {
        int width=5;
        int height=10;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter width w : ");
        float w= sc.nextFloat();
        System.out.print("Enter height : ");
        float h= sc.nextFloat();
        float area=(w*h/2);
        System.out.println("Calculate the area of triangle="+area);

    }
}
