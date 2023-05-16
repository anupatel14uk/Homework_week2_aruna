package Homework_week2_aruna;
/**Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 * Width = 5.5
 * Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class JavaProgram14 {
    public void instMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter width value:  ");
        Double width = sc.nextDouble();
        System.out.println(" Enter height value:  ");
        Double height = sc.nextDouble();
        double area = (width * height);
        double perimeter = 2 * (width + height);

       System.out.printf("Area is=%.1f * %.1f = %.2f \n", width, height, area);
       System.out.printf("Perimeter= is 2 * (%.1f + %.1f) = %.2f \n", width, height, perimeter);

    }
        public static void main(String[] args) {
        JavaProgram14 obj = new JavaProgram14();
        obj.instMethod();
    }
}














      //  public static void main(String[] args) {
        //JavaProgram14 obj = new JavaProgram14();
       // obj.intsMethod();
    //}
            //public void intsMethod () {
               // double w = 5.6;
              //  double h = 8.5;
            //    double area = w * h;
             //   double Perimeter = 2 * (w + h);

          //  Scanner sc = new Scanner(System.in);
           // System.out.println("Enter area is=");
            //String width = sc.nextLine();
           // System.out.println("Enter perimeter is =");
          //  String height= sc.nextLine();
          //  System.out.println("Area is:="(width*height));
          //  System.out.println("Perimeter is :="+2 *(width+height));

       // }
  //  }





