package Homework_week2_aruna;
/** Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class JavaProgram6 {
    public static void main(String[] args) {
       float pi=3.14f;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any radius value: ");
        float radius= sc.nextFloat();
        float area=pi*radius*radius;

        System.out.println("Area:="+area);
    }
}













