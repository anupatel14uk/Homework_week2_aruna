package Homework_week2_aruna;
/**Write a Java program to convert a given string into lowercase.
 *Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class JavaProgram19 {
    public void method1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in Uppercase letters:-");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
        //String txt="Example :=THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";//Example
        //System.out.println(txt.toLowerCase());
    }
    public static void main(String[] args) {
        JavaProgram19 obj = new JavaProgram19();
        obj.method1();
    }






    //public static void main(String[] args) {

        //String txt="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";//Upper cash to lower cash
       // System.out.println(txt.toLowerCase());
    }


