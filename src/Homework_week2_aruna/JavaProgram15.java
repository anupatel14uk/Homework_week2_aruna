package Homework_week2_aruna;

/** Write a Java program to swap two variables.
 */

     public class JavaProgram15 {


    public static void main(String[] args) {
        int a, b, temp;
        a = 20;
        b = 30;
        System.out.println("Before swapping : a,a="+a+",b="+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping  : a,a="+a+",b="+b);
    }

}


