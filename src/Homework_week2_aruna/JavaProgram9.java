package Homework_week2_aruna;

/**Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class JavaProgram9{

    public static void main(String[] args) {
        JavaProgram9 obj = new JavaProgram9();
        obj.intsMethod();
    }
       public void intsMethod() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter in Uppercase letters:-");
       String str = sc.nextLine();
       System.out.println(str.toLowerCase());
   }


    }



